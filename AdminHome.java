
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminHome extends JFrame {
    JLabel background;

    AdminHome(String title) {
        super(title);
        setSize(1000, 600);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        ImageIcon i1 = new ImageIcon("Saved Pictures/bg.png");

        Image q1 = i1.getImage().getScaledInstance(1000, 600,

                Image.SCALE_DEFAULT);

        ImageIcon i2 = new ImageIcon(q1);
        JLabel l3 = new JLabel(i2);
        l3.setBounds(0, 0, 1000, 600);
        add(l3);

        JLabel header = new JLabel("ONLINE EVENT MANAGEMENT SYSTEM",
                SwingConstants.CENTER);
        header.setBounds(0, 10, 1000, 100);
        header.setFont(new Font("", Font.BOLD, 25));
        header.setForeground(Color.white);
        l3.add(header);
        JButton button2 = new JButton(" VANUE MANAGEMENT");
        button2.setBackground(Color.BLACK);
        button2.setForeground(Color.WHITE);
        button2.setBounds(120, 210, 129, 36);
        l3.add(button2);
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new VanueM(" ").setVisible(true);
            }
        });
        JButton buttonc = new JButton(" TOTAL COST");
        buttonc.setBackground(Color.BLACK);
        buttonc.setForeground(Color.WHITE);
        buttonc.setBounds(290, 210, 129, 36);
        l3.add(buttonc);
        buttonc.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new TotalCost("").setVisible(true);
                ;
            }
        });
        JButton button1 = new JButton("CUSTOMER DETAIL");
        button1.setBackground(Color.BLACK);
        button1.setForeground(Color.WHITE);
        button1.setBounds(470, 210, 129, 36);
        l3.add(button1);
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new CustomerD("").setVisible(true);
                ;
            }

        });
        JButton button3 = new JButton(" FOOD MANAGEMENT");
        button3.setBackground(Color.BLACK);
        button3.setForeground(Color.WHITE);
        button3.setBounds(100, 265, 140, 36);
        l3.add(button3);
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new FoodVP(" ").setVisible(true);
            }
        });
        JButton button5 = new JButton(" MANAGE NOTIFICATION ");
        button5.setBackground(Color.BLACK);
        button5.setForeground(Color.WHITE);
        button5.setBounds(290, 265, 130, 36);
        l3.add(button5);
        button5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new NotificationP(" MANAGE NOTIFICATION").setVisible(true);
            }
        });
        JButton button = new JButton(" EQUIPMENT MANAGEMENT");
        button.setBackground(Color.BLACK);
        button.setForeground(Color.WHITE);
        button.setBounds(470, 265, 129, 36);
        l3.add(button);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new EquipmentPM(" EQUIPMENT").setVisible(true);
                ;
            }
        });
        /*
         * JButton buttonh= new JButton("BOOKING HISTORY");
         * buttonh.setBackground(Color.BLACK);
         * buttonh.setForeground(Color.WHITE);
         * buttonh.setBounds(650, 210, 129, 36);
         * l3.add(buttonh);
         * buttonh.addActionListener(new ActionListener() {
         * public void actionPerformed(ActionEvent e) {
         * try{
         * String s[] = new
         * String[]{"Name","Venue","Caterer","Number of Persons"};
         * setVisible(false);
         * 
         * System.out.println("Add Venue");
         * new Bookings(s).setVisible(true);
         * 
         * }catch(Exception ex ){}
         * }
         * });
         */
        JButton button6 = new JButton("BACK");
        button6.setBackground(Color.BLACK);

        button6.setForeground(Color.WHITE);
        button6.setBounds(650, 265, 129, 36);
        l3.add(button6);
        button6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new EMStartP(" MAIN PANEL").setVisible(true);
                ;
            }
        });
        JLabel label3 = new JLabel("Welcome to panel!");
        label3.setBounds(384, 33, 168, 22);
        label3.setBackground(Color.WHITE);
        l3.add(label3);
        setSize(901, 499); // frame
        setLayout(null); // frame
        setVisible(true); // frame
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }
}
