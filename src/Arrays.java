public class Arrays {
	public static void main(String args[]) {

		// Para M<N -> int valorEntero = (int)
		// Math.floor(Math.random()*(N-M+1)+M);

		int coordenadas[][];
		coordenadas = new int[25][2];

		for (int i = 0; i <= 24; i++) {
			coordenadas[i][0] = (int) Math.floor(Math.random() * (11) - 5); // Coordenada
																			// X.
			coordenadas[i][1] = (int) Math.floor(Math.random() * (11) - 5); // Coordenada
																			// Y.
			System.out.print("(" + coordenadas[i][0] + "," + coordenadas[i][1] + ")  ");
			int n = i + 1;
			if (n % 5 == 0) // Saltar la linea despues de representar 5 puntos.
				System.out.printf("\n\n");
		}
		int recuento = Arrays.recuentoPuntosSobreEje(coordenadas, 'X');
		System.out.print("Puntos sobre el eje X: " + recuento);
		// System.out.print("Puntos sobre el eje X: " +
		// Array.recuentoPuntosSobreEje(coordenadas, 'X') );
		recuento = Arrays.recuentoPuntosSobreEje(coordenadas, 'Y');
		System.out.println("	   Puntos sobre el eje Y :" + recuento);
	}

	private static int recuentoPuntosSobreEje(int array[][], char eje) {
		int contador = 0;
		if (eje == 'X') {
			for (int i = 0; i <= 24; i++) {
				if (array[i][1] == 0)
					contador++;
			}
			return contador;
		} else {
			for (int i = 0; i <= 24; i++) {
				if (array[i][0] == 0)
					contador++;
			}
			return contador;
		}
	}
}