package sample;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

//class to display account balance
public class DisplayAccounts extends JFrame implements ActionListener {

    double newCaccountBalance;
    double newSaccountBalance;
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
    JTextArea jTextArea = new JTextArea();

    public void CalCheckingDeposit ( double newCaccountBalance){
        this.newCaccountBalance = (this.newCaccountBalance + newCaccountBalance);
    }
    public void CalCheckingWithdraw ( double newCaccountBalance){
        double temp = (this.newCaccountBalance - newCaccountBalance);
        if((temp) >= 0){
            this.newCaccountBalance = temp;
        }   else{
            JOptionPane.showMessageDialog (null,"Balance cant be negative "
                                    + "Your current Balance is : " + this.newCaccountBalance,
                    "Error",JOptionPane.WARNING_MESSAGE);
        }
    }
    //caclulate saving account withdrawl
    public void CalSavingDeposit (double newSaccountBalance){
        this.newSaccountBalance = (this.newSaccountBalance + newSaccountBalance);
    }
    //caclulate saving account withdrawl
    public void CalSavingWithdraw (double newSaccountBalance){
        double temp = (this.newSaccountBalance - newSaccountBalance);
        if((temp) >= 0){
            this.newSaccountBalance = temp;
        }   else{
            JOptionPane.showMessageDialog(null," Balance cant be negative "
                            + " Your current Balance is : " + moneyFormat.format(this.newSaccountBalance)
                    , "Error",JOptionPane.WARNING_MESSAGE);
        }
    }
    public void displayCbalance (){

        JFrame frame = new JFrame();

        jTextArea.setText("Checking account balance is : ");
        jTextArea.append(String.valueOf(moneyFormat.format(this.newCaccountBalance)));
        jTextArea.setFont(new Font("Comic Sans", Font.BOLD,25));
        jTextArea.setEditable(false);

        frame.setSize(500,600);
        frame.setLayout(new FlowLayout());
        frame.add(jTextArea);
        frame.setVisible(true);
    }
    public void displaySbalance (){

        JFrame frame = new JFrame();

        jTextArea.setText("Saving account balance is : ");
        jTextArea.append(String.valueOf(moneyFormat.format(this.newSaccountBalance)));
        jTextArea.setFont(new Font("Comic Sans", Font.BOLD,25));
        jTextArea.setEditable(false);

        frame.setSize(500,600);
        frame.setLayout(new FlowLayout());
        frame.add(jTextArea);
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
    }
}
