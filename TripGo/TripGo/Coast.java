import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Coast extends JFrame {

    private Container c;
    private ImageIcon icon, logo, coast;
    private JLabel imgLabel;
    private Font f1;
    private JButton btn1, btn2, btn3, btn4,btn5, btn6, btn7, nBtn;
    private Cursor cursor;

    Coast() {
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
        Location = new ImageIcon(getClass().getResource("/images/Location.png"));
        imgLabel = new JLabel(Location);
        imgLabel.setBounds(440, 70, Location.getIconWidth(), Location.getIconHeight());
        c.add(imgLabel);
*/
        // Fonts
        f1 = new Font("Segoe UI Black", Font.BOLD, 16);

        // Cursor for JButtons
        cursor = new Cursor(Cursor.HAND_CURSOR);
		
		
	
		
		
		

        // JButtons
        btn1 = new JButton("Expand");
        btn1.setBounds(875, 130, 140, 40);
        btn1.setFont(f1);
        btn1.setCursor(cursor);
        btn1.setForeground(Color.WHITE);
        btn1.setBackground(Color.decode("#C00000"));
        c.add(btn1);

        btn2 = new JButton("Expand");
        btn2.setBounds(875, 300, 140, 40);
        btn2.setFont(f1);
        btn2.setCursor(cursor);
        btn2.setForeground(Color.WHITE);
        btn2.setBackground(Color.decode("#2E75B6"));
        c.add(btn2);

        btn3 = new JButton("Expand");
        btn3.setBounds(875, 430, 140, 40);
        btn3.setFont(f1);
        btn3.setCursor(cursor);
        btn3.setForeground(Color.WHITE);
        btn3.setBackground(Color.decode("#2E75B6"));
        c.add(btn3);
		
		
		
		
		btn5 = new JButton("X");
        btn5.setBounds(1125, 15, 50, 30);
        btn5.setFont(f1);
        btn5.setCursor(cursor);
        btn5.setForeground(Color.WHITE);
        btn5.setBackground(Color.decode("#C00000"));
        c.add(btn5);
		
		
		
				btn6 = new JButton("<");
        btn6.setBounds(80, 15, 50, 30);
        btn6.setFont(f1);
        btn5.setCursor(cursor);
        btn6.setForeground(Color.WHITE);
        btn6.setBackground(Color.decode("#C00000"));
        c.add(btn6);
		
		
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
        // Valley
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                setVisible(false);
                Deck frame = new Deck ();
                frame.setVisible(true);
            }
        });

        // Lusai Button
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                setVisible(false);
                Dream frame = new Dream();
                frame.setVisible(true);
            }
        });
		
		


        // Tripura Button
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                setVisible(false);
                sea frame = new sea();
                frame.setVisible(true);
            }
        });
		
			//Back Button
		    btn6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

               Australia sl = new Australia();
                sl.setVisible(true);
                setVisible(false);
            }
        });
		
		       btn5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });
		
		// Logo and Images
        logo = new ImageIcon(getClass().getResource("/images/coast.png"));
        imgLabel = new JLabel(logo);
        imgLabel.setBounds(0, 0, logo.getIconWidth(), logo.getIconHeight());
        c.add(imgLabel);
    }
	
	
	

    public static void main(String[] args) {

        Coast frame = new Coast();
        frame.setVisible(true);
    }
}
