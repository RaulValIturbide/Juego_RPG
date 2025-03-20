/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import static Entidades.Guerrero.teclado;
import Exception.NombreIncorrectoException;
import Pantalla.Menu;
import java.util.InputMismatchException;

/**
 *
 * @author raulz
 */
public class Arquero extends Jugador{
    private int municion = 50;
    
    public Arquero(int vida, boolean vivo, int ataque, double defensa, int iniciativa){
        super(vida,vivo,ataque*2,defensa,iniciativa);
        
    }
    
    
    public void setMunicion(int municion){
        this.municion = municion;
    }

    /**
     *
     * @return
     */
    public int getMunicion(){
        return municion;
    }
    
    /**
     * Un metodo que pone nombre al jugador teniendo que respetar la expresionRegular
     * @return devulve un String que será el nombre al cual se le aplicará la expresion regular
     */
    @Override
     String darNombre() {
        String expReg = "^ELDEL[A-Z]{1,}$";
        boolean correcto = false;
        String nombreTemp = null;

        do {
            try {
                Menu.pedirNombreJugador("Arquero");
                nombreTemp = teclado.nextLine();
                if (!nombreTemp.matches(expReg)) {
                    throw new NombreIncorrectoException("Introduzca solo letras en mayusculas con el prefijo \"ELDEL\"");
                }else{
                correcto = true;
                }
            } catch (InputMismatchException e) {
            } catch (NombreIncorrectoException ex) {
                System.out.println("Error: " + ex.getMessage());
            }
        } while (!correcto);

        return nombreTemp;
    }
     
     @Override
     public String mostrarInfo(){
            return super.mostrarInfo() + "\nMunicion: " + municion;
            
     }
     
    
}
