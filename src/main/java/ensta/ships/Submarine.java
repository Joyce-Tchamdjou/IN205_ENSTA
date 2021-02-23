package ensta.ships;


public class Submarine extends AbstractShip{
	/**Label du Submarine*/
	static char l = 'S';
	/**Nom complet du Submarine*/
	static String n = "Submarine";
	/**Taille du Submarine*/
	static int t = 3;

	/**
	 *Constructeur valué
	 *@param pos orientation du navire
	 */
	public Submarine(Orientation pos){
		super(l, n, t, pos);
	}

	/**
	 *Constructeur par défaut
	 */
	public Submarine(){
		super(l, n, t, Orientation.EAST);
	}
}

