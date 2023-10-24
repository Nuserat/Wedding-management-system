import java.awt.*;
import javax.swing.*;
import javax.swing.table.JTableHeader;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class EquipmentPM extends JFrame {
   JLabel l;
    JCheckBox cb1, cb2, cb3;
    JButton b;
    JLabel  background, todayHeader;
    JPanel panel;
    JMenuBar mb;
    JTable due;
    JTableHeader header;
    JMenu home, payment, mile, rules, help, logout;
    JButton add;
    JScrollPane sp;
    EquipmentPM(String title) {
        super(title);
        setSize(10480, 715);
             JLabel todayHeader = new JLabel(" VIEW VANUE ", SwingConstants.CENTER);
        todayHeader.setBounds(350, 50, 200, 30);
        todayHeader.setOpaque(true);
        todayHeader.setBackground(Color.black);
        todayHeader.setFont(new Font("", Font.BOLD, 18));
        todayHeader.setForeground(Color.pink);
        add(todayHeader);
        JButton add = new JButton("BACK ");
        add.setBounds(0, 0, 200, 30);
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        add.setFont(new Font("", Font.BOLD, 15));
        add(add);
        add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              setVisible(false);
               new CustomerHome("CUSTOMER PANEL").setVisible(true);
            }
          });
        //  List
        String data[][]={
            {" 1"," OPEN AIR", "5000 "},
            {" 2"," HOME", "2000 "},
            {" 3"," HOTEL", "9000 "},
            {" 4"," OUTDOOR", "7000"},
            {" 5", " CANTONMENT","18000"},
            {" 6", " CONVENTIONAL HALL","15000"},
        };    
        String column[]={"VANUE ID","VANUE PLACE", "VANUE COST"};      
        due = new JTable(data, column);
        sp = new JScrollPane(due);
        due.setFont(new Font("", Font.CENTER_BASELINE, 14));
        sp.setBounds(50, 150, 800, 230);
        sp.setFont(new Font("", Font.CENTER_BASELINE, 16));
        due.setRowHeight(30);
        header = due.getTableHeader();
        header.setPreferredSize(new Dimension(200, 40));
        header.setFont(new Font("", Font.CENTER_BASELINE, 16));
        add(sp);

        // Background Image
        ImageIcon img = new ImageIcon( "bg4.png");
        background = new JLabel("", img, JLabel.CENTER);
        background.setBounds(0, 0, 1080, 715);
        add(background);

        // Frame Initialization
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        setLocationRelativeTo(null);  
        setVisible(true);
        setLayout( null );     

    }
}
