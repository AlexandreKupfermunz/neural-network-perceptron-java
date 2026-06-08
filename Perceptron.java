import java.util.Random;

/**
 * This class trains a simple perceptron.
 * The perceptron has two inputs, one bias, and one output.
 */
public class Perceptron {

    static double learningRate = 0.1;
    static double[] weights = new double[3]; 
    // weights[0] = input 1 weight
    // weights[1] = input 2 weight
    // weights[2] = bias weight

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

        int[] targets = {
                // TODO: choose AND or OR target values
        };

        // TODO 1: initialize weights randomly

        // TODO 2: train perceptron until all inputs are classified correctly

        // TODO 3: print final weights

        // TODO 4: print number of iterations

        // TODO 5: test final perceptron on all inputs
    }

    // TODO 6: create setRandomWeights()

    // TODO 7: create predict()
    // Should calculate:
    // activation = input1*w1 + input2*w2 + bias*wbias
    // If activation >= 0, return 1
    // Else return 0

    // TODO 8: create train()
    // For each input:
    // - predict output
    // - calculate error = target - output
    // - update weights if error is not 0
    // Stop only when all outputs are correct

    // TODO 9: create updateWeights()
    // Rule:
    // new weight = old weight + learningRate * error * input

    // TODO 10: create printWeights()

    // TODO 11: create optional verbose printing
}