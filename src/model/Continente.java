/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;


public class Continente 
{
        private String nombre;
	private ArrayList<Integer> territorios;
	private int valor;
	Territorio t;
	
	
	Continente(String nm, ArrayList<Integer> t, int v){
		nombre = nm;
		valor = v;
		territorios = t;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public ArrayList<Integer> getTerritorios(){
		return territorios;
	}
	
	public int getValor(){
		return valor;
	}
	
	public boolean esTerritorioDe(Territorio t){
		return (territorios.contains(t.getId()));
	}
	
}
