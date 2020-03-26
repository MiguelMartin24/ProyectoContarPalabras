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
public class ImprimirResultados extends Atributos {
    
         static final String TEXTO_LETRAS= "Las letras que se repiten son:";
	 static final String TEXTO_PALABRAS= "Se han ingresado ";
	 static final String TEXTO_FINAL_PALABRAS= " palabras.";
	 static final String TEXTO_TOTAL_CARACTERES_SIN_BLANCOS= "Se han introducido un total de ";
	 static final String TEXTO_FINAL_TOTAL_CARACTERES_SIN_BLANCOS= " caracteres(sin contar los blancos).";
	 static final String TEXTO_PEDIR_CADENA= "Introduzca un conjunto de caracteres:";
	
        static public void textoCaracteresTotal(int total){
        System.out.println(TEXTO_TOTAL_CARACTERES_SIN_BLANCOS + numCaracteresSinBlancos + TEXTO_FINAL_TOTAL_CARACTERES_SIN_BLANCOS);
    
        }
        
        static public void textoNumeroPalabras(int total){
        System.out.println(TEXTO_PALABRAS + palabras + TEXTO_FINAL_PALABRAS);
      
               
        }
        static public void textoTodosCaracteres(int [] total){
            System.out.println(TEXTO_LETRAS);
		for (int i = 0;i<letras.length;i++) { //Recorro el array y muestro todo.
			if (contador[i]>0 && letras[i] != ' ') {
				if (contador[i]==1)
					System.out.println(""+letras[i]+ "-->" + contador[i] + " vez.");
				else
					System.out.println(""+letras[i]+ "-->" + contador[i] + " veces.");
			}
		}
    
        }
}
