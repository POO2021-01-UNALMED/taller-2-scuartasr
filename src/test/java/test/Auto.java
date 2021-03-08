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
		List<Asiento> sillas = new ArrayList<Asiento>();
		for(Asiento sillita: asientos) {
			if (sillita != null) {
				sillas.add(sillita);
			}
		}
		boolean integro = true;
		if (sillas.get(0).registro != motor.registro || motor.registro != this.registro) {
			integro = false;
		}
		for (int i = 0; i < (sillas.size()-1); i++) {
			if (sillas.get(i) != sillas.get(i+1)) {
				integro = false;
				break;
			}
		}
		if (integro) {
			return "Auto original";
		}
		else {
			return "Las piezas no son originales";
		}
	}
}