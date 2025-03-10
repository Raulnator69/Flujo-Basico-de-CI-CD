/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practicatdd;

/**
 *
 * @author raula
 */
import java.util.Scanner;

public class PracticaTDD {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hay cafe disponible? (si/no): ");
        String respuesta = scanner.nextLine().trim().toLowerCase();

        boolean hayCafe = respuesta.equals("si");
        System.out.println(verificarCafe(hayCafe));
    }

    public static String verificarCafe(boolean hayCafe) {
        if (hayCafe) {
            return "¡Si hay cafe! ☕";
        } else {
            return "No hay cafe... 😢";
        }
    }
}
