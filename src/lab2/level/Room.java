package lab2.level;
import java.awt.Color;

public class Room{
	
	int x=0, y=0, dx=0, dy=0;
	Color color = null;
	Room north = null, east = null, south = null, west = null;
	
	public Room(int dx, int dy, Color color){
		this.dx = dx;
		this.dy = dy;
		this.color = color;
	}

	public void connectNorthTo(Room r){
		north = r;
	}
	public void connectEastTo(Room r){
		east = r;
	}
	public void connectSouthTo(Room r){
		south = r;
	}
	public void connectWestTo(Room r){
		west = r;
	}
}