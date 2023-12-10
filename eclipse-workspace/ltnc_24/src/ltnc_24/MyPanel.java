package ltnc_24;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Panel;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyPanel extends JPanel{
	JPanel cardPanel, defaultPanel;
	CardLayout cardLayout;

	public MyPanel() {
		setLayout(new BorderLayout());
		cardPanel = new JPanel();
		cardLayout = new CardLayout();
		cardPanel.setLayout(cardLayout);
		
		cardPanel.add("default", new DefaultPanel());
		cardPanel.add("point", new Point());
		
		add(cardPanel, BorderLayout.CENTER);
		
	
	}
	public void change(String tenTrang) {
		cardLayout.show(cardPanel, tenTrang);
	}
	
	class DefaultPanel extends Panel {
		JLabel jlb;
		public DefaultPanel() {
			
			setLayout(new BorderLayout());
			jlb = new JLabel("QUAN LY SINH VIEN K.CNTT", JLabel.CENTER);
			add(jlb, BorderLayout.CENTER);
	
		}
		
	}

}
