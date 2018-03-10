/* Name: May Shin Lyan @ Hnin Oo Wai 
 * NetID: hwai
 * Project 1 
 * email : hwai@u.rochester.edu 
 * 
 */

package Project1;

public class Move {

	public void left(int[][] anArray){
		for(int i=0;i<anArray.length;i++){

			//move the numbers to the left 
			for(int j=1; j<=3;j++){
				for(int k=j; k>0; k--){
					if(anArray[i][k-1]==0){
						anArray[i][k-1]+=anArray[i][k];
						anArray[i][k]=0;
					}					
				}
			}

			//add the numbers to the left 
			for(int j=1; j<=3;j++){
				if(anArray[i][j-1]==anArray[i][j] || anArray[i][j-1]==0){
					anArray[i][j-1]+=anArray[i][j];
					anArray[i][j]=0;
				}					
			}

			//add the middle two numbers if they are the same
			if(anArray[i][1]==anArray[i][2]){
				anArray[i][1]+=anArray[i][2];
				anArray[i][2]=0;
			}
		}
	}	


	public void right(int[][] anArray){
		for(int i=0;i<anArray.length;i++){

			//move the numbers to the right 
			for(int j=2; j>=0;j--){
				for(int k=j; k<3; k++){
					if(anArray[i][k+1]==0){
						anArray[i][k+1]+=anArray[i][k];
						anArray[i][k]=0;
					}					
				}
			}

			//add the numbers to the right 
			for(int j=2; j>=0;j--){
				if(anArray[i][j+1]==anArray[i][j] || anArray[i][j+1]==0){
					anArray[i][j+1]+=anArray[i][j];
					anArray[i][j]=0;
				}					
			}

			//add the middle two numbers if they are the same
			if(anArray[i][1]==anArray[i][2]){
				anArray[i][2]+=anArray[i][1];
				anArray[i][1]=0;
			}
		}
	}	


	public void up(int[][] anArray){

		//move the numbers up
		for(int j=0; j<4; j++){
			for(int i=1;i<=3;i++){
				for(int k=i; k>0; k--){
					if(anArray[k-1][j]==0){
						anArray[k-1][j]+=anArray[k][j];
						anArray[k][j]=0;
					}					
				}
			}

			//add the numbers up
		for(int i=1; i<=3;i++){
				if(anArray[i-1][j]==anArray[i][j] || anArray[i-1][j]==0){
					anArray[i-1][j]+=anArray[i][j];
					anArray[i][j]=0;
				}					
			}

			//add the middle two numbers if they are the same
			if(anArray[1][j]==anArray[2][j]){
				anArray[1][j]+=anArray[2][j];
				anArray[2][j]=0;
			}
		}
	}
	
	
	
	public void down(int[][] anArray){

		//move the numbers down
		for(int j=0; j<4; j++){
			for(int i=2;i>=0;i--){
				for(int k=i; k<3; k++){
					if(anArray[k+1][j]==0){
						anArray[k+1][j]+=anArray[k][j];
						anArray[k][j]=0;
					}					
				}
			}

		//add the numbers down
		for(int i=2; i>=0;i--){
				if(anArray[i+1][j]==anArray[i][j] || anArray[i+1][j]==0){
					anArray[i+1][j]+=anArray[i][j];
					anArray[i][j]=0;
				}					
			}

			//add the middle two numbers if they are the same
			if(anArray[2][j]==anArray[1][j]){
				anArray[2][j]+=anArray[1][j];
				anArray[1][j]=0;
			}
		}
	}
}







