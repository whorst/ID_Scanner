
import java.awt.BorderLayout;
import java.awt.Component;
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

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JMenuBar;

import java.awt.Cursor;

import javax.swing.JEditorPane;

import java.awt.TextField;
import java.beans.PropertyVetoException;

import javax.swing.JPasswordField;
import javax.swing.JInternalFrame;
import javax.swing.JTextField;
import javax.swing.JScrollBar;
import javax.swing.JSpinner;
import javax.swing.JComboBox;

import java.awt.ScrollPane;

public class gui extends JFrame {

	static LinkedList<String> doubleL = new LinkedList<String>(); // for the
																	// username
																	// and
																	// password
	static ArrayList<String> AL = new ArrayList<String>(); // For the security
															// answers
	static ArrayList<String> ques = new ArrayList<String>(); // For the
																// questions

	static ArrayList<String> urls = new ArrayList<String>();
	static ArrayList<String> passwords = new ArrayList<String>();
	static ArrayList<String> username = new ArrayList<String>();

	int decisions;
	private JPasswordField AccountPassword;
	static JPasswordField passwordField;
	static JPasswordField createPasswordText;
	static JEditorPane resultPress = new JEditorPane();
	static JEditorPane AccountUsername = new JEditorPane();
	static JEditorPane createUsernametext = new JEditorPane();
	static JButton btnCreate = new JButton("Create!");
	static JEditorPane secQues = new JEditorPane();
	static JEditorPane secQues2 = new JEditorPane();
	static JEditorPane secQues1 = new JEditorPane();
	static JEditorPane secQues3 = new JEditorPane();
	static JButton btnReturnToMain = new JButton("Return to Main Menu");
	static JButton btnCreate2 = new JButton("Create!");
	static JButton makeBtn = new JButton("Create Account");
	static JButton forgotBtn = new JButton("Forgot Account ");
	static JButton Exitbtn = new JButton("Exit");
	static JButton accessBtn = new JButton("Access Account");
	static JEditorPane dtrpnReenterPassword = new JEditorPane();
	static JEditorPane createPassword = new JEditorPane();
	static JEditorPane createUsername = new JEditorPane();
	static JButton dltAccount = new JButton("Yes");
	JEditorPane accountExists = new JEditorPane();
	JButton btnCheck2Pass = new JButton("Check");
	JEditorPane newPassword = new JEditorPane();
	JPanel panel = new JPanel();
	JPanel panel_1 = new JPanel();
	JPanel panel_2 = new JPanel();
	JButton button = new JButton("Delete Account");
	JPanel addPanel = new JPanel();
	JButton forgotPassword = new JButton("Password");
	JButton forgotUsername = new JButton("Username");
	JEditorPane Password = new JEditorPane();
	JEditorPane Username = new JEditorPane();
	JTextPane usernamePane = new JTextPane();

