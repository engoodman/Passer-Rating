import java.util.*;
public class passerRating {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of passing attempts: ");
		double attempts = input.nextInt();
		System.out.println("Enter number of completions: ");
		double completions = input.nextInt();
		System.out.println("Enter number of passing yards: ");
		double yards = input.nextInt();
		System.out.println("Enter number of touchdowns: ");
		double td = input.nextInt();
		System.out.println("Enter number of interceptions: ");
		double interceptions = input.nextInt();
		
		double a = ((completions/attempts)-0.3)*5;
		double b = ((yards/attempts)-3)*0.25;
		double c = (td/attempts)*20;
		double d = 2.375-((interceptions/attempts)*25);
		
		double passerRating = (( a +  b +  c +  d)/6)*100;
		System.out.println("Your passer rating is: " + passerRating);

	}

}
