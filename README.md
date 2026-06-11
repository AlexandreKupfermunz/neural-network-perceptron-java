# Perceptron Learning Algorithm - KEN1210 Practical Assignment 2

## About This Project

This project implements a simple Perceptron from scratch in Java to learn basic logical functions through supervised learning. Starting from randomly initialized weights, the perceptron adjusts its parameters iteratively until it correctly classifies all training examples.

The project was originally developed as part of the KEN1210 course at Maastricht University. While the problem statement was provided by the course, the perceptron architecture, learning process, and training logic were implemented independently.

The objective of the project is to demonstrate how a simple artificial neuron can learn a decision boundary from data using the Perceptron Learning Rule, illustrating one of the foundational concepts of machine learning and neural networks.

## Features

Random weight initialization, Support for AND and OR logical functions, Binary step activation function, Bias neuron implementation, Perceptron Learning Rule, Iterative supervised training, Automatic convergence detection, Training iteration tracking, Optional verbose learning output, Configurable learning rate

## Concepts Demonstrated

Perceptrons, Artificial Neurons, Machine Learning Fundamentals, Supervised Learning, Binary Classification, Linear Decision Boundaries, Activation Functions, Perceptron Learning Rule, Gradient-Free Learning, Neural Network Foundations

## Technical Skills

Algorithm Design, Machine Learning Fundamentals

Java Programming, Numerical Computation, Debugging and Testing

## How It Works

The program begins by randomly initializing the perceptron's weights, including a bias weight.

For each training example:

The perceptron computes an activation value using a weighted sum of its inputs and bias.

The activation is passed through a binary step function, producing a prediction of either 0 or 1.

The prediction is compared to the target output.

If the prediction is incorrect, the weights are updated using the Perceptron Learning Rule.

At each training iteration:

Training examples are evaluated sequentially.

Prediction errors are calculated.

Weights are adjusted whenever misclassifications occur.

The process repeats until all training examples are classified correctly.

Once training is complete, the program displays the final weights and the number of iterations required for convergence.

## Academic Context

This repository is shared for educational and portfolio purposes to demonstrate my understanding of machine learning fundamentals, neural network concepts, supervised learning, and algorithm implementation in Java.

The implementation focuses on clarity and educational value, providing a minimal but complete example of how a perceptron learns linearly separable problems such as AND and OR logical functions.
