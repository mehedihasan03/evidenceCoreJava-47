package com.example;

import java.util.Scanner;

public class EmailValidation {
    public static final String VALID_EMAIL_ADDRESS_REGEX = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";

    public static void main(String[] args) {
        
        EmailValidation obj = new EmailValidation();
        
         Scanner sc = new Scanner(System.in);
        System.out.println("Type your email address: ");
        String email = sc.nextLine();
        
        boolean isValid = obj.isValidEmail(email);
        if(isValid){
            System.out.println("Email is valid");
        }else{
            System.out.println("Email is invalid");
        }
    }
    
    private boolean isValidEmail(String email){
        
        if(email.toUpperCase().matches(VALID_EMAIL_ADDRESS_REGEX)){
           return true;
        }
        return false;
    }
}
