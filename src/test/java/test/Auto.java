package test;
import java.util.*;
public class Auto {
	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados;
	
	int cantidadAsientos() {
		int contador = 0;
		for (int i = 0; i < asientos.length; i++) {
			if (asientos[i] != null) {
				contador++;
			}					
		}
		return contador;
	}
	public String verificarIntegridad() {
		boolean integro = false;
		// Verificación de los asientos
		for(int i = 0; i < asientos.length; i++) {
			if(asientos[i] != null) {
				if (asientos[i].registro == this.registro && this.registro == motor.registro) {
					integro = true;
				}
			}
		}
		if(!integro) {
			return "Auto original";
		}
		else {
			return "Las piezas no son originales";
		}
	}
}