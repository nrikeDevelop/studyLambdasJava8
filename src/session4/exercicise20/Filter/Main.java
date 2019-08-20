package session4.exercicise20.Filter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
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
		
		//3.Filter : DEL FLUJO DE DATOS DEVUELVE LA LISTA FILTRADA 
		//EJ: RECOGER AQUELLOS QUE SEAN DE ID MAYOR DE 2 Y NOMBRE DIFERENTE DE SUSY
		
		List<User> filterList = users.stream()
				.filter(user->user.getName()!="Susy")
				.filter(user->user.getId() > 2)
				.collect(Collectors.toList());
		
		filterList.stream().forEach(user->System.out.println(user.getId()+"   "+user.getName()));
		
	}

}
