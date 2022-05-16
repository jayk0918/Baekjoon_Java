import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		boolean calculate = true;
		while(calculate) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int C = sc.nextInt();
			if(A>=2 && A<=10000) {
				if(B>=2 && B<=10000) {
				}if(C>=2 && C<=10000) {
					System.out.println((A+B)%C);
					System.out.println(((A%C) + (B%C))%C);
					System.out.println((A*B)%C);
					System.out.println(((A%C) * (B%C))%C);
					calculate = false;
				}
			}else {
				continue;
			}
		}
		sc.close();
	}
}