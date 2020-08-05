package com.example.mareu.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class User {

    private String firstName;
    private String lastName;
    private static String emailAddress = "@service.com";

    //Déclaration des parametres
    private User(String firstName, String lastName, String emailAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        User.emailAddress = emailAddress;
    }

    private static List<User> DUMMY_USER = Arrays.asList(
            new User("Jean","Tanrien", emailAddress),
            new User("Jean","Perdmaimo", emailAddress),
            new User("Jean","Aiassez", emailAddress),
            new User("Jean","Racine", emailAddress)

    );

    public static List listParticipants = adressGenerator();

    private static List adressGenerator() {
        List<String> tab = new ArrayList<>();
        for (User utilisateur : DUMMY_USER) {
            tab.add(utilisateur.firstName + utilisateur.lastName + emailAddress);
        }
        return tab;
    }
}
