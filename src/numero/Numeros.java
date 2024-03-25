package numero;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Numeros {
	
	static final int NUN_MAX = 10;
	static int par = 0;
	static int impar = 0;
	static int c = 0;
	
	public static void main(String[] args) {
		validarNumeros();
		mostrarResultado();		
	}


	public static void validarNumeros() {
	Scanner scanner = new Scanner(System.in);
	while(c<NUN_MAX) {
		try {
			System.out.println("Introduce entero");
			int var = scanner.nextInt();
			esPar(var);
			c = c+1;
		
		}catch (InputMismatchException e) {
			System.out.println("Entero por favor");
			scanner.next();
		}
	}
	
	scanner.close();
	}
	
	public static void esPar(int var) {
		if ((var%2)==0) {
			par = par+1;
		}else {
			impar = impar+1;
		}
	}
	
	public static void mostrarResultado() {
		System.out.println("Impar: "+ impar + "Par: "+ par);
	}
}






















	/*public static void validarNumeros() {
	Scanner scanner = new Scanner(System.in);
	for (int c=0; c<NUN_MAX;c++) {
		try {
			System.out.println("Introduce enetro");
			int var = scanner.nextInt();
			esPar(var);
		
		}catch (InputMismatchException e) {
			System.out.println("Entero por favor");
			scanner.next();
		}
	}
	scanner.close();
	System.out.println("Impar: "+ impar + "Par: "+ par);
}*/

/*	public static void validarNumeros() {
	Scanner scanner = new Scanner(System.in);
	do {
		try {
			System.out.println("Introduce enetro");
			int var = scanner.nextInt();
			esPar(var);
			c = c+1;
		
		}catch (InputMismatchException e) {
			System.out.println("Entero por favor");
			scanner.next();
		}
	}while(c<NUN_MAX);
	
	scanner.close();
	}*/


