import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		
		double abscissa = in.nextDouble();
		double ordenada = in.nextDouble();
		in.close();
		
		if(abscissa == 0 && ordenada == 0) {
			System.out.println("Origem");
		}else if(abscissa > 0 && ordenada > 0){
			System.out.println("Q1");
		}else if(abscissa < 0 && ordenada > 0) {
			System.out.println("Q2");
		}else if(abscissa < 0 && ordenada < 0) {
			System.out.println("Q3");
		}else if(abscissa > 0 && ordenada < 0) {
			System.out.println("Q4");
		}else {
			System.out.println("Ops, parece que temos um erro :(");
		}
	}

}
