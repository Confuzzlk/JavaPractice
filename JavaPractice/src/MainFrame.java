import java.awt.Color;
import java.awt.Font;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainFrame extends JFrame{
	MainFrame(){
		JLabel label = new JLabel();
		JPanel mainPanel = new JPanel();
		ImageIcon icon = new ImageIcon("icon.png");
		Border border = BorderFactory.createLineBorder(Color.green,3);
		
		mainPanel.setBackground(Color.green);
		mainPanel.setBounds(95, 55, 450, 250);
		
		label.setText("Cool Color");
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.BOTTOM);
		label.setFont(new Font("MV Boli",Font.BOLD,20));
		label.setBorder(border);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setForeground(Color.white);
		
		this.setTitle("JavaPractice");
		this.setSize(650, 400);
		this.setLayout(null);
		this.setResizable(false);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setBackground(new Color(75, 75, 75));
		this.setIconImage(icon.getImage());
		 
		this.add(label);
		this.add(mainPanel);
	}
}
