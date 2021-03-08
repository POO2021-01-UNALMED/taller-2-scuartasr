package test;

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
	String verificarIntegridad() {
		boolean integro = true;
		
		// Verificación del registro de asientos 'no nulos'
		
		for (int i = 0; i < asientos.length; i++) {
			if (asientos[i] != null) {
				if (asientos[i].registro != registro) {
					integro = false;
				}
			}
		}
		
		// Verificación del registro del motor
		if (motor.registro != registro) {
			integro = false;
		}
		if(integro) {
			return "Auto original";
		}
		else {
			return "Las piezas no son originales";
		}
	}
}