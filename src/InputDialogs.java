import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.awt.*;

public class InputDialogs {
    public static void main(String[] args) {

        float costPerSquareMeter, lengthOfRoom, breadthOfRoom;
        String name;

        name = getName();
        lengthOfRoom = getRoomLength();
        breadthOfRoom = getRoomBreadth();
        costPerSquareMeter = getCarpetCost();

        generateQuotation(name, lengthOfRoom, breadthOfRoom, costPerSquareMeter);

    }

    private static String getName()
    {
        String name = JOptionPane.showInputDialog("Please enter your name: ");
        return name;
    }

    private static float getRoomLength()
    {
        float lengthOfRoom = Float.parseFloat(JOptionPane.showInputDialog("Please enter the length of the room: "));

        return lengthOfRoom;
    }

    private static float getRoomBreadth()
    {
        float breadthOfRoom = Float.parseFloat(JOptionPane.showInputDialog("Please enter the breadth of the room: "));

        return breadthOfRoom;
    }

    private static float getCarpetCost()
    {
        float costPerSquareMeter = Float.parseFloat(JOptionPane.showInputDialog("Please enter the cost per square meter of carpet: "));

        return costPerSquareMeter;
    }

    private static void generateQuotation(String name, float length, float breadth, float squareMeterCost)
    {
        float area = length * breadth;
        float totalCost = area * squareMeterCost;

        //System.out.println("Quotation for " + name);
        //System.out.printf("%-20s%.2f m.\n%-20s%.2f m.\n%-20s%.2f sq. m \n%-20s%.2f euro\n%-20s%.2f euro","Length of room",length,"Breadth of room", breadth, "Total area of Room", area, "Cost per square meter of carpet", squareMeterCost, "Total cost of carpet", totalCost);

        JTextArea textArea = new JTextArea();

        Font textAreaFont = new Font("monospaced", Font.PLAIN, 16);
        textArea.setFont(textAreaFont);

        textArea.append("Quotation for " + name + "\n" + String.format("%-20s\t\t%.2f m.\n%-20s\t\t%.2f m.\n%-20s\t\t%.2f sq. m \n%-20s\t%.2f euro\n%-20s\t\t%.2f euro","Length of room",length,"Breadth of room", breadth, "Total area of Room", area, "Cost per square meter of carpet", squareMeterCost, "Total cost of carpet", totalCost));

        JOptionPane.showMessageDialog(null, textArea);
    }
}
