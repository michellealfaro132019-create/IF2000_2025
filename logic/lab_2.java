package logic;
import java.util.Scanner;
public class lab_2{
public lab_2(){}

   public void SumaPares(){
    int suma = 0; 
    for (int i =2; i <= 100; i+=2){
        suma += i; 

    }
System.out.println("La suma de los número primos es:"+suma); 

   }
public void CelsiusAFahrenheit() {
       Scanner sc =new Scanner(System.in); 
        
System.out.print("Ingrese grados Celsius: ");
        double c = sc.nextDouble();
        double f = (9.0 / 5.0) * c + 32;
        
    System.out.println("En Fahrenheit es: " + f);
    }

}
