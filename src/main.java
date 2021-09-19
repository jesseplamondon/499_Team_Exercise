import java.io.*;
import java.util.*;

public class main {

	public static void main(String[] args) throws IOException {
		int[] arr = new int[10];
		int max = 20;
		int min = 1;
		int range = max-min+1;
		for(int i = 0; i< arr.length;i++) {
			arr[i]=(int)(Math.random()*range) + min;
		}
		System.out.println("The questions will be based on the following array: ");
		System.out.print("{");
		for(int e: arr) {
			System.out.print(e + ", ");
		}
		System.out.print("}");
		System.out.println();
		arraySum(arr);

	}
	
	public static void arraySum(int[] arr) throws IOException {
		Scanner in = new Scanner(System.in);
		System.out.println("What is the total sum of integers in the array? ");
		
		int user_sum = in.nextInt();
		int total_sum = 0;
		
		for(int arr_num : arr) {
			total_sum = total_sum + arr_num;
		}
		
		if(user_sum == total_sum) {
			System.out.println("That's correct! The sum of the array is: " + total_sum);
		} else {
			System.out.println("That's incorrect! The sum of the array is: " + total_sum);
		}
		
		in.close();
	}
	
	public static void arrayMax(int[] arr) throws IOException {}
	
	public static void arrayMin(int[] arr) throws IOException {}

}
