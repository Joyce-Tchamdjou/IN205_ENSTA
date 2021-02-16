package ensta;


public class Destroyer extends AbstractShip{
	/**Label du Destroyer*/
	static String l = "Des";
	/**Nom complet du Destroyer*/
	static String n = "Destroyer";

	/**
	 *Constructeur valué
	 *@param taille taille du navire
	 *@param pos orientation du navire
	 */
	public Destroyer(int taille, Orientation pos){
		super(l, n, taille, pos);
	}

	/**
	 *Constructeur valué
	 *@param taille taille du navire
	 */
	public Destroyer(int taille){
		super(l, n, taille, Orientation.EAST);
	}
}






