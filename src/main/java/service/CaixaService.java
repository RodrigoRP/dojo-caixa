package service;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CaixaService {

    private static final int[] CEDULAS = new int[]{100, 50, 20, 10};
    private static final int SIZE = CEDULAS.length;

    public int lerValorInteiro() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                return sc.nextInt();
            } catch (InputMismatchException e) {
                sc.next();
                System.out.print("Valor invalido tente novamente: ");
            }
        }
    }


    public int[] sacarDinheiro(int valor) {
        if (valor < 0)
            throw new IllegalArgumentException("Não é possível sacar um valor negativo.");

        int[] contadorNotas = new int[SIZE];
        for (int i = 0; i < SIZE; i++) {
            if (valor >= CEDULAS[i]) {
                contadorNotas[i] = valor / CEDULAS[i];
                valor = valor - contadorNotas[i] * CEDULAS[i];
            }
        }
        return contadorNotas;
    }

    public void imprimirCedulasSacadas(int[] contadorCedulas) {
        System.out.println("---- NUMERO DE NOTAS ----");
        for (int i = 0; i < SIZE; i++) {
            if (contadorCedulas[i] != 0) {
                System.out.println("R$ " + CEDULAS[i] + " : "
                        + contadorCedulas[i]);
            }
        }
    }
}
