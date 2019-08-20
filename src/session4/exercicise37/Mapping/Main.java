package session4.exercicise37.Mapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
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
		rooms.add(new Room(3, "Cocinas", 20));
		rooms.add(new Room(4, "Asesoria", 3));
		rooms.add(new Room(5, "Informatica", 6));
		rooms.add(new Room(6, "Asesoria", 6));
		rooms.add(new Room(7, "Ajustes", 6));
	}

	private static int getNumeroRandom(int min, int max) {
		return ThreadLocalRandom.current().nextInt(min, max);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		setUpUsers();
		//GROUPINGBY ORDENA UN STREAM EN MAPS DEPENDIENDO DE LAS CONDICIONES
		
		Map<Character,List<Room>> grupoAlfabetico = rooms.stream()
				.collect(Collectors.groupingBy(e->new Character(e.getName().charAt(0))));
		
		System.out.println("Orden Alfabetico");
		grupoAlfabetico.get('I').stream().forEach(e->System.out.println(e.getName()));
		grupoAlfabetico.get('C').stream().forEach(e->System.out.println(e.getName()));

		
		Map<String,List<Room>> grupoType = rooms.stream()
				.collect(Collectors.groupingByConcurrent(room->room.getName()));
		System.out.println("String tipo");
		grupoType.get("Informatica").stream().forEach(e->System.out.println("Tipo Informatica"+e.getCapacity()));
		grupoType.get("Cocinas").stream().forEach(e->System.out.println("Tipo Cocina"+e.getCapacity()));



	}
}
