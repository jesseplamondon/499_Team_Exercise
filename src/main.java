import java.io.*;
import java.util.*;

public class main {

	public static void main(String[] args) {
		int[] arr = new int[10];
		int max = 20;
		int min = 1;
		int range = max-min+1;
		for(int i = 0; i< arr.length;i++) {
			arr[i]=(int)(Math.random()*range) + min;
		}
		System.out.print("{");
		for(int e: arr) {
			System.out.print(e + ", ");
		}
		System.out.print("}");
		System.out.println();

		System.out.println(Twosum(arr));

	}

	public static String Twosum(int [] nums){
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is the desired sum");
		int target = scanner.nextInt();

		for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return i + " " + j; 
                }	
				
            }
        }
        // In case there is no solution, we'll just return null
		scanner.close();
        return null;
	}

}
