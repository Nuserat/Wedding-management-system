import java.awt.*;
import javax.swing.*;

import java.awt.event.*;

public class CustomerHome extends JFrame {
JMenu HOME, EXIT, about;
JMenuBar mb;
    CustomerHome(String title) {
        super(title);
        setSize(1000, 600);
        ImageIcon i1 = new ImageIcon("bg1.jpg");
        JLabel l1 = new JLabel(i1);
        l1.setBounds(0, 0, 1000, 536);
        add(l1);
        mb = new JMenuBar();
        HOME = new JMenu("HOME");
        about = new JMenu("CONTACT US");
        EXIT = new JMenu("EXIT");
        mb.add(HOME);
        mb.add(EXIT);
        mb.add(about);
        mb.setBackground(Color.gray);
        setJMenuBar(mb);
        about.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {

                setVisible(false);
              //  new ContactUs("CONTACT US").setVisible(true);
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });
        EXIT.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                setVisible(false);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });
        HOME.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                setVisible(false);
                new EMStartP(" HOME Panel").setVisible(true);
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }

        });
        JButton button2 = new JButton("VIEW VANUE ");
        button2.setBackground(Color.BLACK);
        button2.setForeground(Color.WHITE);
        button2.setBounds(120, 210, 129, 36);
        l1.add(button2);
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new ViewVanue(" ").setVisible(true);
            }
        });
        JButton button = new JButton("UPDATE PROFILE");
        button.setBackground(Color.BLACK);
        button.setForeground(Color.WHITE);
        button.setBounds(290, 210, 129, 36);
        l1.add(button);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                UpdateCP x = new UpdateCP();
                ;
            }
        });
        JButton button3 = new JButton(" FOOD ITEM ");
        button3.setBackground(Color.BLACK);
        button3.setForeground(Color.WHITE);
        button3.setBounds(470, 210, 129, 36);
        l1.add(button3);
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new ViewFood(" ").setVisible(true);
            }
        });
        JButton button4 = new JButton("BOOKING HISTORY");
        button4.setBackground(Color.BLACK);
        button4.setForeground(Color.WHITE);
        button4.setBounds(100, 265, 140, 36);
        l1.add(button4);

        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new BookingHis("").setVisible(true);
                ;
            }
        });
        JButton button5 = new JButton(" NOTIFICATION ");
        button5.setBackground(Color.BLACK);
        button5.setForeground(Color.WHITE);
        button5.setBounds(290, 265, 130, 36);
        l1.add(button5);
        button5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new NotificationP(" ").setVisible(true);
            }
        });
        JButton button1 = new JButton("VIEW EQUIPMENT ");
        button1.setBackground(Color.BLACK);
        button1.setForeground(Color.WHITE);
        button1.setBounds(470, 265, 129, 36);
        l1.add(button1);
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                BookV s = new BookV(" ");
                ;
            }
        });
        JButton button6 = new JButton("BOOK EVENT ");
        button6.setBackground(Color.BLACK);
        button6.setForeground(Color.WHITE);
        button6.setBounds(650, 210, 129, 36);
        l1.add(button6);
        button6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new BookEvent("BOOKING PANEL").setVisible(true);
            }
        });
        JButton buttonb = new JButton(" BACK ");
        buttonb.setBackground(Color.BLACK);
        buttonb.setForeground(Color.WHITE);
        buttonb.setBounds(650, 265, 129, 36);
        l1.add(buttonb);
        buttonb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new EMStartP(" START PANEL").setVisible(true);
            }
        });

        setSize(900, 536); // frame
        setLayout(null); // frame
        setVisible(true); // frame
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }
}