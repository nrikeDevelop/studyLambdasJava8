package session3.SetUp;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		//SE DEBE CREAR LA INTERFAZ TRABAJO
		//METODO ESTATICO
		Trabajo t1 = () -> User.referenciaAMertodoEstatico();
		Trabajo t1MR = User::referenciaAMertodoEstatico;
		
		t1.accion();
		
		//MÉTODO PARTICULAR
		User user = new User("susy");
		
		Trabajo t2 = () -> user.referenciaAMetodoParticular();
		Trabajo t2MR = user::referenciaAMetodoParticular;
		
		t2.accion();
		
		//SE DEBE CREAR LA INTERFAZ TRABAJOSTRING
		//MÉTODO DE REFERENCIA A OBJETO
		TrabajoString ts = (palabra) -> palabra.toUpperCase();
		TrabajoString tsMR = String::toUpperCase;
		
		System.out.println(tsMR.accion("susy"));
		
		List<User> users = new ArrayList();
		users.add(new User("user1"));
		users.add(new User("user2"));
		users.add(new User("user3"));
		users.add(new User("user4"));

		users.forEach(nombre -> nombre.mostrarNombre());
		users.forEach(User::mostrarNombre);
		
		//SE HA CREADO LA INTERFAZ IUSER
		//REFERENCIA A UN CONSTRUCTOR
		
		Iuser iuser = (nombre)-> new User(nombre);
		Iuser iuser2 = User::new;
		
		iuser.crear("susy");
		
		
		
	}

}
