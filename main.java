package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> newproduct = new ArrayList<String>();
        ArrayList<Double> price = new ArrayList<Double>();
        ArrayList<String> purchase = new ArrayList<String>();
        ArrayList<Double> priceofpurchase = new ArrayList<Double>();
        newproduct.add("Bison Sweater");
        price.add(55.99);
        newproduct.add("Bison Tee");
        price.add(14.99);
        newproduct.add("Bison Hoodie");
        price.add(23.99);
        newproduct.add("Bison Bumpersticker");
        price.add(4.99);

        String answer;
        Scanner input = new Scanner(System.in);
        String item;
        double sum = 0.0;
        int index = -1;
        do {
            System.out.println("What item did you buy? If you are done write 'Finish Transaction':  ");
            item = input.nextLine();
            purchase.add(item);
            for (int i = 0; i < newproduct.size(); i++) {
                if (item.equals(newproduct.get(i))) {
                            index = i;
                }
            }
            priceofpurchase.add(price.get(index));
        } while (!item.equalsIgnoreCase("Finish Transaction"));
        for (int i = 0; i < purchase.size() - 1; i++) {
                    System.out.println("You purchased: " + purchase.get(i));
                    sum += priceofpurchase.get(i);
                }
        System.out.println("Your order sum is: $" + sum);
        System.out.println("Your order has been placed! Thanks for shopping");
    }
}
