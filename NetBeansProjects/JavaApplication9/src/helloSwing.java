
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class helloSwing extends JFrame implements ActionListener {
	
	JButton button = new JButton();
	FlowLayout fl = new FlowLayout();

	
	public helloSwing(){
		//JFrame frame = new JFrame();

		JPanel pan = new JPanel();
		BorderLayout bl = new BorderLayout();
		
		//frame.setTitle("Fuck This");
		setSize(400,400);
		setVisible(true);
		setResizable(false);
		add(pan);
		
		pan.setSize(400,400);
		pan.setLayout(fl);
		pan.add(button);
		
		
		button.addActionListener(e -> {
			
			System.out.println("LEALEALEALEA");
		});
		
	}
	

	public static void main(String[] args) {
		helloSwing g = new helloSwing();

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
