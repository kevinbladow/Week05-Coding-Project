package week05CodingProject;

class AsteriskLogger implements Logger{

	public void log(String logString) {
		
		System.out.println("***" + logString + "***");
	}

	
	public void error(String errorMsg) { 						// prints string surrounded by box of asterisks
		for (int i=0; i < errorMsg.length() + 13; i++) { 		//print * for length of string errorMsg plus 6
			System.out.print("*");
		} System.out.println();
		System.out.println("***Error: " + errorMsg + "***");
		
		for (int i=0; i < errorMsg.length() + 13 ; i++) {
			System.out.print("*");
		}System.out.println();
	}
}
