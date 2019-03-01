package UserInput;

import java.io.IOException;

public class Main {
	public static void main(String args[]) throws IOException {
		TestInput testinput = new TestInput();
		testinput.inputJOptionPane();
		testinput.inputScannerClass();
		testinput.inputCommandPrompt(args);
		testinput.inputBufferedReader();
		
	}
}
