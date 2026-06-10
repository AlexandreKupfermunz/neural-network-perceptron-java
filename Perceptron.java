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


        int [] OrTargets = { 0, 1, 1, 1 };
        double [] OrWeights = new double[3];

        int [] AndTarget = { 0, 0, 0, 1 };
        double [] AndWeights = new double[3];

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

    // TODO 7: create predict()
    static boolean predict(double[][] inputs, double[] weights){


        return false;
    }
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