/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

import java.util.Scanner;

/**
 *
 * @author migue
 */
public class Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
		System.out.println("Introduce una cadena de caracteres");
		String cadena = scan.nextLine();
                
                //Creamos objetos
                ContarPalabras contarp=new ContarPalabras();
                ImprimirResultados imprimirR=new ImprimirResultados();
                
    
                imprimirR.textoCaracteresTotal(contarp.contarCaracteresTotal(cadena));
                imprimirR.textoNumeroPalabras(contarp.contarNumeroPalabras(cadena));
                imprimirR.textoTodosCaracteres(contarp.contarTodosCaracteres(cadena));
                

                
                
		
	}
	
	
	
	
      

}
