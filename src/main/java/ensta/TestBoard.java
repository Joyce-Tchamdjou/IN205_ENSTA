package ensta;

public class TestBoard{
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

}