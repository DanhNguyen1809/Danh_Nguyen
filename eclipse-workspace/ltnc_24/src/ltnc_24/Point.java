package ltnc_24;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Point extends JPanel{
	JPanel topP, midP, botP;
	JLabel id, name,mH, point;
	JTextField mssv, ten, diem;
	JComboBox<String> cb;
	String stt, tenMH, d, t;
	
	public Point() {
		setLayout(new GridLayout(3,1));
		topPanel tP = new topPanel();
		add(tP);
		
		midPanel mP = new midPanel();
		add(mP);
		
		JTextArea botP = new JTextArea(10,5);
		botP.setBackground(Color.WHITE);
		stt = "So TT";
		tenMH = "Ten Mon Hoc";
		d = "Diem";
		t =stt+ "\t" + tenMH+"\t\t\t"+d;
		botP.setText(t);
		add(botP);
		JScrollPane jsP = new JScrollPane(botP, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, 
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		add(jsP);
		
	}
	class topPanel extends JPanel{
		public topPanel() {
			topP = new JPanel();
			topP.setLayout(new GridLayout(4,1));
			Border border = BorderFactory.createLineBorder(Color.BLUE);
			setBorder(BorderFactory.createTitledBorder(border, "Them Mon Hoc "));
			id = new JLabel("MSSV");
			name = new JLabel("Full Name");
			mH = new JLabel("Mon Hoc");
			point = new JLabel("Point");
			mssv = new JTextField(10);
			ten = new JTextField(10);
			diem = new JTextField(10);
			
			String[] subject = {"1111 LTNC", "2222 LTDT", "3333 LTCB", "9999 TKHDT"};
			cb = new JComboBox<String>(subject);
			
			topP.add(id);
			topP.add(mssv);
			topP.add(name);
			topP.add(ten);
			topP.add(mH);
			topP.add(cb);
			topP.add(point);
			topP.add(diem);
			add(topP);
			
		}
	}
	class midPanel extends JPanel{
		JButton addP, searchSV;
		public midPanel() {
			midP = new JPanel();
			midP.setLayout(new FlowLayout());
			Border border = BorderFactory.createLineBorder(Color.BLUE);
			setBorder(BorderFactory.createTitledBorder(border, "Thao Tac"));
			
			addP = new JButton("Add Point");
			searchSV = new JButton("Search Studen");
			midP.add(addP);
			midP.add(searchSV);
			add(midP);
		}
	}
	

	
}
