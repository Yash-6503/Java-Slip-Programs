// slip4_q2 program

import java.awt.*;
import java.awt.event.*;

public class LoginScreen extends Frame implements ActionListener {
    private TextField usernameField;
    private TextField passwordField;
    private Button loginButton;
    private Button clearButton;
    private int loginAttempts;

    public LoginScreen() {
        setLayout(new FlowLayout());

        Label usernameLabel = new Label("Username: ");
        add(usernameLabel);

        usernameField = new TextField(20);
        add(usernameField);

        Label passwordLabel = new Label("Password: ");
        add(passwordLabel);

        passwordField = new TextField(20);
        passwordField.setEchoChar('*');
        add(passwordField);

        loginButton = new Button("Login");
        add(loginButton);
        loginButton.addActionListener(this);

        clearButton = new Button("Clear");
        add(clearButton);
        clearButton.addActionListener(this);

        loginAttempts = 3;

        setSize(300, 150);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == loginButton) {
            String username = usernameField.getText();
            String password = passwordField.getText();

            if (username.equals(password)) {
                System.out.println("Login successful!");
                dispose();
            } else {
                loginAttempts--;
                if (loginAttempts > 0) {
                    System.out.println("Login failed! Please try again. " + loginAttempts + " attempts remaining.");
                } else {
                    System.out.println("Login failed! No attempts remaining.");
                    dispose();
                }
            }
        } else if (event.getSource() == clearButton) {
            usernameField.setText("");
            passwordField.setText("");
        }
    }

    public static void main(String[] args) {
        new LoginScreen();
    }
}
