package session4.exercicise29.AllMatchAnyMatchNoneMatch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import session4.list.Room;

public class Main {

	private static List<Room> rooms;

	private static void setUpUsers() {
		rooms = new ArrayList();
		rooms.add(new Room(1, "Informatica",3));
		rooms.add(new Room(2, "Cochera",3));
		rooms.add(new Room(3, "Despacho",3));
		rooms.add(new Room(4, "Aula",3));
	}

	
	private static int getNumeroRandom(int min, int max) {
		return ThreadLocalRandom.current().nextInt(min, max);
	}

	public static void main(String[] args) {
		setUpUsers();

		// ALLMATCH : VERIFICA SI EL PREDICADO ES VERDADERO
		
		List <Integer> capacity = rooms.stream().map(room->room.getCapacity()).collect(Collectors.toList());
		
		int condition1 = 2;
		boolean allMatchCaqpacity = capacity.stream().allMatch(e -> e > condition1);
		if(allMatchCaqpacity) {
			System.out.println("Todas las salas tienen mas de "+condition1);
		}else {
			System.out.println("No todas las salas tiene mas de "+condition1 );
		}
		
		int condition2 = 2;
		boolean anyMatchCaqpacity = capacity.stream().anyMatch(e -> e > condition2);
		if(anyMatchCaqpacity) {
			System.out.println("Algunas de las salas tienen mas de "+condition2);
		}else {
			System.out.println("Ninguna de las salas tiene mas de "+condition2 );
		}
		
		int condition3 = 4;
		boolean noneMatchCaqpacity = capacity.stream().noneMatch(e -> e == condition3);
		if(noneMatchCaqpacity) {
			System.out.println("Ninguna de las salas tienen "+condition3);
		}else {
			System.out.println("Todas las salas tiene mas de "+condition3);
		}
		
	}
}
