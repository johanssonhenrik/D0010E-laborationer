package lab2.level;
import java.awt.Color;

public class Room{
	
	int x=0, y=0, dx=0, dy=0;	//x & y är startposition för det översta vänstra hörn. dx & dy är bredd och höjd i pixlar.
	Color color = null;
	Room north = null, east = null, south = null, west = null;
	
	public Room(int dx, int dy, Color color){
		this.dx = dx;
		this.dy = dy;
		this.color = color;
	}

	public void connectNorthTo(Room r){	// Aktuella objektet får en öppning norrut mot rummet r.
		north = r;
	}
	public void connectEastTo(Room r){ // Aktuella objektet får en öppning österut mot rummet r.
		east = r;
	}
	public void connectSouthTo(Room r){	// Aktuella objektet får en öppning söderut mot rummet r.
		south = r;
	}
	public void connectWestTo(Room r){	// Aktuella objektet får en öppning västerut mot rummet r.
		west = r;
	}
}