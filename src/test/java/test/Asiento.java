package test;

public class Asiento {
	String color;
	int precio;
	int registro;
	
	void cambiarColor(String col) {
		if (col=="rojo"||col=="verde"||col=="amarillo"||col=="negro"||col=="blanco") {
			this.color = col;
		}
	}
}
