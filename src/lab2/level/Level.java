package lab2.level;
import java.util.ArrayList;
import java.util.Observable;

public class Level extends Observable{
	Room playerLocation;						// Dynamisk variabel av typen Room. Används för att se vilket rum spelaren är i.					
	ArrayList<Room> roomInLevel = new ArrayList<Room>();	//Lista med alla rum
	
	public boolean place(Room r, int x, int y){
		for (int i = 0; i < roomInLevel.size(); i++){
			int xStart = roomInLevel.get(i).x;
			int xEnd = xStart + roomInLevel.get(i).dx;
			int yStart = roomInLevel.get(i).y;
			int yEnd = yStart + roomInLevel.get(i).dy;
			
			if(!((((x+r.dx)<=xStart) || (x>=xEnd)) || (((y+r.dy)<=yStart)) || (y>=yEnd))){
				return false;
			}
		}
		r.x = x;
		r.y = y;
		roomInLevel.add(r);
		return true;
	}
	public void firstLocation(Room r){		//Run only once on driver setup.
			this.playerLocation = r;
	}
	void goNorth(){
		if(playerLocation.north != null){
			playerLocation = playerLocation.north;		//playerLocation in level		//playerLocation.north = det andra objektet som ligger ovanför
			setChanged();
			notifyObservers();
		}
	}
	void goEast(){
		if(playerLocation.east != null){
			playerLocation = playerLocation.east;
			setChanged();
			notifyObservers();
		}
	}
	void goSouth(){
		if(playerLocation.south != null){
			playerLocation = playerLocation.south;
			setChanged();
			notifyObservers();
		}
	}
	void goWest(){
		if(playerLocation.west != null){
			playerLocation = playerLocation.west;
			setChanged();
			notifyObservers();
		}
	}
}
