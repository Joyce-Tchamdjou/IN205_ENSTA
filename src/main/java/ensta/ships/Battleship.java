package ensta.ships;

public class Battleship extends AbstractShip{
	/**Label du Battleship*/
	static char l = 'B';
	/**Nom complet du Battleship*/
	static String n = "Battleship";
	/**Taille du Battleship*/
	static int t = 4;

	/**
	 *Constructeur valué
	 *@param pos orientation du navire
	 */
	public Battleship(Orientation pos){
		super(l, n, t, pos);
	}
	
	/**
	 *Constructeur par defaut
	 */
	public Battleship(){
		super(l, n, t, Orientation.EAST);
	}
}





