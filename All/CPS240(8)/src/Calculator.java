//Will Horst
//Calculator.java
//This gui program builds a calculator

import javax.swing.*;

import java.awt.Font;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {

	private JPanel panel = new JPanel();
	static JTextPane ansField;
	static JButton equalBtn, additionBtn, subtractionBtn, MultiplicationBtn,
			divisionButton, CBtn, zeroBtn, oneBtn, twoBtn, threeBtn, fourBtn,
			fiveBtn, sixBtn, sevenBtn, eightBtn, nineBtn;

	static int addition = 0, subtract = 0, multiplication = 0, division = 0;
	static int clearAll;
	static double first, second, jAnswer;

	public Calculator() {

	//	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Set my sizes and panels
		setResizable(false);
		setSize(411, 523);

		
		panel.setSize(370, 330);
		panel.setLayout(null);

		add(panel);

		// Create the new buttons
		additionBtn = new JButton("+");
		subtractionBtn = new JButton("-");
		MultiplicationBtn = new JButton("*");
		divisionButton = new JButton("/");
		equalBtn = new JButton("=");
		zeroBtn = new JButton("0");
		oneBtn = new JButton("1");
		twoBtn = new JButton("2");
		threeBtn = new JButton("3");
		fourBtn = new JButton("4");
		fiveBtn = new JButton("5");
		sixBtn = new JButton("6");
		sevenBtn = new JButton("7");
		eightBtn = new JButton("8");
		nineBtn = new JButton("9");
		CBtn = new JButton("C");
		ansField = new JTextPane();

		// Set the loactions of the buttons
		additionBtn.setLocation(294, 109);
		subtractionBtn.setLocation(294, 202);
		MultiplicationBtn.setLocation(294, 296);
		divisionButton.setLocation(294, 389);
		equalBtn.setLocation(198, 389);
		zeroBtn.setLocation(104, 389);
		oneBtn.setLocation(5, 109);
		twoBtn.setLocation(104, 109);
		threeBtn.setLocation(198, 109);
		fourBtn.setLocation(5, 202);
		fiveBtn.setLocation(104, 202);
		sixBtn.setLocation(198, 202);
		sevenBtn.setLocation(5, 296);
		eightBtn.setLocation(104, 296);
		nineBtn.setLocation(198, 296);
		CBtn.setLocation(5, 389);

		ansField.setLocation(5, 10);
		ansField.setFont(new Font("Arial", Font.BOLD, 36));
		ansField.setEditable(false);

		additionBtn.setSize(86, 86);
		subtractionBtn.setSize(86, 86);
		MultiplicationBtn.setSize(86, 86);
		divisionButton.setSize(86, 86);
		equalBtn.setSize(86, 86);
		zeroBtn.setSize(86, 86);
		oneBtn.setSize(86, 86);
		twoBtn.setSize(86, 86);
		threeBtn.setSize(86, 86);
		fourBtn.setSize(86, 86);
		fiveBtn.setSize(86, 86);
		sixBtn.setSize(86, 86);
		sevenBtn.setSize(86, 86);
		eightBtn.setSize(86, 86);
		nineBtn.setSize(86, 86);
		CBtn.setSize(86, 86);
		ansField.setSize(371, 86);

		// Add the action listener for the buttons
		equalBtn.addActionListener(this);
		additionBtn.addActionListener(this);
		subtractionBtn.addActionListener(this);
		MultiplicationBtn.addActionListener(this);
		divisionButton.addActionListener(this);
		CBtn.addActionListener(this);
		zeroBtn.addActionListener(this);
		oneBtn.addActionListener(this);
		twoBtn.addActionListener(this);
		threeBtn.addActionListener(this);
		fourBtn.addActionListener(this);
		fiveBtn.addActionListener(this);
		sixBtn.addActionListener(this);
		sevenBtn.addActionListener(this);
		eightBtn.addActionListener(this);
		nineBtn.addActionListener(this);

		// Add the buttons to the panel
		panel.add(zeroBtn);
		panel.add(oneBtn);
		panel.add(twoBtn);
		panel.add(threeBtn);
		panel.add(fourBtn);
		panel.add(fiveBtn);
		panel.add(sixBtn);
		panel.add(sevenBtn);
		panel.add(eightBtn);
		panel.add(nineBtn);
		panel.add(ansField);
		panel.add(equalBtn);
		panel.add(additionBtn);
		panel.add(subtractionBtn);
		panel.add(MultiplicationBtn);
		panel.add(divisionButton);
		panel.add(CBtn);

		setTitle("CPS 240 Calculator");

	}

	// The next few lines of code establish what happens when you push the
	// button
	public void actionPerformed(ActionEvent action) {
		if (action.getSource() == zeroBtn) {
			setNum("0");
		}

		if (action.getSource() == oneBtn) {
			setNum("1");
		}

		if (action.getSource() == twoBtn) {
			setNum("2");
		}

		if (action.getSource() == threeBtn) {
			setNum("3");
		}

		if (action.getSource() == fourBtn) {
			setNum("4");
		}

		if (action.getSource() == fiveBtn) {
			setNum("5");
		}

		if (action.getSource() == sixBtn) {
			setNum("6");
		}

		if (action.getSource() == sevenBtn) {
			setNum("7");
		}

		if (action.getSource() == eightBtn) {
			setNum("8");
		}

		if (action.getSource() == nineBtn) {
			setNum("9");
		}
		// The C button will reset all values to 0
		if (action.getSource() == CBtn) {
			ansField.setText("");
			first = 0;
			second = 0;
			addition = 0;
			subtract = 0;
			multiplication = 0;
			division = 0;
		}

		if (action.getSource() == equalBtn) {
			second = Double.parseDouble(String.valueOf(ansField.getText()));
			ansField.setText(ansField.getText());
			if (addition == 1) {
				jAnswer = first + second;
				ansField.setText(String.valueOf(jAnswer));
				addition = 0;
			}

			if (subtract == 1) {
				jAnswer = first - second;
				ansField.setText(String.valueOf(jAnswer));
				subtract = 0;
			}

			if (multiplication == 1) {
				jAnswer = first * second;
				ansField.setText(String.valueOf(jAnswer));
				multiplication = 0;
			}

			if (division == 1) {
				if (second == 0) {
					ansField.setText("Can't Divide by 0");
					division = 0;
				} else {
					jAnswer = first / second;
					ansField.setText(String.valueOf(jAnswer));
					division = 0;
				}
			}
		}

		if (action.getSource() == subtractionBtn) {
			if (ansField.getText() != null)
				first = Double.parseDouble(String.valueOf(ansField.getText()));
			subtract = 1;
			clearAll = 1;
		}
		if (action.getSource() == MultiplicationBtn) {
			if (ansField.getText() != null)
				first = Double.parseDouble(String.valueOf(ansField.getText()));
			multiplication = 1;
			clearAll = 1;
		}
		if (action.getSource() == additionBtn) {
			if (ansField.getText() != null) // If there's something in the field
				first = Double.parseDouble(String.valueOf(ansField.getText())); // parse
																				// the
																				// string
																				// values
			addition = 1; // set addition and clear all to 1
			clearAll = 1;
		}

		if (action.getSource() == divisionButton) {
			if (ansField.getText() != null)
				first = Double.parseDouble(String.valueOf(ansField.getText()));
			division = 1;
			clearAll = 1;
		}

	}

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.setVisible(true);
	}

	// My setnum method, which is for what happens when the button is pushed
	public void setNum(String f) {
		if (ansField.getText().length() < 16) {
			if (clearAll == 1) {
				ansField.setText(f);
				clearAll = 0;
			} else {
				ansField.setText(ansField.getText() + f);
			}
		}

	}
}
