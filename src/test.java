/* Name: May Shin Lyan @ Hnin Oo Wai 
 * NetID: hwai
 * Project 1 
 * email : hwai@u.rochester.edu 
 * 
 */
package Project1;

import java.io.IOException;
import java.util.Scanner;

public class test {


	public static initialize init;
	public static int count=0;

	public static void main(String[] args) throws IOException {
		
		//initializing the game
		init = new initialize();
		
		while(init.gameover == false){
		init.gameover = true;
		System.out.println("Please enter 'a' to move 'LEFT', 'd' to move 'RIGHT' "
				+ "\n 'w' to move 'UP' and 's' to move 'DOWN': \nYou may press 'q' to quit or 'r' to restart the game.\n");
		print2Darray(init.anArray);
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		
		runningSum2DArray(init.anArray, s);
		
		
		}
		
		//gameover condition 
		if(init.gameover==true){
			System.out.println("*******************************GAME OVER!**************************************\n");
			System.out.println("Your total valid moves is: "+count);
		}
		
		
	}

	
	//method to add the numbers with key pressed 
	public static void runningSum2DArray(int[][] anArray, String s){
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		Move move = new Move();
		Scanner scan = new Scanner(System.in);
		switch(s){
		
		// move left
		case "a":{
	
			move.left(anArray);
			init.randomFill();
			count++;
			if(init.gameover==false){
				System.out.println("After moving left, your board is: ");
			}
			break;
			
		}
		
		//right
		case "d":{
		
			move.right(anArray);
			init.randomFill();
			count++;
			if(init.gameover==false){
				System.out.println("After moving right, your board is: ");
			}
			break;
			
		}
		
		//up
		case "w":{
			
			init.randomFill();
			move.up(anArray);
			count++;
			if(init.gameover==false){
				System.out.println("After moving up, your board is: ");
			}
			break;
		}
		
		//down
		case "s":{
			
			System.out.println("After moving down, your board is: ");
			move.down(anArray);
			init.randomFill();
			count++;
			if(init.gameover==false){
				System.out.println("After moving up, your board is: ");
			}
			break;
		}
		
		//quit
		case "q":{
			
			System.out.println("Are you sure you want to quit? If yes press '1', \n otherwise pressed '2'." );
			int quit = scan.nextInt();
			if(quit==1){
			init.gameover=true;
			
			}
			else if(quit==2){
			init.gameover=false;
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			}
			
			break;
			
		}
		
		//restart
		case "r":{
			
			System.out.println("Are you sure you want to restart? If yes press '1', \n otherwise enter '2'." );
			int restart = scan.nextInt();
			
			if(restart==1){
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			System.out.println("The game has restarted.");
			init = new initialize();
			}
			
			else{
				init.gameover=false;
				System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			}
			
			break;
		
		}
		default: {
			init.gameover=false;
			System.out.println("*************************************************");
			System.out.println("Wrong Key! The key you entered is invalid. ");
			System.out.println("*************************************************\n\n");
			break;}
		}
		
	}


	
	//method to print 4*4 2D array
	public static void print2Darray(int [][] anArray){
	
		System.out.println("*************************************************");
		for(int i=0;i<4;i++){
			for (int j=0;j<4;j++){
				System.out.format(anArray[i][j]+ "\t");
			}
			System.out.println("");
		}
		System.out.println("\n*************************************************\n");
		
	}
}




