package Bai_2;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class KetQua extends JPanel{
	JLabel jlb;
	public KetQua() {
		setLayout(new BorderLayout());
		jlb = new JLabel("KET QUA PHIEU BAU");
		add(jlb, BorderLayout.NORTH);
		
	}
}
