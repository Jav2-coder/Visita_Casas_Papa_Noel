package net.javierjimenez;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App {

	private static String RUTA_CASAS = "/ruta.txt";

	public static void main(String[] args) {
		
		BufferedReader mapa = null;

		try {

			mapa = new BufferedReader (new FileReader(App.class.getResource(RUTA_CASAS).getFile()));

			String rutaMapa = mapa.readLine();
			
			rutaCasas RC = new rutaCasas(rutaMapa);

			int totalCases = RC.rutaMapa();

			System.out.println("Total cases visitades: " + totalCases);

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if(mapa != null) mapa.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}
		}
	}
}
