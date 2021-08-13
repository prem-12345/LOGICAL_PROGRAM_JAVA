package com.bridgelabz.reversenumber;
/**
 * WELCOME TO REVERSE NUMBER PROGRAM
 *
 * @author prem
 * @version 6.4
 * @since 13/08/2021
 */

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to reversed :: ");
        int numToReverse = sc.nextInt();

        ReverseNum(numToReverse);
    }
    public static void ReverseNum(int numToReverse){

        int reversedNum = 0;
        while (numToReverse != 0) {
            int remenderDigit = numToReverse % 10;
            reversedNum = reversedNum * 10 + remenderDigit;
            numToReverse /= 10;
        }

        System.out.println("Reversed Number: " + reversedNum);
    }
    }

