import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Country extends JFrame {

    private Container c;
    private ImageIcon icon, logo, country;
    private JLabel imgLabel;
    private Font f1;
    private JButton btn1, btn2, btn3, btn4, nBtn;
    private Cursor cursor;

    Country() {
        // Frame Layout
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1200, 600);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.decode("#F2F2F2"));

        // Icon
        icon = new ImageIcon(getClass().getResource("/images/Icon.png"));
        this.setIconImage(icon.getImage());


/*
        Country = new ImageIcon(getClass().getResource("/images/Country.png"));
        imgLabel = new JLabel(Country);
        imgLabel.setBounds(440, 70, Country.getIconWidth(), Country.getIconHeight());
        c.add(imgLabel);
*/
        // Fonts
        f1 = new Font("Segoe UI Black", Font.BOLD, 16);

        // Cursor for JButtons
        cursor = new Cursor(Cursor.HAND_CURSOR);
		
		
	
		
		
		

        // JButtons
        btn1 = new JButton("BANGLADESH");
        btn1.setBounds(150, 468, 200, 50);
        btn1.setFont(f1);
        btn1.setCursor(cursor);
        btn1.setForeground(Color.WHITE);
        btn1.setBackground(Color.decode("#C00000"));
        c.add(btn1);

        btn2 = new JButton("AUSTRALIA");
        btn2.setBounds(380, 468, 200, 50);
        btn2.setFont(f1);
        btn2.setCursor(cursor);
        btn2.setForeground(Color.WHITE);
        btn2.setBackground(Color.decode("#2E75B6"));
        c.add(btn2);

        btn3 = new JButton("SINGAPUR");
        btn3.setBounds(610, 468, 200, 50);
        btn3.setFont(f1);
        btn3.setCursor(cursor);
        btn3.setForeground(Color.WHITE);
        btn3.setBackground(Color.decode("#2E75B6"));
        c.add(btn3);
		
		btn4 = new JButton("INDONESIA");
        btn4.setBounds(845, 468, 200, 50);
        btn4.setFont(f1);
        btn4.setCursor(cursor);
        btn4.setForeground(Color.WHITE);
        btn4.setBackground(Color.decode("#2E75B6"));
        c.add(btn4);
		
        
        nBtn = new JButton("");
        nBtn.setBounds(0, 0, 0, 0);
        c.add(nBtn);

        // Action Listener for JButtons
        // Exit Button
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });

        // Contribution Button
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                Profile frame = new Profile ();
                frame.setVisible(true);
            }
        });
		
		


        // Next Button
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                setVisible(false);
                Home frame = new Home();
                frame.setVisible(true);
            }
        });
		
		// Logo and Images
        logo = new ImageIcon(getClass().getResource("/images/bi.png"));
        imgLabel = new JLabel(logo);
        imgLabel.setBounds(0, 0, logo.getIconWidth(), logo.getIconHeight());
        c.add(imgLabel);
    }
	
	
	

    public static void main(String[] args) {

        Country frame = new Country();
        frame.setVisible(true);
    }
}
