import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		System.out.println("Write the numbers x and y: ");
		Scanner in = new Scanner(System.in);
		double x = in.nextDouble();
		double y = in.nextDouble();
		
		if(x>0 && y>0) {
			System.out.println("Q1");
		}else if( x<0 && y>0) {
			System.out.println("Q2");
		}else if(x<0 && y<0) {
			System.out.println("Q3");
		}else if(x>0 && y<0){
			System.out.println("Q4");
		}else if(x==0 && y ==0) {
			System.out.println("Source");
		}
	}
}
