
import javax.swing.table.JTableHeader;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginP extends JFrame {

	LoginP(String title) {
		super(title);
		ImageIcon i1 = new ImageIcon("bg2.jpg");

		Image q1 = i1.getImage().getScaledInstance(1000, 600,

				Image.SCALE_DEFAULT);

		ImageIcon i2 = new ImageIcon(q1);
		JLabel l3 = new JLabel(i2);
		l3.setBounds(0, 0, 1000, 600);
		add(l3);
		JLabel label1 = new JLabel("EVENT MANAGEMENT SYSTEM");
		label1.setFont(new Font(" ", Font.BOLD, 30));
		label1.setBounds(200, 10, 600, 22);
		label1.setForeground(Color.white);
		l3.add(label1);
		JLabel label2 = new JLabel("***** costomer only! *****");
		label2.setBounds(336, 390, 197, 14);
		label2.setForeground(Color.white);
		l3.add(label2);
		JButton button2 = new JButton("REGISTER ");

		button2.setBackground(Color.BLACK);
		button2.setForeground(Color.WHITE);
		button2.setBounds(300, 222, 129, 36);
		l3.add(button2);
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				setVisible(false);
				RegisterP r = new RegisterP();
				// r.setVisible(true);
			}
		});
		JLabel label3 = new JLabel("Welcome to sign-up panel!");
		label3.setBounds(336, 360, 168, 22);
		label3.setForeground(Color.WHITE);
		l3.add(label3);
		JButton button6 = new JButton(" LOGIN ");
		button6.setBackground(Color.BLACK);
		button6.setForeground(Color.WHITE);
		button6.setBounds(470, 222, 129, 36);
		l3.add(button6);
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				setVisible(false);
				new SignUpP("CUSTOMER LOGIN PANEL").setVisible(true);
			}
		});

		setSize(901, 499); // frame
		setLayout(null); // frame
		setVisible(true); // frame
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	}

}
