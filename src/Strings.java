public class Strings {

	public static void main(String args[]) {

		String palabraOriginal = new String("Luz AzuL");
		String palabra = new String(palabraOriginal); // Introducimos una serie
														// de palabras.
		palabra = palabra.toLowerCase(); // Convertimos todo a minusculas.
		palabra = palabra.replace(" ", ""); // Eliminamos los espacios en caso
											// de haberlos.
		// System.out.println(palabra); //Herramienta.
		int inicio = 0; // Seteamos los puntos de inicio y final de la palabra.
		int inicioInverso = palabra.length() - 1;
		boolean error = false; // Flag.
		while ((inicio < inicioInverso) && (!error)) { // Comprobamos la palabra
														// desde el inicio y
														// desde el final
														// comparando los
														// caracteres.
			if (palabra.charAt(inicio) == palabra.charAt(inicioInverso)) {
				inicio++;
				inicioInverso--;
			} else { // Si algun caracter no es igual, activamos el flag
				error = true;
			}
		}
		if (!error) // Mostramos mensaje al usuario.
			System.out.println(palabraOriginal + " es un palíndromo");
		else
			System.out.println(palabraOriginal + " no es un palíndromo");
	}
}