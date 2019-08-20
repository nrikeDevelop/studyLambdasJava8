package session4.exercicise35.PartitionBy;

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
		//PARTITIONBY RECOGE LA LISTA DEL STREAM Y LA DIVIDE EN DOS DEPENDIENDO DE LAS CONDICIONES
		
		Map<Boolean,List<Integer>> roomMayor10 = rooms.stream()
				.map(room->room.getCapacity())
				.collect(Collectors.partitioningBy(e->e > 10));
		
		Map<Boolean,List<Room>> roomMayor10Object = rooms.stream()
				.collect(Collectors.partitioningBy(room -> room.getCapacity() > 10));
		
		System.out.println("Mayor que 10");
		roomMayor10Object.get(true).stream().forEach(e->System.out.println(e.getName()+" "+e.getCapacity()));
		System.out.println("Menor que 10");
		roomMayor10Object.get(false).stream().forEach(e->System.out.println(e.getName()+" "+e.getCapacity()));
		
		
				
		
	}
}
