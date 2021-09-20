import java.io.*;
import java.util.*;

import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

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
		greatestSubset(arr);

		System.out.println(Twosum(arr));

	}

	public static String Twosum(int [] nums){
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is the desired sum");
		int target = scanner.nextInt();

		for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return "The integers in the array that make that sum are: {"+nums[i] + ", " + nums[j]+"} and have indices of " + i + ", " + j; 
                }	
				
            }
        }
        // In case there is no solution, we'll just return null
		scanner.close();
        return "There is no set of two integers in the array that summate to that value";
	}
	public static void greatestSubset(int[] arr) throws IOException{
		Scanner in = new Scanner(System.in);
		System.out.println("What is the greatest subset of three integers in the span of the array? ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String lines = br.readLine();
		
		String[] a = lines.trim().split("\\s+");
		int[] ansTemp = new int[3];
		for(int i=0;i<ansTemp.length;i++) {
			ansTemp[i] = Integer.parseInt(a[i]);
		}
		int[] ans = new int[3];
		for(int e: ansTemp) {
			if(e>ans[2]) {
				ans[2]=e;
			}
			if(e>ans[1]) {
				ans[2]=ans[1];
				ans[1]=e;
			}
			if(e>ans[0]) {
				ans[1]=ans[0];
				ans[0]=e;
			}
		}
		int [] subset = new int [3];
		for(int e: arr) {
			if(e>subset[2]) {
				subset[2]=e;
			}
			if(e>subset[1]) {
				subset[2]=subset[1];
				subset[1]=e;
			}
			if(e>subset[0]) {
				subset[1]=subset[0];
				subset[0]=e;
			}
		}
		boolean isCorrect = true;
		for(int i = 0; i<3; i++) {
			if(ans[i]!=subset[i]) {
				isCorrect = false;
				break;
			}
		}
		//print correct or incorrect based on answer, don't return anything
		String subsetText = "{";
		for(int e: subset) {
			subsetText+=e + ", ";
		}
		subsetText+="}";
		if(isCorrect) {
			System.out.println("That's correct! The answer was: " +subsetText);
		}
		else {
			System.out.println("That's incorrect :( The answer was: " +subsetText);
		}
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
	}

}
