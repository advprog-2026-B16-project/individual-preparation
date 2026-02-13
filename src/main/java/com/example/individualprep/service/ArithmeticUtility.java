package com.example.individualprep.service;

import org.springframework.stereotype.Service;

import java.lang.Math.*;

@Service
public class ArithmeticUtility {
    
    public double add(double o1, double o2) {
        // TODO: Implement me properly!
        return 0.0;
    }

    public double subtract(double o1, double o2) {
        return o1 - o2;
    }

    public double multiply(double o1, double o2) {
        return o1 * o2;
    }

    public double divide(double o1, double o2) {
        double result = o1 / o2;

        return result;
    }

    public double exponent(double o1, int n) {
        return Math.pow(o1, n);
    }
}
