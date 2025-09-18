package IF2000_introduccionprogra;

import java.util.Scanner;
import domain.Person;
import logic.*;
public class IF2000_introducionprogra {
    public static void main(String[] args) {
        
        Person client1 =
        new Person("Edgardo" , "Corrales", "1-2323-4545", "63224555", 18); 
        
       SavingAccount account1= 
        new SavingAccount("01-01-2024", 12, 5, "1020482051", 25000, client1);

account1.deposit(3000);

System.out.println(account1.toString() );


        /*String name = "Lionel"; 
        int age = 40;
     
        System.out.println("Hola mundo"); 
        //Python: println('Hola mundo')
        System.out.println("Name:"+ name); 
        System.out.println("Age:" +age); 

        /*Tipos de datos numericos: int, long, double, short, float,numeric, money, decimal
         * 
         * Manejo de fechas: date
         * 
         * Cadenas de caracteres: String, char
         * 
         * Objetos: object
         * 
         * Data estructura: Arrays or Vectors: int [] x; 
         *                                     int [][] y; 
         * True or false
         * boolean 
        
   
     Ejercicios_semana2_PracticasEnClase ej = new Ejercicios_semana2_PracticasEnClase (); 
        ej.Piramide_1(5); 
         ej.Cuadrado_lab(5,9); 
         ej.Cuadrado_vacio(5,5); 
         ej.Piramide_C(10); 
         ej.Piramide_b( 12);
         ej.Ejercicio_D(); 
         ej.Ejercicio_E(); 
         ej.Ejercicio_F(); 

    Lab_1 lab1 = new Lab_1();
    lab1.ejercicio1();
    lab1.ejercicio2();
    lab1.ejercicio3();
    lab1.ejercicio4();
    lab1.ejercicio5();
    lab1.ejercicio6();
    lab1.ejercicio7();
    lab1.ejercicio8();
    lab1.ejercicio9();
    lab1.ejercicio10();
    lab1.ejercicio11();
    lab1.ejercicio12();
    }*/
    }
}

