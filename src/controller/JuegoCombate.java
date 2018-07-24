package controller;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import model.Jugador;
import model.Territorio;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import view.Observer;



public class JuegoCombate implements Subject
{
        
	//static public ArrayList<Territorio> territorios  = new ArrayList<Territorio>();
        static public  ArrayList<Territorio> territorios = new ArrayList<Territorio>();
        static public ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
        static public ArrayList<Observer> observadores  = new ArrayList<Observer>();
       
        public Jugador curPlayer;
        public Jugador defender;
        
        public Jugador activo;
        private int estado;
        public Territorio aTerritorio;
        public Territorio dTerritorio;
        public int defNum = 0;
        public int attNum = 0;
        public int iter = 0;
        public boolean drawn;
       

    public boolean agregarJugador(String nm){
            int size = jugadores.size();
            if (size >= 4)
                return false;
            Jugador p = new Jugador(nm, size);
            jugadores.add(p);
                return true;
        }
    public boolean agregarTerritorios(int cantidad){
            int cl=2;
            int i=1;
            String fichero = null;
            if(cantidad==18)
            {
                System.out.println("mapa mundo");
                fichero ="C:\\Users\\Notebook\\Google Drive\\Facultad drive 02 SII\\5°año (2018)\\1°SEMESTRE\\Ing de software(2018)\\FINAL\\ULTIMOOO\\combatev3\\anda - copia - copia\\combatev2-master\\src\\controller\\mapamundo.txt";
            } else { 
                
            }
            try {
            FileInputStream fis = new FileInputStream(fichero);
            InputStreamReader isr = new InputStreamReader(fis,"utf8");
            BufferedReader br = new BufferedReader(isr);
            String linea;
            while((linea = br.readLine()) != null)
            {
                //System.out.println(linea);
                Territorio t = new Territorio(i,cl,linea);
                territorios.add(t);
                
                System.out.println("territorio id:"+ i +" y nombre: "+linea+"  agregado");
                i++;
            }
             fis.close();
                }
            catch(Exception e) {
      System.out.println("Excepcion leyendo fichero "+ fichero + ": " + e);
         }
            System.out.println("Territorios agregados");
        return true;
    }
    public void EstadoJuego()
    {
        //thread.start();
        
        for(int i=0;i<6;i++)
        {   
            
            estado=i;
            if(i==0)
            {
               JOptionPane.showMessageDialog(null,"Binvenido a Combate - Cada Jugador debera agregar 5 ejercitos");            
            }
            System.out.println("hola");
            //Iterator<Jugador> it = jugadores.iterator();
            for(Jugador jug : jugadores)
            {
                
                activo=jug;
                /*JOptionPane pane = new JOptionPane("Jugador "+activo.getNombre()+" tu turno");
                // Configure via set methods
                JDialog dialog = pane.createDialog(null, "No cerrar hasta terminar la tarea");
                // the line below is added to the example from the docs
                dialog.setModal(false); // esto dice: no bloquear componentes de fondo
                dialog.show();*/
                String Scant;
                String Spais;
                String Sejercitos;
                int cant;
                int pais;
                int ejercitos;
                Scant=JOptionPane.showInputDialog(null,"Jugador "+jug.getNombre()+" indicar la cantidad de paices donde querra poner ejercitos");
                cant = Integer.parseInt(Scant);
                for(int p=0;p<cant;p++)
                {
                Spais=JOptionPane.showInputDialog(null,"Jugador "+jug.getNombre()+" indicar el numero del pais donde quiera poner ejercito");
                pais = Integer.parseInt(Spais);
                Sejercitos=JOptionPane.showInputDialog(null,"Jugador "+jug.getNombre()+" indicar la cantidad de ejercitos que quiera poner en el pais "+territorios.get(pais-1).getNombre());
                ejercitos = Integer.parseInt(Sejercitos);
                Jugando(pais,ejercitos);
                notifyObservers();
                }
                
            }
    
        } 
    }

    public void Jugando(int idterritorio,int eje)
   {
        switch(estado) 
        {
	case 0:
	activo.añadirEjercitos();
        territorios.get(idterritorio-1).setEjercitos(eje);
        territorios.get(idterritorio-1).setJugador(activo);
        System.out.printf("ESTADO 0");//poner 10 fichas
        
       
	break;
	case 1:
		//ponen 5 fichas
	break;
	case 2:				
		//atacan
	break;
	case 3:
		//ponen fichas de acuerdo a sus territorios
	break;
	case 4:
		//chequear jugadores vivos
	break;		
	case 5:
		//calcule ejercitos para cada jugadores
	break;
        case 6:
        break; // estado de fin de 
	default:
		//no hacer nada
	break;
	}
    }  
    public void registerObserver(Observer o) {
        observadores.add(o);
    }

    public void removeObserver(Observer o) {
        observadores.remove(o);
    }

    public void notifyObservers() {
        for(Observer observador : observadores)
        {
            observador.update(territorios);
        }
    }
}