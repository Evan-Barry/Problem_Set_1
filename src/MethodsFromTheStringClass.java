import javax.swing.*;

public class MethodsFromTheStringClass {
    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Please enter your full name");

        char firstNameInitial = name.charAt(0);

        System.out.println("Number of characters in name : " + name.length());
        System.out.println("Initial of the first name : " + firstNameInitial);
        System.out.println("Your name as all caps : " + name.toUpperCase());
        System.out.println("Your surname : " + name.substring(name.lastIndexOf(" ") + 1));

    }
}
