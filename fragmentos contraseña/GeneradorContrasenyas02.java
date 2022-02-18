public class GeneradorContrasenyas02 {
	private static final String CONSONANTES = "bcdfghjklmnpqrstvwxyz";
	private static final String VOCALES = "aeiou";
	private static final String NUMEROS = "0123456789";
	private static final String SIMBOLOS = "!@#$€&/\\ºª()=?*+-,;.:><\"\'";
	
	private static final int NUM_PARES = 3;
	private static final int NUM_NUMS = 2;
	private static final int NUM_SIMB = 1;

	public static void main(String[] args) {
		
	}
	
	private static String generaPar() {
		String par = "";
		par += getAlea(VOCALES);
		par += getAlea(CONSONANTES);
		return par;
	}

	private static char getAlea(String opciones) {
		int pos = (int)(Math.random() * opciones.length());
		return opciones.charAt(pos);
	}
}