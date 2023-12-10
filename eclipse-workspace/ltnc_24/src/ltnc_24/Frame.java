package ltnc_24;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class Frame extends JFrame{
	MyPanel panel;
	JMenu qlsv, file;
	JMenuBar menuBar; 
	JMenuItem exit, point, qlmh;
	JLabel jlb;
	
	public Frame() {
		panel = new MyPanel();
		add(panel);
		setJMenuBar(new menuBar());
		setSize(500, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(Frame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	class menuBar extends JMenuBar{
		public menuBar() {
			file = new JMenu("File");
			file.setMnemonic(KeyEvent.VK_F);
			add(file);
			
			exit = new JMenuItem("Exit");
			exit.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
					System.exit(0);
				}
			});
			file.add(exit);
			
			qlsv = new JMenu("Quan Ly Sinh Vien");
			qlsv.setMnemonic(KeyEvent.VK_S);
			add(qlsv);
		
		
			point = new JMenuItem("Quan ly Diem");
			point.setMnemonic(KeyEvent.VK_D);
			point.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					panel.change("default");
					
				}
			});
			qlsv.add(point);
			
			
			qlmh = new JMenuItem("Quan ly Mon Hoc");
			qlmh.setMnemonic(KeyEvent.VK_M);
			qlmh.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, InputEvent.CTRL_DOWN_MASK));
			qlsv.add(qlmh);
			qlmh.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					panel.change("point");
				}
			});
			
		}
	}

	
	
	
	public static void main(String[] args) {
		new Frame();
	}
}
