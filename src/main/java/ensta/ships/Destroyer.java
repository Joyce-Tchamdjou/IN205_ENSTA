package ensta.ships;


public class Destroyer extends AbstractShip{
	/**Label du Destroyer*/
	static char l = 'D';
	/**Nom complet du Destroyer*/
	static String n = "Destroyer";
	/**Taille du Destroyer*/
	static int t = 2;

	/**
	 *Constructeur valué
	 *@param pos orientation du navire
	 */
	public Destroyer(Orientation pos){
		super(l, n, t, pos);
	}

	/**
	 *Constructeur par défaut
	 */
	public Destroyer(){
		super(l, n, t, Orientation.EAST);
	}
}






