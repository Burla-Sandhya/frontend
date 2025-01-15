package eventhandler;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class Second extends JFrame {
    private JTextField input1;
    private JTextField input2;
    private JTextField input3;
    private JPasswordField pwField;

    // now we need constructor
    public Second() {
        super("Login To Xiaomi software");
        setLayout(new FlowLayout());
        input1 = new JTextField(10);
        add(input1);

        input2 = new JTextField("Enter text");
        add(input2);

        input3 = new JTextField("No Access");
        input3.setEditable(false);// user can`t access to chge

        pwField = new JPasswordField("mypassword");// pswd container
        add(pwField);

        user usersObject = new user();// user is new class name

        input1.addActionListener(usersObject);// creates an action until it waits then executes further..by the
        // class"users""
        input2.addActionListener(usersObject);// calling through a method
        input3.addActionListener(usersObject);
        pwField.addActionListener(usersObject);
    }

    // now creating a new class
    // if i call 'second' class ,it will stores overall data from 'user' class
    private class user implements ActionListener {// implements the inherited abstract method actionlistener,event
        public void actionPerformed(ActionEvent myEvent) {// actioPerformed is a java inbulit method
            String myText = " ";
            if (myEvent.getSource() == input1) {
                myText = String.format("you typed : %s", myEvent.getActionCommand());

            } else if (myEvent.getSource() == input2) {
                myText = String.format("you typed : %s", myEvent.getActionCommand());

            } else if (myEvent.getSource() == input3) {
                myText = String.format("you typed : %s", myEvent.getActionCommand());

            } else if (myEvent.getSource() == pwField) {
                myText = String.format("your password is %s", myEvent.getActionCommand());
            }

            JOptionPane.showMessageDialog(null, myText);
        }
    }
}