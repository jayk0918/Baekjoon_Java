import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int subjects = sc.nextInt();
		sc.nextLine();
		String scores = sc.nextLine();
		double newScores = 0;
		int max = 0;
		double result = 0;
		
		String[] scoresArray = scores.split(" ");
		
		for(int i=0; i<scoresArray.length; i++) {
			Integer fraud = Integer.parseInt(scoresArray[i]);
			if(fraud > max) {
				max = fraud;
			}
		}
		
		for(int i=0; i<scoresArray.length; i++) {
			Integer frauds = Integer.parseInt(scoresArray[i]);
			double newScore = (double)frauds / max * 100;
			newScores += newScore;
		}
		
		result = (double) (newScores / subjects);
		System.out.println(result);
		
		sc.close();
	}
}