package Guipackage1;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

public final class SimpleGuiExample extends JFrame{

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private JLabel helloL;

public SimpleGuiExample() {
	//using constructor
	setTitle("Simple Gui Example");
	setSize(1200,800);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	Container cp = getContentPane();
	cp.setLayout(null);
	
	helloL = new JLabel("Hello");
	helloL.setBounds(200,0,400,400);
	cp.add(helloL);
}//IFrame constucter

public static void main(String[] args) {
	SimpleGuiExample i = new SimpleGuiExample();
	i.setVisible(true);
}

}//IFrame