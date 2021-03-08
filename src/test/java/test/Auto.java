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
		return asientos.length;		
	}
	public String verificarIntegridad() {
		boolean integro = true;
		if (asientos[0].registro != motor.registro || motor.registro != this.registro) {
			integro = false;
		}
		for (int i = 0; i < (asientos.length - 1); i++) {
			if (asientos[i] != asientos[i+1]) {
				integro = false;
				break;
			}
		}
		if (integro) {
			return "Auto original";
		}
		else {return "Las piezas no son originales";}
	}
}