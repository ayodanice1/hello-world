/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author HorlarME
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        double sum = 0;
        double value = 1;
        while (value != 0) {
            System.out.println("Value: ");
            value = input.nextDouble();
            sum += value; 
        }
        System.out.println("Total: " + sum + "\nIgnore the zero(0) value");
    }
}
