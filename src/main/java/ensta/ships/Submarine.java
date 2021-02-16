package ensta;


public class Submarine extends AbstractShip{
	static String l = "Sub";
	static String n = "Submarine";

	public Submarine(int taille, Orientation pos){
		super(l, n, taille, pos);
	}

	public Submarine(int taille){
		super(l, n, taille, Orientation.EAST);
	}
}