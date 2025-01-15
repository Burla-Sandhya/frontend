package Guig;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String x, y;
        x = JOptionPane.showInputDialog("Enter you First Number: ");
        y = JOptionPane.showInputDialog("Enter your second number: ");
        int firstN = Integer.parseInt(x);
        int secN = Integer.parseInt(y);
        int result = firstN + secN;
        JOptionPane.showMessageDialog(null, "RESULT: " + result, "^^^^Sandhya`s Company^^^^", JOptionPane.PLAIN_MESSAGE);
    }
}