	String one = "What is your mom's maiden name?";
	String two = "What city did you grow up in?";
	String three = "What is your favorite Website?";
	private final JEditorPane secInstruction = new JEditorPane();
	private final JEditorPane userInstruction = new JEditorPane();
	private final JEditorPane userInstructionType = new JEditorPane();
	private final JButton btnCheckUser = new JButton("Check");
	private final JButton btnCheckPass = new JButton("Check");
	private final JEditorPane securityQuestion = new JEditorPane();
	private final JButton btnCheck2 = new JButton("Check");
	private final JEditorPane newUserQuestion = new JEditorPane();
	private final JEditorPane newUsername = new JEditorPane();
	private final JButton replaceUser = new JButton("Check");
	private final JEditorPane passInstructionType = new JEditorPane();
	JButton replacePassword = new JButton("Check");
	JEditorPane securityAnswer = new JEditorPane();
	private final JLabel label = new JLabel("");
	private final JButton mainMenu = new JButton("Return to Main Menu");
	private final JLabel backGround3 = new JLabel("");
	private final JLabel label_3 = new JLabel("");
	private final JEditorPane username_1 = new JEditorPane();
	private final JEditorPane password_1 = new JEditorPane();
	private final JEditorPane url_2 = new JEditorPane();
	private final JEditorPane username_2 = new JEditorPane();
	private final JEditorPane password_2 = new JEditorPane();
	private final JEditorPane url_3 = new JEditorPane();
	private final JEditorPane username_3 = new JEditorPane();
	private final JEditorPane password_3 = new JEditorPane();
	private final JButton returnToMain2 = new JButton("Return to Main Menu");
	private final JButton button_2 = new JButton("Add URLs");
	private final JEditorPane URL = new JEditorPane();
	private final JEditorPane user = new JEditorPane();
	private final JEditorPane pass = new JEditorPane();
	private final JPanel printPanel = new JPanel();
	private final JLabel label_4 = new JLabel("");
	private final JLabel label_5 = new JLabel("");
	private final JPanel deletePanel = new JPanel();
	private final JLabel label_6 = new JLabel("");
	private final JLabel label_7 = new JLabel("");
	private final JButton btnNo = new JButton("No");
	private final JButton btnYes = new JButton("Yes");
	private final JButton button_1 = new JButton("Return to Main Menu");
	private final JEditorPane dtrpnAreYouSure = new JEditorPane();
	private final JEditorPane dtrpnDoingSoWill = new JEditorPane();
	JEditorPane url_1 = new JEditorPane();
	static JEditorPane addPrompt = new JEditorPane();
	JButton returnToMain3 = new JButton("Return to Main Menu");
	private final JEditorPane editorPane = new JEditorPane();
	private final JEditorPane editorPane_1 = new JEditorPane();
	private final JEditorPane editorPane_2 = new JEditorPane();
	private final JTextPane urlPane = new JTextPane();
	private final JTextPane passwordPane = new JTextPane();

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
	 * 
	 * @throws Exception
	 */
	public gui() throws Exception {
		usernamePane.setFont(new Font("Times New Roman", Font.BOLD, 14));

		usernamePane.setOpaque(false);

		ques.add("1) " + one);
		ques.add("2) " + two);
		ques.add("3) " + three);

		int height;
		int width;

		addPanel.hide();
		printPanel.hide();

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

		int i = (int) (Math.random() * 2);

		deletePanel.hide();
		resultPress.hide();
		securityAnswer.hide();
		btnCheckPass.hide();
		newUserQuestion.hide();
		replaceUser.hide();
		newUsername.hide();
		newUserQuestion.hide();
		btnCheck2.hide();
		btnCheck2Pass.hide();
		newPassword.hide();
		replacePassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				doubleL.removeLast();
				doubleL.addLast(newPassword.getText());
				System.out.println(doubleL.toString());

			}
		});
		replacePassword.hide();
		accountExists.hide();
		btnCreate2.hide();
		btnReturnToMain.hide();

		JEditorPane deleteText = new JEditorPane();
		JButton dontDelete = new JButton("No");

		JButton btnGo = new JButton("Go!");

		createPasswordText = new JPasswordField();

		createPassword.hide();
		createPasswordText.hide();
		createUsername.hide();
		createUsernametext.hide();
		secQues.hide();
		secQues1.hide();
		secQues2.hide();
		secQues3.hide();

		btnGo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (AccountUsername.getText().equals(doubleL.getFirst())
						&& AccountPassword.getText().equals(doubleL.getLast())) {
					panel.hide();
					panel_1.hide();
					panel_2.show();
					AccountUsername.setText(null);
					AccountPassword.setText(null);
				} else {
					System.out.println("Wrong");
				}
			}
		});
		JEditorPane forgotText = new JEditorPane();

		dontDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				deleteText.hide();
				dontDelete.hide();
				dltAccount.hide();
				btnReturnToMain.hide();

				returnMain();

			}
		});

		deleteText.hide();
		dontDelete.hide();
		btnNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				deletePanel.hide();
				btnYes.hide();
				btnNo.hide();
				button_1.hide();

				panel_2.show();
			}
		});

		btnNo.hide();
		btnYes.hide();
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				deletePanel.hide();
				btnYes.hide();
				btnNo.hide();
				button_1.hide();

				panel_2.show();
			}
		});
		button_1.hide();

		panel_2.hide();
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				grabContent(username_1, password_1, url_1);
				grabContent(username_2, password_2, url_2);
				grabContent(username_3, password_3, url_3);
			}
		});
		button_2.hide();
		returnToMain2.hide();
		printPanel.setLayout(null);
		printPanel.setBounds(0, 0, 895, 800);

		contentPane.add(printPanel);
		passwordPane.setOpaque(false);
		passwordPane.setFont(new Font("Times New Roman", Font.BOLD, 14));
		passwordPane.setBounds(634, 204, 213, 393);

		printPanel.add(passwordPane);
		urlPane.setOpaque(false);
		urlPane.setFont(new Font("Times New Roman", Font.BOLD, 14));
		urlPane.setBounds(148, 204, 233, 393);

		printPanel.add(urlPane);
		editorPane_2.setText("URL");
		editorPane_2.setOpaque(false);
		editorPane_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		editorPane_2.setEditable(false);
		editorPane_2.setBounds(190, 184, 40, 20);

		printPanel.add(editorPane_2);
		editorPane_1.setText("Password");
		editorPane_1.setOpaque(false);
		editorPane_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		editorPane_1.setEditable(false);
		editorPane_1.setBounds(651, 184, 68, 20);

		printPanel.add(editorPane_1);
		editorPane.setText("Username");
		editorPane.setOpaque(false);
		editorPane.setFont(new Font("Times New Roman", Font.BOLD, 14));
		editorPane.setEditable(false);
		editorPane.setBounds(413, 184, 68, 20);

		printPanel.add(editorPane);

		usernamePane.setBounds(405, 204, 199, 393);
		printPanel.add(usernamePane);

		returnToMain3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				printPanel.hide();
				printPanel.disable();
				panel_2.show();
				returnToMain2.hide();
			}
		});
		returnToMain3.setToolTipText("Return to the main screen");
		returnToMain3.setFont(new Font("Times New Roman", Font.BOLD, 12));
		returnToMain3.setBounds(351, 126, 193, 33);
		printPanel.add(returnToMain3);
		label_4.setIcon(new ImageIcon(
				"C:\\Users\\Willy\\Desktop\\PasswordKeeprer\\lock.jpg"));
		label_4.setBounds(46, 21, 80, 80);

		printPanel.add(label_4);
		label_5.setOpaque(true);
		label_5.setIcon(new ImageIcon(
				"C:\\Users\\Willy\\Desktop\\PasswordKeeprer\\back.PNG"));
		label_5.setBounds(0, 0, 895, 800);

		printPanel.add(label_5);

		addPanel.setBounds(0, 0, 895, 800);
		contentPane.add(addPanel);
		addPanel.setLayout(null);

		addPrompt.setText("\r\n");
		addPrompt.setOpaque(false);
		addPrompt.setFont(new Font("Times New Roman", Font.BOLD, 14));
		addPrompt.setEditable(false);
		addPrompt.setBounds(381, 440, 133, 20);
		addPanel.add(addPrompt);
		pass.setText("Password");
		pass.setOpaque(false);
		pass.setFont(new Font("Times New Roman", Font.BOLD, 14));
		pass.setEditable(false);
		pass.setBounds(586, 184, 68, 20);

		addPanel.add(pass);
		user.setText("Username");
		user.setOpaque(false);
		user.setFont(new Font("Times New Roman", Font.BOLD, 14));
		user.setEditable(false);
		user.setBounds(413, 184, 68, 20);

		addPanel.add(user);
		URL.setText("URL");
		URL.setOpaque(false);
		URL.setFont(new Font("Times New Roman", Font.BOLD, 14));
		URL.setEditable(false);
		URL.setBounds(255, 184, 40, 20);

		addPanel.add(URL);
		button_2.setToolTipText("Selecting this option allows you to view your account info.");
		button_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		button_2.setBounds(377, 384, 140, 45);

		addPanel.add(button_2);
		returnToMain2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addPanel.hide();
				addPanel.disable();
				panel_2.show();
				button_2.hide();
				returnToMain2.hide();
			}
		});
		returnToMain2.setToolTipText("Return to the main screen");
		returnToMain2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		returnToMain2.setBounds(351, 126, 193, 33);

		addPanel.add(returnToMain2);
		password_3.setBorder(new LineBorder(new Color(160, 160, 160)));
		password_3.setBounds(559, 334, 123, 20);

		addPanel.add(password_3);
		password_2.setBorder(new LineBorder(new Color(160, 160, 160)));
		password_2.setBounds(559, 284, 123, 20);

		addPanel.add(password_2);
		password_1.setBorder(new LineBorder(new Color(160, 160, 160)));
		password_1.setBounds(559, 234, 123, 20);

		addPanel.add(password_1);
		username_3.setBorder(new LineBorder(new Color(160, 160, 160)));
		username_3.setBounds(386, 334, 123, 20);

		addPanel.add(username_3);
		username_2.setBorder(new LineBorder(new Color(160, 160, 160)));
		username_2.setBounds(386, 284, 123, 20);

		addPanel.add(username_2);
		username_1.setBorder(new LineBorder(new Color(160, 160, 160)));
		username_1.setBounds(386, 234, 123, 20);

		addPanel.add(username_1);
		url_3.setBorder(new LineBorder(new Color(160, 160, 160)));
		url_3.setBounds(213, 334, 123, 20);

		addPanel.add(url_3);

		url_2.setBorder(new LineBorder(new Color(160, 160, 160)));
		url_2.setBounds(213, 284, 123, 20);

		addPanel.add(url_2);

		url_1.setBorder(new LineBorder(new Color(160, 160, 160)));
		url_1.setBounds(213, 234, 123, 20);
		addPanel.add(url_1);

		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("C:\\Users\\Willy\\Desktop\\PasswordKeeprer\\lock.jpg"));
		label_2.setBounds(46, 21, 80, 80);
		addPanel.add(label_2);
		label_3.setIcon(new ImageIcon("C:\\Users\\Willy\\Desktop\\PasswordKeeprer\\back.PNG"));
		label_3.setBounds(0, 0, 895, 800);

		addPanel.add(label_3);

		panel_2.setBounds(0, 0, 895, 800);
		contentPane.add(panel_2);
		panel_2.setLayout(null);

		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel_2.hide();

				accountExists.show();
				accessBtn.show();
				makeBtn.show();

				forgotBtn.show();
				Exitbtn.show();

				btnReturnToMain.hide();
				AccountPassword.hide();
				AccountUsername.hide();
				Password.hide();
				Username.hide();
				btnGo.hide();

				panel.show();
			}
		});

		JButton btnAddUrls = new JButton("Add URLs");
		btnAddUrls.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				addPanel.show();
				panel_2.hide();
				returnToMain2.show();
				button_2.show();

			}
		});
		btnAddUrls
				.setToolTipText("Selecting this option allows you to view your account info.");
		btnAddUrls.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnAddUrls.setBounds(87, 120, 140, 45);
		panel_2.add(btnAddUrls);

		JButton btnPrinturls = new JButton("Print URLs");
		btnPrinturls.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				printPanel.show();
				panel_2.hide();
				returnToMain3.show();
				button_2.show();

				String formatedString = username.toString().replace(",", "") // remove
																				// the
																				// commas
						.replace("[", "") // remove the right bracket
						.replace("]", "") // remove the left bracket
						.trim().replace(" ", "\n \n");

				String formatedString2 = passwords.toString().replace(",", "") // remove
																				// the
																				// commas
						.replace("[", "") // remove the right bracket
						.replace("]", "") // remove the left bracket
						.trim().replace(" ", "\n \n");

				String formatedString3 = urls.toString().replace(",", "") // remove
																			// the
																			// commas
						.replace("[", "") // remove the right bracket
						.replace("]", "") // remove the left bracket
						.trim().replace(" ", "\n \n");

				usernamePane.setText(formatedString);
				passwordPane.setText(formatedString2);
				urlPane.setText(formatedString3);

			}
		});
		btnPrinturls
				.setToolTipText("Selecting this option allows you to view your account info.");
		btnPrinturls.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnPrinturls.setBounds(232, 120, 140, 45);
		panel_2.add(btnPrinturls);

		JButton btnEditInfo = new JButton("Edit Info");
		btnEditInfo
				.setToolTipText("Selecting this option allows you to view your account info.");
		btnEditInfo.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnEditInfo.setBounds(377, 120, 140, 45);
		panel_2.add(btnEditInfo);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				addPanel.hide();
				deletePanel.show();
				panel_2.hide();
				btnNo.show();
				btnYes.show();
				button_1.show();
			}
		});

		button.setToolTipText("Delete your current account");
		button.setFont(new Font("Times New Roman", Font.BOLD, 12));
		button.setBounds(522, 120, 140, 45);
		panel_2.add(button);
		btnExit.setToolTipText("Selecting this option allows you to view your account info.");
		btnExit.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnExit.setBounds(667, 120, 140, 45);
		panel_2.add(btnExit);

		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Users\\Willy\\Desktop\\PasswordKeeprer\\lock.jpg"));
		label_1.setBounds(46, 21, 80, 80);
		panel_2.add(label_1);
		backGround3
				.setIcon(new ImageIcon("C:\\Users\\Willy\\Desktop\\PasswordKeeprer\\back.PNG"));
		backGround3.setBounds(0, 0, 895, 800);

		panel_2.add(backGround3);
		deletePanel.setLayout(null);
		deletePanel.setBounds(0, 0, 895, 800);

		contentPane.add(deletePanel);
		dtrpnDoingSoWill
				.setText("Doing so will get rid of all usernames, passwords, and saved information.");
		dtrpnDoingSoWill.setOpaque(false);
		dtrpnDoingSoWill.setFont(new Font("Times New Roman", Font.BOLD, 14));
		dtrpnDoingSoWill.setEditable(false);
		dtrpnDoingSoWill.setBounds(219, 251, 457, 33);

		deletePanel.add(dtrpnDoingSoWill);
		dtrpnAreYouSure
				.setText("Are you sure you wish to delete your account? ");
		dtrpnAreYouSure.setOpaque(false);
		dtrpnAreYouSure.setFont(new Font("Times New Roman", Font.BOLD, 14));
		dtrpnAreYouSure.setEditable(false);
		dtrpnAreYouSure.setBounds(302, 227, 290, 33);

		deletePanel.add(dtrpnAreYouSure);
		button_1.setToolTipText("Return to the main screen");
		button_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		button_1.setBounds(351, 126, 193, 33);

		deletePanel.add(button_1);
		btnYes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				doubleL.clear();
				AL.clear();
				ques.clear();
				urls.clear();
				passwords.clear();
				username.clear();

				deletePanel.hide();
				panel_2.hide();

				AccountPassword.hide();
				AccountUsername.hide();
				Password.hide();
				Username.hide();
				btnReturnToMain.hide();
				deleteText.hide();
				dontDelete.hide();
				dltAccount.hide();
				createPassword.hide();
				createUsernametext.hide();
				createUsername.hide();
				createPasswordText.hide();
				dtrpnReenterPassword.hide();
				passwordField.hide();
				forgotPassword.hide();
				forgotUsername.hide();
				forgotText.hide();
				btnCreate.hide();
				btnGo.hide();
				// resultPress2.hide();
				returnMain();
				resultPress.hide();

				panel.show();
			}
		});
		btnYes.setToolTipText("Return to the main menu");
		btnYes.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnYes.setBounds(232, 336, 140, 45);

		deletePanel.add(btnYes);
		btnNo.setToolTipText("Return to the main menu");
		btnNo.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNo.setBounds(522, 336, 140, 45);

		deletePanel.add(btnNo);
		label_6.setIcon(new ImageIcon("C:\\Users\\Willy\\Desktop\\PasswordKeeprer\\lock.jpg"));
		label_6.setBounds(46, 21, 80, 80);

		deletePanel.add(label_6);
		label_7.setIcon(new ImageIcon("C:\\Users\\Willy\\Desktop\\PasswordKeeprer\\back.PNG"));
		label_7.setBounds(0, 0, 895, 800);

		deletePanel.add(label_7);

		panel.setBounds(0, 0, 895, 800);
		contentPane.add(panel);
		panel.setLayout(null);

		forgotText.hide();

		btnGo.hide();

		dltAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				doubleL.clear();
				AL.clear();
				urls.clear();
				passwords.clear();
				username.clear();

				System.out.println(doubleL.toString());

				deleteText.hide();
				dontDelete.hide();
				dltAccount.hide();
				btnReturnToMain.hide();

				returnMain();
			}
		});
		dltAccount.hide();
		forgotPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCheckPass.show();
				panel.hide();
				panel_1.show();
				userInstruction.setText("Enter your username");
				userInstruction.show();
				passInstructionType.show();
			}
		});

		forgotPassword.hide();

		forgotUsername.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnCheckUser.show();
				panel.hide();
				panel_1.show();
				userInstruction.show();
				userInstruction.setText("Enter your password");
				userInstructionType.show();

			}
		});
		forgotUsername.hide();

		//
		accessBtn.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		accessBtn.setBounds(160, 120, 140, 45);
		panel.add(accessBtn);
		accessBtn.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {

				if (doubleL.isEmpty()) {
					accountExists.show();
					accountExists.setText("You need to create an account");
				} else {

					accountExists.hide();
					accessBtn.hide();
					makeBtn.hide();

					forgotBtn.hide();
					Exitbtn.hide();

					btnReturnToMain.show();
					AccountPassword.show();
					AccountUsername.show();
					Password.show();
					Username.show();
					btnGo.show();
				}
			}
		});
		accessBtn
				.setToolTipText("Selecting this option allows you to view your account info.");
		accessBtn.setFont(new Font("Times New Roman", Font.BOLD, 12));

		//
		makeBtn.setBounds(305, 120, 140, 45);
		panel.add(makeBtn);
		makeBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accountExists.hide();
				System.out.println(doubleL.toString());
				if (!doubleL.isEmpty()) {
					accountExists.show();
					accountExists.setText("You already have an account");
				} else {

					accessBtn.hide();
					makeBtn.hide();

					forgotBtn.hide();
					Exitbtn.hide();

					btnCreate.setEnabled(true);
					createUsernametext.setEnabled(true);
					passwordField.setEnabled(true);
					createPasswordText.setEnabled(true);
					dtrpnReenterPassword.setEnabled(true);

					createUsernametext.setText(null);
					createPasswordText.setText(null);
					passwordField.setText(null);

					secQues1.setText("");
					secQues2.setText("");
					secQues3.setText("");

					btnReturnToMain.show();
					createPassword.show();
					createUsername.show();
					createUsernametext.show();
					createPasswordText.show();
					passwordField.show();
					dtrpnReenterPassword.show();
					btnCreate.show();
				}
			}

		});
		makeBtn.setToolTipText("Create an account if you don't already have one");
		makeBtn.setFont(new Font("Times New Roman", Font.BOLD, 12));

		//
		forgotBtn.setBounds(450, 120, 140, 45);
		panel.add(forgotBtn);
		forgotBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (doubleL.isEmpty()) {
					accountExists.show();
					accountExists.setText("You need to create an account");
				} else {

					accountExists.hide();

					accessBtn.hide();
					makeBtn.hide();

					forgotBtn.hide();
					Exitbtn.hide();

					btnReturnToMain.show();
					forgotPassword.show();
					forgotUsername.show();
					forgotText.show();

				}

			}
		});
		forgotBtn
				.setToolTipText("Select this option if you've forgotten your username or password");
		forgotBtn.setFont(new Font("Times New Roman", Font.BOLD, 12));

		forgotUsername.setToolTipText("Delete ALL saved info");
		forgotUsername.setFont(new Font("Times New Roman", Font.BOLD, 12));
		forgotUsername.setBounds(232, 336, 140, 45);
		panel.add(forgotUsername);

		//
		Exitbtn.setBounds(595, 120, 140, 45);
		panel.add(Exitbtn);
		Exitbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}

		});
		Exitbtn.setToolTipText("Exit Password Keeper");
		Exitbtn.setFont(new Font("Times New Roman", Font.BOLD, 12));

		forgotPassword.setToolTipText("Return to the main menu");
		forgotPassword.setFont(new Font("Times New Roman", Font.BOLD, 12));
		forgotPassword.setBounds(522, 336, 140, 45);
		panel.add(forgotPassword);

		accountExists.setText("You Already Have an Account");
		accountExists.setOpaque(false);
		accountExists.setFont(new Font("Times New Roman", Font.BOLD, 14));
		accountExists.setEditable(false);
		accountExists.setBounds(351, 186, 193, 20);
		panel.add(accountExists);

		dltAccount.setToolTipText("Delete ALL saved info");
		dltAccount.setFont(new Font("Times New Roman", Font.BOLD, 12));
		dltAccount.setBounds(232, 336, 140, 45);
		panel.add(dltAccount);

		btnCreate2.setToolTipText("Delete ALL saved info");
		btnCreate2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnCreate2.setBounds(377, 564, 140, 45);
		panel.add(btnCreate2);

		secQues3.setBorder(new LineBorder(Color.LIGHT_GRAY));
		secQues3.setBounds(466, 524, 123, 20);
		panel.add(secQues3);
		secQues3.hide();

		secQues2.setBorder(new LineBorder(Color.LIGHT_GRAY));
		secQues2.setBounds(466, 488, 123, 20);
		panel.add(secQues2);
		secQues2.hide();

		secQues1.setBorder(new LineBorder(Color.LIGHT_GRAY));
		secQues1.setBounds(466, 457, 123, 20);
		panel.add(secQues1);
		secQues1.hide();

		secQues.setText("1) What is your mom's maiden name?\r\n\r\n         2) What city did you grow up in?\r\n\r\n        3) What is your favorite website?");
		secQues.setOpaque(false);
		secQues.setFont(new Font("Times New Roman", Font.BOLD, 14));
		secQues.setEditable(false);
		secQues.setBounds(208, 457, 259, 106);
		panel.add(secQues);

		resultPress.setEditable(false);
		resultPress.setOpaque(false);
		resultPress.setFont(new Font("Times New Roman", Font.BOLD, 14));
		resultPress.setBounds(350, 384, 337, 62);
		panel.add(resultPress);

		btnCreate.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				String password = createPasswordText.getText().trim();
				String password2 = passwordField.getText().trim();
				containPass(password, password2);

			}

		});
		btnCreate.hide();

		btnCreate.setToolTipText("Delete ALL saved info");
		btnCreate.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnCreate.setBounds(377, 336, 140, 45);
		panel.add(btnCreate);

		createPasswordText.setBounds(421, 264, 123, 20);
		panel.add(createPasswordText);

		createPassword.setText("Password:");
		createPassword.setOpaque(false);
		createPassword.setFont(new Font("Times New Roman", Font.BOLD, 14));
		createPassword.setEditable(false);
		createPassword.setBounds(341, 264, 70, 23);
		panel.add(createPassword);

		createUsername.setText("Username:");
		createUsername.setOpaque(false);
		createUsername.setFont(new Font("Times New Roman", Font.BOLD, 14));
		createUsername.setEditable(false);
		createUsername.setBounds(341, 233, 106, 20);
		panel.add(createUsername);

		createUsernametext.setBorder(new LineBorder(new Color(160, 160, 160)));
		createUsernametext.setBounds(421, 233, 123, 20);
		panel.add(createUsernametext);

		btnGo.setToolTipText("Delete ALL saved info");
		btnGo.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnGo.setBounds(377, 336, 140, 45);
		panel.add(btnGo);

		forgotText.setText("Have You Forgotten your username or password?");
		forgotText.setOpaque(false);
		forgotText.setFont(new Font("Times New Roman", Font.BOLD, 14));
		forgotText.setEditable(false);
		forgotText.setBounds(299, 264, 596, 20);
		panel.add(forgotText);

		btnReturnToMain.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				AccountUsername.setText(null);
				AccountPassword.setText(null);

				AccountPassword.hide();
				AccountUsername.hide();
				Password.hide();
				Username.hide();
				btnReturnToMain.hide();
				deleteText.hide();
				dontDelete.hide();
				dltAccount.hide();
				createPassword.hide();
				createUsernametext.hide();
				createUsername.hide();
				createPasswordText.hide();
				dtrpnReenterPassword.hide();
				passwordField.hide();
				forgotPassword.hide();
				forgotUsername.hide();
				forgotText.hide();
				btnCreate.hide();
				btnGo.hide();
				// resultPress2.hide();
				returnMain();
				resultPress.hide();

			}
		});
		btnReturnToMain.setToolTipText("Return to the main screen");
		btnReturnToMain.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnReturnToMain.setBounds(351, 126, 193, 33);
		panel.add(btnReturnToMain);

		JLabel lockLabel = new JLabel("");
		lockLabel.setBounds(46, 21, 80, 80);
		panel.add(lockLabel);
		lockLabel.setIcon(new ImageIcon("C:\\Users\\Willy\\Desktop\\PasswordKeeprer\\lock.jpg"));

		deleteText
				.setText("Are you sure you want to delete your account? Doing so will delete all previously saved data.");
		deleteText.setOpaque(false);
		deleteText.setFont(new Font("Times New Roman", Font.BOLD, 14));
		deleteText.setEditable(false);
		deleteText.setBounds(149, 264, 596, 20);
		panel.add(deleteText);

		dontDelete.setToolTipText("Return to the main menu");
		dontDelete.setFont(new Font("Times New Roman", Font.BOLD, 12));
		dontDelete.setBounds(522, 336, 140, 45);
		panel.add(dontDelete);

		Password.hide();

		Password.setBounds(341, 264, 70, 23);
		panel.add(Password);
		Password.setEditable(false);

		Password.setText("Password:");
		Password.setOpaque(false);
		Password.setFont(new Font("Times New Roman", Font.BOLD, 14));
		Username.hide();
		Username.setBounds(341, 233, 106, 20);
		panel.add(Username);
		Username.setEditable(false);

		Username.setFont(new Font("Times New Roman", Font.BOLD, 14));
		Username.setText("Username:");
		Username.setOpaque(false);

		AccountUsername.hide();
		AccountUsername.setBounds(421, 233, 123, 20);
		panel.add(AccountUsername);

		AccountUsername.setBorder(new LineBorder(SystemColor.controlShadow));
		AccountPassword = new JPasswordField();
		AccountPassword.hide();
		AccountPassword.setBounds(421, 264, 123, 20);
		panel.add(AccountPassword);
		passwordField = new JPasswordField();
		passwordField.hide();

		passwordField.setBounds(421, 295, 123, 20);
		panel.add(passwordField);

		dtrpnReenterPassword.hide();

		dtrpnReenterPassword.setText("Re-enter Password:");
		dtrpnReenterPassword.setOpaque(false);
		dtrpnReenterPassword
				.setFont(new Font("Times New Roman", Font.BOLD, 14));
		dtrpnReenterPassword.setEditable(false);
		dtrpnReenterPassword.setBounds(282, 295, 129, 23);
		panel.add(dtrpnReenterPassword);

		JLabel backGround = DefaultComponentFactory.getInstance().createLabel(
				"");
		backGround.setBounds(new Rectangle(0, 0, 895, 800));
		panel.add(backGround);
		backGround
				.setIcon(new ImageIcon("C:\\Users\\Willy\\Desktop\\PasswordKeeprer\\back.PNG"));

		panel_1.setBounds(0, 0, 895, 800);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		btnCheckUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// if (Username.equals(getDoubleL.getFirst())
				if (userInstructionType.getText().trim()
						.equals(doubleL.getLast())) {

					securityQuestion.setText(ques.get(i));
					btnCheck2.show();
					secInstruction.show();
					securityQuestion.show();
					securityAnswer.show();

					if (securityAnswer.getText().equals(AL.get(i))) {
						System.out.println("Youre right");

					}

				}
			}
		});
		btnCheckUser.setToolTipText("Delete ALL saved info");
		btnCheckUser.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnCheckUser.setBounds(377, 255, 135, 45);
		btnCheckUser.hide();

		btnCheck2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (securityAnswer.getText().equals(AL.get(i))) {
					System.out.println("You're right");

					newUsername.show();
					newUserQuestion.show();
					newUserQuestion
							.setText("What would you like your new username to be?");
					replaceUser.show();
				}
			}
		});
		btnCheckPass.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (passInstructionType.getText().trim()
						.equals(doubleL.getFirst())) {

					System.out.println("Right");
					securityQuestion.setText(ques.get(i));
					securityQuestion.show();
					secInstruction.show();
					securityAnswer.show();
					btnCheck2Pass.show();

				}

			}
		});
		btnCheckPass.hide();

		secInstruction.hide();
		secInstruction.setText("Answer the following Security Question\r\n");
		secInstruction.setOpaque(false);
		secInstruction.setFont(new Font("Times New Roman", Font.BOLD, 14));
		secInstruction.setEditable(false);
		secInstruction.setBounds(314, 339, 261, 20);
		secInstruction.hide();
		passInstructionType.hide();

		securityQuestion.hide();
		mainMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				securityQuestion.hide();
				securityAnswer.hide();
				passInstructionType.hide();
				replacePassword.hide();
				btnCheck2Pass.hide();
				newPassword.hide();
				newUsername.hide();
				secInstruction.hide();
				btnCheckPass.hide();
				btnCheck2.hide();
				newUserQuestion.hide();
				btnCheckUser.hide();
				userInstructionType.hide();
				userInstruction.hide();
				replaceUser.hide();

				passInstructionType.setText(null);
				securityAnswer.setText(null);
				passInstructionType.setText(null);
				newPassword.setText(null);
				newUsername.setText(null);
				userInstructionType.setText(null);

				panel_1.hide();
				panel.show();
			}
		});
		userInstruction.setBounds(375, 186, 151, 20);
		panel_1.add(userInstruction);
		userInstruction.setOpaque(false);
		userInstruction.setFont(new Font("Times New Roman", Font.BOLD, 14));
		userInstruction.setEditable(false);
		userInstruction.hide();
		mainMenu.setToolTipText("Return to the main screen");
		mainMenu.setFont(new Font("Times New Roman", Font.BOLD, 12));
		mainMenu.setBounds(351, 126, 193, 33);

		panel_1.add(mainMenu);

		securityQuestion.setOpaque(false);
		securityQuestion.setFont(new Font("Times New Roman", Font.BOLD, 14));
		securityQuestion.setEditable(false);
		securityQuestion.setBounds(314, 401, 261, 23);

		panel_1.add(securityQuestion);
		securityQuestion.hide();

		securityAnswer.setBorder(new LineBorder(Color.LIGHT_GRAY));
		securityAnswer.setBounds(379, 432, 123, 20);
		panel_1.add(securityAnswer);

		passInstructionType.setBounds(379, 217, 123, 20);
		panel_1.add(passInstructionType);
		passInstructionType.setBorder(new LineBorder(Color.LIGHT_GRAY));
		passInstructionType.setBounds(379, 217, 123, 20);

		panel_1.add(passInstructionType);

		replacePassword.setToolTipText("Delete ALL saved info");
		replacePassword.setFont(new Font("Times New Roman", Font.BOLD, 12));
		replacePassword.setBounds(377, 627, 135, 45);
		panel_1.add(replacePassword);

		btnCheck2Pass.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (securityAnswer.getText().equals(AL.get(i))) {
					System.out.println("You're right");

					newUserQuestion
							.setText("What would you like your new password to be?");
					newPassword.show();
					newUserQuestion.show();
					replacePassword.show();

					newUserQuestion
							.setText("What would you like your new password to be?");
				}

			}
		});
		btnCheck2Pass.setToolTipText("Delete ALL saved info");
		btnCheck2Pass.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnCheck2Pass.setBounds(377, 467, 135, 45);
		panel_1.add(btnCheck2Pass);

		newPassword.setBorder(new LineBorder(Color.LIGHT_GRAY));
		newPassword.setBounds(373, 584, 123, 20);
		panel_1.add(newPassword);

		panel_1.add(secInstruction);
		btnCheckPass.setToolTipText("Delete ALL saved info");
		btnCheckPass.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnCheckPass.setBounds(377, 255, 135, 45);

		panel_1.add(btnCheckPass);
		newUsername.setBorder(new LineBorder(Color.LIGHT_GRAY));
		newUsername.setBounds(373, 584, 123, 20);

		panel_1.add(newUsername);
		btnCheck2.setToolTipText("Delete ALL saved info");
		btnCheck2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnCheck2.setBounds(377, 467, 135, 45);

		panel_1.add(btnCheck2);
		newUserQuestion.setOpaque(false);
		newUserQuestion.setFont(new Font("Times New Roman", Font.BOLD, 14));
		newUserQuestion.setEditable(false);
		newUserQuestion.setBounds(297, 549, 300, 20);

		panel_1.add(newUserQuestion);

		panel_1.add(btnCheckUser);
		userInstructionType.setBorder(new LineBorder(Color.LIGHT_GRAY));
		userInstructionType.setBounds(379, 217, 123, 20);

		panel_1.add(userInstructionType);
		panel_1.hide();
		replaceUser.hide();
		replaceUser.addActionListener(new ActionListener() {
			@SuppressWarnings("unchecked")
			public void actionPerformed(ActionEvent e) {
				doubleL.removeFirst();
				doubleL.addFirst(newUsername.getText());
				System.out.println(doubleL.toString());
			}
		});
		replaceUser.setToolTipText("Delete ALL saved info");
		replaceUser.setFont(new Font("Times New Roman", Font.BOLD, 12));
		replaceUser.setBounds(377, 627, 135, 45);

		panel_1.add(replaceUser);
		label.setIcon(new ImageIcon("C:\\Users\\Willy\\Desktop\\PasswordKeeprer\\lock.jpg"));
		label.setBounds(46, 21, 80, 80);

		panel_1.add(label);

		JLabel backGround2 = DefaultComponentFactory.getInstance().createLabel(
				"");
		backGround2.setBounds(0, 0, 895, 800);
		panel_1.add(backGround2);
		backGround2.setIcon(new ImageIcon("C:\\Users\\Willy\\Desktop\\PasswordKeeprer\\back.PNG"));
		userInstructionType.hide();

	}

	public static void printContent() {

	}

	public static void grabContent(JEditorPane Username, JEditorPane Password,
			JEditorPane URL) {
		if (!Username.getText().isEmpty() && !Password.getText().isEmpty()
				&& !URL.getText().isEmpty()) {

			addPrompt.setText(null);

			username.add(Username.getText());
			passwords.add(Password.getText());
			urls.add(URL.getText());

			Username.setText(null);
			Password.setText(null);
			URL.setText(null);

			System.out.println(username.toString());

			addPrompt.setText("Information added!");

		} else {

			Username.setText(null);
			Password.setText(null);
			URL.setText(null);

			addPrompt.setText("There was a problem");

		}
	}

	public static boolean containsChar(char[] text) {
		boolean retval = false;
		for (int i = 0; i < text.length; i++) {
			if (text[i] < '\u0041' || text[i] > '\u005A') {
				retval = false;
			} else {
				retval = true;
				break;
			}
		}
		return retval;
	}

	public static boolean containsNum(char[] text) {
		boolean retval = false;
		for (int i = 0; i < text.length; i++) {
			if (text[i] < '\u0030' || text[i] > '\u0039') {
				retval = false;
			} else {
				retval = true;
				break;
			}
		}
		return retval;
	}

	@SuppressWarnings("deprecation")
	public static void containPass(String password, String password2) {
		char[] text = password.toCharArray();
		boolean retval;
		int i;

		boolean actual = containsChar(text);
		boolean actual2 = containsNum(text);

		if (password.length() < 8 || actual == false || actual2 == false) {

			resultPress.show();
			// resultPress2.show();

		} else {
			if (password.equals(password2)) {
				resultPress.setText(null);
				btnCreate.setEnabled(false);
				createUsernametext.setEnabled(false);
				passwordField.setEnabled(false);
				createPasswordText.setEnabled(false);
				quesCreate();
				// resultPress2.hide();

			} else {
				resultPress.setText("Your Passwords are different.");
			}
		}
	}

	public static void quesCreate() {

		resultPress.setText("Now answer these security questions.");
		btnCreate2.show();
		secQues.show();
		secQues1.show();
		secQues2.show();
		secQues3.show();

		btnCreate2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (secQues1.getText().isEmpty()
						|| secQues2.getText().isEmpty()
						|| secQues3.getText().isEmpty()) {
					resultPress
							.setText("One of your question fields is empty.");
				} else {

					AL.add(secQues1.getText());
					AL.add(secQues2.getText());
					AL.add(secQues3.getText());
					// System.out.println(AL.toString());
					doubleL.add(createUsernametext.getText().trim());
					// System.out.println(username.toString());
					doubleL.add(passwordField.getText().trim());
					System.out.println(doubleL.toString());

					btnCreate.hide();
					createUsernametext.hide();
					passwordField.hide();
					createPasswordText.hide();
					btnCreate2.hide();
					secQues.hide();
					secQues1.hide();
					secQues2.hide();
					secQues3.hide();
					resultPress.setText(" ");
					createUsername.hide();
					createPassword.hide();
					dtrpnReenterPassword.hide();
					btnReturnToMain.hide();

					returnMain();

				}
			}
		});

	}

	public static void returnMain() {
		accessBtn.show();
		makeBtn.show();
		forgotBtn.show();
		Exitbtn.show();

	}
}
