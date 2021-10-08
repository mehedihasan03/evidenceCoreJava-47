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
public class SummationExample {
    public static void main(String[] args) {
        double summation = getSummation();
        System.out.println("Summation: "+ summation);
    }
    
    private static double getSummation(){
        Scanner sc = new Scanner(System.in);
        
        int loopController = 0;
        double sum = 0;
        while(loopController != -1){
            sum += loopController;
            System.out.println("Enter a your number to summation and exit for program to type -1");
            loopController = sc.nextInt();
        }
        
        return sum;
    }
}
