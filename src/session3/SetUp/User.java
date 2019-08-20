package session3.SetUp;

public class User {

	private String nombre;

	public User(String nombre) {
		super();
		this.nombre = nombre;
	}

	public static void referenciaAMertodoEstatico() {
		System.out.println("Ejemplo de referencia a Método Estatico");
	}

	public void referenciaAMetodoParticular() {
		System.out.println("Ejemplo de referencia a Método de Objeto Particular");
	}

	public void mostrarNombre() {
		System.out.println(nombre);
	}
}
