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
		lv.addObserver(this);					//Needed in order to be able to observe
	}
	
	public void update(Observable arg0, Object arg1){
		d.repaint();							//Repaint Display
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
		}
		private void paintRoom(Graphics g){
			for(int i=0; i<lv.roomInLevel.size(); i++ ){
				g.setColor(lv.roomInLevel.get(i).color);
				g.fillRect(lv.roomInLevel.get(i).x , lv.roomInLevel.get(i).y, lv.roomInLevel.get(i).dx, lv.roomInLevel.get(i).dy);
				g.setColor(Color.black);
				g.drawRect(lv.roomInLevel.get(i).x , lv.roomInLevel.get(i).y, lv.roomInLevel.get(i).dx, lv.roomInLevel.get(i).dy);
			}
		}
		public void paintComponent(Graphics g){
			
			super.paintComponent(g);
			paintRoom(g);
			paintCorridor(g);
			paintPlayer(g);
		}

	 	private class Listener implements KeyListener{

	 		public void keyPressed(KeyEvent arg0){
	 		}
	 		public void keyReleased(KeyEvent arg0){
	 		}
	 		public void keyTyped(KeyEvent event){
	 			
	 			switch(event.getKeyChar()){
	 			case 'd': 
	 				lv.goEast();
	 				break;
	 			case 'w':
	 				lv.goNorth();
	 				break;
	 			case 's':
	 				lv.goSouth();
	 				break;
				case 'a':
					lv.goWest();
					break;
				default:
					break;
				}
	 		}
	 	}
	}
}
