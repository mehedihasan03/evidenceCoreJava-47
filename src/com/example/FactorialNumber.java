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
public class FactorialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type a number: ");
        int num = sc.nextInt();
        int num2 = num;
        long fac = 1;
        while(num != 0){
            fac *= num;
            --num;
        }
        System.out.println(num2 +" Factorial is : "+fac);
    }
}
