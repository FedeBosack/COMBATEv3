package strategy;

import model.Jugador;
import model.Territorio;

public class SituacionVientoAFavor implements SituacionBehavior {	
	public void combate(Jugador atacante,Jugador defensor,Territorio atacado,Territorio defendido){
		atacante.añadirEjercitos(2);
		atacado.setEjercitos(2);
	}
}