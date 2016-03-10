import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JPasswordField;
import javax.swing.border.LineBorder;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.Panel;
import javax.swing.JScrollBar;
import java.awt.Choice;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTabbedPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.JScrollPane;
import java.awt.Rectangle;
import java.awt.Dimension;


public class GUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setSize(new Dimension(1400, 700));
		frame.getContentPane().setSize(new Dimension(900, 900));
		frame.setResizable(false);
		frame.getContentPane().setForeground(Color.RED);
		frame.getContentPane().setBackground(Color.RED);
		frame.setBounds(100, 100, 1080, 812);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setSize(new Dimension(900, 900));
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 12, true));
		panel_1.setBackground(SystemColor.menu);
		panel_1.setBounds(0, 0, 1064, 773);
		frame.getContentPane().add(panel_1);
		
		JLabel lblTitle = DefaultComponentFactory.getInstance().createTitle(" Password Keeper\r\n");
		lblTitle.setFont(new Font("Copperplate Gothic Light", Font.ITALIC, 76));
		
		JLabel lblNewJgoodiesLabel = DefaultComponentFactory.getInstance().createLabel("Copyright 2015");
		lblNewJgoodiesLabel.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 13));
		
		JLabel lblNewJgoodiesLabel_1 = DefaultComponentFactory.getInstance().createLabel("A William Horst Invention....");
		lblNewJgoodiesLabel_1.setBackground(Color.WHITE);
		lblNewJgoodiesLabel_1.setForeground(Color.BLACK);
		lblNewJgoodiesLabel_1.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
		
		Panel panel = new Panel();
		panel.setBackground(new Color(0, 0, 0));
		
		Panel panel_2 = new Panel();
		panel_2.setBackground(Color.BLACK);
		
		JButton btnNewButton = new JButton("New button");
		
		JButton button = new JButton("New button");
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(10)
							.addComponent(lblNewJgoodiesLabel_1, GroupLayout.PREFERRED_SIZE, 367, GroupLayout.PREFERRED_SIZE))
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 735, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(10)
							.addComponent(lblTitle, GroupLayout.PREFERRED_SIZE, 805, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(90)
							.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 735, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(687)
							.addComponent(lblNewJgoodiesLabel, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(215, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(8)
					.addComponent(lblNewJgoodiesLabel_1, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 3, GroupLayout.PREFERRED_SIZE)
					.addGap(2)
					.addComponent(lblTitle, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
					.addGap(2)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 3, GroupLayout.PREFERRED_SIZE)
					.addGap(8)
					.addComponent(lblNewJgoodiesLabel, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
						.addComponent(button, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
					.addGap(560))
		);
		panel_1.setLayout(gl_panel_1);
		panel_1.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lblNewJgoodiesLabel_1, panel, lblTitle, panel_2, lblNewJgoodiesLabel}));
		frame.getContentPane().setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{panel_1, lblNewJgoodiesLabel_1, panel, lblTitle, panel_2, lblNewJgoodiesLabel, btnNewButton, button}));
	}
}
