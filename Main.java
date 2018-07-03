import java.util.Scanner;


public class Main {
	public static void main(String[] args){
	Grid grid = new Grid();
	//grid.map();
	//test
	//test2
	//test3
	

		Scanner input = new Scanner(System.in);
		System.out.println("Please choose a level by typing in the number.\n 1.Beginner\n 2.Intermediate\n 3.Advance");
		int userinput = input.nextInt();
		
		if(userinput == 1){
			
			grid.map();
			Life life = new Life();
			life.setLife();
			//System.out.println(life);
			/*for(life > 0){
			System.out.println("Please enter row of choice.");
			int row = input.nextInt();
			System.out.println("Please enter column of choice.");
			int col = input.nextInt();
			
			if(checkGrid(row,col) == 1) or (checkGrid(row,col) == 3) or (checkGrid(row,col) == 4)){
				show[row][col];
				if((checkGrid(row,col) == 3)){
					
				}
				
			}else{
				show[row][col] = 0;
			}
			}*/
		}
		/*else if(userinput == 2){
			Game start = new Game();
			start.setIntermediate();
			/*System.out.println("Please enter row of choice.");
			int row = input.nextInt();
			System.out.println("Please enter column of choice.");
			int col = input.nextInt();
		}
		else if(userinput == 2){
			Game start = new Game();
			start.setBeginner();
			System.out.println("Please enter row of choice.");
			int row = input.nextInt();
			System.out.println("Please enter column of choice.");
			int col = input.nextInt();
		}
		else{
			System.out.println("You entered an invalid number.");
		}*/
		
		
		

}
}
