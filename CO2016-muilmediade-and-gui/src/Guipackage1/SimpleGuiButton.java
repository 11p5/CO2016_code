package Guipackage1;

import java.awt.Button;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

public final class SimpleGuiButton extends JFrame{
	
	private JLabel helloL;
	private Button enterB, leaveB;
	
	public SimpleGuiButton() {
		setTitle("Simple gui example");
		setSize(1200,800);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container cp = getContentPane();
		cp.setLayout(null);
		
		helloL = new JLabel("Hello");
		helloL.setBounds(200,0,200,50);
		cp.add(helloL);
		
		enterB = new Button("enter");
		enterB.setBounds(400,100,100,50);
		cp.add(enterB);
		
		leaveB = new Button("leave");
		leaveB.setBounds(400,100,100,50);
		cp.add(leaveB);
		
	}//IFrame constuctor
	
	public static void main(String[] args) {
		SimpleGuiButton i = new SimpleGuiButton();
		i.setVisible(true);
		
	}
}