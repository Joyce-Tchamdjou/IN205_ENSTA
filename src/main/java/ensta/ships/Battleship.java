package ensta;

public class Battleship extends AbstractShip{
	static String l = "Bat";
	static String n = "Battleship";

	public Battleship(int taille, Orientation pos){
		super(l, n, taille, pos);
	}

	public Battleship(int taille){
		super(l, n, taille, Orientation.EAST);
	}
}