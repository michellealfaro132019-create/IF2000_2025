/*package logic;

import java.util.Scanner;
import java.util.Arrays;

public class Lab_1 {
    public Lab_1() {}

    public void ejercicio1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int n = sc.nextInt();
        System.out.println("======================");
        System.out.println("El número es " + (n % 2 == 0 ? "par: " : "impar: ") + n);
    }

    public void ejercicio2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int n = sc.nextInt();
        System.out.println("El valor absoluto es: " + Math.abs(n));
    }

    public void ejercicio3() {
        int suma = 0;
        for (int i = 3; i <= 99; i += 3) {
            System.out.println(i);
            suma += i;
        }
    }

    public void ejercicio4() {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            nums[i] = sc.nextInt();
        }
        Arrays.sort(nums);
        System.out.println("Números ordenados: " + nums[0] + ", " + nums[1] + ", " + nums[2]);
    }

    public void ejercicio5() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int a = sc.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int b = sc.nextInt();
        if (a == b)
            System.out.println("Iguales, multiplicación: " + (a * b));
        else if (a > b)
            System.out.println("El primero es mayor, resta: " + (a - b));
        else
            System.out.println("El segundo es mayor, suma: " + (a + b));
    }

    public void ejercicio6() {
        Scanner sc = new Scanner(System.in);
        boolean found10 = false;
        while (!found10) {
            System.out.print("Ingrese una nota (0-10, -1 para terminar): ");
            int nota = sc.nextInt();
            if (nota == 10) {
                found10 = true;
                System.out.println("Hubo una nota 10");
            } else if (nota == -1) {
                System.out.println("No hubo ninguna nota 10");
                break;
            } else if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida");
            }
        }
    }

    public void ejercicio7() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();
        System.out.print("Ingrese su sexo (F/M): ");
        String sexo = sc.next();
        double pulsos = sexo.equalsIgnoreCase("F") ? (220 - edad) / 10.0 : (210 - edad) / 10.0;
        System.out.println("Pulsaciones por 10 seg: " + pulsos);
    }

    public void ejercicio8() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Salario mensual: ");
        double salario = sc.nextDouble();
        System.out.print("Años en la empresa: ");
        int años = sc.nextInt();
        double utilidad = salario * (años < 1 ? 0.05 : años < 2 ? 0.07 : años < 5 ? 0.10 : años < 10 ? 0.15 : 0.20);
        System.out.println("Utilidad: " + utilidad);
    }

    public void ejercicio9() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int n = sc.nextInt();
        int divisores = 0;
        for (int i = 1; i <= n; i++)
            if (n % i == 0) divisores++;
        System.out.println("Divisores: " + divisores);
    }

    public void ejercicio10() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cantidad de computadoras: ");
        int cantidad = sc.nextInt();
        double precio = 11000 * cantidad;
        double descuento = cantidad < 5 ? 0.10 : cantidad < 10 ? 0.20 : 0.40;
        double monto = precio - precio * descuento;
        System.out.println("Total: " + precio + ", Descuento: " + (precio * descuento) + ", A pagar: " + monto);
    }

    public void ejercicio11() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese N: ");
        int N = sc.nextInt();
        System.out.println("Primos entre 2 y " + N + ":");
        for (int i = 2; i <= N; i++) {
            int div = 0;
            for (int j = 1; j <= i; j++)
                if (i % j == 0) div++;
            if (div == 2) System.out.print(i + " ");
        }
        System.out.println();
    }

    public void ejercicio12() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Base del triángulo: ");
        double base = sc.nextDouble();
        System.out.print("Altura del triángulo: ");
        double altura = sc.nextDouble();
        System.out.println("Área: " + (base * altura / 2));
    }
}*/
