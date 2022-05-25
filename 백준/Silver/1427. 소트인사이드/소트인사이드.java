import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		String num = br.readLine();
		String[] numArray = num.split("");
		Integer[] intArray = new Integer[numArray.length];
		
		for(int i=0; i<numArray.length; i++) {
			intArray[i] = Integer.parseInt(numArray[i]);
		}
		
		Arrays.sort(intArray,Comparator.reverseOrder());
		
		for(Integer result : intArray) {
			System.out.print(result);
		}
		
		br.close();
	
	}
}