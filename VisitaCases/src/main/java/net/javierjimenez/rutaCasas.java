package net.javierjimenez;

import java.util.HashSet;
import java.util.Set;

public class rutaCasas {

	private static String ruta;
	
	public rutaCasas(String mapa) {
		
		ruta = mapa;
		
	}
	
	public int rutaMapa() {
		
		int x = 0; 
		int y = 0;
		
		Set<String> cases = new HashSet<String>();
		
		for (int i = 0; i < ruta.length(); i++) {
			
			if(ruta.charAt(i) == '>'){
				
				cases.add("Casa (" + x + ", " + y + ")");
				x++;
				
			} else if (ruta.charAt(i) == '<'){
				
				cases.add("Casa (" + x + ", " + y + ")");
				x--;
				
			} else if (ruta.charAt(i) == '^'){
				
				cases.add("Casa (" + x + ", " + y + ")");
				y++;
				
			} else if (ruta.charAt(i) == 'v'){
				
				cases.add("Casa (" + x + ", " + y + ")");
				y--;
				
			}	
		}
		
		return cases.size();
	}
}
