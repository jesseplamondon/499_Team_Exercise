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
		System.out.println();
		
		arrayMax(arr);
		System.out.println();
		
		arrayMin(arr);

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
	}
	
	public static void arrayMax(int[] arr) throws IOException {
		Scanner in = new Scanner(System.in);
		System.out.println("What is the max integer in the array? ");
		
		int user_max = in.nextInt();
		int max_val = arr[0]; 
		
	    for(int a = 1; a < arr.length; a++) { 
	    	if(arr[a] > max_val) { 
	    		max_val = arr[a]; 
	    	} 
	    }
	    
	    if(user_max == max_val) {
			System.out.println("That's correct! The max integer in the array is: " + max_val);
		} else {
			System.out.println("That's incorrect! The max integer in the array is: " + max_val);
		}
	}
	
	public static void arrayMin(int[] arr) throws IOException {
		Scanner in = new Scanner(System.in);
		System.out.println("What is the min integer in the array? ");
		
		int user_min = in.nextInt();
		int min_val = arr[0]; 
		
	    for(int a = 1; a < arr.length; a++) { 
	    	if(arr[a] < min_val) { 
	    		min_val = arr[a]; 
	    	} 
	    }
	    
	    if(user_min == min_val) {
			System.out.println("That's correct! The min integer in the array is: " + min_val);
		} else {
			System.out.println("That's incorrect! The min integer in the array is: " + min_val);
		}
	    in.close();
	}

}
