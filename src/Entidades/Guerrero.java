
package Entidades;
import Pantalla.Menu;
import java.util.InputMismatchException;
import Exception.NombreIncorrectoException;
import java.util.Scanner;

/**
 *
 * @author raulz
 */
public class Guerrero extends Jugador{
    static Scanner teclado = new Scanner(System.in);
    
    public Guerrero(int vida, boolean vivo, int ataque, double defensa, int iniciativa){
        super(vida,vivo,ataque,(defensa*1.2),iniciativa);
    }
    
    
    /**
     * Este metodo pretende dar un nombre al personaje de guerrero, para ello el usuario deberá pasar un nombre en mayusculas para cumplir
     * con la expresion regular
     * @return Devolverá un string que cumpla con las especificaciones de la expresion regular
     */
    @Override
    String darNombre() {
        String expReg = "^[A-Z]{1,} SON$";
        boolean correcto = false;
        String nombreTemp = null;

        do {
            try {
                Menu.pedirNombreJugador("Guerrero");
                nombreTemp = teclado.nextLine();
                if (!nombreTemp.matches(expReg)) {
                    throw new NombreIncorrectoException("Introduzca solo letras en mayusculas mas el sufijo \" SON\"");
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
      return super.mostrarInfo();
    }
    
}
