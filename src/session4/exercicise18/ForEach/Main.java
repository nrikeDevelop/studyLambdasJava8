package session4.exercicise18.ForEach;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import session4.list.User;

public class Main {

	private static List<User> users;

	// 1.CREAMOS LA LISTA
	private static void setUpUsers() {
		users = new ArrayList();
		users.add(new User(1, "Susy"));
		users.add(new User(2, "Firulais"));
		users.add(new User(3, "Geniberto"));
		users.add(new User(4, "Ataulfo"));
		users.add(new User(5, "Osvaldo"));
		users.add(new User(6, "Susy"));

	}

	private static void imprimirLista() {
		users.stream().forEach(user -> System.out.println(user.getId() + "   " + user.getName()));
	}

	// 2.EJECUTAMOS EL STREAM
	public static void main(String[] args) {
		setUpUsers();
		// Stream.of(users);
		// users.stream();
		
		//POR CADA USUARIO AÑADIRA "APELLIDO" A CADA ELEMENTO DE LA LISTA
		
		users.stream().forEach(user -> user.setName(user.getName() + " Apellido"));
		imprimirLista();

	}

}
