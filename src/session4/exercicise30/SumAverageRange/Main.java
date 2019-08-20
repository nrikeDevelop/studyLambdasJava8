package session4.exercicise30.SumAverageRange;

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

		double average = rooms.stream().mapToInt(user -> user.getCapacity()).average().orElse(0);
		int sum = rooms.stream().mapToInt(user -> user.getCapacity()).sum();
		int range = IntStream.range(0, 20).sum();

		System.out.println("Media de los ocupantes de la sala :" + average);
		System.out.println("Suma de los ocupantes de la sala :" + sum);
		System.out.println("Suma del rango entre 0 y 20 : " + range);

	}
}
