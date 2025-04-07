package ie.atu.sw;

public class NumberArray {
	//Constructor
	public void go() {
		int[] numbers = new int[100];
		print(numbers);
	}
	
	private void print(int[] nums) {
		System.out.print("[");
		for (int i =0; i < nums.length; i++) {
			System.out.print(nums[i]);
			if (i < nums.length - 1) System.out.print(", ");
		}
		System.out.println("]");
	}
	
	public static void main(String[] args) {
		new NumberArray().go(); //This changes the context from "static"
	}
}
