package Bai_2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Frame;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class PhieuBaiCu extends JFrame{
	JPanel mainPanel, nonPanel, lpanel, rpanel,centerP;
	JLabel jlb;
	public PhieuBaiCu() {
		mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());
		topPanel tp = new topPanel();
		mainPanel.add(tp, BorderLayout.NORTH);
		add(mainPanel);
		
		setSize(500, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	class topPanel extends JPanel{
		JLabel jlb;
		public topPanel(){
		jlb = new JLabel("PHIEU BAU CU CAC CAP");
		Border borer = BorderFactory.createLineBorder(Color.black);
		add(jlb);
		}
	}
	public static void main(String[] args) {
		new PhieuBaiCu();
	}
	
}
