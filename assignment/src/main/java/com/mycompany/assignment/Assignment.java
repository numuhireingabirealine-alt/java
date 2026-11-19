/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.assignment;

/**
 *
 * @author PC
 */
        import java.util.Scanner;

public class Assignment{
    public static void main(String[] args) {
    
        final double DRINK_PRICE = 15.50;

        Scanner input = new Scanner(System.in);


        System.out.print("Enter customer's name: ");
        String customerName = input.nextLine();

        System.out.print("Enter customer's age: ");
        int age = input.nextInt();

        System.out.print("Enter price of the meal: ");
        double mealPrice = input.nextDouble();

        System.out.print("Enter number of drinks ordered: ");
        int numDrinks = input.nextInt();

        System.out.print("Is the customer a student? (true/false): ");
        boolean isStudent = input.nextBoolean();

        System.out.print("Enter service rating (1 to 5): ");
        int rating = input.nextInt();

        
        if (rating < 1 || rating > 5) {
            System.out.println("Error: Invalid service rating! Please enter a rating between 1 and 5.");
        } else {
            
            double drinksCost = numDrinks * DRINK_PRICE;
            double subtotal = mealPrice + drinksCost;

         
            double discountRate = 0.0;
            if (isStudent) {
                discountRate = 0.10;
            } else if (age >= 60) {
                discountRate = 0.05;
            }
            double discountAmount = subtotal * discountRate;

         
            double tipAmount = 0.0;
            if (rating == 4 || rating == 5) {
                tipAmount = subtotal * 0.10;
            }

            //Casting 
            double finalBill = (subtotal - discountAmount) + tipAmount;
            int wholeAmount = (int) finalBill;

            // Required receipt - Slide 06)
            System.out.println("\nSMART RESTAURANT");
            System.out.println("Customer: " + customerName);
            System.out.println("Meal: $" + mealPrice);
            System.out.println("Drinks: $" + drinksCost);
            System.out.println("Discount: $" + discountAmount);
            System.out.println("Tip: $" + tipAmount);
            System.out.println("Final bill: $" + finalBill);
            System.out.println("Whole amount: $" + wholeAmount);
        }

        input.close();
    }
}
        
        
  
