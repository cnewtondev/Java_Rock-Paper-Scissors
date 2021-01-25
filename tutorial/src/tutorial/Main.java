package tutorial;
import java.util.Random;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("0 = Rock, 1 = Paper, and 2 = Scissors! Please select your choice...");
		Scanner sc = new Scanner(System.in);
		int answer = sc.nextInt();
		
		String[] choiceArr = {"Rock", "Paper", "Scissors"}; 
		
		String x = choiceArr[answer];
		int y = new Random().nextInt(choiceArr.length);
		String compChoice = choiceArr[y];
		
		String z = "";
		
		if(x.equals("Rock") && compChoice.equals("Paper")) {
			z = "Computer Wins";
		}else if(x.equals("Paper") && compChoice.equals("Scissors")) {
			z = "Computer Wins";
		}else if(x.equals("Scissors") && compChoice.equals("Rock")) {
			z = "Computer Wins";
		}else if(x.equals(compChoice)) {
			z = "It's a draw";
		}else {
			z = "You Won!";
		}		
		
		System.out.println("you have selected " + x + " and the computer chose " + compChoice + ". " + z);
	}

}
