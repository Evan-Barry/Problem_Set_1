import javax.swing.*;

public class whileLoop {
    public static void main(String[] args) {

        float exchangeRate, pound = -1f;

        exchangeRate = getExchangeRate();

        while(pound != 0)
        {
            pound = getGBP();

            if(pound == 0)
            {
                break;
            }

            convertGBPtoEUR(pound, exchangeRate);
        }
    }

    private static float getExchangeRate()
    {
        float exchangeRate = Float.parseFloat(JOptionPane.showInputDialog("Please enter the exchange rate to GBP to EUR:"));

        return exchangeRate;
    }

    private static float getGBP()
    {
        float pound = Float.parseFloat(JOptionPane.showInputDialog("Enter value in GBP to convert to EUR"));

        return pound;
    }

    private static void convertGBPtoEUR(float pound, float exchangeRate)
    {
        JOptionPane.showMessageDialog(null, pound + " GBP is " + String.format("%.2f",pound*exchangeRate) + " EUR", "1 GBP is " + String.format("%.2f", exchangeRate) + " EUR",1 );
    }
}