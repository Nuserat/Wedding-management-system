import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SignUpP extends JFrame {

    SignUpP(String title) {
        super(title);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        ImageIcon i1 = new ImageIcon("bg5.jpg");
        Image q1 = i1.getImage().getScaledInstance(1000, 600,
                Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(q1);
        JLabel l3 = new JLabel(i2);
        l3.setBounds(0, 0, 1000, 600);
        add(l3);
        JLabel lblNew = new JLabel("Welcome to Login panel!");
        lblNew.setBounds(384, 120, 168, 22);
        lblNew.setBackground(Color.BLACK);
        JButton back = new JButton("BACK");
        back.setBounds(480, 350, 120, 45);
        back.setBackground(Color.white);
        back.setForeground(Color.black);
        back.setFont(new Font("", Font.BOLD, 14));
        l3.add(back);
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new LoginP("SIGN UP").setVisible(true);
            }
        });
        final JPasswordField value = new JPasswordField();
        value.setBounds(384, 250, 184, 28);
        JLabel l = new JLabel("Username:");
        l.setBounds(284, 200, 84, 14);
        l.setBackground(Color.white);
        JLabel l2 = new JLabel("Password:");
        l2.setBackground(Color.white);
        l2.setBounds(284, 250, 84, 14);
        JButton b = new JButton(" SIGN IN");
        b.setBounds(284, 350, 120, 45);
        b.setBackground(Color.white);
        b.setForeground(Color.black);
        b.setFont(new Font("", Font.BOLD, 14));
        final JTextField text = new JTextField();
        text.setBounds(384, 200, 184, 28);
        l3.add(lblNew);
        l3.add(value);
        l3.add(l);
        l3.add(l2);

        l3.add(b);
        l3.add(text);
        setSize(1000, 600);
        setLayout(null);
        setVisible(true);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String user = text.getText();
                String pass = new String(value.getPassword());
                if (user.equals("login") && pass.equals("login")) {
                    setVisible(false);
                    new CustomerHome(" VANUE portal").setVisible(rootPaneCheckingEnabled);
                } else {
                    JOptionPane.showMessageDialog(null, "Wrong !",
                            "Warning!", JOptionPane.WARNING_MESSAGE);
                }
            }
        });

    }
}
