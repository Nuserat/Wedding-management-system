
import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.ActionEvent;

public class SIgnup2 extends JFrame {

    SIgnup2(String title) {
        super(title);
        setSize(1000, 600);
        ImageIcon i1 = new ImageIcon("logz.jpg");

        Image q1 = i1.getImage().getScaledInstance(1000, 600,

                Image.SCALE_DEFAULT);

        ImageIcon i2 = new ImageIcon(q1);
        JLabel l3 = new JLabel(i2);
        l3.setBounds(0, 0, 1000, 600);
        add(l3);
        JLabel label1 = new JLabel("EVENT MANAGEMENT SYSTEM ");
        label1.setFont(new Font("Tahoma", Font.BOLD, 20));
        label1.setForeground(Color.white);
        label1.setBounds(315, 10, 386, 45);
        l3.add(label1);

        final JLabel label = new JLabel();
        label.setBounds(20, 150, 200, 50);
        final JPasswordField value = new JPasswordField();
        value.setBounds(140, 200, 300, 30);
        JLabel l1 = new JLabel("Username:");
        l1.setBounds(40, 150, 117, 40);
        l1.setForeground(Color.white);
        JLabel l2 = new JLabel("Password:");
        l2.setBounds(40, 200, 117, 40);
        l2.setForeground(Color.white);

        JButton b = new JButton("Login");
        b.setBounds(140, 300, 129, 36);
        final JTextField text = new JTextField();
        text.setBounds(140, 150, 300, 30);
        JButton b1 = new JButton("Back");
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(400, 300, 129, 36);
        l3.add(value);
        l3.add(l1);
        l3.add(label);
        l3.add(l2);
        l3.add(b);
        l3.add(b1);
        l3.add(text);
        setSize(901, 499);
        setLayout(null);
        setVisible(true);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new EMStartP("ADMIN PANEL").setVisible(true);
            }
        });
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                File file = new File("user1.txt");
                try {
                    String userName = text.getText();
                    String password = new String(value.getPassword());
                    Scanner input = new Scanner(file);
                    String user = input.nextLine();
                    String pass = input.nextLine();
                    if (userName.equals(user) && password.equals(pass)) {
                        setVisible(false);
                        new CustomerHome(" VANUE portal").setVisible(rootPaneCheckingEnabled);
                    } else {
                        label.setText("Incorrect Password or Username");
                    }
                    input.close();
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(AdminP.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });

    }
}