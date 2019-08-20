package session4.exercicise34.SumarizingDouble;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
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
		
		//SUMMARIZINGDOUBLE NOS DEVUELVE ESTADISTICAS DEL STREAM
		//METHOD 1
		DoubleSummaryStatistics statistics = rooms.stream()
				.collect(Collectors.summarizingDouble(room -> room.getCapacity()));
		
		System.out.println("Method 1    Media :"+statistics.getAverage()+"\nMaximo:"+statistics.getMax()+"\nSuma:"+statistics.getSum());

		//METHOD 2 
		DoubleSummaryStatistics statistics2 = rooms.stream()
				.mapToDouble(room->room.getCapacity())
				.summaryStatistics();
		
		System.out.println("Method 2   Media :"+statistics2.getAverage()+"\nMaximo:"+statistics2.getMax()+"\nSuma:"+statistics2.getSum());

	}
}
