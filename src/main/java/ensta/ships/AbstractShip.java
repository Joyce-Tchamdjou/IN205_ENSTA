package ensta.ships;


public abstract class AbstractShip{
	/**label du type de navire*/
	private char label;
	/**nom du type de navire*/
	private String name;
	/**taille du navire*/
	private int length;
	/**orientation du navire*/
	private Orientation pos;
	
	/**
	 *Constructeur valué
	 *@param label label du type de navire
	 *@param name nom du type de navire
	 *@param taille taille du navire
	 *@param pos orientation du navire
	 */
	public AbstractShip(char label, String name, int length, Orientation pos){
		this.label = label;
		this.name = name;
		this.length = length;
		this.pos = pos;
	}

	/**
	 *getter name
	 */
	public String getName(){
		return name;
	}

	/**
	 *setter name
	 *@param name_ship
	 */
	public void setName(String name){
		this.name = name;
	}

	/**
	 *getter label
	 */
	public char getLabel(){
		return label;
	}

	/**
	 *setter label
	 *@param label
	 */
	public void setLabel(char label){
		this.label = label;
	}

	/**
	 *getter length
	 */
	public int getLength(){
		return length;
	}

	/**
	 *setter length
	 *@param length
	 */
	public void setLength(int length){
		this.length = length;
	}

	/**
	 *getter pos
	 */
	public Orientation getPos(){
		return pos;
	}

	/**
	 *setter pos
	 *@param pos
	 */
	public void setPos(Orientation pos){
		this.pos = pos;
	}
}