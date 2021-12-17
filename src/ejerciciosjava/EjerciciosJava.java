/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosjava;

/**
 *
 * @author alvar
 */
public class EjerciciosJava {

    public boolean fiestaArdilla(int numBellotas, boolean finDeSemana){
        //si es fin de semana de igual cuantas vellotas haya
        if (finDeSemana){
            return true;
        }
        if (40 <= numBellotas && numBellotas <= 60){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        EjerciciosJava ejercicio = new EjerciciosJava();
                System.out.println("Ejercicio 01 : ARDILLAS");
        System.out.println("30,false"+ejercicio.fiestaArdilla(30, false));
         System.out.println("50,false"+ejercicio.fiestaArdilla(50, false));
          System.out.println("30,true"+ejercicio.fiestaArdilla(70, true));
    }
    
}
