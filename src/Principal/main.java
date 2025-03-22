/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Principal;
import Entidades.*;
import GestorEntidades.*;
import Pantalla.Menu;
/**
 *
 * @author raulz
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           ListaEntidades listMng = new ListaEntidades();
           Combate combatSys = new Combate();
           boolean endProgram = false;
           
  
           
           
      
            listMng.crearJugador(Menu.classSelection());

            listMng.crearEnemigo();

            System.out.println(listMng.lista().get(0).mostrarInfo());

            combatSys.combate(listMng.lista(),1);

            System.out.println(listMng.lista().get(0).mostrarInfo());
            System.out.println(listMng.lista().get(1).mostrarInfo());
            
            
            endProgram = true;

   



    }
    
}
