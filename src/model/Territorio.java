
package model;

import controller.Subject;
import static controller.JuegoCombate.observadores;
import static controller.JuegoCombate.territorios;
import model.Jugador;
import java.lang.reflect.Array;
import view.Observer;


public class Territorio 
{   
    
	protected int id;
        private int x;
        private int y;
	private String nombre;
	private Jugador jugador;
	private int ejercitos;
	private int continente;//todavia no lo usamos
	private int[] limitrofes;//id de los paises limitrofes
        
	public Territorio(int i,int cl,String nm){
		id = i;
		nombre = nm;
		//continente = c;
		ejercitos = 0; //empieza vacio
		limitrofes = new int[cl];//cantidad de paises limitrofes
                jugador = new Jugador(null,-1);
	}

	
	public void setJugador(Jugador p){
		jugador = p;
	}

        public void setLimitrofe(int[] a){
            limitrofes = a;
        }
	
	public void setEjercitos(int a){
		ejercitos = +a;
	}
	
	public int getId(){
		return id;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public Jugador getJugador(){
		return jugador;
	}
	
	public int getEjercitos(){
		return ejercitos;
	}
	
	public int[] getLimitrofes(){
		return limitrofes;
	}
        
    
}

