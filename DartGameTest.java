package hw2;

import static api.ThrowType.*;

public class DartGameTest 
{
	public static void main(String[] args) 
	{
//		DartGame g = new DartGame(1, 100, 3);
//		System.out.println(g.getScore(0)); //Expected 100
//		System.out.println(g.getScore(1)); //Expected 100
//		System.out.println(g.getCurrentPlayer()); //Expected 1
//		System.out.println(g.getDartCount()); //Expected 3
//		
//		g.throwDart(DOUBLE, 10); 
//	    System.out.println(g); 
//	    g.throwDart(DOUBLE, 10); 
//	    System.out.println(g); 
//	    g.throwDart(DOUBLE, 10); 
//	    System.out.println(g); 
//	    g.throwDart(DOUBLE, 10); 
//	    System.out.println(g);
//		
//		System.out.println(DartGame.calcPoints(MISS, 42));// expected 0  
//        												  //(second arg ignored) 
//		System.out.println(DartGame.calcPoints(SINGLE, 7));  // expected 7 
//		System.out.println(DartGame.calcPoints(DOUBLE, 10)); // 20 
//		System.out.println(DartGame.calcPoints(TRIPLE, 8));  // 24 
//		System.out.println(DartGame.calcPoints(OUTER_BULLSEYE, 42)); // 25 
//		System.out.println(DartGame.calcPoints(INNER_BULLSEYE, 42)); // 50
	    
//	    DartGame g = new DartGame(1, 50, 3); 
//	    g.throwDart(DOUBLE, 15); 
//	    System.out.println(g); 
//	    g.throwDart(DOUBLE, 12); 
//	    System.out.println(g);
//	     
//	    g.throwDart(DOUBLE, 15); 
//	    System.out.println(g); 
//	    g.throwDart(SINGLE, 5); 
//	    g.throwDart(SINGLE, 5); 
//	    System.out.println(g);  // player 0's turn, player 1 score now 10 
//	    g.throwDart(DOUBLE, 1); 
//	    g.throwDart(DOUBLE, 1); 
//	    g.throwDart(DOUBLE, 1); // player 0 having a bad day 
//	    System.out.println(g);      
//	    g.throwDart(SINGLE, 5); 
//	    g.throwDart(SINGLE, 5); // player 1 gone bust 
//	    System.out.println(g);  // player 0's turn, player 1 score back to 10
//	    
//	    g.throwDart(SINGLE, 10); 
//	    System.out.println(g);   // score still 100, not doubled in yet 
//	    g.throwDart(DOUBLE, 7); 
//	    System.out.println(g);   // ok, score now 86 
//		
//		DartGame g = new DartGame(1,20,2);
//		g.throwDart(DOUBLE, 5);
//		g.throwDart(DOUBLE, 5);
//		System.out.println(g);
//		
//		DartGame  g = new DartGame(1,21,2);
//		g.throwDart(DOUBLE, 3);
//		g.throwDart(TRIPLE, 4);
//		System.out.println(g);
		
		DartGame g = new DartGame(0);
		g.throwDart(TRIPLE, 10);
		g.throwDart(DOUBLE, 10);
		g.throwDart(TRIPLE, 10);
		g.throwDart(TRIPLE, 10);
		g.throwDart(DOUBLE, 10);
		g.throwDart(TRIPLE, 10);
		g.throwDart(TRIPLE, 10);
		g.throwDart(DOUBLE, 10);
		g.throwDart(TRIPLE, 10);
	}
}
