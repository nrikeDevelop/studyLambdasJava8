package session4.exercicise32.Joining;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import session4.list.Room;

public class Main {

	private static List<Room> rooms;

	private static void setUpUsers() {
		rooms = new ArrayList();
		rooms.add(new Room(1, "Informatica", 3));
		rooms.add(new Room(2, "Cochera", 20));
		rooms.add(new Room(3, "Despacho", 5));
		rooms.add(new Room(4, "Aula", 6));
	}

	private static int getNumeroRandom(int min, int max) {
		return ThreadLocalRandom.current().nextInt(min, max);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		setUpUsers();

		//JOINING SE ENCARGA DE UNIR LOS ELEMENTOS DE UN STREAM 
		String join = rooms.stream().map(room -> room.getName()).collect(Collectors.joining("  -  "));
		System.out.println(join);

	}
}
