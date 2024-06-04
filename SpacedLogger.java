package week05CodingProject;

class SpacedLogger implements Logger {
		
		public void log(String logString) {
			if (logString == "Hello") {
				System.out.println("H e l l o");
			}
		}
	
		public void error(String errorMsg) {
			if (errorMsg == "HELLO") {
				System.out.println("ERROR: H e l l o");
			}
		}
}
