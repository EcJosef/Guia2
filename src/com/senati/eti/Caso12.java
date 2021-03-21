package com.senati.eti;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Empleado.................: ");
		String nombre = sc.nextLine();
		
		System.out.print("Nivel [1-4]..............: ");
		int nivel = sc.nextInt();
		
		System.out.print("Sueldo...................: ");
		float sueldo = sc.nextFloat();
		
		float inc = 0;
		
		switch (nivel)  {
		    case 1:
		    	inc = (float) 4.5;
		    	break;
		    case 2:
		    	inc = 6.0f;
		    	break;
		    case 3:
		    	inc = 8.5f;
		    	break;
		    case 4:
		    	inc = 11.0f;
		    	break;
		   
		    
		}
		
		float incre1=(sueldo * inc)/100;
		float n_sueldo=(float)(sueldo + incre1);
		
		System.out.println("\n=========== Resultados ==========");
		System.out.println(" Empleado.........: " + nombre);
		System.out.println(" Nivel.........: " + nivel);
		System.out.println(" Sueldo.........: " + sueldo);
		System.out.println(" Incremento.........: " + inc + "%"	);
		System.out.println(" Nuevo sueldo.........: " + df.format(n_sueldo) );

	}

}
