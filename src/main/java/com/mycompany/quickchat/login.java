/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quickchat;

public class login {
    //Acess specified
    //public and private

    private String username;
    private String password;
    private String cellphoneNumber;
    private String firstName;
    private String lastName;

    //Getter and Setters
    
    //Setter
    
    public login(String firstName, String lastName, String username, String password, String cellphoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.cellphoneNumber = cellphoneNumber;
    }

    // Check Username
    public boolean checkUserName() {
        return username.contains("_") && username.length() <= 5;
    }

    // Check Password Complexity
    public boolean checkPasswordComplexity() {
        boolean hasUppercase = false;
        boolean hasNumber = false;
        boolean hasSpecial = false;

        if (password.length() < 8) {
            return false;
        }

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUppercase = true;
            } else if (Character.isDigit(c)) {
                hasNumber = true;
            } else if (!Character.isLetterOrDigit(c)) {
                hasSpecial = true;
            }
        }

        return hasUppercase && hasNumber && hasSpecial;
    }

    // Check Cellphone Number
    public boolean checkCellphoneNumber() {
        return cellphoneNumber.startsWith("+27") && cellphoneNumber.length() == 12;
    }

    // Register User
    public String registerUser() {

        if (!checkUserName()) {
            return "Username is not correctly formatted. It must contain an underscore and be no more than 5 characters.";
        }

        if (!checkPasswordComplexity()) {
            return "Password is not correctly formatted. It must be at least 8 characters, contain a capital letter, a number, and a special character.";
        }

        if (!checkCellphoneNumber()) {
            return "Cellphone number is incorrect. It must start with +27 and be 12 characters long.";
        }

        return "User is registered successfully.";
    }

    // Login User
    public boolean loginUser(String inputUsername, String inputPassword) {
        return inputUsername.equals(username) && inputPassword.equals(password);
    }

    // Return Login Status
    public String returnLoginStatus(boolean loginStatus) {
        if (loginStatus) {
            return "Welcome " + firstName + " " + lastName + ", it is great to see you again.";
        } else {
            return "Username or password incorrect, please try again.";
        }
    }
}

