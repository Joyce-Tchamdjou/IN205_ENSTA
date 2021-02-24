package ensta.ships;

public class Carrier extends AbstractShip{
	/**Label du Carrier*/
	static char l = 'C';
	/**Nom complet du Carrier*/
	static String n = "Carrier";
	/**Taille du Carrier*/
	static int t = 5;

	/**
	 *Constructeur valué
	 *@param pos orientation du navire
	 */
	public Carrier(Orientation pos){
		super(l, n, t, pos);
	}

	/**
	 *Constructeur par défaut
	 */
	public Carrier(){
		super(l, n, t, Orientation.EAST);
	}
}


