package session2.exercise6;

public interface PorDefecto {

	//Esto siempre se implementa en las demas versiones
	//void mostrarNombre(String Nombre);
	
	default String nombrePorDefecto(String nombre) {
		return nombre + " por defecto";
	}
}
