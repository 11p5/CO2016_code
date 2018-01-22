package Guipackage1;

import java.awt.Button;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public final class SimpleGuiCom extends JFrame implements ActionListener{
	
	final public String[] message = {"enter","leave","you are here now","you are not here now"};
	
	private JLabel helloL;
	private Button enterB, leaveB;
	
	public SimpleGuiCom() {
		setTitle("Simple Gui Example");
		setSize(1200,800);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container cp = getContentPane();
		cp.setLayout(null);
		
		helloL = new JLabel("Hello");
		helloL.setBounds(200,0,200,50);
		cp.add(helloL);
		
		enterB = new Button(message[0]);
		enterB.setBounds(400,0,200,50);
		cp.add(enterB);
		
		leaveB= new Button(message[3]);
		leaveB.setBounds(400,100,200,50);
		cp.add(leaveB);
		
		enterB.addActionListener(this);
		leaveB.addActionListener(this);
		
	}//iframconstucter
	
	public static void main(String[] args) {
		SimpleGuiCom i = new SimpleGuiCom();
		i.setVisible(true);
		}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==enterB) {
			helloL.setText("hello");
			enterB.setLabel(message[2]);
			leaveB.setLabel(message[1]);
		}
		if (e.getSource()==enterB) {
			helloL.setText("good bye");
			enterB.setLabel(message[0]);
			leaveB.setLabel(message[3]);
		}
	}
}
