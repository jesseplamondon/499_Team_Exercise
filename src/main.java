
import java.io.*;
import java.util.*;
=======
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
                    return i + " " + j; 
                }	
				
            }
        }
        // In case there is no solution, we'll just return null
		scanner.close();
        return null;
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
		in.close();
	}

}
