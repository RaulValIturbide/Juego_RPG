/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author baske
 */
public class Bandido extends Enemigo {
    
    public Bandido(int vida, boolean vivo, int ataque, double defensa, int iniciativa){
        super(vida,vivo,ataque*2,defensa,iniciativa);
    }
    
}
