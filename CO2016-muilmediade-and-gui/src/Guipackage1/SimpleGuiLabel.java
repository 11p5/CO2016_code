package Guipackage1;

import java.awt.Button;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public final class SimpleGuiLabel extends JFrame implements ActionListener{
	
	private JLabel helloL;
	private Button enterB, leaveB;
	
	public SimpleGuiLabel() {
		setTitle("simple Gui Example");
		setSize(1200,800);
		setDefaultCloseOperation(EXIT_ON_CLOSE); //bufferimage
		
		Container cp = getContentPane();
		cp.setLayout(null);
		
		helloL = new JLabel("hello");
		helloL.setBounds(200,0,200,50);
		cp.add(helloL);
		
		enterB = new Button("enter");
		enterB.setBounds(200,0,200,50);
		cp.add(enterB);
		
		leaveB.addActionListener(this);
		enterB.addActionListener(this);
	}//Iframe constucter

public static void main(String[] arg) {
	
	SimpleGuiLabel i = new SimpleGuiLabel();
	i.setVisible(true);
}

public void actionPerformed(ActionEvent e) {
	if(e.getSource()==enterB) {
		helloL.setText("hello");
		enterB.setLabel("youa re already here");
		leaveB.setLabel("leave");
	}
	if (e.getSource()==leaveB) {
		helloL.setText("good bye");
		enterB.setLabel("enter");
		leaveB.setLabel("you are not here");
	}
}

}

