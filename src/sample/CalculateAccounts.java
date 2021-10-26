package sample;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculateAccounts implements ActionListener {

    JFrame frame;
    JTextField textField;
    JButton[] numberButton = new JButton[10];
    JButton[] actionButton = new JButton[2];
    JButton delButton, entButton;
    JPanel panel;
    double amount;
    boolean isDeposite =  false;
    boolean isSaving = false;

   // CheckingAccount checkingAccount = new CheckingAccount();
    DisplayAccounts displayAccounts;

    Font myfont = new Font("Ink Free",Font.BOLD,30);

    public void calculateAccounts(){

        frame = new JFrame("Calculator");
        frame.setSize(420,550);
        frame.setLayout(null);

        textField = new JTextField();
        textField.setBounds(50,25,300,50);
        textField.setFont(myfont);
        textField.setEditable(false);

        delButton = new JButton("Delete");
        entButton = new JButton("Enter");

        actionButton[0] = delButton;
        actionButton[1] = entButton;

        for(int i =0; i<2;i++){
            actionButton[i].addActionListener(this);
            actionButton[i].setFont(myfont);
        }
        for(int i = 0; i < 10; i++){
            numberButton[i] = new JButton(String.valueOf(i));
            numberButton[i].addActionListener(this);
            numberButton[i].setFont(myfont);
        }
        delButton.setBounds(50,430,145,50);
        entButton.setBounds(205,430,145,50);

        panel = new JPanel();
        panel.setBounds(50,100,300,300);
        panel.setLayout(new GridLayout(4,4,10,10));

        panel.add(numberButton[1]);
        panel.add(numberButton[2]);
        panel.add(numberButton[3]);
        panel.add(numberButton[4]);
        panel.add(numberButton[5]);
        panel.add(numberButton[6]);
        panel.add(numberButton[7]);
        panel.add(numberButton[8]);
        panel.add(numberButton[9]);
        panel.add(numberButton[0]);

        frame.add(panel);
        frame.add(delButton);
        frame.add(entButton);
        frame.add(textField);
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        for(int i=0;i<10;i++){
            if(e.getSource() == numberButton[i]){
                textField.setText(textField.getText().concat(String.valueOf(i)));
            }
        }
        if(e.getSource() == entButton){
            amount = Double.parseDouble(textField.getText());
            if(isSaving){
                if(isDeposite){
                    displayAccounts.CalSavingDeposit(amount);
                }
                else{
                    displayAccounts.CalSavingWithdraw(amount);
                }
            }
             else if(isDeposite){
                displayAccounts.CalCheckingDeposit(amount);
            }
            else{
                displayAccounts.CalCheckingWithdraw(amount);
            }
            frame.dispose();
        }
        if(e.getSource() == delButton){
            String string = textField.getText();
            textField.setText("");
            for(int i=0;i<string.length()-1;i++){
                textField.setText(textField.getText()+string.charAt(i));
            }
        }
    }
}
