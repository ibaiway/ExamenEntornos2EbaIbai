import java.util.ArrayList;

public class Matematica {

	
	private int sumas[];
	

	
	/**
	 * Suma los numeros que se le introducen al metodo a traves de los parametros y devuelve el resultado de la operacion.
	 * 
	 * @param a Es el valor el cual se sumara al valor 'b'.
	 * @param b Es el valor el cual se sumara al valor 'a'.
	 * @return Devolvera la suma de los valores 'a' y 'b'.
	 */
	
	public int suma(int a, int b){
		int resultado;
		resultado = a + b;
		return resultado;
	}
		
	
	
	
	/**
	 * 
	 * Compara dos numeros y dice si es mayor o no.
	 * 
	 * @param a Es el valor el cual se comprobora si es mayor que el otro valor.
	 * @param b Es el valor con el que se comprobara 'a'
	 * @return Si 'a' es mayor que 'b' devolvera "true". Si 'a' no es mayor que 'b' devolvera "false".
	 */
	public boolean mayor(int a, int b){
		boolean resultado = false;
		if (a > b){
			resultado = true;
		}
		return resultado;
	}
	
	/**
	 * Devuelve todos los resultados de las sumas que se han hecho con anterioridad.
	 * @return Devuelve un Array de tipo int.
	 */
	
	public int[] sumas(){
		
		int sumas[] = getSumas();
		return sumas;
	}


/*
 * GETTERS & SETTERS
 */

	public int[] getSumas() {
		return sumas;
	}

	public void setSumas(int[] sumas) {
		this.sumas = sumas;
	}
	
}
