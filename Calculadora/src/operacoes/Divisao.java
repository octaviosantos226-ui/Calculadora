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
public class Divisao {
    public static void main(String[] args) {
        EntradaNumeros entradaNumeros = new EntradaNumeros();
        entradaNumeros.pedir();
        System.out.println("o resultado é:" + (entradaNumeros.x / entradaNumeros.y));
    }
}
