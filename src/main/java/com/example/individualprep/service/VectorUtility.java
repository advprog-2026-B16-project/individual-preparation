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
        return new double[] { 0.0, 0.0, 0.0 };
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
        // TODO: Implement me properly!
        return 0.0;
    }
    
    public double norm(double[] v1) {
        // TODO: Implement me properly!
        return 0.0;
    }
}