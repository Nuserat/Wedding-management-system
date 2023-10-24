import javax.swing.table.JTableHeader;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class VanueM extends JFrame {
    JLabel background, todayHeader, addHeader, dueHeader, mealH;
    JPanel panel;
    JMenuBar mb;
    JTable due;
    JTableHeader header;
    JMenu back;
    JButton add;
    JScrollPane sp;
    JComboBox<String> cb;
    JTextArea meal;

    VanueM(String title) {
        super(title);
        setSize(900, 800);
        // Today Header
        mb = new JMenuBar();
        back = new JMenu("BACK");
        mb.add(back);
        mb.setBackground(Color.gray);
        setJMenuBar(mb);
        // Meal List
        String data[][] = {
                { " 1", " BIRTHDAY ", "15000 " },
                { " 2", " FAMILY EVENT", "11000 " },
                { " 3", " SEMINER", "13000" },
                { " 4", " WEDDING", "22000" },
                { " 5", " PARTY", "16000" },
                { " 6", " CONFERENCE", "15000" }
        };
        String column[] = { "VANUE ID", "VANUE NAME", "VANUE COST" };
        due = new JTable(data, column);
        sp = new JScrollPane(due);
        due.setFont(new Font("", Font.CENTER_BASELINE, 14));
        sp.setBounds(50, 100, 800, 300);
        sp.setFont(new Font("", Font.CENTER_BASELINE, 16));
        due.setRowHeight(30);
        header = due.getTableHeader();
        header.setPreferredSize(new Dimension(200, 40));
        header.setFont(new Font("", Font.CENTER_BASELINE, 16));
        add(sp);

        // Add Menu

        add = new JButton("Add");
        add.setBounds(350, 550, 200, 30);
        add.setForeground(Color.BLUE);
        add.setFont(new Font("", Font.BOLD, 15));
        add(add);
       back.addMouseListener(new MouseListener() {
     
      public void mouseClicked(MouseEvent e) {
        setVisible(false);
        new AdminHome("ADMIN PANEL").setVisible(true);
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

        // Add Button

        // Background Image
        ImageIcon img = new ImageIcon("bg4.jpg");
        background = new JLabel("", img, JLabel.CENTER);
        background.setBounds(0, 100, 1000, 600);
        add(background);

        // Frame Initialization
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        setLayout(null);
    }
}
/*
             
         
               

 */