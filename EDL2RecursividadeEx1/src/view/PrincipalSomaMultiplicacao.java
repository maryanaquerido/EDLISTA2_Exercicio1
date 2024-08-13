package view;
import controller.ControllerSomaMultiplicacao;
public class PrincipalSomaMultiplicacao {
	public static void main (String [] args) {
		
		ControllerSomaMultiplicacao m = new ControllerSomaMultiplicacao();
		int A = 5;
		int B = 2;
		int resp = m.SomaMultiplicacao(A, B);
		System.out.println (resp);
		
	}

}
