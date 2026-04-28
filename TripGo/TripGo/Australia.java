import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Australia extends JFrame {

    private Container c;
    private ImageIcon icon, logo, australia;
    private JLabel imgLabel;
    private Font f1;
    private JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, nBtn;
    private Cursor cursor;

    Australia() {
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
        btn1 = new JButton("SYDNEY");
        btn1.setBounds(150, 468, 200, 50);
        btn1.setFont(f1);
        btn1.setCursor(cursor);
        btn1.setForeground(Color.WHITE);
        btn1.setBackground(Color.decode("#C00000"));
        c.add(btn1);

        btn2 = new JButton("HOBART");
        btn2.setBounds(380, 468, 200, 50);
        btn2.setFont(f1);
        btn2.setCursor(cursor);
        btn2.setForeground(Color.WHITE);
        btn2.setBackground(Color.decode("#2E75B6"));
        c.add(btn2);

        btn3 = new JButton("GOLD COAST");
        btn3.setBounds(610, 468, 200, 50);
        btn3.setFont(f1);
        btn3.setCursor(cursor);
        btn3.setForeground(Color.WHITE);
        btn3.setBackground(Color.decode("#2E75B6"));
        c.add(btn3);
		
		btn4 = new JButton("PERTH");
        btn4.setBounds(845, 468, 200, 50);
        btn4.setFont(f1);
        btn4.setCursor(cursor);
        btn4.setForeground(Color.WHITE);
        btn4.setBackground(Color.decode("#2E75B6"));
        c.add(btn4);
		
			    btn5 = new JButton("X");
        btn5.setBounds(1125, 15, 50, 30);
        btn5.setFont(f1);
        btn5.setCursor(cursor);
        btn5.setForeground(Color.WHITE);
        btn5.setBackground(Color.decode("#C00000"));
        c.add(btn5);
		
		
		//back button
	    btn6 = new JButton("<");
        btn6.setBounds(80, 15, 50, 30);
        btn6.setFont(f1);
        btn5.setCursor(cursor);
        btn6.setForeground(Color.WHITE);
        btn6.setBackground(Color.decode("#C00000"));
        c.add(btn6);
		
		// Forward button ( Not workable )
		btn7 = new JButton(">");
        btn7.setBounds(130, 15, 50, 30);
        btn7.setFont(f1);
        btn7.setCursor(cursor);
        btn7.setForeground(Color.WHITE);
        btn7.setBackground(Color.decode("#C00000"));
        c.add(btn7);
		
		
		
		
        
        nBtn = new JButton("");
        nBtn.setBounds(0, 0, 0, 0);
        c.add(nBtn);

        // Action Listener for JButtons
        // Exit Button
        btn5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });
		
		//back
		
				btn6.addActionListener(new ActionListener() {  
            public void actionPerformed(ActionEvent ae) {

                Country us = new Country();
                us.setVisible(true);
                setVisible(false);
            }
        });
		
		
		btn1.addActionListener(new ActionListener() {  
            public void actionPerformed(ActionEvent ae) {

                Sydney us = new Sydney();
                us.setVisible(true);
                setVisible(false);
            }
        });

        // Contribution Button
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                Hobart frame = new Hobart ();
                frame.setVisible(true);
            }
        });
		
		


        // Next Button
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                setVisible(false);
                Coast frame = new Coast();
                frame.setVisible(true);
            }
        });
		
		        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                setVisible(false);
                Perth frame = new Perth();
                frame.setVisible(true);
            }
        });
		
		// Logo and Images
        logo = new ImageIcon(getClass().getResource("/images/australia.png"));
        imgLabel = new JLabel(logo);
        imgLabel.setBounds(0, 0, logo.getIconWidth(), logo.getIconHeight());
        c.add(imgLabel);
    }
	
	
	

    public static void main(String[] args) {

        Australia frame = new Australia();
        frame.setVisible(true);
    }
}
