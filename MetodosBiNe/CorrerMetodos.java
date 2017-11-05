import java.util.Scanner;
public class CorrerMetodos {

	public static void main(String[] args) {
		int met=2;
		Scanner s= new Scanner(System.in);
		System.out.println("Escoja el metodo que desea utilizar para encontrar la raíz");
		System.out.println("\n1° Newton-Raphson");
		System.out.println("2° Bisección");
		met=s.nextInt();
		switch(met){
				case 1:
					System.out.println("Newton-Raphson");
					Newton r= new Newton();
					r.calcula();
					break;
				case 2:
					System.out.println("Bisección");
					Biseccion b= new Biseccion();
					b.correr();
					break;
		}
	}

}
