import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int result = (num1 * num2 * num3);
		
		String str = Integer.toString(result);
		String[] strArray = str.split("");
		
		for(int i=0; i<10; i++) {
			int count = 0;
			for(int j=0; j<strArray.length; j++) {
				Integer convert = Integer.parseInt(strArray[j]);
				if(convert == i) {
					count += 1;
				}
			}
			System.out.println(count);
		}
		
		
		sc.close();
	}
}