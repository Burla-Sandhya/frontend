package guiframe;

import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        Second myClickstop = new Second();
        myClickstop.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myClickstop.setSize(250,200);
        myClickstop.setVisible(true);
    }
}