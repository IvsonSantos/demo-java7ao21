package com.example.demojava7ao21.exercises.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercicio1 {

    public static void main(String[] args) {
        List<Transaction> transactions = Arrays.asList(
                new Transaction("1", "Deposit", 1000.0, "COMPLETED"),
                new Transaction("2", "Withdrawal", 200.0, "PENDING"),
                new Transaction("3", "Deposit", 1500.0, "COMPLETED"),
                new Transaction("4", "Transfer", 500.0, "COMPLETED"),
                new Transaction("5", "Withdrawal", 300.0, "COMPLETED")
        );

        List<Transaction> completedTransaction = filterCompletedTransactions(transactions);
        completedTransaction.forEach(t -> System.out.println(t.getId()));

        Map<String, List<Transaction>> transactionByType = groupTransactionsByType(completedTransaction);
        transactionByType.forEach((type, trans) -> System.out.println(type + ": " + trans.size()));

        Map<String, Double> totalAmountByType = calculateTotalAmountByType(completedTransaction);
        totalAmountByType.forEach((type, total) -> System.out.println(type + ": " + total));

    }

    private static List<Transaction> filterCompletedTransactions(List<Transaction> transactions) {
        return transactions.stream()
                .filter(t -> "COMPLETED".equals(t.getStatus()))
                .collect(Collectors.toList());
    }

    private static Map<String, List<Transaction>> groupTransactionsByType(List<Transaction> completedTransaction) {
        return completedTransaction.stream()
                .collect(Collectors.groupingBy(Transaction::getType));
    }

    private static Map<String, Double> calculateTotalAmountByType(List<Transaction> completedTransaction) {
        return completedTransaction.stream()
                .collect(
                    Collectors.groupingBy(
                        Transaction::getType,
                        Collectors.summingDouble(Transaction::getAmount)
                    )
                );
    }

}
