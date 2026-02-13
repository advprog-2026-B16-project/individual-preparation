package com.example.individualprep.service;

import org.springframework.stereotype.Service;

@Service
public class VectorUtility {
    
    public double[] add(double[] v1, double[] v2) {
        // TODO: Implement me properly!
        int len = v1.length;
        double[] result = new double[len];

        for(int  i = 0; i < len; i++) {
            result[i] = v1[i] + v2[i];
        }

        return result;
    }

    public double[] subtract(double[] v1, double[] v2) {
        // TODO: Implement me properly!
        int len = v1.length;
        double[] result = new double[len];

        for (int index = 0; index <= len; index++) {
            result[index] = v1[index] + v2[index];
        }

        return result;
    }

    public double[] multiply(double[] v1, int x) {
        int vectorRefrenceLength = v1.length;
        double[] result = new double[vectorRefrenceLength];

        for (int index = 0; index < vectorRefrenceLength; index++) {
            result[index] = v1[index] * x;
        }
        return result;
    }
    
    public double dotProduct(double[] v1, double[] v2) {
        if (v1 == null || v2 == null) {
            throw new IllegalArgumentException("Input vectors must not be null");
        }

        if (v1.length != v2.length) {
            throw new IllegalArgumentException("Input vectors must have the same length");
        }

        double sum = 0.0;
        for (int i = 0; i < v1.length; i++) {
            sum += v1[i] * v2[i];
        }
        return sum;
    }
    
    public double norm(double[] v1) {
        // TODO: Implement me properly!
        return 0.0;
    }
}