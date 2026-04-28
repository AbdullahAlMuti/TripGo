import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Home extends JFrame {

    private Container c;
    private ImageIcon icon, logo, hlogo;
    private JLabel label1, imgLabel;
    private Font f1, f2, f3;
    private JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, nBtn;
    private Cursor cursor;

    Home() {
        // Frame Layout
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("TripGo");
        this.setSize(1200, 600);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.decode("#AFF2DD"));

        // Icon
        icon = new ImageIcon(getClass().getResource("/images/Icon.png"));
        this.setIconImage(icon.getImage());

        // Logo
        logo = new ImageIcon(getClass().getResource("/images/LogoBlue.png"));
        imgLabel = new JLabel(logo);
        imgLabel.setBounds(550, 30, logo.getIconWidth(), logo.getIconHeight());
        c.add(imgLabel);
		
		
		hlogo = new ImageIcon(getClass().getResource("/images/LogoBlue.png"));
        imgLabel = new JLabel(hlogo);
        imgLabel.setBounds(550, 30, hlogo.getIconWidth(), hlogo.getIconHeight());
        c.add(imgLabel);
		

        // Fonts
        f1 = new Font("Tahoma", Font.BOLD, 40);
        f2 = new Font("Segoe UI", Font.BOLD, 15);
		f3 = new Font("Segoe UI", Font.BOLD, 60);

        // Title
        label1 = new JLabel();
        label1.setText("Self Help is the");
        label1.setBounds(140, 130, 700, 90);
        label1.setFont(f3);
        c.add(label1);

        label1 = new JLabel();
        label1.setText("Best Help Ever!");
        label1.setBounds(140, 200, 600, 80);
        label1.setFont(f1);
        c.add(label1);
		
		
		label1 = new JLabel();
        label1.setText("E x p l o r e  t h e  W o r l d!");
        label1.setBounds(140, 300, 600, 70);
        label1.setFont(f1);
        c.add(label1);
		
		
		
		

        // Cursor for JButtons
        cursor = new Cursor(Cursor.HAND_CURSOR);

        // JButtons
        btn1 = new JButton("HOME");
        btn1.setBounds(140, 10, 100, 30);
        btn1.setFont(f2);
        btn1.setCursor(cursor);
        btn1.setForeground(Color.WHITE);
        btn1.setBackground(Color.decode("#C00000"));
        c.add(btn1);

        btn2 = new JButton("ABOUT US");
        btn2.setBounds(250, 10, 150, 30);
        btn2.setFont(f2);
        btn2.setCursor(cursor);
        btn2.setForeground(Color.WHITE);
        btn2.setBackground(Color.decode("#C00000"));
        c.add(btn2);

        btn3 = new JButton("DESTINATION");
        btn3.setBounds(410, 10, 150, 30);
        btn3.setFont(f2);
        btn3.setCursor(cursor);
        btn3.setForeground(Color.WHITE);
        btn3.setBackground(Color.decode("#C00000"));
        c.add(btn3);

        btn4 = new JButton("SIGN UP");
        btn4.setBounds(1000, 10, 130, 30);
        btn4.setFont(f2);
        btn4.setCursor(cursor);
        btn4.setForeground(Color.WHITE);
        btn4.setBackground(Color.decode("#C00000"));
        c.add(btn4);
		
		
		btn5 = new JButton("BEST PLACES");
        btn5.setBounds(570, 10, 130, 30);
        btn5.setFont(f2);
        btn5.setCursor(cursor);
        btn5.setForeground(Color.WHITE);
        btn5.setBackground(Color.decode("#C00000"));
        c.add(btn5);
		
		
	    btn6 = new JButton("Admin Login");
        btn6.setBounds(710, 10, 130, 30);
        btn6.setFont(f2);
        btn6.setCursor(cursor);
        btn6.setForeground(Color.WHITE);
        btn6.setBackground(Color.decode("#C00000"));
        c.add(btn6);
		
		btn7 = new JButton("LOG IN");
        btn7.setBounds(860, 10, 130, 30);
        btn7.setFont(f2);
        btn7.setCursor(cursor);
        btn7.setForeground(Color.WHITE);
        btn7.setBackground(Color.decode("#C00000"));
        c.add(btn7);
		
		
		btn8 = new JButton("LET'S TRAVEL");
        btn8.setBounds(140, 450, 230, 50);
        btn8.setFont(f2);
        btn8.setCursor(cursor);
        btn8.setForeground(Color.WHITE);
        btn8.setBackground(Color.decode("#C00000"));
        c.add(btn8);
		
		
		
		
		
		
        
        nBtn = new JButton("");
        nBtn.setBounds(0, 0, 0, 0);
        c.add(nBtn);

        // Login/Home
		
        /*btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                setVisible(false);
                Registration tr = new Registration();
                tr.setVisible(true);
            }
        });
		*/
		

        // Register / About Us
		
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                AboutUs us = new AboutUs();
                us.setVisible(true);
                setVisible(false);
            }
        });
		

btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                setVisible(false);
                Country tr = new Country();
                tr.setVisible(true);
            }
        });
		
      btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                setVisible(false);
                Registration tr = new Registration();
                tr.setVisible(true);
            }
        });
		
		
		      btn5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                setVisible(false);
                Perth tr = new Perth();
                tr.setVisible(true);
            }
        });
		
// Lets Travel button 

        btn8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                Country us = new Country();
                us.setVisible(true);
                setVisible(false);
            }
        });
		
		//Log In
		btn7.addActionListener(new ActionListener() {  
            public void actionPerformed(ActionEvent ae) {

                Login us = new Login();
                us.setVisible(true);
                setVisible(false);
            }
        });
		
		//AdminLogin
		
				btn6.addActionListener(new ActionListener() {  
            public void actionPerformed(ActionEvent ae) {

                AdminLogin us = new AdminLogin();
                us.setVisible(true);
                setVisible(false);
            }
        });
    }

    public static void main(String[] args) {

        Home frame = new Home();
        frame.setVisible(true);
    }
}
