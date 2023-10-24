import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.util.Iterator;

public class bookings extends JFrame {
    private JPanel contentPane;
    JButton b1, b2, b3;
    ArrayList<String> v = new ArrayList<String>();

    ArrayList<JTextField> t = new ArrayList<JTextField>();

    bookings(String s[]) {
        setBounds(620, 200, 1250, 600);
        setContentPane(contentPane);
        contentPane.setLayout(null);
        JLabel l10 = new JLabel("Event List");
        l10.setFont(new Font("Tahoma", Font.BOLD, 18));
        l10.setBounds(450, 10, 120, 22);
        contentPane.add(l10);
        JButton b2 = new JButton("Back");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(500, 360, 100, 30);
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    setVisible(false);

                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        });
        add(b2);
        int j = 0;
        for (int i = 0; i < s.length; i++) {
            JLabel l1 = new JLabel(s[i]);
            l1.setForeground(new Color(25, 25, 112));
            l1.setFont(new Font("Tahoma", Font.BOLD, 14));
            l1.setBounds(64 + j, 70, 102, 22);
            contentPane.add(l1);
            j = j + 175;
        }
        int count = 0;
        ArrayList<String> events = new ArrayList<String>();
        try {
            FileReader fr = new FileReader("vanue.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                events.add(line);
                count++;
            }
            fr.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println(events);
        Iterator itr = events.iterator();
        j = 0;
        for (int i = 0; i < count; i++) {
            String s1 = itr.next().toString();
            System.out.println(s1);
            String[] arrOfStr = s1.split("\t");
            int m = 0;
            for (int k = 0; k < arrOfStr.length; k++) {
                System.out.println(arrOfStr[k]);
                JLabel l1 = new JLabel(arrOfStr[k]);
                l1.setForeground(new Color(25, 25, 112));
                l1.setFont(new Font("Tahoma", Font.BOLD, 14));
                l1.setBounds(64 + m, 110 + j, 102, 22);
                contentPane.add(l1);
                m = m + 175;

            }
            j = j + 40;
        }
        contentPane.setBackground(Color.PINK);
        setVisible(true);
    }
}