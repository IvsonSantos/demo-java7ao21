package com.example.demojava7ao21.lombok.delegate;

public class UserTest {

    public static void main(String[] args) {
        User user = new User();
        user.setFirstName("Primeiro");
        user.setLastName("Ultimo");
        user.setPhoneNr("333-444");

        System.out.println(user.toString());
        System.out.println(user.getFullName());
    }
}
