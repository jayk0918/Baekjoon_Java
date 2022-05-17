import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int result = 1;
		int i = 1;
		int j = 1;
		while(true) {
			if(i<num) {
				i += 6*j;
				++j;
				result += 1;
			}
			else	{
				break;
			}
		}
		
		System.out.println(result);
		
		
		sc.close();
		
	}
}