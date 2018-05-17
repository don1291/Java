import java.util.*;

//import java.io.File;

public class GuessingGame{

	int secret;
	int num;
	Scanner scan;
	boolean won;
	int guess;
	int low;
	int high;
	int lowest;
	int highest;
	boolean firstHigh, firstLow;

	public GuessingGame(){
		high = 0;
		low = 1;
		scan = new Scanner(System.in);
	}

	public void playGame(){
		low = 1;
		high = 100;
		lowest = high + 1;
		highest = low - 1;
		firstHigh = true;
		firstLow = true;
		won = false;	// if second time, needs to be reset
		guess = 0;	// ""
		generateSecretNumber();
		num = 0;
		while(!won){
			obtainUserGuess(); 
			num++;
			if(checkOutsideRange()){
				System.out.println("Outside range!");
				continue;
			}
			
			if (checkIfWon()){
				System.out.println("You won!");
				break;
			}
			System.out.println(checkTooHighLow());
		}

	}
	public void generateSecretNumber(){
		secret = (int)(Math.random()*(high-low+1)+ low);
	}
	public void obtainUserGuess(){
		System.out.println("Guess a number (1-100): ");
		guess = scan.nextInt(); 
	}
	public boolean checkIfWon(){
		if(guess == secret){
			return true;
		}else{
			return false;
		}
	}
	public String checkTooHighLow(){
		String temp = "";
		if(guess>secret){
			temp =  "Too high!";
			if(firstHigh){
				highest = guess;
				firstHigh = false;
			}else if(guess>=highest){
				System.out.println("You were already told " + highest + " is too high!");
			}else{
				highest = guess;
			}
		}else if(guess<secret){
			temp = "Too low!";
			if(firstLow){
				lowest = guess;
				firstLow = false;
			}else if( guess <= lowest){
				System.out.println("You were already told " + lowest + "  is too low!");
			}else{
				lowest = guess;
			}
		}
	 
		return temp;
	}
	public boolean checkOutsideRange(){
		if(guess < low || guess > high){
			return true;
		}
		return false;
	}
	
	public static void main(String[] args){
		
		GuessingGame gg = new GuessingGame(50,150);
		gg.playGame();
		
		//File x = new File ("output.txt");
		//if(x.exits())
			//System.out.println("You have " + num + "guess.");
		//else
			//System.out.println("File Not Found");
	}	
}