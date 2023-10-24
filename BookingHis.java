import javax.swing.JFrame;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class BookingHis extends JFrame {

  String money, name, card;

  BookingHis(String title) {
    super(title);
    setSize(1000, 600);
    JLabel l, l3;
    setBounds(500, 300, 1000, 600);
    l = new JLabel("NOT BOOKED ANYTHING YET ??");
    l.setFont(new Font("Times New Roman", Font.BOLD, 30));
    l.setForeground(Color.WHITE);
    l.setBounds(200, 40, 600, 100);
    add(l);
    l3 = new JLabel("Book now!!");
    l3.setFont(new Font("Times New Roman", Font.BOLD, 30));
    l3.setForeground(Color.WHITE);
    l3.setBounds(250, 100, 300, 100);
    add(l3);
    ImageIcon i1 = new ImageIcon("xyz.jpg");

    JLabel l1 = new JLabel(i1);
    l1.setBounds(0, 0, 1000, 600);
    add(l1);
    JButton b1 = new JButton("BOOK EVENT");
    b1.setBackground(Color.WHITE);
    b1.setForeground(Color.BLACK);
    b1.setBounds(250, 300, 150, 30);
    l1.add(b1);
    b1.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        setVisible(false);

        new BookEvent("Booking").setVisible(true);

      }
    });
    JButton b2 = new JButton("BACK");
    b2.setBackground(Color.WHITE);
    b2.setForeground(Color.BLACK);
    b2.setBounds(500, 300, 150, 30);
    l1.add(b2);
    b2.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        setVisible(false);

        new CustomerHome("admin").setVisible(true);

      }
    });
    setSize(900, 600); // frame
    setLayout(null); // frame
    setVisible(true); // frame
    setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
  }

}