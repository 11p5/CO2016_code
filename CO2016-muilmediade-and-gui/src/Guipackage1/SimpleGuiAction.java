package Guipackage1;

import java.awt.Button;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public final class SimpleGuiAction extends JFrame implements ActionListener{
	
	private JLabel helloL;
	private Button enterB, leaveB;
	
	public SimpleGuiAction() {
		setTitle("Simple Gui Example");
		setSize(1200,800);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container cp = getContentPane();
		cp.setLayout(null);
		
		helloL = new JLabel("Hello");
		helloL.setBounds(400, 0, 200, 50);
		cp.add(helloL);
		
		enterB = new Button("enter");
		enterB.setBounds(400,0,100,50);
		cp.add(enterB);
		
		leaveB = new Button("leave");
		leaveB.setBounds(400,100,100,50);
		cp.add(leaveB);
		
		enterB.addActionListener(this);
		leaveB.addActionListener(this);
		
	}//Ifram constuctor
	
	public static void main(String[] args) {
		SimpleGuiAction i = new SimpleGuiAction();
		i.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==enterB)
			helloL.setText("hello");
		if(e.getSource()==leaveB)
			helloL.setText("good bye");
	}
}//IFrame