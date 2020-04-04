package lab12;

import java.io.Serializable;

public class Usuario implements Serializable {
	private String nombre;
	private transient String password;
	
	public Usuario(String nombre, String password) {
		this.nombre = nombre;
		this.password = password;
	}

	public String toString() {
		String pwd = (password == null) ? "(n/a)" : password;
		return "Informaci�n Usuario: \n    Nombre: " + nombre + "\n Contrase�a: "+ pwd;
	}
	
	
}
