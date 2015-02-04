package lab2.level;
import java.awt.Color;

public class Room{
	
	int x=0, y=0, dx=0, dy=0;	//x & y �r startposition f�r det �versta v�nstra h�rn. dx & dy �r bredd och h�jd i pixlar.
	Color color = null;
	Room north = null, east = null, south = null, west = null;
	
	public Room(int dx, int dy, Color color){
		this.dx = dx;
		this.dy = dy;
		this.color = color;
	}

	public void connectNorthTo(Room r){	// Aktuella objektet f�r en �ppning norrut mot rummet r.
		north = r;
	}
	public void connectEastTo(Room r){ // Aktuella objektet f�r en �ppning �sterut mot rummet r.
		east = r;
	}
	public void connectSouthTo(Room r){	// Aktuella objektet f�r en �ppning s�derut mot rummet r.
		south = r;
	}
	public void connectWestTo(Room r){	// Aktuella objektet f�r en �ppning v�sterut mot rummet r.
		west = r;
	}
}