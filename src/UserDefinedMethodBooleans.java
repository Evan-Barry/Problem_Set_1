import javax.swing.*;

public class UserDefinedMethodBooleans {
    public static void main(String[] args) {

        int inputNum = 0;
        boolean numIsEven;

        while(inputNum != -1)
        {
            inputNum = getNum();

            if (inputNum == -1)
            {
                break;
            }

            numIsEven = isEven(inputNum);

            if(numIsEven)
            {
                JOptionPane.showMessageDialog(null, inputNum + " is even");
            }

            else
            {
                JOptionPane.showMessageDialog(null, inputNum + " is odd");
            }
        }

    }

    private static int getNum()
    {
        int number = Integer.parseInt(JOptionPane.showInputDialog("Please enter an integer number (-1 to exit)"));

        return number;
    }

    private static boolean isEven(int number)
    {
        boolean numIsEven = false;

        if(number % 2 == 0)
        {
            numIsEven = true;
        }

        return numIsEven;
    }
}
