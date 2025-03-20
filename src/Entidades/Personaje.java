package Entidades;

/**
 *
 * @author raulz
 */
abstract class Personaje {

    private int vida;//La salud de un personaje, cuando llegue a 0 estar� muerto
    private boolean vivo; //Se mantendr� en true mientras la vida sea > 0 y false si es <= 0
    private int ataque; //Un atributo que marcar� el da�o de un personaje al usar su arma
    private double defensa; //Ser� una cifra de 0 a 1, el da�o se multiplicar� por la defensa del enemigo para calcular el da�o real sobre la vida
    private int iniciativa; //El que mas iniciativa tenga atacar� primero en la ronda
    private String nombre; //El nombre de la entidad

    public Personaje(int vida, boolean vivo, int ataque, double defensa, int iniciativa) {
        this.vida = vida;
        this.vivo = vivo;
        this.ataque = ataque;
        this.defensa = defensa;
        this.iniciativa = iniciativa;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getVida() {
        return vida;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    public boolean getVivo() {
        return vivo;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setDefensa(double defensa) {
        this.defensa = defensa;
    }

    public double getDefensa() {
        return defensa;
    }

    public void setIniciativa(int iniciativa) {
        this.iniciativa = iniciativa;
    }

    public int getIniciativa() {
        return iniciativa;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
    
    abstract String mostrarInfo();


        
        
        
        
        
        
        
        
        
        
        
        
    
}
