import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		
		double number = in.nextDouble();
		in.close();
		
		if(number < 0 || number>100) {
			System.out.println("Fora do intervalo");
		}else if(number > 0 && number <= 25) {
			System.out.println("Intervao [0, 25]");
		}else if(number < 50) {
			System.out.println("Intervalo [25, 50]");
		}else if(number < 75) {
			System.out.println("Intervalo [50, 75]");
		}else if(number <= 100) {
			System.out.println("Intervalo [75, 100]");
		}
		
		

	}

}
