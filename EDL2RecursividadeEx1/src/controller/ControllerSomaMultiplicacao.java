package controller;

public class ControllerSomaMultiplicacao {
	public ControllerSomaMultiplicacao() {
		super();
		
	}
	
	public int SomaMultiplicacao (int A, int B) {
		if (B == 1) {
			return A;
			
		}
		else {
			return A + SomaMultiplicacao (A,B-1);
		}
	}

}
