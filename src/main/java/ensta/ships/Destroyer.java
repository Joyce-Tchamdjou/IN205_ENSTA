package ensta;


public class Destroyer extends AbstractShip{
	static String l = "Des";
	static String n = "Destroyer";

	public Destroyer(int taille, Orientation pos){
		super(l, n, taille, pos);
	}

	public Destroyer(int taille){
		super(l, n, taille, Orientation.EAST);
	}
}






