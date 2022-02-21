package examenrefactorizado;

/*@author: David Lozano
 * @version: 1.1
 * @since: 21/02/2022
 * 
 */

public class ejercicio5 extends variables {
	
	public static void main(String[] args) {
		x = 4;							//
		y = 7;							// en estas tres lineas se esta declarando las variables 
		z = x + y;						//
		mensaje(); 						//llava a la funcion "mensaje"
		
	}

	public static void mensaje() {
		System.out.println("la suma de la variable x y la variable y es igual a " + z); //esta linea sirve para imprimir por pantalla la frase que estamos viendo
	}

}
