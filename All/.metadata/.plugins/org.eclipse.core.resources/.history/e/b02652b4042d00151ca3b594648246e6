package bin;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Rectangle;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import javax.swing.JButton;

public class gui extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gui frame = new gui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public gui() {
		
		int height;
		int width;
		
		setResizable(false);
		setBackground(SystemColor.window);
		setBounds(new Rectangle(1400, 1400, 1400, 1400));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, height = 895, width = 800);
		JPanel contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Access Your Account");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnNewButton.setBounds(20, 131, 167, 37);
		contentPane.add(btnNewButton);
		
		JButton btnMakeYourAccount = new JButton("Make Your Account");
		btnMakeYourAccount.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnMakeYourAccount.setBounds(190, 131, 167, 37);
		contentPane.add(btnMakeYourAccount);
		
		JButton btnDeleteYourAccount = new JButton("Delete Your Account");
		btnDeleteYourAccount.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnDeleteYourAccount.setBounds(360, 131, 167, 37);
		contentPane.add(btnDeleteYourAccount);
		
		JButton btnForgotAccountInfo = new JButton("Forgot Account Info");
		btnForgotAccountInfo.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnForgotAccountInfo.setBounds(530, 131, 167, 37);
		contentPane.add(btnForgotAccountInfo);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnExit.setBounds(700, 131, 167, 37);
		contentPane.add(btnExit);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Users\\Willy\\Desktop\\lock.jpg"));
		label_1.setBounds(44, 21, 90, 80);
		contentPane.add(label_1);
		
		JLabel label = DefaultComponentFactory.getInstance().createLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Willy\\Desktop\\back.PNG"));
		label.setBounds(0, 0, 895, 800);
		contentPane.add(label);
	}
}
