package ensta;
import ensta.ships.*;
import java.lang.Throwable;

public class TestBoard{
	public static void main(String[] args){
		Board test = new Board("Joyce");
		for(int i = 0; i < 10; i++){
			for(int j = 0; j < 10; j++){
				test.navires[i][j] = '.';
				test.frappes[i][j] = false;
			}
		}

		Carrier bat = new Carrier();
		System.out.println(bat.getLength() + ", " + bat.getLabel() + ", " + bat.getPos());
		try{
			test.putShip(bat, 1, 1);
		}catch(Exception e){
			System.out.println(e);
		}
		
		test.print();
	}

}