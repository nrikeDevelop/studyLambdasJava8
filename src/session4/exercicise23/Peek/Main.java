package session4.exercicise23.Peek;

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

	private static void setUpRooms() {
		users2 = new ArrayList();
		users2.add(new User(1, "Susy2"));
		users2.add(new User(2, "Firulais2"));
		users2.add(new User(3, "Geniberto2"));
		users2.add(new User(4, "Ataulfo2"));
		users2.add(new User(5, "Osvaldo2"));
		users2.add(new User(6, "Susy2"));
	}

	private static int getNumeroRandom(int min, int max) {
		return ThreadLocalRandom.current().nextInt(min, max);
	}

	public static void main(String[] args) {
		setUpUsers();
		setUpRooms();

		// PEEK: ES COMOI FOREACH(FINAL) SIN EMBARGO ESTE NO ES FINAL, DA PASO A
		// REALIZAR MÁS FILTROS
		// EJEMPLO 1: LISTAMOS Y AÑADIMOS LA PALAGRA APELLIDO
		List<User> userPeek = users.stream().peek(user -> user.setName(user.getName() + " Apellidos"))
				.collect(Collectors.toList());
		// userPeek.stream().forEach(x-> System.out.println(x.getName()));

		// EJEMPLO 2: LISTAMOS, CAMBIAMOS EL ID POR UNO RANDOM, Y RECOGEMOS AQUELLOS QUE SEAN IGUAL A 2
		List<User> userPeek2 = users.stream().peek(user -> user.setId(getNumeroRandom(1,4))).filter(user->user.getId() == 2).collect(Collectors.toList());
		userPeek2.stream().forEach(x -> System.out.println(x.getId()+"   "+x.getName()));

	}

}
