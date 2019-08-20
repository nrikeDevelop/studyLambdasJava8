package session4.exercicise28.Distinct;

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
		rooms.add(new Room(1, "Informatica",300));
		rooms.add(new Room(2, "Cochera",20));
		rooms.add(new Room(3, "Despacho",220));
		rooms.add(new Room(4, "Aula",3));
		rooms.add(new Room(1, "Informatica",300));
		rooms.add(new Room(2, "Cochera",20));
		rooms.add(new Room(1, "Informatica",300));
		rooms.add(new Room(2, "Cochera",20));
	
	}

	
	private static int getNumeroRandom(int min, int max) {
		return ThreadLocalRandom.current().nextInt(min, max);
	}

	public static void main(String[] args) {
		setUpUsers();

		// DISTINCT
		// RECOGEMOS TODOS LOS VALORE A COMPARAR EN UNA LISTA Y SEGIDAMENTE LOS ANALIZAMOS CON DISTINCT
		List <String> rommsDistinct = new ArrayList();
		rommsDistinct = rooms.stream()
				.map(room -> room.getName())
				.distinct()
				.collect(Collectors.toList());		
		rommsDistinct.stream().forEach(e -> System.out.println(e));
	}
}
