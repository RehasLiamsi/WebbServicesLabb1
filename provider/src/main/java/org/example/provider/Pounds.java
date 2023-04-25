package org.example.provider;

import org.example.service.WeightConversion;

public class Pounds implements WeightConversion {
    @Override
    public String weight(double gram) {
        return gram / 453.59237 + " pounds";
    }
}
