package com.example.demojava7ao21.deitel.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DesempilhamentoThrowable {

    private static final Logger LOG = LoggerFactory.getLogger(DesempilhamentoThrowable.class);

    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception exception) // captura a exceção lançada em method1
        {
            LOG.error(exception.getMessage());
            exception.printStackTrace();

            // obtém informações de rastreamento de pilha
            StackTraceElement[] traceElements = exception.getStackTrace();

            // faz um loop por traceElements para obter a descrição da exceção
            for (StackTraceElement element : traceElements) {

                // element.getClassName()

                LOG.error(element.getFileName() + " " +
                          element.getLineNumber() + " " +
                          element.getMethodName()
                );
            }

        }
    } // fim de main

    // chama method2; lança exceções de volta para main
    public static void method1() throws Exception {
        method2();
    }

    public static void method2() throws Exception {
        method3();
    }

    // lança Exception de volta para method2
    public static void method3() throws Exception {
        throw new Exception("Exception thrown in method3");
    }

}
