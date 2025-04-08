package ie.atu.sw;

import java.util.concurrent.ThreadLocalRandom;

public class CharacterArray {
	
	//Instance Variables
	private char[] text = null;
	
	//Create a contructor that will take in user data and create an array
	public CharacterArray(int size) {
		text = new char[size];
		init();
	}
	
	//Create an initializer
	private void init() {
		ThreadLocalRandom rnd = ThreadLocalRandom.current();
		
	}
	
	public String getCharactersAsString() {
		return new String(text);
	}
	
	//Go to Run>Run Configurations>Arguments>Program Arguments type "100">Run
	/* In a terminal open the project folder and enter the command:
	 * java ie.atu.sw.CharacterArray 100
	 * Output: null
	 */
	public static void main(String[] args) {
		if (args.length > 0) {
			int size = Integer.parseInt(args[0]);
			CharacterArray ca = new CharacterArray(size);
			String s = ca.getCharactersAsString();
			System.out.println(s);
		}else {
			System.out.println("Usage: java ie.atu.sw.CharacterArray <size>");
		}
	}
}                                                                           	
