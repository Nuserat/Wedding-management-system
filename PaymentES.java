import java.awt.*;
import java.awt.event.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.*;

public class PaymentES extends JFrame{
   JMenu HOME, EXIT, about;
		JMenuBar mb;
		String money, name, card;
     PaymentES(String title) {
            super(title);
        this.getContentPane().setBackground(Color.pink);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(901, 499);
		
		setLayout(null);
		setVisible(true);
		ImageIcon i1 =  new ImageIcon( "pay.jpg");
		
		Image q1 = i1.getImage().getScaledInstance(1000, 600,
		
		Image.SCALE_DEFAULT);
		
		ImageIcon i2 = new ImageIcon(q1);
		JLabel l3 = new JLabel(i2);
		l3.setBounds(0, 0, 1000, 600);
		add(l3);
		mb = new JMenuBar();
		HOME = new JMenu("HOME");
		about = new JMenu("CONTACT US");
		EXIT = new JMenu("EXIT");
		mb.add(HOME);
		mb.add(EXIT);
		mb.add(about);
		mb.setBackground(Color.black);
		mb.setBackground(Color.white);
		setJMenuBar(mb);
		about.addMouseListener(new MouseListener() {
		public void mouseClicked(MouseEvent e) {
		setVisible(false);
		//new ContactUs("CONTACT US").setVisible(true);
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
		
		JLabel label1 = new JLabel(" ");
		label1.setFont(new Font("Tahoma", Font.BOLD, 20));
		label1.setBounds(315, 0, 386, 45);
		l3.add(label1);
		label1.setForeground(Color.white);
		JButton button = new JButton("Back");
		button.setBounds(10, 15, 87, 32);
		l3.add(button);
		button.setBackground(Color.BLACK);
		button.setForeground(Color.WHITE);
		button.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
		setVisible(false);
		new CustomerHome("PANEL").setVisible(true);
		}
		});
		JLabel label2 = new JLabel("PAYMENT :");
		label2.setBounds(39, 100, 117, 35);
		
		l3.add(label2);
		label2.setForeground(Color.white);
		JLabel label7 = new JLabel("NID :");
		label7.setBounds(39, 150, 117, 35);
		l3.add(label7);
		label7.setForeground(Color.white);
		JLabel label8 = new JLabel("CARD NO. :");
		label8.setBounds(39, 200, 117, 35);
		label8.setForeground(Color.white);
		l3.add(label8);
		JLabel label = new JLabel("CARD NAME :");
		label.setBounds(39, 250, 117, 35);
		l3.add(label);
		label.setForeground(Color.white);
		JTextField textField2 = new JTextField();
		textField2.setBounds(150, 101, 117, 35);
		l3.add(textField2);
		JTextField textField1 = new JTextField();
		textField1.setBounds(150, 150, 117, 35);
		l3.add(textField1);
		JTextField textField = new JTextField();
		textField.setBounds(150, 200, 117, 35);
		l3.add(textField);
		JTextField textField3 = new JTextField();
		textField3.setBounds(150, 250, 117, 35);
		l3.add(textField3);
		textField.setColumns(10);
		JLabel lblTaka = new JLabel("Taka");
		lblTaka.setBounds(300, 101, 48, 35);
		l3.add(lblTaka);
		lblTaka.setForeground(Color.white);
		JLabel label4 = new JLabel(" ");
		label4.setFont(new Font("Tahoma", Font.BOLD, 17));
		label4.setBounds(542, 172, 314, 34);
		l3.add(label4);
		label4.setForeground(Color.white);
		JButton button5 = new JButton(" PAY ");
		button5.setBounds(40, 350, 117, 35);
		l3.add(button5);
		button5.setBackground(Color.BLACK);
		button5.setForeground(Color.WHITE);
		button5.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		String s1 = textField2.getText();
		String s2 = textField3.getText();
		String s3 = textField.getText();
		double d1 = Double.parseDouble(s1);
		double d2 = Double.parseDouble(s3);
		double sum = (d1 * .1) + d1;
		double sum1 = d2;
		String sm3 = String.valueOf(sum1);
		String sm1 = String.valueOf(s2);
		
		String sm = String.valueOf(sum);
		money = sm;
		card = sm3;
		name = sm1;
		sm += " Deposited";
		label4.setText(sm);
		}
		});
		JButton Slipbuttton = new JButton("Generate Slip");
		Slipbuttton.setBounds(230, 350, 117, 35);
		l3.add(Slipbuttton);
		Slipbuttton.setBackground(Color.BLACK);
		Slipbuttton.setForeground(Color.WHITE);
		Slipbuttton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		setVisible(false);
		JOptionPane.showMessageDialog(Slipbuttton, "Slip has been generated! ");
		}
		});
		JButton buttton = new JButton("Exit");
		buttton.setBounds(390, 350, 117, 35);
		l3.add(buttton);
		buttton.setBackground(Color.BLACK);
		buttton.setForeground(Color.WHITE);
		buttton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		setVisible(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		});
		JButton Slipbuttton1 = new JButton("Print Slip");
		Slipbuttton1.setBounds(560, 350, 117, 35);
		l3.add(Slipbuttton1);
		Slipbuttton1.setBackground(Color.BLACK);
		Slipbuttton1.setForeground(Color.WHITE);
		Slipbuttton1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		FileWriter fwrite = null;
		java.io.BufferedWriter bw = null;
		PrintWriter pw = null;
		try {
		fwrite = new
		
		FileWriter("Deposit.txt");
		bw = new java.io.BufferedWriter(fwrite);
		pw = new PrintWriter(bw);
		
		pw.println("\t\t*******************************************************");
		
		pw.println("\t\t\t\t\tPAYMEN SLIP");
		pw.println("\t\t*******************************************************");
		
		pw.println("Digital Payment receipt Cheque");
		
		pw.println("________________________________________________________________________________________");
		
		String pay = "Booking No: " + card + "\t\tAccount Holder: " + name + " ";
		
		pw.println("_________________________________________________________________________________________");
		
		pw.println(pay);
		pw.println("\nExcluding 10% Service Charge!");
		
		pw.println("__________________________________________________________________________________________");
		
		pw.println("PAYMENT: " + money + " taka");
		pw.println("___________________________________________________________________________________________");
		
		bw.close();
		pw.close();
		} catch (IOException ex) {
		}
		}
		});
		
		
      }
}