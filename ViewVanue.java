import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.table.JTableHeader;
import java.awt.*;
import javax.swing.*;

public class ViewVanue extends JFrame {
    JLabel l;
    JCheckBox cb1, cb2, cb3;
    JButton b;
    JScrollPane sp;
    JTable due;
    JTableHeader header;
    ViewVanue(String title){
        super(title);
        setSize(1000, 600);
        ImageIcon i1 = new ImageIcon( "bg4.jpg");
       Image q1 = i1.getImage().getScaledInstance(1000, 600,
       Image.SCALE_DEFAULT);
       ImageIcon i2 = new ImageIcon(q1);
       JLabel l3 = new JLabel(i2);
       l3.setBounds(0,100, 1000, 600);
       add(l3);
       JButton add = new JButton("BACK ");
       add.setBounds (200, 300, 200, 45);
       
       add.setBackground(Color.BLACK);
       add.setForeground(Color.WHITE);
       add.setFont(new Font("", Font.BOLD, 15));
       l3.add(add);
       add.addActionListener(new ActionListener() {
       public void actionPerformed(ActionEvent e) {
       setVisible(false);
       new CustomerHome("ADMIN PANEL").setVisible(true);
       }
       });
       l = new JLabel(" VIEW VANUE");
       l.setBounds(50, 50, 300, 20);
       String data[][]={
       {" 1"," BIRTHDAY ", "15000 "},
       {" 2"," FAMILY EVENT", "11000 "},
       {" 3", " SEMINER","13000"},
       {" 4", " WEDDING", "22000"},
       {" 5", " PARTY", "16000"},
       {" 6", " CONFERENCE", "15000"}
       };
       String column[]={"VANUE ID","VANUE NAME", "VANUE COST"};
       due = new JTable(data, column);
       sp = new JScrollPane(due);
       due.setFont(new Font("", Font.CENTER_BASELINE, 14));
       sp.setBounds(0, 0, 1000, 145);
       sp.setFont(new Font("", Font.CENTER_BASELINE, 16));
       due.setRowHeight(20);
       header = due.getTableHeader();
       header.setPreferredSize(new Dimension(200, 20));
       header.setFont(new Font("", Font.CENTER_BASELINE, 16));
       l3.add(sp);
       setSize(1000, 499); //frame
    }
}
