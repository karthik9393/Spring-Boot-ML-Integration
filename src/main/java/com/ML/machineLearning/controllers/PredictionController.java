package com.ML.machineLearning.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ML.machineLearning.models.PredictRequest;
import com.ML.machineLearning.models.PredictionResponse;
import com.ML.machineLearning.services.TensorFlowServingClient;

@RestController
@RequestMapping("/api/predict")
public class PredictionController {

    @Autowired
    private TensorFlowServingClient tensorflowServingClient; // Inject TensorFlow Serving client

    @PostMapping
    public ResponseEntity<PredictionResponse> predictPetalLength(@RequestBody PredictRequest request) {
        // Validate input
        if (request.getSepalLength() <= 0 || request.getSepalWidth() <= 0 || request.getPetalWidth() <= 0) {
            return ResponseEntity.badRequest().body(new PredictionResponse("Invalid input: values must be positive."));
        }

        // Process and send prediction request to TensorFlow Serving
        double[] input = new double[]{request.getSepalLength(), request.getSepalWidth(), request.getPetalWidth()};
        float[] prediction = tensorflowServingClient.predict(input);

        // Return prediction and relevant metadata
        return ResponseEntity.ok(new PredictionResponse(prediction[0], "Petal length (cm)"));
    }
}
