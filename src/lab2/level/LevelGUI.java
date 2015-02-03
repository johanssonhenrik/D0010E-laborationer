package lab2.level;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Observable;
import java.util.Observer;

import java.util.Vector;
import lab2.level.Level;
import lab2.level.LevelGUI;
import lab2.level.Room;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class LevelGUI implements Observer{
	private Level lv;
	private Display d;
	
	public LevelGUI(Level level, String name){
		
		this.lv = level;
		
		JFrame frame = new JFrame(name);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		d = new Display(lv,450,450);
		
		frame.getContentPane().add(d);
		frame.pack();
		frame.setLocation(10,200);
		frame.setVisible(true);
	}
	
	public void update(Observable arg0, Object arg1){
		
	}
	
	private class Display extends JPanel{
		
		public Display(Level fp, int x, int y){
		
			addKeyListener(new Listener());
			
			setBackground(Color.gray);
			setPreferredSize(new Dimension(x+20,y+20));
			setFocusable(true);
		}
		private void paintCorridor(Graphics g){
			for(int i=0; i<lv.roomInLevel.size(); i++){
				if(lv.roomInLevel.get(i).north != null){
					//g.drawLine((lv.roomInLevel.get(i).x)+50, (lv.roomInLevel.get(i).y), (lv.roomInLevel.get(i).north.x)+50, (lv.roomInLevel.get(i).north.y)+100);
					g.setColor(lv.roomInLevel.get(i).north.color);
					g.fillRect((lv.roomInLevel.get(i).x)+25, (lv.roomInLevel.get(i).y)-15,50,15);
					g.setColor(Color.black);
					g.drawRect((lv.roomInLevel.get(i).x)+25, (lv.roomInLevel.get(i).y)-15,50,15);
				}
				if(lv.roomInLevel.get(i).east != null){
					//g.drawLine((lv.roomInLevel.get(i).x)+100, (lv.roomInLevel.get(i).y)+50, (lv.roomInLevel.get(i).east.x), (lv.roomInLevel.get(i).east.y)+50);
					g.setColor(lv.roomInLevel.get(i).east.color);
					g.fillRect((lv.roomInLevel.get(i).x)+100, (lv.roomInLevel.get(i).y)+25,15,50);
					g.setColor(Color.black);
					g.drawRect((lv.roomInLevel.get(i).x)+100, (lv.roomInLevel.get(i).y)+25,15,50);
				}
				if(lv.roomInLevel.get(i).south != null){
					//g.drawLine((lv.roomInLevel.get(i).x)+50, (lv.roomInLevel.get(i).y)+100, (lv.roomInLevel.get(i).south.x)+50, (lv.roomInLevel.get(i).south.y));
					g.setColor(lv.roomInLevel.get(i).south.color);
					g.fillRect((lv.roomInLevel.get(i).x)+25, (lv.roomInLevel.get(i).y)+100,50,15);
					g.setColor(Color.black);
					g.drawRect((lv.roomInLevel.get(i).x)+25, (lv.roomInLevel.get(i).y)+100,50,15);
				}
				if(lv.roomInLevel.get(i).west != null){
					//g.drawLine((lv.roomInLevel.get(i).x), (lv.roomInLevel.get(i).y)+50, (lv.roomInLevel.get(i).west.x)+100, (lv.roomInLevel.get(i).west.y)+50);
					g.setColor(lv.roomInLevel.get(i).west.color);
					g.fillRect((lv.roomInLevel.get(i).x)-15, (lv.roomInLevel.get(i).y)+25,15,50);
					g.setColor(Color.black);
					g.drawRect((lv.roomInLevel.get(i).x)-15, (lv.roomInLevel.get(i).y)+25,15,50);
				}
			}
		}
		private void paintPlayer(Graphics g){
			g.setColor(Color.black);
			g.fillOval(lv.playerLocation.x+30, lv.playerLocation.y+30, 40, 40);
//			g.setColor(Color.yellow);
//			g.fillOval(lv.firstLocation.x+32, lv.firstLocation.y+32, 36, 36);
//			g.setColor(Color.blue);
//			g.fillOval(lv.firstLocation.x+34, lv.firstLocation.y+34, 32, 32);
//			g.setColor(Color.red);
//			g.fillOval(lv.firstLocation.x+36, lv.firstLocation.y+36, 28, 28);
//			g.setColor(Color.orange);
//			g.fillOval(lv.firstLocation.x+38, lv.firstLocation.y+38, 24, 24);
//			g.setColor(Color.pink);
//			g.fillOval(lv.firstLocation.x+40, lv.firstLocation.y+40, 20, 20);
//			g.setColor(Color.magenta);
//			g.fillOval(lv.firstLocation.x+42, lv.firstLocation.y+42, 16, 16);
//			g.setColor(Color.cyan);
//			g.fillOval(lv.firstLocation.x+44, lv.firstLocation.y+44, 12, 12);
		}
		public void paintComponent(Graphics g){
			
			super.paintComponent(g);
			
			for(int i=0; i<lv.roomInLevel.size(); i++ ){
				g.setColor(lv.roomInLevel.get(i).color);
				g.fillRect(lv.roomInLevel.get(i).x , lv.roomInLevel.get(i).y, lv.roomInLevel.get(i).dx, lv.roomInLevel.get(i).dy);
				g.setColor(Color.black);
				g.drawRect(lv.roomInLevel.get(i).x , lv.roomInLevel.get(i).y, lv.roomInLevel.get(i).dx, lv.roomInLevel.get(i).dy);
			}
			paintCorridor(g);
			paintPlayer(g);
		}

	 	private class Listener implements KeyListener{

	 		public void keyPressed(KeyEvent arg0){
	 			if (arg0.getKeyCode() == KeyEvent.VK_RIGHT) {
	 	            System.out.println("Right key pressed");
	 	        }
	 	        if (arg0.getKeyCode() == KeyEvent.VK_LEFT) {
	 	            System.out.println("Left key pressed");
	 	        }
	 	        if (arg0.getKeyCode() == KeyEvent.VK_UP) {
	 	            System.out.println("Up key pressed");
	 	        }
	 	       	if (arg0.getKeyCode() == KeyEvent.VK_DOWN) {
	 	            System.out.println("Down key pressed");
	 	        }	
	 		}
	 		public void keyReleased(KeyEvent arg0){
	 			if (arg0.getKeyCode() == KeyEvent.VK_RIGHT) {
	 	            System.out.println("Right key pressed");
	 	        }
	 	        if (arg0.getKeyCode() == KeyEvent.VK_LEFT) {
	 	            System.out.println("Left key pressed");
	 	        }
	 	        if (arg0.getKeyCode() == KeyEvent.VK_UP) {
	 	            System.out.println("Up key pressed");
	 	        }
	 	       	if (arg0.getKeyCode() == KeyEvent.VK_DOWN) {
	 	            System.out.println("Down key pressed");
	 	        }
	 		}
	 		public void keyTyped(KeyEvent event){
	 			if (event.getKeyCode() == KeyEvent.VK_RIGHT) {
	 	            System.out.println("Right key pressed");
	 	        }
	 	        if (event.getKeyCode() == KeyEvent.VK_LEFT) {
	 	            System.out.println("Left key pressed");
	 	        }
	 	        if (event.getKeyCode() == KeyEvent.VK_UP) {
	 	            System.out.println("Up key pressed");
	 	        }
	 	       	if (event.getKeyCode() == KeyEvent.VK_DOWN) {
	 	            System.out.println("Down key pressed");
	 	        }
	 		}
	 	}
	}
}