package com.example.demojava7ao21.java17.sealedclass;

public class SealedclassExample {

    public static void main(String args[]) {
        Person grandfather = new GrandFather(87, "Albert");
        grandfather.name = "Albert";
        System.out.println("The age of grandfather is: " + getAge(grandfather));
    }

    public static int getAge(Person person) {
        if (person instanceof Father) {
            return ((Father) person).getFatherAge();
        }
        else if (person instanceof GrandFather) {
            return ((GrandFather) person).getGrandFatherAge();
        }
        return -1;
    }

}

//the class person extends only Father and GrandFather class
abstract sealed class Person permits Father, GrandFather {
    String name;

    String getName() {
        return name;
    }
}

final class Father extends Person {
    String name;
    int age;

    //constructor of the Father class
    Father(int age, String name) {
        this.age = age;
        this.name = name;
    }

    int getFatherAge() {
        return age;
    }
}

//non-sealed class extends unknown subclass (Person)
non-sealed class GrandFather extends Person {
    int age;

    GrandFather(int age, String name) {
        this.age = age;
        this.name = name;
    }

    int getGrandFatherAge() {
        return age;
    }
}
