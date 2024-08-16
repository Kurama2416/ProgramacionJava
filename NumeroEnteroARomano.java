package Programacion_Java;

import javax.swing.JOptionPane;

public class NumeroEnteroARomano {
	public static void main(String[] args) {
		int number = Integer.parseInt(JOptionPane.showInputDialog("Enter the number to convert: "));
		String[] thousands={"M"};
        String[] tens={"C","CC", "CCC", "CD", "D", "DC", "DCC", "DCCC","CM"};
        String[] hundreds={"X","XX", "XXX", "XL", "L", "LX", "LXX", "LXXX","XC"};
        String[] units={"I","II", "III", "IV", "V", "VI", "VII", "VIII","IX"};
        int m = number / 1000;
        int c = number / 100 % 10;
        int d = number / 10 % 10;
        int u = number % 10;
        String msj="";        
        if (m>0) msj+=""+thousands[m-1]; //miles
        if (c>0) msj+=""+tens[c-1];   //centenas
        if (d>0) msj+=""+hundreds[d-1]; //decenas
        if (u>0) msj+=""+units[u-1];   //unidades
        System.out.println("The number "+number+" is: "+msj);
	}

}
