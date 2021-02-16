package ensta;

public class Carrier extends AbstractShip{
	static String l = "Car";
	static String n = "Carrier";

	public Carrier(int taille, Orientation pos){
		super(l, n, taille, pos);
	}

	public Carrier(int taille){
		super(l, n, taille, Orientation.EAST);
	}
}
