package sample;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckingAccount  extends  JFrame implements ActionListener{

    OptionMenu optionMenu;
    JButton button1,button2, button3, goBack = new JButton();

    public void getChecking(){

        button1 = new JButton("View Balance");
        button1.setBackground(Color.black);
        button1.setFont(new Font("Comic Sans", Font.BOLD,25));
        button1.addActionListener(this);

        button2 = new JButton("Withdraw Funds");
        button2.setBackground(Color.black);
        button2.setFont(new Font("Comic Sans", Font.BOLD,25));
        button2.addActionListener(this);

        button3 = new JButton("Deposit funds");
        button3.setFont(new Font("Comic Sans", Font.BOLD,25));
        button3.setBackground(Color.black);
        button3.addActionListener(this);

        goBack = new JButton("Go back");
        goBack.setFont(new Font("Comic Sans", Font.BOLD,25));
        goBack.setBackground(Color.black);
        goBack.addActionListener(this);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,600);
        this.setLayout(new GridLayout(4,1));
        this.add(button1);
        this.add(button2);
        this.add(button3);
        this.add(goBack);
        this.setVisible(true);
    }
    DisplayAccounts da;

    @Override
    public void actionPerformed(ActionEvent e) {
        CalculateAccounts calculateAccounts = new CalculateAccounts();
        if(e.getSource() == goBack){
            optionMenu.setVisible(true);
            this.dispose();
        }
        else if(e.getSource() == button1){
            da.displayCbalance();
        }
        else if(e.getSource()== button2){
            calculateAccounts.displayAccounts = da;
            calculateAccounts.calculateAccounts();
        }
        else if (e.getSource() == button3){
            calculateAccounts.displayAccounts = da;
            calculateAccounts.isDeposite = true;
            calculateAccounts.calculateAccounts();
        }
    }
}

