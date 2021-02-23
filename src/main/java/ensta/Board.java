package ensta;
import ensta.ships.*;

class Board implements IBoard{
	/** Nom du Board */
	private String nom;
	/** Tableau 2D des navires*/
	public char[][] navires;
	/** Tableau 2D des frappes*/
	public boolean[][] frappes;

	/**
	 *Constructeur valué 1
	 *@param name nom du board
	 *@param size taille du board
	 */
	public Board(String name, int size){
		nom = name;
		navires = new char[size][size];
		frappes = new boolean[size][size];
	}

	/**
	 *Constructeur valué 2
	 *@param name nom du board
	 */
	public Board(String name){
		nom = name;
		navires = new char[10][10];
		frappes = new boolean[10][10];
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
	public void setNom(String name){
		nom = name;
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
				System.out.print(navires[i-1][j] + "\t");
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
				if(frappes[i-1][j] == true){
					System.out.print("x" + "\t");
				}else{
					System.out.print("." + "\t");
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
    	if (navires[x][y] == '.'){
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
    	int size_s = ship.getTaille();
    	char label_s = ship.getLabel();
    	Orientation pos_s = ship.getPos();
    	int size_grid = getSize();

    	if(x <= 0 || x > size_grid){
    		throw new Exception("Valeur hors champ");
    	}
    	if(y <= 0 || y > size_grid){
    		throw new Exception("Valeur hors champ");
    	}

    	if(hasShip(x, y)){
    		throw new Exception("Bateau présent à cette position !");
    	}

    	switch(pos_s) {
    		case NORTH:
    			if(y-size_s < 0){
    				throw new Exception("Sortie de grille");
    			}else{
    				for(int i = y; i > y-size_s; i--){
    					if(!hasShip(x, i)){
    						navires[x][i] = label_s;
    					}else{
    						throw new Exception("Bateau présent à cette position !");
    					}
    					
    				}
    			}
    			break;
    		case SOUTH:
    			if(y+size_s >= size_grid){
    				throw new Exception("Sortie de grille");
    			}else{
    				for(int i = y; i < y+size_s; i++){
    					if(!hasShip(x, i)){
    						navires[x][i] = label_s;
    					}else{
    						throw new Exception("Bateau présent à cette position !");
    					}
    				}
    			}
    			break;
    		case EAST:
    			if(x+size_s >= size_grid){
    				throw new Exception("Sortie de grille");
    			}else{
    				for(int i = x; i < x+size_s; i++){
    					if(!hasShip(i, y)){
    						navires[i][y] = label_s;
    					}else{
    						throw new Exception("Bateau présent à cette position !");
    					}
    				}
    			}
    			break;
    		case WEST:
    			if(x-size_s < 0){
    				throw new Exception("Sortie de grille");
    			}else{
    				for(int i = x; i > x-size_s; i--){
    					if(!hasShip(i, y)){
    						navires[i][y] = label_s;
    					}else{
    						throw new Exception("Bateau présent à cette position !");
    					}
    				}
    			}
    			break;
    	}

    }



}

