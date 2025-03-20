/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author raulz
 */
public abstract class Jugador extends Personaje{
    private int nivel = 1; //Este nivel aumentará cuando experiencia llegue a 100
    private int experiencia = 0; //Una barra que irá de 0 a 100
    String nombre = darNombre();
    public Jugador(int vida, boolean vivo, int ataque, double defensa, int iniciativa){
        super(vida,vivo,ataque,defensa,iniciativa);
    
    }
    
    
    
    private void comprobarNivel() {
        do {
            if (experiencia >= 100) {
                nivel++;
                experiencia -= 100;
                System.out.println("Has subido de nivel!!" + "Nvl " + (nivel-1) + " -> " + " Nvl " + nivel);
            }
        } while (experiencia > 100);
    }
    
    abstract String darNombre();
    @Override
    public String mostrarInfo(){
        return """
               Datos del jugador: 
               Nombre: """ + nombre + "\nVida: " + super.getVida() + "\nAtaque: " +super.getAtaque() + "\nDefensa: " +super.getDefensa() + "\nIniciativa: " + super.getIniciativa();
    }
}
