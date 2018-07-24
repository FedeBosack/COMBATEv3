package strategy;

import model.Jugador;
import model.Territorio;

public class SituacionNieve implements SituacionBehavior {	
	public void combate(Jugador atacante,Jugador defensor,Territorio atacado,Territorio defendido){
		atacante.ejercitoPerdido();//pierde un ejercito
		defendido.setEjercitos(2);//dos ejercitos mas
	}
}