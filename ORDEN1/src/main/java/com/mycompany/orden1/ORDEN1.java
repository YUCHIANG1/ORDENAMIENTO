/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.orden1;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class ORDEN1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        
        // Ingreso de los 5 numeros
        System.out.print("Primer numero: ");
        numeros[0] = scanner.nextInt();
        
        System.out.print("Segundo numero: ");
        numeros[1] = scanner.nextInt();

        System.out.print("Tercer numero: ");
        numeros[2] = scanner.nextInt();
        
        System.out.print("Cuarto numero: ");
        numeros[3] = scanner.nextInt();
        
        System.out.print("Quinto numero: ");
        numeros[4] = scanner.nextInt();
        
        // Commit  1: Ingreso de los 5 numeros
    }
}
