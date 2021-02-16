package ensta;

public class Battleship extends AbstractShip{
	/**Label du Battleship*/
	static String l = "Bat";
	/**Nom complet du Battleship*/
	static String n = "Battleship";

	/**
	 *Constructeur valué
	 *@param taille taille du navire
	 *@param pos orientation du navire
	 */
	public Battleship(int taille, Orientation pos){
		super(l, n, taille, pos);
	}
	
	/**
	 *Constructeur valué
	 *@param taille taille du navire
	 */
	public Battleship(int taille){
		super(l, n, taille, Orientation.EAST);
	}
}





