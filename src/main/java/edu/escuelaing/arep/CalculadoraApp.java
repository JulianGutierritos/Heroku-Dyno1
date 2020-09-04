package edu.escuelaing.arep;

/**
 * Es una calculadora que dado un archivo con una fila de datos, calcula la media y desviación estandar de estos.
 * @author Julian Gutierrez
 * @version 1.0 
 */
public class CalculadoraApp {

    /**
	 * Metodo que calcula una funcion matematica aplicada a un numero
	 * 
	 * @param funcion que se quiere realizar
	 * @param numero  al que se le aplicara la funcion
	 * @throws Exception si la funcion no existe 
	 */
	public static String getTrig(String funcion, double numero) throws Exception {
		double res = 0;
		if (funcion.equals("cos")){
			res = Math.cos(numero);
		}
		else if (funcion.equals("sen")){
			res = Math.sin(numero);
		}
		else if (funcion.equals("tan")){
			res = Math.tan(numero);
		}
		else{
			throw new Exception("Funcion no encontrada");
		}
		return "{ \"resp\": " + res + " }";
		
    }
	
}