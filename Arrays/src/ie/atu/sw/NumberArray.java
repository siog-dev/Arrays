package ie.atu.sw;

public class NumberArray {
	//Constructor
	public void go() {
		int[] numbers = new int[100];
	}
	
	public static void main(String[] args) {
		new NumberArray().go(); //This changes the context from "static"
	}
}
