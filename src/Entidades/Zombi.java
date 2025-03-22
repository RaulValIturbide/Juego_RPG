/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author baske
 */
public class Zombi extends Enemigo {
    
    public Zombi(int vida, boolean vivo, int ataque, double defensa, int iniciativa){
        super(vida,vivo,ataque,defensa*1.2,iniciativa);
    }
    
    
    
    
    
}
