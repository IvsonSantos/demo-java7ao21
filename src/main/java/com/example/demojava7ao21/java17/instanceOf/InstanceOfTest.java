package com.example.demojava7ao21.java17.instanceOf;

public class InstanceOfTest {

    public static void main(String[] args) {

        // antes
        var animal = (Object) new Dog();
        if (animal instanceof Dog ){
            var fido = (Dog) animal;
            fido.bark();
        }

        // java 17
        var animal17 = (Object) new Dog ();
        if (animal17 instanceof Dog fido ){
            fido.bark();
        }
    }
}
