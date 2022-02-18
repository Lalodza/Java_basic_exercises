/* Ejercicio 06b - Lista todos los argumentos que recibas, pero mostrando su posición:
 *
 * java Ejercicio06b hola como estás
 * 0) hola
 * 1) como
 * 2) estás
 */

public class Ejercicio06b {
	public static void main(String[] args) {
		for (int i = 0; i < args.length; i ++) {
			String s = args[i];
			System.out.println(i + ") " + s);
		}
	}
}