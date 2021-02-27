package ensta;
import ensta.ships.*;
import java.lang.Throwable;
import java.lang.Boolean;

class Board implements IBoard{
	/** Nom du Board */
	private String nom;
	/** Tableau 2D des navires*/
	public ShipState[][] navires;
	/** Tableau 2D des frappes*/
	public Boolean[][] frappes;

	public Boolean t = new Boolean(true);
	public Boolean f = new Boolean(false);

	/**
	 *Constructeur valué 1
	 *@param name nom du board
	 *@param size taille du board
	 */
	public Board(String nom, int size){
		this.nom = nom;
		navires = new ShipState[size][size];
		frappes = new Boolean[size][size];
	}

	/**
	 *Constructeur valué 2
	 *@param name nom du board
	 */
	public Board(String nom){
		this.nom = nom;
		navires = new ShipState[10][10];
		frappes = new Boolean[10][10];
	}

	/**
	 *getters
	 */
	public String getNom(){
		return nom;
	}

	/**
	 *setters
	 */
	public void setNom(String nom){
		this.nom = nom;
	}

	/**
	 *Fonction qui affiche les tableaux
	 */
	public void print(){
		int size_navires = navires.length;
		int size_frappes = frappes.length;
		char[] lettres = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'}; 
		
		System.out.println("Navires :");
		System.out.print(" "+"\t");

		for(int i = 0; i < size_navires; i++){
			System.out.print(lettres[i] + "\t");
		}
		System.out.print("\n");

		for(int i = 1; i <= size_navires; i++){
			System.out.print(i + "\t");
			for(int j = 0; j < size_navires; j++){
				if(navires[i-1][j] == null){
					System.out.print("." + "\t");
				}else{
					System.out.print(navires[i-1][j].toString() + "\t");
				}
			}
			System.out.print("\n");
		}

		System.out.println();
		System.out.println("Frappes :");
		System.out.print(" "+"\t");

		for(int i = 0; i < size_frappes; i++){
			System.out.print(lettres[i] + "\t");
		}
		System.out.print("\n");

		for(int i = 1; i <= size_frappes; i++){
			System.out.print(i + "\t");
			for(int j = 0; j < size_frappes; j++){
				if(frappes[i-1][j] == null){
					System.out.print("." + "\t");
				}else if(frappes[i-1][j].compareTo(t) == 0){
					System.out.print(ColorUtil.colorize("X", ColorUtil.Color.RED) + "\t");
				}else{
					System.out.print(ColorUtil.colorize("X", ColorUtil.Color.WHITE) + "\t");
				}
			}
			System.out.print("\n");
		}
	}

	/**
     * Get the size of the grids contained in the Board
     * @return the size of the grids contained in the Board
     */
    public int getSize(){
    	return navires.length;
    }

    /**
     * Get if a ship is placed at the given position
     * @param x
     * @param y
     * @return true if a ship is located at the given position
     */
    public boolean hasShip(int x, int y){
    	if (navires[x][y] == null || navires[x][y].getShip() == null || navires[x][y].getShip().isSunk()){
    		return false;
    	}else{
    		return true;
    	}
    }

    /**
     * Put the given ship at the given position
     * @param ship The ship to place on the board
     * @param x
     * @param y
     */
    public void putShip(AbstractShip ship, int x, int y) throws Exception{
    	int size_s = ship.getLength();
    	char label_s = ship.getLabel();
    	Orientation pos_s = ship.getPos();
    	int size_grid = getSize();
    	boolean possible = true;
    	int i;

    	if(x <= 0 || x > size_grid){
    		throw new Exception("Valeur hors champ");
    	}
    	if(y <= 0 || y > size_grid){
    		throw new Exception("Valeur hors champ");
    	}

    	if(hasShip(x-1, y-1)){
    		throw new Exception("Bateau présent à cette position !");
    	}

    	switch(pos_s) {
    		case WEST:
    			if(y-size_s < 0){
    				throw new Exception("Sortie de grille");
    			}else{
    				i = y-1; 
    				while(i > y-size_s-1 && possible){
    					if(hasShip(x-1, i)){
    						possible = false;
    					}
    					i--;
    				}
    				if(possible){
    					for(int j = y-1; j > y-size_s-1; j--){
    						navires[x-1][j] = new ShipState(ship);
    					}	
    				}else{
    					throw new Exception("Bateau présent à cette position !");
    				}
    			}
    			break;

    		case EAST:
    			if(y+size_s > size_grid){
    				throw new Exception("Sortie de grille");
    			}else{
    				i = y-1; 
    				while(i < y+size_s-1 && possible){
    					if(hasShip(x-1, i)){
    						possible = false;
    					}
    					i++;
    				}
    				if(possible){
    					for(int j = y-1; j < y+size_s-1; j++){
    						navires[x-1][j] = new ShipState(ship);
    					}	
    				}else{
    					throw new Exception("Bateau présent à cette position !");
    				}
    			}
    			break;

    		case SOUTH:
    			if(x+size_s > size_grid){
    				throw new Exception("Sortie de grille");
    			}else{
    				i = x-1; 
    				while(i < x+size_s-1 && possible){
    					if(hasShip(i, y-1)){
    						possible = false;
    					}
    					i++;
    				}
    				if(possible){
    					for(int j = x-1; j < x+size_s-1; j++){
    						navires[x-1][j] = new ShipState(ship);
    					}	
    				}else{
    					throw new Exception("Bateau présent à cette position !");
    				}
    			}
    			break;

    		case NORTH:
    			if(x-size_s < 0){
    				throw new Exception("Sortie de grille");
    			}else{
    				i = x-1; 
    				while(i > x-size_s-1 && possible){
    					if(hasShip(i, y-1)){
    						possible = false;
    					}
    					i--;
    				}
    				if(possible){
    					for(int j = x-1; j > x-size_s-1; j--){
    						navires[x-1][j] = new ShipState(ship);
    					}	
    				}else{
    					throw new Exception("Bateau présent à cette position !");
    				}
    			}
    			break;
    	}

    }

    /**
     * Set the state of the hit at a given position
     * @param hit true if the hit must be set to successful
     * @param x
     * @param y
     */
    public void setHit(boolean hit, int x, int y){
    	frappes[x-1][y-1] = new Boolean(hit);
    }

    /**
	 * Sends a hit at the given position
	 * @param x
	 * @param y
	 * @return status for the hit (eg : strike or miss)
	 */
	public Hit sendHit(int x, int y){
		if(navires[x-1][y-1] == null){
			return Hit.MISS;
		}else if(navires[x-1][y-1].getShip().isSunk()){
			return Hit.fromInt(navires[x-1][y-1].getShip().getLength());
		}else if(navires[x-1][y-1].getShip().strikeCount == navires[x-1][y-1].getShip().getLength()-1){
			navires[x-1][y-1].addStrike();
			return Hit.fromInt(navires[x-1][y-1].getShip().getLength());
		}else{
			navires[x-1][y-1].addStrike();
			return Hit.STRIKE;
		}
	}

    /**
     * Get the state of a hit at the given position considering the 0-25 count
     * @param x
     * @param y
     * @return true if the hit is successful
     */
    public Boolean getHit(int x, int y){
    	return frappes[x][y];
    }

}