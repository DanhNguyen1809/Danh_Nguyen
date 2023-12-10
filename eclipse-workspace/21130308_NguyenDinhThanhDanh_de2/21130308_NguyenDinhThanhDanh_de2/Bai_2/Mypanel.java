package Bai_2;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Panel;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Mypanel extends Panel{
	CardLayout cardLayout;
	Panel cPanel;
	public Mypanel() {
		setLayout(new BorderLayout());
		cardLayout = new CardLayout();
		cPanel = new Panel();
		cPanel.setLayout(cardLayout);
		
		
		cPanel.add("Kq", new KetQua());
//		cPanel.add("defult", new Phieu());
		add(cPanel, BorderLayout.CENTER);
		
		
	}
	public void change(String name) {
		cardLayout.show(cPanel, name);
	}
//	class KetQua extends JPanel{
//		JLabel jlb;
//		public KetQua() {
//			setLayout(new BorderLayout());
//			jlb = new JLabel("KET QUA PHIEU BAU");
//			add(jlb, BorderLayout.NORTH);
//			
//		}
//	}
}
