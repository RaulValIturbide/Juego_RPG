/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Principal;
import Entidades.*;
/**
 *
 * @author raulz
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Guerrero g1 = new Guerrero(100, true, 20,0.5,30);
        
        Arquero a1 = new Arquero(100,true,20,0.2,30);
        
        Ladron l1 = new Ladron(100,true,20,0.2,30);
        
        
        System.out.println(g1.mostrarInfo());
        System.out.println(a1.mostrarInfo());
        System.out.println(l1.mostrarInfo());
    }
    
}
