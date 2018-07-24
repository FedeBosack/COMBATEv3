package strategy;

import model.Jugador;
import model.Territorio;

public interface SituacionBehavior {
	public void combate(Jugador atacante,Jugador defensor,Territorio atacado,Territorio defendido);
}
