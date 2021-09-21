package br.com.pontodecisao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.classes.Animal;

public class Hashs {

	public static void main(String[] args) {
		
		HashMap<String, String> capitais = new HashMap<String, String>();

	    // Add keys and values (Country, City)
		capitais.put("Inglaterra", "Londres");
		capitais.put("Alemanha", "Berlin");
		capitais.put("Noruega", "Oslo");
		capitais.put("USA", "Washington DC");
	    System.out.println(capitais);
	    System.out.println(capitais.get("USA"));
	    System.out.println(capitais.entrySet());
	    System.out.println(capitais.remove("Noruega"));
	    System.out.println(capitais.entrySet());

	    HashMap<String, List<Animal>> animais = new HashMap<String, List<Animal>>();
	    
	    Animal a1 = new Animal("Leão Ruivo", BigDecimal.TEN, "Ruivo", BigDecimal.TEN, 4, Boolean.TRUE);
		Animal a2 = new Animal("Cavalo", BigDecimal.ZERO, "Preto", BigDecimal.TEN, 4, Boolean.FALSE);
		Animal a5 = new Animal("Leão Doido", BigDecimal.TEN, "Doido", BigDecimal.TEN, 4, Boolean.TRUE);
	    
		List<Animal> listaCarnivoros = new ArrayList<Animal>();
		listaCarnivoros.add(a1);
		listaCarnivoros.add(a5);
		
		List<Animal> listaHerbivoro = new ArrayList<Animal>();
		listaHerbivoro.add(a2);
		animais.put("Carnivoro", listaCarnivoros);
		animais.put("Herbivoro", listaHerbivoro);


		for(Map.Entry<String, List<Animal>> entry : animais.entrySet()) {
		    String key = entry.getKey();
		    List<Animal> value = entry.getValue();

		    System.out.println(key);
		    System.out.println(value.toString());
		}
		
	    
	    
	}
	
}
