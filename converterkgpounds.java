import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//*Program to convert kg to pounds in a window*/

public class Converter extends JFrame {
	double kg, pounds;
	private JButton button;
	private JTextField textfield;
	private JLabel enterLabel;
	private JLabel kgLabel;
	private JLabel resultLabel;
	
	public Converter() {
		setLayout(new FlowLayout()); //makes everything appear in window
		
		enterLabel = new JLabel("Enter a number in kg: ");
		add(enterLabel);
		
		textfield = new JTextField(5); //length of textfield
		add(textfield);
		
		kgLabel = new JLabel("kg");
		add(kgLabel);
		
		button = new JButton("Convert into pounds!");
		add(button);
		
		resultLabel = new JLabel("");
		add(resultLabel);
		
		event e = new event();
		button.addActionListener(e);
	}
	
	public class event implements ActionListener {
		public void actionPerformed(ActionEvent e) {
				final double convertIntoPounds = 2.2046; //conversion factor that will never change
				
				kg = Double.parseDouble(textfield.getText()); //scans textfield for number
				
				pounds = kg * convertIntoPounds; //does the math
				
				double result = (double) Math.round(pounds * 100) / 100; //rounds converted number to only two decimals 
				
				resultLabel.setText("Result "+result+" lbs"); //displays result
		}
	}
	
	public static void main(String[] args) {
		Converter frame = new Converter(); //create frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //closes program when click on exit
		frame.setVisible(true); //window is visible
		frame.setTitle("Converter"); //window title
		frame.setSize(500, 300); //size of window
	}
}
