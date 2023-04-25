package org.example.consumer;

import org.example.service.WeightConversion;

import java.util.ServiceLoader;

public class Consumer {

    public static void main(String[] args) {

        ServiceLoader<WeightConversion> weightConversions = ServiceLoader.load(WeightConversion.class);

        for (var weightConversion : weightConversions){
            System.out.println(weightConversion.weight(2500));
        }
    }
}
