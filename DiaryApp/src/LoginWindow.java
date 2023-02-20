import java.awt.*;
import javax.swing.*;

public class LoginWindow {
    public static void main(String[] args) throws Exception {

        // Diary App Login Label Text

        JLabel label = new JLabel();
        label.setText("Diary App Login");
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setFont(new Font("Inter", Font.BOLD, 28));

        // TextFields

        JTextField userName = new JTextField();
        JTextField passWord = new JTextField();

        userName.setFont(new Font("Inter", Font.PLAIN, 18));
        userName.setPreferredSize(new Dimension(400, 30));

        passWord.setFont(new Font("Inter", Font.PLAIN, 18));
        passWord.setPreferredSize(new Dimension(400, 30));

        // Login Button

        JButton loginButton = new JButton();
        loginButton.setText("Login");
        loginButton.setBounds(10, 10, 100, 20);
        // loginButton.setBorder(new RoundedBorder(10));

        // Sign Up Button

        JButton signUpButton = new JButton();
        signUpButton.setText("Sign Up");
        signUpButton.setBounds(10, 10, 100, 20);

        // Border Panels

        JPanel topPanel = new JPanel();
        JPanel leftPanel = new JPanel();
        JPanel rightPanel = new JPanel();
        JPanel bottomPanel = new JPanel();
        JPanel centerPanel = new JPanel();

        topPanel.setBackground(Color.red);
        leftPanel.setBackground(Color.blue);
        rightPanel.setBackground(Color.pink);
        bottomPanel.setBackground(Color.green);

        topPanel.setPreferredSize(new Dimension(100, 140));
        leftPanel.setPreferredSize(new Dimension(160, 100));
        rightPanel.setPreferredSize(new Dimension(160, 100));
        bottomPanel.setPreferredSize(new Dimension(100, 140));

        // Login Window JFrame instantiation

        JFrame frame = new JFrame();

        frame.setVisible(true);
        frame.setSize(968, 688);
        frame.setTitle("Login");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setIgnoreRepaint(false);
        frame.getContentPane().setBackground(new Color(242, 242, 242));
        frame.setResizable(false);
        frame.setLayout(new BorderLayout());

        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(leftPanel, BorderLayout.WEST);
        frame.add(rightPanel, BorderLayout.EAST);
        frame.add(bottomPanel, BorderLayout.SOUTH);
        frame.add(centerPanel, BorderLayout.CENTER);

        // Content Panels within Grid Layout

        JPanel textPanel = new JPanel();
        JPanel inputPanel = new JPanel();
        JPanel buttonsPanel = new JPanel();

        textPanel.add(label);

        inputPanel.add(userName);
        inputPanel.add(passWord);

        // buttonsPanel.setLayout(new GridLayout(1, 2, 100, 20));

        buttonsPanel.add(loginButton);
        buttonsPanel.add(signUpButton);

        centerPanel.setLayout(new GridLayout(3, 1, 10, 10));
        centerPanel.add(textPanel);
        centerPanel.add(inputPanel);
        centerPanel.add(buttonsPanel);

    }
}
