package ensta;


public enum Orientation{
	NORTH, SOUTH, EAST, WEST
}


public abstract class AbstractShip{
	/**label du type de navire*/
	private String label;
	/**nom du type de navire*/
	private String name_ship;
	/**taille du navire*/
	private int taille;
	/**orientation du navire*/
	private Orientation pos;
	
	/**
	 *Constructeur valué
	 *@param label label du type de navire
	 *@param name_ship nom du type de navire
	 *@param taille taille du navire
	 *@param pos orientation du navire
	 */
	public AbstractShip(String label, String name_ship, int taille, Orientation pos){
		label = label;
		name_ship = name_ship;
		taille = taille;
		pos = pos;
	}

	/**
	 *getter name_ship
	 */
	public String getName_ship(){
		return name_ship;
	}

	/**
	 *setter name_ship
	 *@param name_ship
	 */
	public void setName_ship(String name_ship){
		name_ship = name_ship;
	}

	/**
	 *getter label
	 */
	public String getLabel(){
		return label;
	}

	/**
	 *setter label
	 *@param label
	 */
	public void setLabel(String label){
		label = label;
	}

	/**
	 *getter taille
	 */
	public int getTaille(){
		return taille;
	}

	/**
	 *setter taille
	 *@param taille
	 */
	public void setTaille(String taille){
		taille = taille;
	}

	/**
	 *getter pos
	 */
	public Orientation getPos(){
		return orientation;
	}

	/**
	 *setter pos
	 *@param pos
	 */
	public void setPos(Orientation pos){
		pos = pos;
	}
}