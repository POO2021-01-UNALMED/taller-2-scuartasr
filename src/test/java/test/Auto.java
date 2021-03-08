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
		// Tomar únicamente los elementos no-null de Asientos en la lista sillas
		List<Asiento> sillas = new ArrayList<Asiento>();
		for(Asiento sillita: asientos) {
			if (sillita != null) {
				sillas.add(sillita);
			}
		}
		// Tomar los registros de las diferentes sillas.
		int[] registros = new int[sillas.size()];
		for(int j = 0; j < sillas.size(); j++) {
			registros[j] = sillas.get(j).registro;
		}
		// Definición de un booleando y chequeo de los registros
		boolean integro = false;		
		for (int i = 1; i < registros.length; i++) {
			if (registros[i] == registros[0] && registros[0] == motor.registro && this.registro == motor.registro) {
				integro = true;
			}
		}
		if (!integro) {
			return "Auto original";
		}
		else {
			return "Las piezas no son originales";
		}
	}
}