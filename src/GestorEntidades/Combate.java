/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestorEntidades;
import Entidades.*;
import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author baske
 */
public class Combate {
    static Random random = new Random();
    
   public void combate(ArrayList<Personaje> lista, int idEnemigo){
       do{
       if(iniciativeOrder(lista,idEnemigo) == 1){
           playerAtk(lista,idEnemigo);
       }else{
           
       }     
       }while(lista.get(0).getVivo() == true && lista.get(idEnemigo).getVivo() == true);
       
       
   }
   
   private void playerAtk(ArrayList<Personaje> lista, int idEnemigo){    
       lista.get(idEnemigo).setVida(lista.get(idEnemigo).getVida() - lista.get(0).getAtaque());
       System.out.println("El jugador golpea a x y le hace " + lista.get(0).getAtaque() + " puntos de ataque");
       System.out.println("El enemigo se queda a " + lista.get(idEnemigo).getVida() + " puntos de vida");
       if(lista.get(idEnemigo).getVida() <= 0){
           lista.get(idEnemigo).setVivo(false);
       }
   }
   
   
   
    /**
     * Este metodo establece la iniciativa entre el jugador y el enemigo
     *
     * @param lista el ArrayList donde están todas las entidades (recordar que
     * el jugador siempre será el numero "0"
     * @param idEnemigo el id que posee el enemigo para saber contra cual nos
     * estamos enfrentando
     * @return devolverá 1 si el jugador tiene mayor iniciativa y por lo tanto
     * puede atacar primero o devolverá -1 si es el enemigo el que puede atacar
     * primero
     */
    private int iniciativeOrder(ArrayList<Personaje> lista, int idEnemigo) {
        int numPlayer = 0;
        int numEnemy = 0;
        do {
            numPlayer = random.nextInt(2, 5) * lista.get(0).getIniciativa();
            numEnemy = random.nextInt(2, 5) * lista.get(idEnemigo).getIniciativa();

            if (numPlayer > numEnemy) {
                return 1;
            } else {
                return -1;
            }
        } while (numPlayer == numEnemy);
    }
   
   
    
    
    
}
