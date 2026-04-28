import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class AboutUs extends JFrame {

    private Container c;
    private ImageIcon icon, logo, welcome;
    private JLabel imgLabel;
    private Font f1;
    private JButton btn1, btn2, btn3, btn4, nBtn;
    private Cursor cursor;

    AboutUs() {
   
        this.setTitle("TripGo");
        this.setSize(1200, 600);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.decode("#AFF2DD"));

        icon = new ImageIcon(getClass().getResource("/images/Icon.png"));
        this.setIconImage(icon.getImage());


       logo = new ImageIcon(getClass().getResource("/images/ad.png"));
        imgLabel = new JLabel(logo);
        imgLabel.setBounds(0, 0, 1200,600);
        c.add(imgLabel);
        

        f1 = new Font("Segoe UI Black", Font.BOLD, 25);

 
        cursor = new Cursor(Cursor.HAND_CURSOR);

    
        btn1 = new JButton("OK");
        btn1.setBounds(800, 480, 100, 50);
        btn1.setFont(f1);
        btn1.setCursor(cursor);
        btn1.setForeground(Color.WHITE);
        btn1.setBackground(Color.decode("#C00000"));
        c.add(btn1);

        nBtn = new JButton("");
        nBtn.setBounds(0, 0, 0, 0);
        c.add(nBtn);



        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                setVisible(false);
                Home bc = new Home();
                bc.setVisible(true);
            }
        });

        btn3 = new JButton("X");
        btn3.setBounds(1100, 20, 80, 30);
        btn3.setFont(f1);
        btn3.setCursor(cursor);
        btn3.setForeground(Color.WHITE);
        btn3.setBackground(Color.decode("#C00000"));
        c.add(btn3);

        btn4 = new JButton("<--");
        btn4.setBounds(0, 20, 100, 30);
        btn4.setFont(f1);
        btn4.setCursor(cursor);
        btn4.setForeground(Color.WHITE);
        btn4.setBackground(Color.decode("#C00000"));
        c.add(btn4);
		


        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });

    
        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                setVisible(false);
                Home frame = new Home();
                frame.setVisible(true);
            }
        });
			
		
    }

    public static void main(String[] args) {

        AboutUs AU = new AboutUs();
        AU.setVisible(true);
    }
}
