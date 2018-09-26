import java.awt.*;
import javax.swing.*;

public class forLoop {
    public static void main(String[] args) {

        createTextArea();

    }

    public static void createTextArea()
    {
        JTextArea textArea = new JTextArea();

        Font textAreaFont = new Font("monospaced", Font.PLAIN, 16);
        textArea.setFont(textAreaFont);

        textArea.append("Yards\tInches\n-----\t------\n");

        textArea.append(convertYardsToInches());

        JOptionPane.showMessageDialog(null, textArea);
    }

    public static String convertYardsToInches()
    {
        String message = "";

        System.out.println("In Convert");

        for(int i = 1; i <= 10; i++)
        {
            message += i + "\t" + (i*36) + "\n";
        }

        return message;
    }
}
