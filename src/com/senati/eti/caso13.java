package com.senati.eti;

import java.util.Scanner;

public class caso13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		  
		  System.out.print("Ingrese primer n�mero: ");
		  float n1 = sc.nextFloat();
		  System.out.print("Ingrese primer n�mero: ");
		  float n2 = sc.nextFloat();
		  System.out.print("Operaci�n [1-6]: ");
		  int op = sc.nextInt();
		  String operacion = "";
		  float rs = 0.0f;
		  switch(op) { 
		         case 1:
		          operacion = "Suma";
		       rs = n1 + n2;
		          break;
		         case 2:
		          operacion = "Resta";
		       rs = n1 - n2;
		          break;
		         case 3:
		          operacion = "Multiplicaci�n";
		       rs = n1 * n2;
		          break;
		         case 4:
		          if (n2 != 0) {
		           operacion = "Divisi�n";
		        rs = n1 / n2;
		        }
		        else {
		        operacion = "No es posible dividir";
		        }
		           break;
		         case 5:
		           if (n2 != 0) {
		        operacion = "Resto Entero";
		        rs = n1 % n2;
		       }
		       else {
		        operacion = "No es posible hallar el resto entero";
		       }
		          break;
		         case 6:
		          operacion = "Promedio";
		       rs = (n1 + n2) / 2;
		          break;
		         default:
		          operacion = "Ninguna";
		     }
		  System.out.println("\n========== RESULTADOS==========");
		  System.out.println("N�mero 1......: " + n1);
		  System.out.println("N�mero 2......: " + n2);
		  System.out.println("Operaci�n.....: " + operacion);
		  System.out.println("Resultado.....: " + rs);

	}

}