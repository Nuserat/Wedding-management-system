import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

class foodlist extends JFrame {
    int i = 0;

    foodlist(String title) {
        super(title);
        setSize(1000, 800);
        this.getContentPane().setBackground(Color.pink);
        try {
            setTitle("Event Management System");
            this.setSize(900, 800);
            String[][] data = new String[0][3];
            String[] column = { "FOOD ID", "FOOD NAME", "FOOD COST" };
            DefaultTableModel model = new DefaultTableModel(data,
                    column);
            JTable jt = new JTable(model) {
                public boolean isCellEditable(int data, int column) {
                    return false;
                }
            };
            File g = new File("food.txt");
            Scanner sc = new Scanner(g);
            while (sc.hasNext()) {
                String[] data1 = new String[3];
                data1[0] = sc.nextLine();
                data1[1] = sc.nextLine();
                data1[2] = sc.nextLine();
                model.addRow(data1);
            }
            JScrollPane sp = new JScrollPane(jt);
            sp.setBounds(20, 40, 850, 400);

            this.add(sp);
            this.setLayout(null);
            this.setVisible(true);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        } catch (FileNotFoundException ex) {
           System.out.println(ex);  
            setVisible(false);
        }
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        setLayout(null);
    }

}

public class FoodVP extends JFrame {
    FoodVP(String title) {
        super(title);
        setSize(1000, 800);
        JLabel l = new JLabel("Food Ordering System");
        l.setBounds(50, 50, 300, 20);
        try {
            JButton button6 = new JButton("BACK");
            button6.setBackground(Color.BLACK);
            button6.setForeground(Color.WHITE);
             button6.setBounds(350, 450, 100, 36);
            add(button6);
            button6.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    setVisible(false);
                    new AdminHome(" PANEL").setVisible(true);
                    ;
                }
            });
            JTextField t1 = new JTextField(" ");
            t1.setBounds(100, 400, 180, 30);
            add(t1);
            JTextField t2 = new JTextField(" ");
            t2.setBounds(290, 400, 180, 30);
            add(t2);
            JTextField t3 = new JTextField(" ");
            t3.setBounds(490, 400, 180, 30);
            add(t3);
            File g = new File("food.txt");
            Scanner sc = new Scanner(g);
            FileWriter f = new FileWriter("food.txt", true);
            PrintWriter p = new PrintWriter(f);

            JButton b3 = new JButton("Remove");
            b3.setBounds(250, 450, 100, 36);
            add(b3);
            b3.setBackground(Color.BLACK);
            b3.setForeground(Color.WHITE);
            JButton b1 = new JButton("Add");
              b1.setBounds(150, 450, 129, 36);
            add(b1);
            b1.setBackground(Color.BLACK);
            b1.setForeground(Color.WHITE);
            String[][] data = new String[0][3];
            String[] column = { "FOOD ID", "FOOD NAME", "FOOD COST" };
            DefaultTableModel model = new DefaultTableModel(data, column);
            JTable jt = new JTable(model) {
                public boolean isCellEditable(int data, int column) {
                    return false;
                }
            };
            b3.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent z) {
                    System.out.println(jt.getSelectedRow());
                    int s = jt.getSelectedRow() * 3;
                    removeRecord("food.txt", s);
                    if (jt.getSelectedRow() != -1) {
                        model.removeRow(jt.getSelectedRow());

                        JOptionPane.showMessageDialog(null, "Selected row deleted successfully");
                    }
                }
            });
            jt.setBounds(30, 40, 500, 800);
            jt.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
            JScrollPane scroll = new JScrollPane(jt);
            scroll.setBounds(10, 100, 800, 350);
            add(scroll);
            while (sc.hasNext()) {
                String[] data1 = new String[3];
                data1[0] = sc.nextLine();
                data1[1] = sc.nextLine();
                data1[2] = sc.nextLine();
                model.addRow(data1);
            }

            b1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    int j = 0;
                    String s1 = t1.getText();
                    String s2 = t2.getText();
                    String s3 = t3.getText();
                    p.println(s1);

                    p.println(s2);
                    p.println(s3);
                    p.close();
                    String[] data1 = new String[3];
                    data1[0] = s1;
                    data1[1] = s2;
                    data1[2] = s3;
                    model.addRow(data1);
                }
            });
        } catch (IOException ex) {
            System.out.println(ex);  
        }

    }

    public void removeRecord(String filepath, int positionOfTerm) {
        String tempFile = "temp.txt";
        File oldFile = new File(filepath);
        File newFile = new File(tempFile);
        try {
            int i = 0;
            String[] junk = new String[100];
            FileWriter f = new FileWriter(tempFile, true);
            PrintWriter p = new PrintWriter(f);
            Scanner in = new Scanner(oldFile);
            while (in.hasNext()) {
                if (positionOfTerm == i || positionOfTerm + 1 == i ||
                        positionOfTerm + 2 == i) {
                    junk[i] = in.nextLine();
                } else {
                    p.println(in.nextLine());
                }
                i++;
            }
            p.close();
            oldFile.delete();
            File dump = new File(filepath);
            newFile.renameTo(dump);
        } catch (Exception e) {
            System.out.println(e);  
        }
        // Frame Initialization
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        setLayout(null);
    }
}