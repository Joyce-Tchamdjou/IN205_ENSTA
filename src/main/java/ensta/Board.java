package ensta;

class Board{
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
}

/*public class TestBoard{
	public static void main(String[] args){
		Board test = new Board("Joyce");
		for(int i = 0; i < 10; i++){
			for(int j = 0; j < 10; j++){
				test.navires[i][j] = '.';
				test.frappes[i][j] = false;
			}
		}
		test.print();
	}

}*/