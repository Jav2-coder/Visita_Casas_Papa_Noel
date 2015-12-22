package net.javierjimenez;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * @author alumne1daw
 *
 */
public class rutaCases {

	/**
	 * String que conte la ruta a seguir per visitar les cases.
	 */
	private String ruta;

	/**
	 * Constructor de l'objecte rutaCases.
	 * 
	 * @param mapa String que conte la ruta de cases a visitar.
	 */
	public rutaCases(String mapa) {

		ruta = mapa;

	}

	/**
	 * Metode que comproba les cases per les que hem passat i que, si tornem a
	 * passar per una casa que ja hem visitat, no la contem.
	 * 
	 * @return Int que conté el total de cases visitades sense repetir.
	 */
	public int rutaMapa() {

		int x = 0;
		int y = 0;

		Set<String> cases = new HashSet<String>();

		for (int i = 0; i < ruta.length(); i++) {

			if (ruta.charAt(i) == '>') {

				cases.add("Casa (" + x + ", " + y + ")");
				x++;

			} else if (ruta.charAt(i) == '<') {

				cases.add("Casa (" + x + ", " + y + ")");
				x--;

			} else if (ruta.charAt(i) == '^') {

				cases.add("Casa (" + x + ", " + y + ")");
				y++;

			} else if (ruta.charAt(i) == 'v') {

				cases.add("Casa (" + x + ", " + y + ")");
				y--;

			}
		}

		return cases.size();
	}
}
