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
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check weather of prime: ");
        int num = sc.nextInt();
        
        if(isPrime(num)){
            System.out.println(num + " is prime number");
        }else{
            System.out.println(num + " is not prime number");
        }
        
        
    }
    
    private static boolean isPrime(int num){
        if(num <2){
            return false;
        }
        
        for(int i = 2; i< num; i++){
            if(num % i == 0){
                return false;
            }
        }
        
        return true;
    }
            
            
}
