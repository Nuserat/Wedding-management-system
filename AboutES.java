import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AboutES extends JFrame {
    AboutES(String Title) {
        super(Title);
        setSize(1000, 600);
        ImageIcon i1 = new ImageIcon("about.jpg");
        JLabel l1 = new JLabel(i1);
        l1.setBounds(0, 0, 1000, 536);
        add(l1);
        JLabel header = new JLabel("ONLINE EVENT MANAGEMENT SYSTEM", SwingConstants.CENTER);
        header.setBounds(0, 0, 900, 100);
        header.setOpaque(true);
        header.setFont(new Font("", Font.BOLD, 25));
        header.setForeground(Color.white);
        add(header);
        JButton button3 = new JButton(" BACK ");
        button3.setBackground(Color.BLACK);
        button3.setForeground(Color.WHITE);
        button3.setBounds(300, 100, 200, 36);
        add(button3);
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                EMStartP st = new EMStartP(" HOME Panel");
                st.setVisible(true);

            }

        });
        JLabel list = new JLabel("<html>Welcome to our project. <br>The event Management System project is a <br>.",
                SwingConstants.CENTER);
        list.setBounds(0, 136, 900, 480);
        list.setOpaque(true);
        list.setForeground(Color.gray);
        list.setFont(new Font("", Font.BOLD, 17));
        add(list);
        setSize(1000, 600);
        setLayout(null);
        setVisible(true);

    }
}