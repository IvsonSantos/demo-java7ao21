package com.example.demojava7ao21.java17.string;

public class MultilineStringTest {

    public static void main(String[] args) {

        var shakespeare = """

                To be, or not to be, that is the question:
                Whether 'tis nobler in the mind to suffer
                The slings and arrows of outrageous fortune,
                Or to take arms against a sea of troubles
                And by opposing end them. To die—to sleep,
                No more; and by a sleep to say we end
                The heart-ache and the thousand natural shocks
                That flesh is heir to: 'tis a consummation
                Devoutly to be wish'd. To die, to sleep;
                To sleep, perchance to dream—ay, there's the rub:
                For in that sleep of death what dreams may come,
                """;

        System.out.println(shakespeare);

        System.out.println("1 " + shakespeare.charAt(0));

        shakespeare = shakespeare.stripLeading();

        System.out.println("2 " + shakespeare.charAt(0));

    }
}
