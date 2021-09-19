
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

	}

}
