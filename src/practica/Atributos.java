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
public class Atributos {
    /**
     * Método constructor de la clase que hemos definido para los atributos
     */
    public Atributos(){
		contador = new int[65536];
		letras = new char[65536];
		palabras = 1;
	}
         static protected int [] contador;
	 static protected char [] letras;
	 static protected int palabras;
	 static protected int numCaracteresSinBlancos = 0;
}
