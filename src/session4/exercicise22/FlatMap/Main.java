package session4.exercicise22.FlatMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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

	public static void main(String[] args) {
		setUpUsers();
		setUpRooms();

		//FLATMAP RECIBE DATOS DE DIFERENTES ARRAYS Y LOS CONCATENA EN DIFERENETES STRINGS

		//EJEMPLO 1: LISTA DE USERS COMO LISTA DE STRING
		List<String> sUsers = users.stream().filter(e->e.getName()!="Susy").map(e->e.getName()).collect(Collectors.toList());		
		List<List<String>> nombreDeVariasListas = new ArrayList<List<String>>(Arrays.asList(
				// new ArrayList<String>(Arrays.asList("Monica","Juanma")),
				sUsers,
				new ArrayList<String>(Arrays.asList("Monica", "Juanma","Other")
		)));
		
		List<String> nombreUnicaLista = nombreDeVariasListas.stream().flatMap(e->e.stream()).collect(Collectors.toList());
		nombreUnicaLista.stream().forEach(x->System.out.println(x));
		
		//EJEMPLO2: LISTA DE USERS COMO OBJETO USER
		
		List<List<User>> listUsers = new ArrayList<List<User>>();
		listUsers.add(users);
		listUsers.add(users2);
		
		List <User> resolveListlisUsers = listUsers.stream().flatMap(e->e.stream()).collect(Collectors.toList());
		resolveListlisUsers.stream().forEach(x->System.out.println("EJ2: "+x.getName()));
		
		

	}

}
