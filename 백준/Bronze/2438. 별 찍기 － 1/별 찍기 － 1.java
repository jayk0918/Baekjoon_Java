import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean print = true;
		String star = "*";
		
		while(print) {
			int n = sc.nextInt();
			if(n>=1 && n<=100) {	
				for(int i = 0; i < n; i++) {
					for(int j = 0; j<=i; j++) {
						System.out.print(star);
					}
					System.out.println();
				}
				print = false;
			}else {
				continue;
			}
		}
		sc.close();
	}
}
