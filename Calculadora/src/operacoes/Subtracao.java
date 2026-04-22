/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operacoes;

import java.util.Scanner;

/**
 *
 * @author info1
 */
public class Subtracao {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite o primeiro valor");
        int x = scanner.nextInt();
        System.out.println("digite o segundo valor");
        int y = scanner.nextInt();
        System.out.println("o resultado é:" + (x - y));
    }
}
