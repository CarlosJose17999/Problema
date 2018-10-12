package Problema2;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		String nom;
		char sexo;
		int edad;
		double peso,alt;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introuzca el nombre");
		nom=sc.nextLine();
		System.out.println("Introuzca la edad");
		edad=sc.nextInt();
		System.out.println("Introuzca el peso");
		peso=sc.nextDouble();
		System.out.println("Introuzca la altura");
		alt=sc.nextDouble();
		//System.out.println("Introuzca el sexo");
		//sexo=sc.next();
		
		persona met1= new persona(nom,peso,alt,edad);
		
		 System.out.println(met1);
	}

}
