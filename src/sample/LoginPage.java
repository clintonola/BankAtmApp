package sample;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public  class LoginPage extends JFrame implements ActionListener {

    JTextField AccountnumField = new JTextField();
    JPasswordField PasswordField = new JPasswordField();
    JButton LoginButton = new JButton("LogIn");
    JButton ResetButton = new JButton("Reset");
    JLabel MessageLabel = new JLabel();
    JLabel IDLabel = new JLabel("UserID");
    JLabel PasswordLabel = new JLabel("Password");

    HashMap<String,String > loginInfo = new HashMap<String, String>();
    
    LoginPage(HashMap<String,String> loginInfo){

        this.loginInfo= loginInfo;

        IDLabel.setBounds(50,100,75,25);
        PasswordLabel.setBounds(50,150,75,25);

        MessageLabel.setBounds(125,250,250,35);
        MessageLabel.setFont(new Font(null, Font.BOLD,25));

        AccountnumField.setBounds(125,100,200,25);
        PasswordField.setBounds(125,150,200,25);

        LoginButton.setBounds(125,200,100,25);
        LoginButton.addActionListener(this);

        ResetButton.setBounds(225,200,100,25);
        ResetButton.addActionListener(this);

        this.add(IDLabel);
        this.add(PasswordLabel);
        this.add(MessageLabel);
        this.add(AccountnumField);
        this.add(PasswordField);
        this.add(LoginButton);
        this.add(ResetButton);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out when clicking x botton.
        this.setSize(420,420); //sets the dimensions of the frame
        this.setLayout(null);
        this.setVisible(true); //make it visible
    }
    @Override
     public void actionPerformed(ActionEvent e) {
         if (e.getSource() == ResetButton){
            AccountnumField.setText("");
            PasswordField.setText("");
        }
         if(e.getSource() == LoginButton){
             String AccountNum = AccountnumField.getText();
             String Password = String.valueOf(PasswordField.getPassword());

             if(loginInfo.containsKey(AccountNum)){
                 if(loginInfo.get(AccountNum).equals(Password)){
                     this.dispose();
                     OptionMenu optionMenu = new OptionMenu();
                 }
                 else{
                     MessageLabel.setForeground(Color.red);
                     MessageLabel.setText("Wrong password");
                 }
             }
             else{
                 MessageLabel.setForeground(Color.red);
                 MessageLabel.setText("User not found");
             }
         }
    }
}
