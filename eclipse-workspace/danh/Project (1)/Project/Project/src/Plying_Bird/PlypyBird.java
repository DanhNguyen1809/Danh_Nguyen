package Plying_Bird;

import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import Suon.AFrameOnImage;
import Suon.Animation;
import Suon.GameScreen;

public class PlypyBird extends GameScreen {
	
	private BufferedImage birds;
	private Animation birds_anima;
	
	public static float g = 0.1f;
	private bird b;

	public PlypyBird() {
		super(800, 600);
		
		try {
			birds = ImageIO.read(new File("Accset/555t.png"));
		} catch (IOException e) {
			
		}
		
		birds_anima = new Animation(70);
		AFrameOnImage f;
		f = new AFrameOnImage(0, 0, 60,60);
		birds_anima.AddFrame(f);
		f = new AFrameOnImage(100, 0, 60,60);
		birds_anima.AddFrame(f);
		f = new AFrameOnImage(200, 0, 60,60);
		birds_anima.AddFrame(f);
		f = new AFrameOnImage(0, 0, 60,60);
		birds_anima.AddFrame(f);
		
		b = new bird(350, 250, 50, 50);
		
		BeginGame();
	}
	
	public static void main(String[] args) {
		new PlypyBird();
	}
	public void GAME_UPDATE(long deltaTime) {
		birds_anima.Update_Me(deltaTime);
		b.update(deltaTime);
		
	}

	@Override
	public void GAME_PAINT(Graphics2D g2) {
		if(b.getIsFly()) 
			birds_anima.PaintAnims((int) b.getPosX(), (int) b.getPosY(), birds, g2, 0, -1);
		else
			birds_anima.PaintAnims((int) b.getPosX(), (int) b.getPosY(), birds, g2, 0, 0);
	}

	@Override
	public void KEY_ACTION(KeyEvent e, int Event) {
		if(Event == KEY_PRESSED) {
			b.fly();
		}
		
	}

}
