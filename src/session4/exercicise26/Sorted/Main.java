package session4.exercicise26.Sorted;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import session4.list.Room;
import session4.list.User;

public class Main {

	private static List<User> users;
	private static List<User> users2;

	private static void setUpUsers() {
		users = new ArrayList();
		users.add(new User(1, "Susy"));
		users.add(new User(2, "Firulais"));
		users.add(new User(3, "Geniberto"));
		users.add(new User(4, "Ataulfo"));
		users.add(new User(5, "Osvaldo"));
		users.add(new User(6, "Susy"));
	}

	
	private static int getNumeroRandom(int min, int max) {
		return ThreadLocalRandom.current().nextInt(min, max);
	}

	public static void main(String[] args) {
		setUpUsers();

		// SORTED : ORDENA por campo
		List<User> usersSkip = users.stream()
				.sorted(Comparator.comparing(user -> user.getName()))
				.collect(Collectors.toList());
		
		usersSkip.stream().forEach(x -> System.out.println("Compare : " + x.getName()));
		
	}

}
