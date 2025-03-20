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
public class Ladron extends Jugador {
    
    public Ladron(int vida, boolean vivo, int ataque, double defensa, int iniciativa){
        super(vida,vivo,ataque,defensa,iniciativa*2);
    }
    
    
        @Override
    String darNombre() {
        String expReg = "^[A-Z]{1,}EXPOSITO$";
        boolean correcto = false;
        String nombreTemp = null;

        do {
            try {
                Menu.pedirNombreJugador("Ladron");
                nombreTemp = teclado.nextLine();
                if (!nombreTemp.matches(expReg)) {
                    throw new NombreIncorrectoException("Introduzca solo letras en mayusculas mas el sufijo \"EXPOSITO\"");
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
    
}
