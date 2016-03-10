
import javax.swing.*;

public class myFrame extends JFrame {

	public myFrame(){
		JPanel pan = new JPanel();
		JTextArea ta = new JTextArea("Fuck you");
		JButton bt = new JButton("MyButton");
		JLabel lab = new JLabel("Good" ,JLabel.HORIZONTAL);
		
		add(pan);
		
		String [] menu = {"Yes", "No", "Maybe"};
		
		JComboBox cb= new JComboBox(menu); 

		//setSize(400, 600);
		pack();
		
		
		pan.add(lab);
		pan.add(ta);
		pan.add(bt);
		pan.add(cb);
		setVisible(true);

	}

	public static void main(String[] args) {
		
		myFrame frame = new myFrame();
	}
	
}

