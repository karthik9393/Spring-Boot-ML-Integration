package com.ML.machineLearning.models;

public class PredictRequest {
    private double sepalLength;
    private double sepalWidth;
    private double petalWidth;
    // Getters
public double getSepalLength() {
    return sepalLength;
  }
  
  public double getSepalWidth() {
    return sepalWidth;
  }
  
  public double getPetalWidth() {
    return petalWidth;
  }
  
  // Setters
  public void setSepalLength(double sepalLength) {
    this.sepalLength = sepalLength;
  }
  
  public void setSepalWidth(double sepalWidth) {
    this.sepalWidth = sepalWidth;
  }
  
  public void setPetalWidth(double petalWidth) {
    this.petalWidth = petalWidth;
  }
  

}