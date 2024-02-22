package com.ML.machineLearning.models;

public class PredictionResponse {
    private double predictedValue;
    private String predictedVariable;

    public PredictionResponse(String string) {

    }

    public PredictionResponse(float f, String string) {

    }

    public double getpredictedValue() {
        return predictedValue;
    }

    public String getpredictedVariable() {
        return predictedVariable;
    }

    public void setpredictedValue(double predictedValue) {
        this.predictedValue = predictedValue;
    }

    public void setpredictedVariable(String predictedVariable) {
        this.predictedVariable = predictedVariable;
    }
}