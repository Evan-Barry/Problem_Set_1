import javax.swing.*;

public class Arrays {
    public static void main(String[] args) {

        int values[] = new int[10];

        for(int i = 0; i < values.length; i++)
        {
            values[i] = getValue();
        }

        displayValues(values);
    }

    private static int getValue()
    {
        int value = Integer.parseInt(JOptionPane.showInputDialog("Please enter an integer"));

        return value;
    }

    private static void displayValues(int[] values)
    {
        JOptionPane.showMessageDialog(null, "The first value in the array is " + values[0]);
        JOptionPane.showMessageDialog(null, "The fifth value in the array is " + values[4]);
    }
}
