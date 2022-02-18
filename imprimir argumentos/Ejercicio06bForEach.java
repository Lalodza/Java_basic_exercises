/* Ejercicio 06b - Lista todos los argumentos que recibas, pero mostrando su posición:
 * Usando for each
 * java Ejercicio06bForEach hola como estás
 * 0) hola
 * 1) como
 * 2) estás
 */

public class Ejercicio06bForEach {
	public static void main(String[] args) {
		int i = 0;
		for (String s : args) {
			System.out.println(i + ") " + s);
			i ++;
		}
	}
}