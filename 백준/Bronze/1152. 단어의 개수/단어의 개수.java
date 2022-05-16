import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int result = 0;
		String input = sc.nextLine();
		String[] lines = input.split(" ");
		
		
		for(int i=0; i<lines.length; i++) {
			result += 1;
		}
		
		if(input.equals(" ")) {
			result = 0;
		}else if(input.charAt(0) == ' ') {
			result -= 1;
		}
		
		System.out.println(result);
		sc.close();
		
	}
}
