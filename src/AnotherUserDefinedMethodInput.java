import javax.swing.*;

public class AnotherUserDefinedMethodInput {
    public static void main(String[] args) {

        int lengthOfSide = Integer.parseInt(JOptionPane.showInputDialog("Please enter the length of the side of a cubic container"));

        if(MyMethods.cube(lengthOfSide) > 100)
        {
            JOptionPane.showMessageDialog(null, "You can't take this on board, put it into your check-in luggage");
        }

    }
}
