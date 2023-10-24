import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class BookEvent extends JFrame {
    JComboBox<String> c, cb, cb3, cb4, cb5;
    ArrayList<JComboBox> t = new ArrayList<JComboBox>();

    BookEvent(String title) {
        super(title);
        setSize(1000, 600);
        ImageIcon i1 = new ImageIcon("bg.jpg");
        Image q1 = i1.getImage().getScaledInstance(1000, 600,
                Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(q1);
        JLabel l3 = new JLabel(i2);
        l3.setBounds(0, 0, 1000, 600);
        add(l3);

        final JLabel label1 = new JLabel();
        label1.setHorizontalAlignment(JLabel.RIGHT);
        label1.setSize(800, 100);
        l3.add(label1);
        label1.setForeground(Color.white);
        final JLabel l1 = new JLabel();
        l1.setHorizontalAlignment(JLabel.RIGHT);
        l1.setSize(800, 100);
        l3.add(l1);
        l1.setForeground(Color.white);
        label1.setBounds(500, 100, 300, 30);
        final JLabel label2 = new JLabel();
        label2.setHorizontalAlignment(JLabel.RIGHT);
        label2.setSize(800, 100);
        l3.add(label2);
        label2.setForeground(Color.white);
        label2.setBounds(500, 150, 300, 30);
        final JLabel label3 = new JLabel();
        label3.setHorizontalAlignment(JLabel.RIGHT);
        label3.setSize(800, 100);
        l3.add(label3);
        label3.setForeground(Color.white);
        label3.setBounds(500, 200, 300, 30);
        final JLabel label4 = new JLabel();
        label4.setHorizontalAlignment(JLabel.RIGHT);
        label4.setSize(800, 100);
        l3.add(label4);
        label4.setForeground(Color.white);
        label4.setBounds(500, 250, 300, 30);
        JLabel labelx = new JLabel("Event :");
        labelx.setBounds(40, 100, 117, 40);
        l3.add(labelx);
        labelx.setForeground(Color.white);
        JLabel labelm = new JLabel("Vanue Place :");
        labelm.setBounds(40, 150, 117, 40);
        l3.add(labelm);
        labelm.setForeground(Color.white);
        JLabel labeln = new JLabel("Food Item:");
        labeln.setBounds(40, 200, 117, 40);
        l3.add(labeln);
        labeln.setForeground(Color.white);
        JLabel labelx1 = new JLabel("Date :");
        labelx1.setBounds(40, 250, 117, 40);
        labelx1.setForeground(Color.white);
        l3.add(labelx1);
        JLabel lax1 = new JLabel("Number of Guest :");
        lax1.setBounds(40, 300, 117, 40);
        lax1.setForeground(Color.white);
        l3.add(lax1);
        ArrayList<ArrayList<String>> lab = new ArrayList<ArrayList<String>>();
        String[] sw = new String[] { "EVENT", "VANUE", "FOODTYPE", "Caterer", "Date", "No. of persons" };
        String EVENT[] = { " WEDDING ", " PARTY ", " CONFERENCE", "FAMILY EVENT", "BIRTHDAY", " SEMINER",
                " THEME PARTY" };
        cb = new JComboBox<>(EVENT);
        cb.setBounds(150, 100, 150, 35);
        l3.add(cb);
        String VANUE[] = { " OPEN AIR ", " HOME ", " HOTEL", " OUTDOOR", " CANTONMENT ", " CONVENTIONAL HALL" };
        c = new JComboBox<>(VANUE);
        c.setBounds(150, 150, 150, 35);
        l3.add(c);
        String FOODTYPE[] = { " CONTINENTAL ", " BUFFET ", " FASTFOOD", " NORMAL" };
        cb3 = new JComboBox<>(FOODTYPE);
        cb3.setBounds(150, 200, 150, 35);
        l3.add(cb3);

        setLayout(null);
        setSize(901, 499);
        setVisible(true);
        String Date[] = { " JANUARY ", " FEBRUARY ", " MARCH", "APRIL", "MAY", "JYNE", "JULY",
                "AUGUST", "SEPTEMBER", "OCTBER", "NOVEMBER", "DECEMBER"
        };
        cb4 = new JComboBox<>(Date);
        cb4.setBounds(150, 250, 100, 35);
        l3.add(cb4);
        String YEAR[] = { " 2023 ", " 2024 ", "2025" };
        cb5 = new JComboBox<>(YEAR);
        cb5.setBounds(250, 250, 100, 35);
        l3.add(cb5);
        SpinnerModel value = new SpinnerNumberModel(31, 1, 31, 1);
        JSpinner spinner = new JSpinner(value);
        spinner.setBounds(350, 250, 50, 35);
        l3.add(spinner);
        spinner.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                String date = "DATE : " + ((JSpinner) e.getSource()).getValue();
                String date2 = "- " +
                        cb4.getItemAt(cb4.getSelectedIndex());
                String date3 = "- " +
                        cb5.getItemAt(cb5.getSelectedIndex());
                label4.setText(" " + date + " " + date2 + " " + date3);
            }
        });
        setSize(901, 499); // frame
        setLayout(null); // frame
        setVisible(true); // frame
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        JButton b = new JButton("TOTAL");
        b.setBounds(150, 350, 100, 30);
        l3.add(b);
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        JButton button7 = new JButton(" PAYMENT ");
        button7.setBackground(Color.BLACK);
        button7.setForeground(Color.WHITE);
        button7.setBounds(300, 350, 129, 36);
        l3.add(button7);
        button7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new PaymentES("PAYING PANEL").setVisible(true);
            }
        });
        JButton b1 = new JButton("back");
        b1.setBounds(0, 0, 100, 30);
        l3.add(b1);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new CustomerHome(" ").setVisible(true);
            }
        });
        JTextField t2 = new JTextField();
        t2.setBounds(150, 300, 100, 35);
        l3.add(t2);
        JButton button = new JButton(" BOOK ");
        button.setBackground(Color.BLACK);
        button.setForeground(Color.WHITE);
        button.setBounds(530, 350, 129, 36);
        l3.add(button);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    setVisible(false);
                    String type = cb.getItemAt(cb.getSelectedIndex());

                    String venue = cb3.getItemAt(cb3.getSelectedIndex());
                    String photographer = c.getItemAt(c.getSelectedIndex());
                    String numberOfPersons = t2.getText();
                    System.out.println(numberOfPersons);

                    try {
                        FileWriter fw = new FileWriter("food.txt", true);
                        fw.write(type + "\t" + venue + "\t" +
                                photographer + "\t" + numberOfPersons + "\t" + "\n");
                        System.out.println(type + "\t" + venue + "\t" +
                                photographer + "\t" + numberOfPersons + "\t" + "\n");
                        fw.close();

                        Frame f = new JFrame();
                        JOptionPane.showMessageDialog(f, "Event added successfully");
                        setVisible(false);
                        // new Dashboard2().setVisible(true);
                    } catch (Exception ex) {
                        System.out.println(ex);
                    }
                } catch (Exception ex1) {
                    JOptionPane.showMessageDialog(null, "Error while adding");
                }

            }
        });
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String data = "BOOKED EVENT : " +
                        cb.getItemAt(cb.getSelectedIndex());
                String data2 = "FOOD : " +
                        cb3.getItemAt(cb3.getSelectedIndex());
                String data3 = "VANUE TYPE : " +
                        c.getItemAt(c.getSelectedIndex());
                label1.setText(data);
                label2.setText(data2);
                label3.setText(data3);
                float amount = 0;
                String msg = "";
                if (c.getSelectedIndex() == 0) {
                    amount += 5000;
                    msg += "Vanue = 5000";

                } else if (c.getSelectedIndex() == 1) {
                    amount += 2000;
                    msg += "Vanue = 2000";

                } else if (c.getSelectedIndex() == 2) {
                    amount += 9000;
                    msg += "Vanue = 9000";

                } else if (c.getSelectedIndex() == 3) {
                    amount += 7000;
                    msg += "Vanue = 7000";
                } else if (c.getSelectedIndex() == 4) {
                    amount += 18000;
                    msg += "Vanue = 18000";

                } else if (c.getSelectedIndex() == 5) {
                    amount += 15000;
                    msg += "Vanue = 15000";
                }
                if (cb3.getSelectedIndex() == 0) {
                    amount += 20000;
                    msg += "\nFood = 20000";

                } else if (cb3.getSelectedIndex() == 1) {
                    amount += 18000;
                    msg += "\nFood = 18000";

                } else if (cb3.getSelectedIndex() == 2) {
                    amount += 13000;
                    msg += "\nFood= 13000";

                } else if (cb3.getSelectedIndex() == 3) {
                    amount += 15000;
                    msg += "\nFood = 15000";

                }
                if (cb.getSelectedIndex() == 0) {
                    amount += 15000;

                    msg += "\nEnvent = 15000";
                    // l1.setText("5000");
                } else if (cb.getSelectedIndex() == 1) {
                    amount += 11000;
                    msg += "\nEvent= 11000";
                    // l1.setText("5000");
                } else if (cb.getSelectedIndex() == 2) {
                    amount += 13000;

                    msg += "\nEvent = 13000\n";

                } else if (cb.getSelectedIndex() == 3) {
                    amount += 22000;

                    msg += "\nEvent = 22000\n";

                } else if (cb.getSelectedIndex() == 4) {
                    amount += 16000;
                    msg += "\nEvent = 15000\n";
                } else if (cb.getSelectedIndex() == 5) {
                    amount += 15000;

                    msg += "\nEvent = 15000\n";

                }
                msg += "-----------------\n";
                JOptionPane.showMessageDialog(b, msg + "Total: " +
                        amount);
            }
        });
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        setLayout(null);
    }
}
