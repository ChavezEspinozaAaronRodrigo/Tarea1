/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea01;

import java.util.Scanner;

/**
 *
 * @author Aaron
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int precio;
        String nombre="nombre";
        precio=0;
        Scanner lector=new Scanner(System.in);
        
        System.out.println("Ingresa el precio del producto:");
        precio=lector.nextInt();
        
        precio=(int) (precio*0.18);
        
        System.out.println("El precio con IGV es de: "+precio);
    }
    
}
