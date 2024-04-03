package trabs;
import java.util.Scanner;

public class ex9a {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double x,y,resu;
		
		System.out.println("Digite o valor de x");
		x = in.nextDouble();
		
		System.out.println("Digite o valor de Y");
		y = in.nextDouble();
		
		resu = Math.pow(2*(Math.sqrt(x + y *(Math.pow(Math.pow(x, 3)/2 , 1.0/25)))), 1.0/13);
		System.out.println(String.format("%.4f", resu));
	}

}
