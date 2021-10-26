package sample;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//bankframe class
public class BankFrame extends JFrame implements ActionListener {

    //instace of IDandPassoword
    IDandPasswords iDandPasswords = new IDandPasswords();

    //button
    JButton button;

    //bankframe constructor
    BankFrame(){

        //creating a button
        button = new JButton();
        button.setBackground(Color.white);
        button.setBounds(625, 625, 250,75);
        button.setText("Click to Sign in");
        button.setFocusable(false);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans", Font.BOLD,15));
        button.setForeground(new Color(0,0,0));
        button.addActionListener(this);
        ImageIcon image = new ImageIcon("black c.jpg");

        //creating a Jlabel
        JLabel label = new JLabel(); //create label
        label.setText("WELCOME TO FIRST CLINTON-BANK"); // set text of label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.BOTTOM);
        label.setForeground(new Color(255,255,255));
        label.setFont(new Font("MV Boli", Font.PLAIN,20));//set font color
        label.setIconTextGap(25);
        label.setBackground(Color.black); // backgroundcolor
        label.setOpaque(true);
        label.setVerticalAlignment(JLabel.CENTER); //set vertical center
        label.setHorizontalAlignment(JLabel.CENTER); // set horizental center
        label.setBounds(400,20,700,750);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);
        this.setBackground(Color.black);
        this.setForeground(Color.black);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }
    @Override
    public void actionPerformed(ActionEvent e) {   //This listen for an event
        if(e.getSource()==button){
            this.dispose();
            new LoginPage(iDandPasswords.getLoginINfo());
        }
    }
}
