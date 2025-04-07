package ie.atu.sw;

import java.util.concurrent.ThreadLocalRandom;

public class NumberArray {
	//Constructor
	public void go() {
		int[] numbers = new int[100];
		generate(numbers);
		print(numbers);
	}
	
	private int[] generate(int size) {
		return null;
	}
	
	private void generate(int[] nums) {
		ThreadLocalRandom rnd = ThreadLocalRandom.current();
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = rnd.nextInt(1, 101);
		}
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
