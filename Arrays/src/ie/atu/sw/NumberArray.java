package ie.atu.sw;

import java.util.concurrent.ThreadLocalRandom;

public class NumberArray {
	//Constructor
	public void go() {
		//int[] numbers = new int[100];
		int[] numbers = generate(100);
		generate(numbers);
		print(numbers);
		
		int total = 0;
		for (int i = 0; i < numbers.length; i++) {
			//total = total + numbers[i];
			total += numbers[i];
		}
		System.out.println("Total: " + total);
	}
	
	private int[] generate(int size) {
		int[] temp = new int[100];
		generate(temp);
		return temp;
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
