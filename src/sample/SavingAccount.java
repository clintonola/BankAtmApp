package sample;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SavingAccount extends JFrame implements ActionListener {

    OptionMenu optionMenu;
    JButton ViewBal,WdrawFunds,DepoFunds,goBack= new JButton();

    public void getSaving(){

        ViewBal = new JButton("View Balance");
        ViewBal.setBackground(Color.black);
        ViewBal.setFont(new Font("Comic Sans", Font.BOLD,25));
        ViewBal.addActionListener(this);

        WdrawFunds = new JButton("Withdraw Funds");
        WdrawFunds.setBackground(Color.black);
        WdrawFunds.setFont(new Font("Comic Sans", Font.BOLD,25));
        WdrawFunds.addActionListener(this);

        DepoFunds= new JButton("Deposit funds");
        DepoFunds.setFont(new Font("Comic Sans", Font.BOLD,25));
        DepoFunds.setBackground(Color.black);
        DepoFunds.addActionListener(this);

        goBack = new JButton("Go back");
        goBack.setFont(new Font("Comic Sans", Font.BOLD,25));
        goBack.setBackground(Color.black);
        goBack.addActionListener(this);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,600);
        this.setLayout(new GridLayout(4,1));
        this.add(ViewBal);
        this.add(WdrawFunds);
        this.add(DepoFunds);
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

        } else if(e.getSource() == ViewBal){
            da.displaySbalance();

        } else if (e.getSource() == DepoFunds){
            calculateAccounts.displayAccounts = da;
            calculateAccounts.isDeposite = true;
            calculateAccounts.isSaving = true;
            calculateAccounts.calculateAccounts();

        } else if(e.getSource()== WdrawFunds){
            calculateAccounts.displayAccounts = da;
            calculateAccounts.isSaving = true;
            calculateAccounts.calculateAccounts();
        }
    }
}
