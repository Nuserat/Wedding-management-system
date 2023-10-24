import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;


public class CustomerD  extends JFrame{
    JLabel  background;
    CustomerD(String title) {
           super(title);
    
    ImageIcon i1 =  new ImageIcon( "bg4.jpg");
    Image q1 = i1.getImage().getScaledInstance(1000, 600,Image.SCALE_DEFAULT);
    
    ImageIcon i2 = new ImageIcon(q1);
    JLabel l3 = new JLabel(i2);
    l3.setBounds(0,100, 1000, 600);
    add(l3);
    
    JButton b1 = new JButton("back");
    b1.setBounds(200, 350, 100, 30);
    l3.add(b1);
    b1.setBackground(Color.WHITE);
    b1.setForeground(Color.BLUE);
    b1.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
    setVisible(false);
    new AdminHome("admin home").setVisible(true);
    }
    });
    String data[][]={
    { "ID","NAME","NUMBER","ADDRESS","PAYMENT RECORD","EMAIL"},
    { "101","AMIN","01760350939","Badda","No Due","amin@gmail.com"},
    {"102","NABA","01760350939","Dhaka"," Due","naba@gmail.com"},
    {"103","BIVA","01760350939","Barisal","Due","biva@gmail.com"},
    {"104","SULTAN","01760350959","Basabo","No Due","sultan@gmail.com"},
    {"105","GOLAM","01760350932","Khulna","Due","gl@gmail.com"},
    
    {"106","SOURAV","01760350939","Rampura","NoDue","sourav@gmail.com"},
    {"107","RAKIB","01760350939","Dhaka","Due","rakib01@gmail.com"},
    {"108","HASAN","01760350939","Banasree","No Due","maha@gmail.com"},
    {"109","NABILA","01760350939","Mirpur","No Due","nabila@gmail.com"},
    {"110","SINTHIA","01760350939","Uttora","Due","synthia@gmail.com"}};
    String column[]={"Serial No.","NAME","Mobile","Address","Payment  Status", "Email"};
    JTable jt=new JTable(data,column);
    jt.setBounds(0, 0, 1000, 180);
    JScrollPane sp=new JScrollPane(jt);
    l3.add(jt);
    l3.add(sp);
    setSize(1000,599);
    setVisible(true);  
    
}     
}