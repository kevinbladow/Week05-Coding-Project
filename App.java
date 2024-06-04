package week05CodingProject;


public class App {

	public static void main(String[] args) {

		AsteriskLogger aLogger = new AsteriskLogger();  // Instantiate AsteriskLogger
		SpacedLogger sLogger = new SpacedLogger();		// Instantiate SpacedLogger
		
		aLogger.log("hello");
		aLogger.error("buttcake");
		sLogger.log("Hello");
		sLogger.error("HELLO");
		
	}

}
