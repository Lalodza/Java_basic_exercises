public class TareaSimplificaIfsSol {
	private static final String CANTA = "CANTA";
	private static final String LADRA = "LADRA";

	public static void main(String[] args) {
		boolean hayArgumentos = args.length > 0;

		if (!hayArgumentos) { // (3)
			System.err.println("No tengo argumentos");
			return;
		}
		
		int numArgumentos = args.length;

		String primerArgumento = args[0];
		if (primerArgumento.equals(CANTA)) { // (5)
			System.out.println("Un, dos, tres, un pasito palante María!");
		} else if (LADRA.equals(primerArgumento)) { // (6)
			boolean faltaNombre = numArgumentos <= 1; // negamos la condición o giramos el >
			if (!faltaNombre) { // (7)-(8)
				String nombrePerro = args[1];
				System.out.println("Bub bub bub");
				System.out.println("Hola " + nombrePerro);						
			} else {
				System.out.println("Grr grr grr");
				System.out.println("No sé como te llamas");						
			}
		} else {
			System.err.println("No sé que quieres que haga");
		}
	}
}