/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package huelequemao;

import java.util.Scanner;

public class Ejercicio3 {

    static int digitosg[] = new int[4];
    static int digitos = 0;
    static double poscu = 0;

    public static void main(String[] args) {
        oscurecer();
    }

    public static void oscurecer() {

        System.out.println("Digite sus 3 enteros separados por un espacio");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            digitos = sc.nextInt();
            digitosg[i] = digitos;
            if (digitos > 255) {
                System.out.println("Algun digito es mayor que 255, porfavor ingrese un numero menor");
            } else {
                System.out.println(digitosg[i]);
            }
        }

        System.out.println("Digite el porcentaje que quiere oscurecer sus colores");
        poscu = sc.nextInt();
        poscu = poscu / 100;
        System.out.println(poscu);
        for (int j = 0; j < 3; j++) {
        }
    }
}

