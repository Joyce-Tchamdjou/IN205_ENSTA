package ensta;
import ensta.ships.*;

public class ShipState{
	/**Navire concerné par l'état*/
	private AbstractShip ship;
	/**etat du navire en ce point*/
	private boolean struck;

	/**
	 *Constructeur
	 *@param ship
	 */
	public ShipState(AbstractShip ship){
		this.ship = ship;
		struck = false;
	}

	/**
	 *Constructeur par défaut
	 */
	public ShipState(){
		this.ship = null;
		struck = false;
	}

	/**
	 *marque le navire comme touché à cet endroit
	 */
	public void addStrike(){
		if(struck == false){
			ship.addStrike();
			struck = true;
		}
	}

	/**
	 *getter struck
	 */
	public boolean isStruck(){
		return struck;
	}

	/** 
	 *@return les labels en fonctions de l'etat
	 */
	public String toString(){
		if(ship == null){
			return ColorUtil.colorize(".", ColorUtil.Color.WHITE);
		}else if(isStruck()){
			return ColorUtil.colorize(Character.toString(ship.getLabel()), ColorUtil.Color.RED);
		}else{
			return ColorUtil.colorize(Character.toString(ship.getLabel()), ColorUtil.Color.WHITE);
		}
		
	}

	/** 
	 *@return le navire concerné
	 */
	public AbstractShip getShip(){
		return ship;
	}
}