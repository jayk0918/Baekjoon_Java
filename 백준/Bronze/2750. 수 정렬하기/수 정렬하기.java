import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		// 2750
		Scanner sc = new Scanner(System.in);
		Set<Integer> nSet = new TreeSet<Integer>();
		
		int count = sc.nextInt();
		int nums = 0;
		boolean arrange = true;
		
		while(arrange) {
			int input = sc.nextInt();
			nums += 1;
			nSet.add(input);
			if(count == nums) {
				arrange = false;
			}
		}
		
		for(int list : nSet) {
			System.out.println(list);
		}
		
		sc.close();
	}
}