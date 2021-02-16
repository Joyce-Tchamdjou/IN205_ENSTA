package ensta;

public class Carrier extends AbstractShip{
	/**Label du Carrier*/
	static String l = "Car";
	/**Nom complet du Carrier*/
	static String n = "Carrier";

	/**
	 *Constructeur valué
	 *@param taille taille du navire
	 *@param pos orientation du navire
	 */
	public Carrier(int taille, Orientation pos){
		super(l, n, taille, pos);
	}

	/**
	 *Constructeur valué
	 *@param taille taille du navire
	 */
	public Carrier(int taille){
		super(l, n, taille, Orientation.EAST);
	}
}


