/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

/**
 *
 * @author migue
 */
public class ContarPalabras extends Atributos{
        int contarNumeroPalabras(String cadena){
       	char car2 = ' ';
		for (int i = 0;i<cadena.length();i++){ //Se recorre la cadena
			char car = cadena.charAt(i);
			int ascii = car; 
                        letras[ascii] = car; //Innecesario pero por claridad mejor ponerlo
			if (car == ' ' && car2!=' ') { // Aumento el contador de palabras
				palabras++;
			}
			car2 = car;
                       
 		}
                 return palabras;
	}
        int contarCaracteresTotal(String cadena){
		for (int i = 0;i<cadena.length();i++){ //recorro la cadena
			char car = cadena.charAt(i); //Se obtiene el valor de la posición de i en la cadena
			if (car != ' ') numCaracteresSinBlancos++; //Aumento el contador caracteres sin blancos
        
                 }
                return numCaracteresSinBlancos;
        }
    
        int [] contarTodosCaracteres(String cadena){
        for (int i = 0;i<cadena.length();i++){ //Se recorre la cadena
			char car = cadena.charAt(i); //Obtengo el valor de la posicion i del for en la cadena
			int ascii = car; 
                        contador[ascii]++;
        }
        return contador;
        }
        
}
