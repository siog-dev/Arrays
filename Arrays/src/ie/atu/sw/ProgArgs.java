package ie.atu.sw;

public class ProgArgs {
	
	public static void main(String[] args) {
		System.out.println(args + "---->" + args.length);
		//Prints: "[Ljava.lang.String;@4517d9a3---->0"
		
		/*
		 * In Run>Run Configurations>Arguments Tab>In Program Arguments: 
		 * type "The Quick Brown Fox Jumps Over The Lazy Dog" and hit Enter
		 * 
		 * Console Prints: [Ljava.lang.String;@4517d9a3---->9
		 * 
		 * 
		 * Do the same in a terminal
		 * cd Arrays/bin/
		 * java ie.atu.sw.ProgArgs The Quick Brown Fox
		 * 
		 * Terminal Prints: [Ljava.lang.String;@372f7a8d---->4
		 */
		
		
	}
	
}
