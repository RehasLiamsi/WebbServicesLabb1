package org.example.provider;

import org.example.service.WeightConversion;

public class Kilograms implements WeightConversion {
    @Override
    public String weight(double gram) {
        return gram/1000 + " kilograms";
    }
}
