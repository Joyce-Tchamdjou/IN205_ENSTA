package ensta;
import ensta.ships.*;
import java.util.*;

public class TestGame{
	private static void sleep(int ms) {
		try {
			Thread.sleep(ms);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Board board = new Board("Joyce");

		BattleShipsAI ai = new BattleShipsAI(board, board);
		List<AbstractShip> bat = new ArrayList<AbstractShip>();
		boolean bof;

		Carrier bat1 = new Carrier();
		bof = bat.add(bat1);
		Battleship bat2 = new Battleship();
		bof = bat.add(bat2);
		Destroyer bat3 = new Destroyer();
		bof = bat.add(bat3);
		Submarine bat4 = new Submarine();
		bof = bat.add(bat4);
		Submarine bat5 = new Submarine();
		bof = bat.add(bat5);

		ai.putShips(bat.toArray(new AbstractShip[0]));
		board.print();
		System.out.println("\n");

		int count = 0;
		int[] coords = new int[2];

		do{
			Hit hit = ai.sendHit(coords);
			System.out.println("Hits : [" + (int)(coords[0]+1) + ", " + (int)(coords[1]+1) + "] - " + hit.toString());
			System.out.println("\n");
			board.print();
			for (AbstractShip ship : bat){
            	if(hit.toString().compareTo(ship.getName()) == 0){
                	count++;
                	break;
            	}
        	}

        	sleep(50);
		}while(count != bat.size());
	}
}