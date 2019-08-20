package session4.exercicise24.Count;

import java.util.ArrayList;
import java.util.Arrays;
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

		//COUNT : CUENTA LOS ELEMENTOS FILTRADOS
		List<User> userPeek2 = users.stream().peek(user -> user.setId(getNumeroRandom(1,4))).filter(user->user.getId() == 2).collect(Collectors.toList());
		userPeek2.stream().forEach(x -> System.out.println(x.getId()+"   "+x.getName()));
		
		System.out.println("Total contados : "+userPeek2.stream().count());

	}

}
