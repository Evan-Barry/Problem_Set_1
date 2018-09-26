import javax.swing.*;
import java.awt.*;

public class ArrayAlgorithms {
    public static void main(String[] args) {

        JTextArea textArea = new JTextArea();

        Font textAreaFont = new Font("monospaced", Font.PLAIN, 16);
        textArea.setFont(textAreaFont);

        double cattleWeights[] = new double[5];

        for(int i = 0; i < cattleWeights.length; i++)
        {
            cattleWeights[i] = getValue(i);
        }

        displayWeights(cattleWeights, textArea);
        getNumberUnder250(cattleWeights, textArea);
        getPercentOver400(cattleWeights, textArea);
        getLightestAnimal(cattleWeights, textArea);
        getAverageWeight(cattleWeights, textArea);

        JOptionPane.showMessageDialog(null, textArea);
    }

    private static double getValue(int i)
    {
        double value = Double.parseDouble(JOptionPane.showInputDialog("Please enter the weigth of cattle " + (i+1)));

        return value;
    }

    private static void displayWeights(double[] weights, JTextArea textArea)
    {
        textArea.append("Weights: " + weights[0] + ", " + weights[1] + ", " + weights[2] + ", " + weights[3] + ", " + weights[4]);
    }

    private static void getNumberUnder250(double[] weights, JTextArea textArea)
    {
        int numberUnder250 = 0;

        for(int i = 0; i < weights.length; i++)
        {
            if(weights[i] < 250)
            {
                numberUnder250++;
            }
        }

        textArea.append("\nNumber under 250 kg: " + numberUnder250);
    }

    private static void getPercentOver400(double[] weights, JTextArea textArea)
    {
        float numberOver400 = 0;
        float percentOver400 = 0;

        for(int i = 0; i < weights.length; i++)
        {
            if(weights[i] > 400)
            {
                numberOver400++;
            }
        }

        percentOver400 = (numberOver400/weights.length) * 100;

        textArea.append("\nPercent over 400 kg: " + percentOver400);
    }

    private static void getLightestAnimal(double[] weights, JTextArea textArea)
    {
        int lightestAnimal = 0;

        for(int i = 0; i < weights.length; i++)
        {
            if(weights[i] < weights[lightestAnimal])
            {
                lightestAnimal = i;
            }
        }

        textArea.append("\nLightest animal: " + weights[lightestAnimal]);
    }

    private static void getAverageWeight(double[] weights, JTextArea textArea)
    {
        float totalWeight = 0;
        float averageWeight = 0;

        for(int i = 0; i < weights.length; i++)
        {
            totalWeight += weights[i];
        }

        averageWeight = totalWeight / weights.length;

        textArea.append("\nAverage weight: " + averageWeight);
    }


}
