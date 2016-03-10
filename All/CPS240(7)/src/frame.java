import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class frame extends JFrame{

	
	public frame(){
		//JPanel pan1 = new JPanel();

		JPanel pan = new JPanel();
		JPanel pan2 = new JPanel();

		
		setTitle("CPS 240 Calculator");
		GridLayout grd = new GridLayout(4,4);
		GridLayout grd1 = new GridLayout(0,1);

		BorderLayout bord = new BorderLayout();
		setLayout(bord);

		JTextField t = new JTextField();
		
		pan.setLayout(grd);
		pack();
		
		pan2.setLayout(grd1);
		pan2.add(t);
	

		
		JButton btn0 = new JButton("0");
		JButton btn1 = new JButton("1");
		JButton btn2 = new JButton("2");
		JButton btn3 = new JButton("3");
		JButton btn4 = new JButton("4");
		JButton btn5 = new JButton("5");
		JButton btn6 = new JButton("6");
		JButton btn7 = new JButton("7");
		JButton btn8 = new JButton("8");
		JButton btn9 = new JButton("9");
		
		JButton btnC = new JButton("C");
		JButton btnEqual = new JButton("=");
		JButton btnDiv = new JButton("/");
		JButton btnMult= new JButton("*");
		JButton btnAdd = new JButton("+");
		JButton btnSub = new JButton("-");
		
		pan.add(btn0);
		pan.add(btn1);
		pan.add(btn2);
		pan.add(btn3);
		pan.add(btn4);
		pan.add(btn5);
		pan.add(btn6);
		pan.add(btn7);
		pan.add(btn8);
		pan.add(btn9);
		pan.add(btnC);
		pan.add(btnEqual);
		pan.add(btnDiv);
		pan.add(btnMult);
		pan.add(btnAdd);
		pan.add(btnSub);
		
		add(pan, BorderLayout.CENTER);
		add(pan2, BorderLayout.NORTH);
		
		pack();

		setVisible(true);
	}
	
	public static void main(String[] args) {
		frame frame = new frame();

	}

}
