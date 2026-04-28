import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class PaySuccess extends JFrame {

    private Container c;
    private ImageIcon icon;
    private JLabel label1, imgLabel;
    private Font f1, f2;
    private ImageIcon logo;
    private JButton btn1, nBtn;
    private Cursor cursor;

    PaySuccess() {
        // Frame Layout
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("TripGo");
        this.setSize(1200, 600);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.decode("#F2F2F2"));

        // Icon
        icon = new ImageIcon(getClass().getResource("/images/Icon.png"));
        this.setIconImage(icon.getImage());

        /*// Logo
        logo = new ImageIcon(getClass().getResource("/images/LogoBlue.png"));
        imgLabel = new JLabel(logo);
        imgLabel.setBounds(30, 82, logo.getIconWidth(), logo.getIconHeight());
        c.add(imgLabel);
		*/

        // Fonts
        f1 = new Font("Segoe UI Black", Font.PLAIN, 35);
        f2 = new Font("Segoe UI Black", Font.PLAIN, 25);

        // Title
        label1 = new JLabel();
        label1.setText("Yooo !! Boysss !! ");
        label1.setBounds(200, 80, 500, 50);
        label1.setFont(f1);
        c.add(label1);

        label1 = new JLabel();
        label1.setText("You Have Completed Your Payment");
        label1.setBounds(200, 130, 700, 50);
        label1.setFont(f1);
        c.add(label1);

        label1 = new JLabel();
        label1.setText("Happy Travel :)");
        label1.setBounds(200, 180, 500, 50);
        label1.setFont(f1);
        c.add(label1);
        
        // Cursor for JButtons
        cursor = new Cursor(Cursor.HAND_CURSOR);

        btn1 = new JButton("Finish");
        btn1.setBounds(200, 310, 300, 50);
        btn1.setFont(f2);
        btn1.setCursor(cursor);
        btn1.setForeground(Color.WHITE);
        btn1.setBackground(Color.decode("#2E75B6"));
        c.add(btn1);
        
        nBtn = new JButton("");
        nBtn.setBounds(0, 0, 0, 0);
        c.add(nBtn);

		// Back Button
        btn1.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent ae) {

                setVisible(false);
                Home frame = new Home();
                frame.setVisible(true);
            }
        });
		
		// Logo
        logo = new ImageIcon(getClass().getResource("/images/ess.png"));
        imgLabel = new JLabel(logo);
        imgLabel.setBounds(0, 0, logo.getIconWidth(), logo.getIconHeight());
        c.add(imgLabel);
		
		
		
    }
    
    public static void main(String[] args) {

        PaySuccess frame = new PaySuccess();
        frame.setVisible(true);
    }
}
