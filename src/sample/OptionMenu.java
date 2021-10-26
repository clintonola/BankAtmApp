package sample;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

    public class OptionMenu extends JFrame implements ActionListener {

        JButton button1, button2, button3;
        DisplayAccounts displayAccounts = new DisplayAccounts();

        //constructor
        OptionMenu() {
            //import image icon
            ImageIcon image = new ImageIcon("black C.jpg"); //add this later

            button1 = new JButton();
            button1.setBackground(Color.black);
            button1.setBounds(625, 600, 250, 70);
            button1.setText("Checking Account");
            button1.setFocusable(false);
            button1.setHorizontalTextPosition(JButton.CENTER);
            button1.setVerticalTextPosition(JButton.BOTTOM);
            button1.setFont(new Font("Comic Sans", Font.BOLD, 15));
            button1.setForeground(new Color(00, 0, 0));
            button1.addActionListener(this);

            button2 = new JButton();
            button2.setBounds(625, 675, 250, 70);
            button2.setText("Savings Account");
            button2.setFocusable(false);
            button2.setHorizontalTextPosition(JButton.CENTER);
            button2.setVerticalTextPosition(JButton.BOTTOM);
            button2.setFont(new Font("Comic Sans", Font.BOLD, 15));
            button2.setForeground(new Color(0, 0, 0));
            button2.addActionListener(this);

            button3 = new JButton();
            button3.setBounds(1000, 725, 100, 50);
            button3.setText("Exit");
            button3.setFocusable(false);
            button3.setHorizontalTextPosition(JButton.CENTER);
            button3.setVerticalTextPosition(JButton.BOTTOM);
            button3.setFont(new Font("Comic Sans", Font.BOLD, 15));
            button3.setForeground(new Color(255, 0, 0));
            button3.addActionListener(this);

            JLabel label = new JLabel(); //create label
            label.setText("Select account to access");
            label.setIcon(image);
            label.setHorizontalTextPosition(JLabel.CENTER);
            label.setVerticalTextPosition(JLabel.BOTTOM);
            label.setForeground(new Color(255, 255, 255));
            label.setFont(new Font("MV Boli", Font.PLAIN, 20));//set font color
            label.setBackground(Color.black); // backgroundcolor
            label.setOpaque(true);
            label.setVerticalAlignment(JLabel.CENTER); //set vertical center
            label.setHorizontalAlignment(JLabel.CENTER); // set horizental center
            label.setBounds(400, 30, 700, 750);

            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setSize(500, 500);
            this.setBackground(Color.BLACK);
            this.setForeground(Color.BLACK);
            this.setLayout(null);
            this.setVisible(true);
            this.add(button1);
            this.add(button2);
            this.add(button3);
            this.add(label);
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == button1){
                CheckingAccount checkingAccount = new CheckingAccount();
                this.setVisible(false);
                checkingAccount.da = displayAccounts;
                checkingAccount.optionMenu = this;
                checkingAccount.getChecking();
            }
            else if (e.getSource() == button2){
                SavingAccount savingAccount = new SavingAccount();
                this.setVisible(false);
                savingAccount.da = displayAccounts;
                savingAccount.optionMenu = this;
                savingAccount.getSaving();
            }
            else if (e.getSource() == button3);
            this.dispose();
        }
    }

