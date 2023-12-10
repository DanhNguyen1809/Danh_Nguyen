package Bai_2;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class PhieuBaiCu extends JFrame{
	JPanel panel;
	JLabel jlb;
	JButton jbt;
//	Mypanel panel1 = new Mypanel();
	CardLayout cardLayout;
	public PhieuBaiCu() {
//		panel1 = new Mypanel();
//		mainPanel = new JPanel();
//		mainPanel.setLayout(new BorderLayout());
//		panel1.setLayout(new BorderLayout());
//		add(panel1);
//		panel1.add(mainPanel, BorderLayout.CENTER);
//		
////		nonpanel np = new nonpanel();
////		mainPanel.add(np, BorderLayout.SOUTH);
////		panel = new Mypanel();
////		add(panel);
//		topPanel tp = new topPanel();
//		mainPanel.add(tp, BorderLayout.NORTH);
//		add(mainPanel);
//		centerP = new JPanel();
//		centerP.setLayout(new GridLayout(1,3));
//		centerPanel1 ct1 = new centerPanel1();
//		centerP.add(ct1);
//		mainPanel.add(centerP, BorderLayout.CENTER);
//		center2 ct2 = new center2();
//		centerP.add(ct2);
//		center3 ct3 = new center3();
//		centerP.add(ct3);
//
//		
//
//		nonpanel np = new nonpanel();
//		mainPanel.add(np, BorderLayout.SOUTH);
		setLayout(new BorderLayout());
		cardLayout = new CardLayout();
//		panel = new MainP();
		panel.setLayout(cardLayout);
		
		panel.add( new KetQua());
		
		
		add(panel);
		setSize(500, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public void change(String name) {
		cardLayout.show(panel, name);
	}
	
	class MainP extends JPanel{
		JPanel mainPanel, nonPanel, lpanel, rpanel,centerP;
		topPanel tp;
		public MainP() {
			mainPanel = new JPanel();
			setLayout(new BorderLayout());
			tp = new topPanel();
			mainPanel.add(tp, BorderLayout.NORTH);
			
			centerP = new JPanel();
			centerP.setLayout(new GridLayout(1,3));
			centerPanel1 ct1 = new centerPanel1();
			centerP.add(ct1);
			mainPanel.add(centerP, BorderLayout.CENTER);
			center2 ct2 = new center2();
			centerP.add(ct2);
			center3 ct3 = new center3();
			centerP.add(ct3);

			

			nonpanel np = new nonpanel();
			mainPanel.add(np, BorderLayout.SOUTH);
			add(mainPanel);
			
		}
	}
	
	class topPanel extends JPanel{
		JLabel jlb;
		public topPanel(){
		jlb = new JLabel("PHIEU BAU CU CAC CAP");
//		Border borer = BorderFactory.createLineBorder(Color.black);
		add(jlb);
		setBorder(BorderFactory.createLineBorder(Color.BLACK));
		}
	}
	class centerPanel1 extends JPanel{
		JCheckBox n1, n2, n3, n4;
		public centerPanel1() {
			setLayout(new GridLayout(5,1));
			n1 = new JCheckBox("Nguyen Tan Khoi");
			n2 = new JCheckBox("Nguyen Xi");
			n3 = new JCheckBox("Nguyen Xuan An");
			n4 = new JCheckBox("Ho Thanh HA");
			add(n1);
			add(n2);
			add(n3);
			add(n4);
			Border borer = BorderFactory.createLineBorder(Color.BLACK);
			setBorder(BorderFactory.createTitledBorder(borer,"CAP PHUONG (Chon3)"));	
		}	
	}
	class center2 extends JPanel{
		JCheckBox n1, n2, n3, n4, n5, n6;
		public center2() {
			setLayout(new GridLayout(7,1));
			n1 = new JCheckBox("Vu Thai Hoa");
			n2 = new JCheckBox("Do THi Thanh Huong");
			n3 = new JCheckBox("Lam Quoc Quan");
			n4 = new JCheckBox("HO Thi Lan");
			n5 = new JCheckBox("Nguyen Van Kien");
			n6 = new JCheckBox("Nguyen Tan Phat");
			add(n1);
			add(n2);
			add(n3);
			add(n4);
			add(n5);
			add(n6);
			Border b = BorderFactory.createLineBorder(Color.BLACK);
			setBorder(BorderFactory.createTitledBorder(b, "CAP QUAN (Chon 4)"));
		}
	}
	
	class center3 extends JPanel{
		JCheckBox n1, n2, n3, n4, n5, n6, n7;
		ArrayList<JCheckBox> arr1 = new ArrayList<>();
		JLabel jlb;
		int count = 0;
		
		public center3() {
			setLayout(new GridLayout(8,1));
			n1 = new JCheckBox("Le Vu Chuong");
			n2 = new JCheckBox("Nguyen Huu Thinh");
			n3 = new JCheckBox("Huynh Thanh An");
			n4 = new JCheckBox("Pham Van Canh");
			n5 = new JCheckBox("Ta Kim CHi");
			n6 = new JCheckBox("Dang Quoc Cuong");
			n7 = new JCheckBox("Tran Quoc Dao");
			add(n1);
			add(n2);
			add(n3);
			add(n4);
			add(n5);
			add(n6);
			add(n7);
			Border border = BorderFactory.createLineBorder(Color.BLACK);
			setBorder(BorderFactory.createTitledBorder(border, "CAP TINH (Chon 5)"));
			arr1.add(n1);
			arr1.add(n2);
			arr1.add(n3);
			arr1.add(n4);
			arr1.add(n5);
			arr1.add(n6);
			arr1.add(n7);
			for(int i =0; i<arr1.size(); i++) {
				arr1.get(i).addItemListener(new Item());
			}
		
			jlb = new JLabel("So Nguoi Da Chon: " + count);
			add(jlb);
		}
		class Item implements ItemListener{
			@Override
			public void itemStateChanged(ItemEvent e) {
				for(int i=0; i<arr1.size(); i++) {
					if(e.getStateChange() == ItemEvent.SELECTED) {
						if(arr1.get(i).isSelected()) {
							count = count +1;
							
						}	
					}
					jlb.setText("So Nguoi Da Chon: " + count);
				}
				
			}
			
		}
	}
	
	class nonpanel extends JPanel{
		JButton jbt;
		public nonpanel() {
			jbt = new JButton("BO PHIEU");
//			add(jbt);
			jbt.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					change("Kq");
					
				}
			});
			add(jbt);
			
		}
	}
	
	public static void main(String[] args) {
		new PhieuBaiCu();
	}
	
}
