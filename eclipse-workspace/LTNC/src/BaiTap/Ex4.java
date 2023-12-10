package BaiTap;

import javax.swing.JFrame;

public class Ex4 extends JFrame{
	public void accCore() {
		setSize(300,400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex4();
	}
}
