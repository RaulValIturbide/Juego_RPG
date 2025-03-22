/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestorEntidades;
import Entidades.*;
import java.util.ArrayList;

/**
 *
 * @author baske
 */
public class ListaEntidades {
    
    ArrayList<Personaje> listaEntidades = new ArrayList<Personaje>();
    
    /**
     * Este metodo pretende crear el tipo de jugador que el usuario elija: guerrero/arquero/ladrón
     * Se debe recordar que en la listaEntidades el id del jugador siempre sera el id "0" 
     * @param usuario la eleccion del usuario
     */
    public void crearJugador(int usuario){
        switch(usuario){
            case 1:
                listaEntidades.add(new Guerrero(100,true,100,0.6,10));
                break;
            case 2:
                listaEntidades.add(new Arquero(100,true,100,0.4,10));
                break;
            case 3:
                listaEntidades.add(new Ladron(100,true,100,0.4,15));
        }
    }
    
    public void crearEnemigo(){
        listaEntidades.add(new Zombi(20,true,20,0.4,10));
    
    }
    
    public ArrayList<Personaje> lista(){
        return listaEntidades;
    }
    
    
    
}
