package lab2;
import lab2.level.Level;
import lab2.level.LevelGUI;
import lab2.level.Room;
import java.awt.Color;
import java.util.ArrayList;

public class Driver{

	Color färg = null;
	public void run(){

//		ArrayList<Room> roomsInArray = new ArrayList<Room>();
//		Room[] r = new Room[72];
//		int randomNumber = (int) (10.0 * Math.random());
//		
//		Color färg = null;
//		
//		for(int i=0;i<72;i++){
//			r[i] = new Room(100,100,Color.blue);
//			roomsInArray.add(r[i]);
//		}
//		for(int i=0;i<roomsInArray.size();i++){
//			if((int) (10.0 * Math.random())<5){
//				roomsInArray.get(i).connectEastTo(roomsInArray.get((int) (10.0 * Math.random())));
//			}
//			if((int) (10.0 * Math.random())<5){
//				roomsInArray.get(i).connectNorthTo(roomsInArray.get((int) (10.0 * Math.random())));
//			}
//			if((int) (10.0 * Math.random())>5){
//				roomsInArray.get(i).connectWestTo(roomsInArray.get((int) (10.0 * Math.random())));
//			}
//			if((int) (10.0 * Math.random())>5){
//				roomsInArray.get(i).connectSouthTo(roomsInArray.get((int) (10.0 * Math.random())));
//			}
//		}
//		Level lev1 = new Level();
//		int roomPositionX = 50;
//		int roomPositionY = 50;
//		for(int i=0;i<roomsInArray.size();i++){
//			System.out.println(roomPositionX);
//			System.out.println(roomPositionY);
//			lev1.place(roomsInArray.get(i), roomPositionX, roomPositionY);
//			roomPositionX += 150;
//			if(roomPositionX>1700){
//				roomPositionY += 150;
//				roomPositionX = 50;
//			}
//		}
//		LevelGUI levGUI1 = new LevelGUI(lev1,"Level 1");
//		lev1.firstLocation(roomsInArray.get(randomNumber));
		
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
		r4.connectEastTo(r1);
		r3.connectSouthTo(r2);
		r2.connectNorthTo(r3);
		
		Level lev1 = new Level();
		lev1.place(r1, 100, 100);
		lev1.place(r2, 250, 100);
		lev1.place(r3, 100, 250);
		lev1.place(r4, 250, 250);
		LevelGUI levGUI1 = new LevelGUI(lev1, "Level 1");
		
		lev1.firstLocation(r1);								//Initial placement of the player.
	}
	
//	public void färg(){
//		if((int) (10.0 * Math.random())<2){
//			färg = Color.red;
//		}
//		if((int) (10.0 * Math.random())<5 && (int) (10.0 * Math.random())>2){
//			färg = Color.blue;
//		}
//		if((int) (10.0 * Math.random())<7 && (int) (10.0 * Math.random())>5){
//			färg = Color.cyan;
//		}
//		if((int) (10.0 * Math.random())<10 && (int) (10.0 * Math.random())>7){
//			färg = Color.yellow;
//		}
//	}
}
