package Ex;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

public class Ex21 extends JFrame {
	static final int No_SHAPE =0;
//	static final int 
	private static final MouseListener MouseL = null;
	JPanel mainPanel, topPanel, leftPanel, midPanel;
	JButton red, blue;
	JRadioButton square, oval, fill, outLine;
	public Ex21() {
		mainPanel = new JPanel();
		topPanel = new JPanel();
		leftPanel = new JPanel();
		midPanel = new JPanel();
		
		mainPanel.setLayout(new BorderLayout());
		this.add(mainPanel);
		
		//giao dien ben trai
		leftPanel.setLayout(new FlowLayout());
		JButton bcliall = new JButton("Clean all");
		leftPanel.add(bcliall);
		leftPanel.setBackground(Color.PINK);
		
		mainPanel.add(leftPanel, BorderLayout.WEST);
		
		
		//su ly giao dien tren top
		
		topPanel.setLayout(new FlowLayout());
		red = new JButton("red");
		red.setBackground(Color.RED);
		blue = new JButton("Blue");
		blue.setBackground(Color.BLUE);
		square = new JRadioButton("square");
		oval = new JRadioButton("Oval");
		fill = new JRadioButton("Fill");
		outLine = new JRadioButton("Out Line");
		
		ButtonGroup bGr = new ButtonGroup();
		bGr.add(blue);
		bGr.add(red);
		ButtonGroup bGr3 = new ButtonGroup();
		bGr3.add(square);
		bGr3.add(oval);
		ButtonGroup bGr2= new ButtonGroup();
		bGr2.add(fill);
		bGr2.add(outLine);
		
		topPanel.setBackground(Color.PINK);
		topPanel.add(red);
		topPanel.add(blue);
		topPanel.add(square);
		topPanel.add(oval);
		topPanel.add(fill);
		topPanel.add(outLine);
		
		mainPanel.add(topPanel, BorderLayout.NORTH);
		
		midPanel.setBackground(Color.yellow);
		mainPanel.add(midPanel, BorderLayout.CENTER);

		this.setSize(800, 800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	
	
	}
	
	class myAction implements ActionListener{

		Graphics g = getGraphics();

		
		public void actionPerformed(ActionEvent e) {

			if(e.getSource() == red && e.getSource() == oval) {
				g.setColor(Color.RED);
				g.fillOval(getX(), getY(), 10, 10);
			}else if(e.getSource() == red && e.getSource() == outLine) {
				g.setColor(Color.RED);
				g.fillRect(getX(), getY(), 10, 10);
			}
			
		}
		
	}
	
	
	public static void main(String[] args) {
		new Ex21();
	}
}
