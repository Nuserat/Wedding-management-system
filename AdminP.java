import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.ActionEvent;

public class AdminP extends JFrame {
    JLabel background;

    AdminP(String title) {
        super(title);
        setSize(1000, 600);
        FileReader reader = null;
        ImageIcon i1 = new ImageIcon("bg3.jpg");
        Image q1 = i1.getImage().getScaledInstance(1000, 600, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(q1);
        JLabel l3 = new JLabel(i2);
        l3.setBounds(0, 0, 1000, 600);
        add(l3);
        JLabel label1 = new JLabel("EVENT MANAGEMENT SYSTEM ");
        label1.setFont(new Font("Tahoma", Font.BOLD, 20));
        label1.setForeground(Color.white);
        label1.setBounds(315, 10, 600, 100);
        l3.add(label1);
        JLabel label = new JLabel();
        label.setBounds(20, 150, 200, 50);
        label.setForeground(Color.white);
        final JPasswordField value = new JPasswordField();
        value.setBounds(140, 200, 300, 30);
        JLabel l1 = new JLabel("Username:");
        l1.setBounds(40, 150, 117, 40);
        l1.setForeground(Color.white);
        JLabel l2 = new JLabel("Password:");
        l2.setBounds(40, 200, 117, 40);
        l2.setForeground(Color.white);
        JButton b = new JButton("Login");
        b.setBounds(180, 300, 129, 36);
        b.setBackground(Color.white);
        b.setForeground(Color.black);
        final JTextField text = new JTextField();
        text.setBounds(140, 150, 300, 30);
        JButton b1 = new JButton("Back");
        b1.setBounds(400, 300, 129, 36);
        b1.setBackground(Color.white);
        b1.setForeground(Color.black);
        l3.add(value);
        l3.add(l1);
        l3.add(label);
        l3.add(l2);
        l3.add(b);
        l3.add(text);

        setSize(901, 499);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                File file = new File("user.txt");
                try {
                    String userName = text.getText();
                    String password = new String(value.getPassword());
                    Scanner input = new Scanner(file);
                    String user = input.nextLine();
                    String pass = input.nextLine();
                    if (userName.equals(user) && password.equals(pass)) {
                        setVisible(false);
                        new AdminHome(" MANAGE NOTIFICATION").setVisible(true);
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