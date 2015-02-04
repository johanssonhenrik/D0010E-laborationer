package lab2;

import lab2.level.Level;
import lab2.level.LevelGUI;
import lab2.level.Room;

import java.awt.Color;
import java.util.ArrayList;

public class Driver{

	public void run(){

		//ArrayList<Room> roomsInArray = new ArrayList<Room>();
		//for(int i=0;i<10;i++){
		//	Room rooms = new Room(100,100,Color.blue);
		//}
		
		Room r1 = new Room(100, 100, Color.blue);	//North west
		Room r2 = new Room(100, 100, Color.red);	//North east
		Room r3 = new Room(100, 100, Color.yellow);	//South west
		Room r4 = new Room(100, 100, Color.cyan);	//South east
		
		r1.connectEastTo(r2);
		r1.connectSouthTo(r3);
		r2.connectWestTo(r1);
		r2.connectSouthTo(r4);
		r3.connectNorthTo(r1);
		r3.connectEastTo(r4);
		r4.connectWestTo(r3);
		r4.connectNorthTo(r2);
		
		Level lev1 = new Level();
		lev1.place(r1, 100, 100);
		lev1.place(r2, 250, 100);
		lev1.place(r3, 100, 250);
		lev1.place(r4, 250, 250);
		LevelGUI levGUI1 = new LevelGUI(lev1, "Level 1");
		
		lev1.firstLocation(r1);								//Initial placement of the player.
	}
}
