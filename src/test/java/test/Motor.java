package test;

public class Motor {
	int numeroCilindros;
	String tipo;
	int registro;
	
	void cambiarRegistro(int registro) {
		this.registro = registro;
	}
	void asignarTipo(String tipo) {
		if (tipo == "electrico") {
			tipo = "electrico";
		}
		else if (tipo == "gasolina") {
			tipo = "gasolina";
		}
	}
}
