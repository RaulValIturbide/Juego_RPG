/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pantalla;

import java.util.InputMismatchException;
import Exception.OutOfRangeException;
import java.util.Scanner;

/**
 *
 * @author raulz
 */
public class Menu {

    static Scanner teclado = new Scanner(System.in);

    /**
     * Este metodo tiene como objetivo que el usuario seleccione la clase siendo
     * esta 1 = guerrero, 2 = arquero 3 = ladrón
     *
     * @return devolverá el valor 1,2,3 dependiendo de la eleccion del jugador
     */
    public static int classSelection() {
        int usuario = 0;
        boolean classSelected = false;
        boolean subSwitch = false;

        do {

            try {
                System.out.println("Que clase deseas?\n1-Guerrero\n2-Arquero\n3-Ladron");
                usuario = teclado.nextInt();
                if (numberRange(usuario, 1, 3) == false) {
                    throw new OutOfRangeException("Numero fuera del rango");
                } else {
                    switch (usuario) {
                        case 1:
                            do {
                                subSwitch = false;
                                try {
                                    System.out.println("1-Elegir guerrero\n2-Informacion de clase\n3-Volver atrás");
                                    usuario = teclado.nextInt();
                                    if (!numberRange(usuario, 1, 3)) {
                                        throw new OutOfRangeException("Numero fuera del rango");
                                    } else {
                                        subSwitch = false;
                                        switch (usuario) {
                                            case 1:
                                                classSelected = true;
                                                subSwitch = true;
                                                usuario = 1;
                                                break;
                                            case 2:
                                                Lore.infoWarrior();
                                                break;
                                            case 3:
                                                subSwitch = true;
                                                break;
                                        }
                                    }
                                } catch (InputMismatchException e) {
                                    System.out.println("Error: Introduzca un valor numerico");
                                    limpiarBuffer();
                                }
                            } while (!subSwitch);
                            break;
                        case 2:
                            do {
                                subSwitch = false;
                                try {
                                    System.out.println("1-Elegir Arquero\n2-Informacion de clase\n3-Volver atrás");
                                    usuario = teclado.nextInt();
                                    if (!numberRange(usuario, 1, 3)) {
                                        throw new OutOfRangeException("Numero fuera del rango");
                                    } else {
                                        subSwitch = false;
                                        switch (usuario) {
                                            case 1:
                                                classSelected = true;
                                                subSwitch = true;
                                                usuario = 2;
                                                break;
                                            case 2:
                                                Lore.infoArcher();
                                                break;
                                            case 3:
                                                subSwitch = true;
                                                break;
                                        }
                                    }
                                } catch (InputMismatchException e) {
                                    System.out.println("Error: Introduzca un valor numerico");
                                    limpiarBuffer();
                                }
                            } while (!subSwitch);
                            break;
                        case 3:
                            do {
                                subSwitch = false;
                                try {
                                    System.out.println("1-Elegir Ladron\n2-Informacion de clase\n3-Volver atrás");
                                    usuario = teclado.nextInt();
                                    if (!numberRange(usuario, 1, 3)) {
                                        throw new OutOfRangeException("Numero fuera del rango");
                                    } else {
                                        subSwitch = false;
                                        switch (usuario) {
                                            case 1:
                                                classSelected = true;
                                                subSwitch = true;
                                                usuario = 3;
                                                break;
                                            case 2:
                                                Lore.infoThief();
                                                break;
                                            case 3:
                                                subSwitch = true;
                                        }
                                    }
                                } catch (InputMismatchException e) {
                                    System.out.println("Error: Introduzca un valor numerico");
                                    limpiarBuffer();
                                }
                            } while (!subSwitch);
                            break;

                    }

                }

            } catch (InputMismatchException e) {
                limpiarBuffer();
                System.out.println("Error: Introduzca un valor numerico");
            } catch (OutOfRangeException ex) {
                System.out.println("Error: " + ex.getMessage());
            }

        } while (!classSelected);
        return usuario;

    }

    public static void pedirNombreJugador(String clase) {

        System.out.println("Dame un nombre para tu campeon " + clase);

    }

    /**
     *
     * @param usuario el numero que introduce el usuario
     * @param maxRango el rango maximo que deberia elegir el usuario
     * @param minRango el rango minimo que deberia elegir el usuario
     * @return devolverá true si el numero se encuentra entre ambos rangos o
     * false si no es asi
     */
    private static boolean numberRange(int usuario, int minRango, int maxRango) {
        if (usuario > maxRango || usuario < minRango) {
            return false;
        } else {
            return true;
        }
    }

    public static void limpiarBuffer() {
        teclado.nextLine();
    }

}
