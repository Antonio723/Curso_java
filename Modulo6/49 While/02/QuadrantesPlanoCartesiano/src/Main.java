import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int first = in.nextInt();
		int second = in.nextInt();
		
		while(!(first==0 || second ==0)) {
			if(first > 0 && second > 0) {
				System.out.println("Primeiro quadrante");
			}else if(first<0 && second>0){
				System.out.println("Segundo quadrante");
			}else if(first<0 && second<0) {
				System.out.println("Terceiro quadrante");
			}else if(first>0 && second<0) {
				System.out.println("Quarto quadrante");
			}
			first = in.nextInt();
			second = in.nextInt();
		}
		
		in.close();
		
		System.out.println("A brincadeira acabou");
	}
}
