import java.awt.event.*;
import java.awt.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.*;

public class RegisterP extends WindowAdapter {
	JFrame py;

	public RegisterP() {
		py = new JFrame(" details ");
		py.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		py.setSize(901, 499);
		py.setLayout(null);
		py.setVisible(true);
		ImageIcon i1 = new ImageIcon("bgx.jpg");

		Image q1 = i1.getImage().getScaledInstance(1000, 600,

				Image.SCALE_DEFAULT);

		ImageIcon i2 = new ImageIcon(q1);
		JLabel l3 = new JLabel(i2);
		l3.setBounds(0, 0, 1000, 600);
		py.add(l3);
		JLabel label1 = new JLabel("EVENT MANAGEMENT SYSTEM ");
		label1.setFont(new Font("Tahoma", Font.BOLD, 20));
		label1.setForeground(Color.white);
		label1.setBounds(315, 4, 386, 45);
		l3.add(label1);
		JButton button = new JButton(" LOGIN ");
		button.setBounds(180, 300, 129, 36);
		button.setBackground(Color.BLACK);
		button.setForeground(Color.WHITE);
		l3.add(button);
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				py.setVisible(false);
				new SIgnup2("CUSTOMER LOGIN PANEL").setVisible(true);
			}
		});
		JLabel label8 = new JLabel("Username :");
		label8.setBounds(40, 150, 117, 40);
		l3.add(label8);
		label8.setForeground(Color.white);
		JLabel label9 = new JLabel("Password :");
		label9.setForeground(Color.white);
		label9.setBounds(40, 200, 117, 40);
		l3.add(label9);
		JTextField textField8 = new JTextField();
		textField8.setBounds(140, 150, 300, 30);
		l3.add(textField8);
		JTextField textField9 = new JTextField();
		textField9.setBounds(140, 200, 300, 30);
		l3.add(textField9);
		JButton button5 = new JButton("ADD");
		button5.setBackground(Color.BLACK);
		button5.setForeground(Color.WHITE);
		button5.setBounds(380, 300, 129, 36);
		l3.add(button5);
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FileWriter fwrite2 = null;
				java.io.BufferedWriter bw2 = null;
				PrintWriter pw2 = null;
				try {
					fwrite2 = new FileWriter("user1.txt");

					bw2 = new java.io.BufferedWriter(fwrite2);

					pw2 = new PrintWriter(bw2);
					pw2.println("" + textField8.getText() + "\n"

							+ textField9.getText());

					bw2.close();
					pw2.close();
					textField8.setText(null);
					textField9.setText(null);
				} catch (IOException ex) {
				}
			}
		});
	}
}
