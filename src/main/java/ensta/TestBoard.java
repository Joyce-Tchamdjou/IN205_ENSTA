package ensta;
import ensta.ships.*;
import java.lang.Throwable;
import java.util.List;
import java.util.ArrayList;

public class TestBoard{
	public static void main(String[] args){
		Board test1 = new Board("Joyce");
		Board test2 = new Board("Noyce");
		/*for(int i = 0; i < 10; i++){
			for(int j = 0; j < 10; j++){
				test1.navires[i][j] = new ShipState();
			}
		}*/

		List<AbstractShip> bat = new ArrayList<AbstractShip>();
		boolean bof;

		Carrier bat1 = new Carrier();
		System.out.println(bat1.getLength() + ", " + bat1.getLabel() + ", " + bat1.getPos());
		bof = bat.add(bat1);
		System.out.println(bof + "1");
		Battleship bat2 = new Battleship();
		System.out.println(bat2.getLength() + ", " + bat2.getLabel() + ", " + bat2.getPos());
		bof = bat.add(bat2);
		System.out.println(bof + "2");
		Destroyer bat3 = new Destroyer();
		System.out.println(bat3.getLength() + ", " + bat3.getLabel() + ", " + bat3.getPos());
		bof = bat.add(bat3);
		System.out.println(bof + "3");
		Submarine bat4 = new Submarine();
		System.out.println(bat4.getLength() + ", " + bat4.getLabel() + ", " + bat4.getPos());
		bof = bat.add(bat4);
		System.out.println(bof + "4");
		Submarine bat5 = new Submarine();
		System.out.println(bat5.getLength() + ", " + bat5.getLabel() + ", " + bat5.getPos());
		bof = bat.add(bat5);
		System.out.println(bof + "5");

		Player test = new Player(test1, test2, bat);
		test.putShips();
		/*try{
			test1.putShip(bat, 1, 1);
		}catch(Exception e){
			System.out.println(e);
		}*/
		//System.out.println(bat.getLength() + ", " + bat.getLabel() + ", " + bat.getPos());
		//test1.navires[1][1].addStrike();
		/*for(int j = 0; j < 5; j++){
			System.out.println(test1.navires[0][j].toString());
		}*/
		System.out.println("\n");
		test1.navires[0][0].addStrike();
		System.out.println(test1.navires[0][0].isStruck());
		test1.print();
	}

}