/* Name: May Shin Lyan @ Hnin Oo Wai 
 * NetID: hwai
 * Project 1 
 * email : hwai@u.rochester.edu 
 * 
 */
package Project1;


import java.util.Random;

public class initialize {
	

	boolean gameover;
	Random rand = new Random();
	
	
	//array that ensures that the probablity of 2 is 80% and 4 is 20%
	int[] startArray = {2,2,2,2,4};
	public int[][] anArray;
	
	//initializes the game
	public initialize(){
		this.gameover = false;
		this.anArray = new int[4][4];
		arrayStart();
		System.out.println("Welcome to May's 2048 game! The following is your game board:\n");
	
	}

	public void arrayStart(){
		//randomnly selecting the random number from the startArray
		int num1 = startArray[rand.nextInt(5)];
		int num2 = startArray[rand.nextInt(5)];
		
		int row1=0,row2 = 0,col1=0,col2 = 0;
		
		//randomly assigning the two numbers and making sure that they are not the same
		while(row1==row2 && col1==col2){
		 row1 = rand.nextInt(4);
		 col1 = rand.nextInt(4);
		 row2 = rand.nextInt(4);
		 col2 = rand.nextInt(4);
		}
		anArray[row1][col1] = num1;
		anArray[row2][col2] = num2;
		
		
	}

	//method that fills the board with a random number after every move
	public void randomFill(){
		//checking there is space to add random number. If there is no space the game is over.
		for(int i=0;i<4;i++){
			for (int j=0;j<4;j++){
				if(anArray[i][j]==0){
					gameover = false;
				}
			}
		}
		
		//randomnly selecting the random number from the startArray
		int num1 = startArray[rand.nextInt(5)];
		int randI, randJ;
		
		do{
			 randI = rand.nextInt(4);
			 randJ = rand.nextInt(4);
			
			if(anArray[randI][randJ]==0){
				anArray[randI][randJ]=num1;
				break;
			}
			
		
		}while(gameover==false);
		
		
	}



}
