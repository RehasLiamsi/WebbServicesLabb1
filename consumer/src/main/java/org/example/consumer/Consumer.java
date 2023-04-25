package org.example.consumer;

import org.example.service.WeightConversion;

import java.util.Scanner;
import java.util.ServiceLoader;

public class Consumer {

    public static void main(String[] args) {

        ServiceLoader<WeightConversion> weightConversions = ServiceLoader.load(WeightConversion.class);

        System.out.println("Welcome to the weight conversion program.");
        System.out.println("We can convert gram to kilograms and pounds");
        System.out.println("Enter the amount in grams for conversion");
        Scanner sc = new Scanner(System.in);
        var grams = sc.nextDouble();

        for (var weightConversion : weightConversions) {
            System.out.println(weightConversion.weight(grams));
        }
    }
}
