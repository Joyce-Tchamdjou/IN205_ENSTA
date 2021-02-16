package ensta;


public class Submarine extends AbstractShip{
	/**Label du Submarine*/
	static String l = "Sub";
	/**Nom complet du Submarine*/
	static String n = "Submarine";

	/**
	 *Constructeur valué
	 *@param taille taille du navire
	 *@param pos orientation du navire
	 */
	public Submarine(int taille, Orientation pos){
		super(l, n, taille, pos);
	}

	/**
	 *Constructeur valué
	 *@param taille taille du navire
	 */
	public Submarine(int taille){
		super(l, n, taille, Orientation.EAST);
	}
}

