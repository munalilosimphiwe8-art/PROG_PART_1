/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quickchat;

import java.util.*;

/**
 *
 * @author Simphiwe
 */
public class QuickChat {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Registration
        System.out.println("== Register User ==");

        System.out.print("Enter First Name: ");
        String firstName = input.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = input.nextLine();

        System.out.print("Enter Username: ");
        String username = input.nextLine();

        System.out.print("Enter Password: ");
        String password = input.nextLine();

        System.out.print("Enter Cellphone Number (e.g. +27680722754): ");
        String cellphone = input.nextLine();

        // Object creation (class name should start with capital letter)
        login user = new login(firstName, lastName, username, password, cellphone);

        String registrationMessage = user.registerUser();
        System.out.println(registrationMessage);

        // Only login if registration is successful
        if (registrationMessage.equalsIgnoreCase("user is registered successfully.")) {

            System.out.println("\n== Login ==");

            System.out.print("Enter username: ");
            String loginUsername = input.nextLine();

            System.out.print("Enter Password: ");
            String loginPassword = input.nextLine(); 

            boolean loginStatus = user.loginUser(loginUsername, loginPassword); 

            System.out.println(user.returnLoginStatus(loginStatus));
        }

        input.close();
    }
}