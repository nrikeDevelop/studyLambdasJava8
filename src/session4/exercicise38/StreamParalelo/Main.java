package session4.exercicise38.StreamParalelo;

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
	
	private static String convertir(String nombre) {
		String retName ="";
		try {
			Thread.sleep(1000);
			retName = nombre.toUpperCase();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return retName;
		
	}
	
	public static void main(String[] args) {
		setUpUsers();
		//PARALLELSTREAM SE ENCARGA DE DIVIDIR LAS ACCIONES EN STREAMS PARA FACILITAR LOS TIEMPOS
		System.out.println("\nStrema");
		long startTime = System.currentTimeMillis();
		rooms.stream().forEach(e->System.out.println("Nombre : "+convertir(e.getName())));
		long stopTime = System.currentTimeMillis();
		System.out.println(stopTime-startTime+" milisegundos empleados");
		
		System.out.println("\nParallelStream");
		startTime = System.currentTimeMillis();
		rooms.parallelStream().forEach(e->System.out.println("Nombre : "+convertir(e.getName())));
		stopTime = System.currentTimeMillis();
		System.out.println(stopTime-startTime+" misidegundos empleados");



	}
}
