package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner valor =new Scanner(System.in);

        double a,b,c,delta,xUm,xDois;

        System.out.println("Calcular Bhaskara:");
        System.out.println("Digite o valor de A:");
        a = valor.nextInt();

        System.out.println("Digite o valor de B:");
        b = valor.nextInt();

        System.out.println("Digite o valor de C:");
        c = valor.nextInt();

        delta = Math.pow(b, 2.0) -4.0 * a * c;

        xUm = (-b + Math.sqrt(delta)) / (2.0 * a);

        xDois = (-b - Math.sqrt(delta)) / (2.0 * a);

        System.out.printf("o Valor de delta = %.2f\n", delta);
        System.out.printf("O valor de x1 = %.2f\n", xUm);
        System.out.printf("O valor de x2 = %.2f\n",xDois);

        valor.close();

    }
}