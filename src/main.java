
public class main {

	public static void main(String[] args) {
		int[] arr = new int[10];
		int max = 20;
		int min = 1;
		int range = max-min+1;
		for(int e: arr) {
			e=(int)(Math.random()*range) + min;
		}

	}

}
