package ie.atu.sw;

import java.util.concurrent.ThreadLocalRandom;

public class CharacterArray {
	
	//Instance Variables
	private char[] text = null;
	private static final int MIN_OGHAM = 5760;
	private static final int MAX_OGHAM = 5791;
	
	//Create a contructor that will take in user data and create an array
	public CharacterArray(int size) {
		text = new char[size];
		init();
	}
	
	//Create an initializer
	private void init() {
		ThreadLocalRandom rnd = ThreadLocalRandom.current();
		
		for (int i = 0; i < text.length; i++) {
			/*
			 * The array is called text, the i(th) element starting at 0 is assigned
			 * the value of rnd(random number generator) calling nextInt(33, 126)
			 * 33 - 126 gives ASCII characters you would find on a standard (american) keyboard
			 */
			text[i] = (char) rnd.nextInt(MIN_OGHAM, MAX_OGHAM + 1); // must add cast (char)
		}
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
