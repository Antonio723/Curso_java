import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		
		double pi = 3.14159;
		
		System.out.print("Digite o valor do raio: ");
		double raio = in.nextDouble();
		in.close();
		
		double result = Math.pow(raio, 2) * pi;
		System.out.printf("A = %.4f",  result);

	}

}
