package eventhandler;

import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        Second mySoft =new Second();
        mySoft.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mySoft.setSize(500, 250);
        mySoft.setVisible(true);
    }
}
