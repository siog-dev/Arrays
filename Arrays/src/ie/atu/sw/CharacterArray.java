package ie.atu.sw;

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
		
	}
	
	public String getCharactersAsString() {
		return null;
	}
	
	public static void main(String[] args) {
		if (args.length > 0) {
			int size = Integer.parseInt(args[0]);
			CharacterArray ca = new CharacterArray(size);
			
		}else {
			System.out.println("Usage: java ie.atu.sw.CharacterArray <size>");
		}
	}
}                                                                           	
