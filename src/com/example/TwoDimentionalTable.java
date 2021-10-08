/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.Arrays;

public class TwoDimentionalTable {
    public static void main(String[] args) {
        int[][] numbers = {
            {45,98,78,65,87},
            {65,78,45,98,12},
            {45,65,12,32,45},
            {14,47,78,89,96},
            {14,47,78,89,96}
        };
        
        for (int i = 0; i < numbers.length; i++) {
            Arrays.sort(numbers[i]);
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(" "+numbers[i][j]);
            }
            System.out.println();
        }
    }
}
