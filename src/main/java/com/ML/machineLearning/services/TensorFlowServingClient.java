package com.ML.machineLearning.services;

import java.util.HashMap;
import java.util.Map;
import org.tensorflow.tensorflow-serving-api-client

import org.springframework.stereotype.Service;

@Service
public class TensorFlowServingClient {

    private TFServingClient client;

    // Configuration, initialization, ...

    public float[] predict(double[] input) {
        Map<String, Object> inputs = new HashMap<>();
        inputs.put("input", input);
        Map<String, Map<String, Object>> outputs = client.predict(inputs);
        return (float[]) outputs.get("output0").get("predictions");
    }
}
