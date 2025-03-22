/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author baske
 */
abstract class Enemigo extends Personaje {
    
    public Enemigo(int vida, boolean vivo, int ataque, double defensa, int iniciativa){
        super(vida,vivo,ataque,defensa,iniciativa);
    }
    
}

