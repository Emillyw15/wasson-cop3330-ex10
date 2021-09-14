/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Emilly Wasson
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class prog10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.print("Enter the price of item 1: ");
        int price1 = in.nextInt();
        System.out.print("Enter the quantity of item 1: ");
        int quantity1 = in.nextInt();
        System.out.print("Enter the price of item 2: ");
        int price2 = in.nextInt();
        System.out.print("Enter the quantity of item 2: ");
        int quantity2 = in.nextInt();
        System.out.print("Enter the price of item 3: ");
        int price3 = in.nextInt();
        System.out.print("Enter the quantity of item 3: ");
        int quantity3 = in.nextInt();

        double subtotal = (price1 * quantity1) + (price2 * quantity2) + (price3 * quantity3);
        double tax = (subtotal * 0.055);
        double total = subtotal + tax;

        System.out.println("Subtotal: $" + df.format(subtotal) + "\nTax: $" + df.format(tax) + "\nTotal: $" + df.format(total));
    }
}
