/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.Scanner;

/**
 *
 * @author Instructor
 */
public class OddAndEvenChecker {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check weather of odd, even: ");
        int num = sc.nextInt();
        
        if(isOdd(num)){
            System.out.println(num + " is odd number");
        }else{
            System.out.println(num + " is even number");
        }
    }
    
    private static boolean isOdd(int num){
        if(num % 2 == 0){
            return false;
        }
        return true;
    }
}
