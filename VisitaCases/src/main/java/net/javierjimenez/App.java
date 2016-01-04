package net.javierjimenez;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author alumne1daw
 *
 */
public class App {

	/**
	 * String que conte la ruta al fitxer que llegirem.
	 */
	private static String RUTA_CASES = "/ruta.txt";

	/**
	 * Metode principal on llegirem el fitxer de resources i on comprobarem la
	 * ruta que segueix el sustitut del Pare Noel.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		BufferedReader mapa = null;

		try {

			String rutaMapa;

			rutaCases RC = new rutaCases();

			mapa = new BufferedReader(
                    new InputStreamReader(App.class.getResource(RUTA_CASES).openStream()));

			int totalCases = 0;

			while ((rutaMapa = mapa.readLine()) != null) {
				
				totalCases = RC.rutaMapa(rutaMapa);
			}

			System.out.println("Total cases visitades: " + totalCases);

		} catch (IOException e) {

			e.printStackTrace();

		} catch (Exception e) {

			e.printStackTrace();

		} finally {

			try {

				if (mapa != null)
					mapa.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}
		}
	}
}
