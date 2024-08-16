package Programacion_Java;

import java.math.BigInteger;

import javax.swing.JOptionPane;

public class NumeroPrimo {
	public static void main(String[] args) {
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero para definir el rango:"));
		BigInteger n;
		for (int i = 1; i < numero; i++) {
			n = new BigInteger("" + i);
			imprimir("El " + (n.isProbablePrime(1) ? i + " es primo" : i + " no es primo"));
		}

	}

	private static void imprimir(String x) {
		System.out.println(x);

	}

}
