package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista {

	public static void main(String[] args) {

		List <String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2,"Marco");
		System.out.println(list.size());
		for(String x : list) {
			System.out.println(x);
		}
		System.out.println("====================");
		//list.remove(1);
		
		//Lambida nesta condi��o chamado de "Predicato"
		//removendo quem come�a com M
		list.removeIf(x -> x.charAt(0) == 'M');
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("====================");
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		
		//elemento n�o existente na lista
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		
		System.out.println("====================");
	
		//filtrando come�ando com a
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for(String x : result) {
			System.out.println(x);
		}
		
		System.out.println("====================");
		
		//encontrando o primeiro elemento que atenda o predicato
		//Utilizamos or orElse pois pode ocorrer de o retorno da fun��o ser vazio, dando erro de inicializa��o de vari�vel
		//TODO	orElse customiz�vel.
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
	}

}
