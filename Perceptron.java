/**
 * This class trains a simple perceptron.
 * The perceptron has two inputs, one bias, and one output.
 */
public class Perceptron {

    static double learningRate = 0.1;
    static double[] weights = new double[3]; 

    public static void main(String[] args) {
        boolean verbose = false;

        if (args.length > 0 && args[0].equals("verbose")) {
            verbose = true;
        }

        int[][] inputs = {
                {0, 0},
                {0, 1},
                {1, 0},
                {1, 1}
        };


        int [] orTargets = { 0, 1, 1, 1 };
        double [] orWeights = new double[3];

        int [] andTarget = { 0, 0, 0, 1 };
        double [] andWeights = new double[3];

        // TODO 2: train perceptron until all inputs are classified correctly


        // TODO 3: print final weights

        // TODO 4: print number of iterations

        // TODO 5: test final perceptron on all inputs
    }

    static void setRandomWeights(double[] weights) {
        weights[0] = Math.random()*2 - 1;
        weights[1] = Math.random()*2 - 1;
        weights[2] = Math.random()*2 - 1;
    }

    static int predict(int[] inputs, double[] weights) {
        double bias = 1.0;
        double activation = inputs[0] * weights[0] + inputs[1] * weights[1] + bias * weights[2];

        if (activation >= 0) {
            return 1;
        } else {
            return 0;
        }
    }

    static int train(int[] targets, int[][] inputs, double[] weights, boolean verbose) {

        boolean allCorrect = false;
        int iterations = 0;

        while (!allCorrect) {

            allCorrect = true;
            iterations++;

            for (int i = 0; i < inputs.length; i++) {

                int output = predict(inputs[i], weights);
                int error = targets[i] - output;

                if (error != 0) {
                    allCorrect = false;

                    weights[0] = weights[0] + learningRate * error * inputs[i][0];
                    weights[1] = weights[1] + learningRate * error * inputs[i][1];
                    weights[2] = weights[2] + learningRate * error; // bias update

                    if (verbose) {
                        System.out.println("Input: " + inputs[i][0] + ", " + inputs[i][1]);
                        System.out.println("Target: " + targets[i]);
                        System.out.println("Output: " + output);
                        System.out.println("Error: " + error);
                        System.out.println("Weights: " + weights[0] + ", " + weights[1] + ", " + weights[2]);
                        System.out.println();
                    }
                }
            }
        }

        return iterations;
    }
}