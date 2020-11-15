/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicioedd3;

import java.util.Scanner;
//Este comentario es una prueba
/**
 * Calculates the area of a triangle.
 *
 * @author marcos
 * Hola Marcos. Soy Ricardo. Aquí queda la prueba de que he podido modificar tu repositorio.
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Triangle triangle = new Triangle();

        System.out.println("¿Cuál es el altura del triángulo?");
        Scanner scanner = new Scanner(System.in);
        triangle.setHeight(scanner.nextFloat());

        System.out.println("¿Cuál es el base del triángulo?");
        scanner = new Scanner(System.in);
        triangle.setBase(scanner.nextFloat());

        float area = triangle.calculateArea();
        System.out.println("El área del triángulo es " + area);

        float fixedHeight = 5;
        float fixedBase = 4;

        Triangle fixedTriangle = new Triangle(fixedBase, fixedHeight);
        System.out.println("El área del triángulo fijado es " + fixedTriangle.calculateArea());

    }

}
