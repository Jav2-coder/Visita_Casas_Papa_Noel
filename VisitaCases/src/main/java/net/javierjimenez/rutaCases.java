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
	 * Set que contindra tots els Strings de cada casa visitada.
	 */
	private Set<String> cases = new HashSet<String>();

	/**
	 * Int que conté la posició x de la casa visitada
	 */
	private int x = 0;

	/**
	 * Int que conté la posició y de la casa visitada
	 */
	private int y = 0;

	/**
	 * Constructor de l'objecte rutaCases.
	 * 
	 */
	public rutaCases() {

	}

	/**
	 * Metode que comproba les cases per les que hem passat i que, si tornem a
	 * passar per una casa que ja hem visitat, no la contem.
	 * 
	 * @return Int que conté el total de cases visitades sense repetir.
	 */
	public int rutaMapa(String ruta) {

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
