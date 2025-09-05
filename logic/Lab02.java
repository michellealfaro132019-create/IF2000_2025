package logic;
import java.util.Scanner;
public class Lab02{
public Lab02(){}
 Scanner sc=new Scanner(System.in);
   public void SumaPares(){
    int suma = 0; 
    for (int i =2; i <= 100; i+=2){
        suma += i; 

    }
System.out.println("La suma de los número primos es:"+suma); 

   }
public void CelsiusAFahrenheit() {
       //Scanner sc =new Scanner(System.in); 
        
System.out.print("Ingrese grados Celsius: ");
        double c = sc.nextDouble();
        double f = (9.0 / 5.0) * c + 32;
        
    System.out.println("En Fahrenheit es: " + f);
    }

 public void Potencia(){
//Scanner sc =new Scanner(System.in); 

System.out.println("Ingrese el exponente:"); 
int x =sc.nextInt();
 
System.out.println("Ingrese la base:"); 
int n =sc.nextInt();
int resultado =1;
for(int i = 0; i< n; i++){
    resultado = resultado* x; 
}
System.out.println(x+"Elevado"+n+"es"+resultado);
}

 public void Meses(){
    //Scanner sc =new Scanner(System.in); 
    System.out.println("Ingre un número para saber que mes es; "); 
    int Meses=0; 
    Meses=sc.nextInt();
    switch (Meses){
        case 1: System.out.println("Enero");
        break; 
        case 2: System.out.println("Febrero");
        break; 
        case 3: System.out.println("Marzo");
        break; 
        case 4: System.out.println("Abril");
        break; 
        case 5: System.out.println("Mayo");
        break; 
        case 6: System.out.println("Junio");
        break; 
        case 7: System.out.println("Julio");
        break; 
        case 8: System.out.println("Agosto");
        break; 
        case 9: System.out.println("Septiembre");
        break; 
        case 10: System.out.println("Octubre");
        break; 
        case 11: System.out.println("Noviembre");
        break; 
        case 12: System.out.println("Diciembre");
        break; 
    }
 }
public void Funcion(){
    //Scanner sc =new Scanner(System.in); 
     System.out.print("Ingrese un numero:");
        int x=sc.nextInt();
        if(x>0){
            System.out.print("El resultado de la funcion es:"+(x+5));
        }else if(x<0){
            System.out.print("El resultado de la funcion es:"+(x*x));
        }
        }
public void Triangulo(){
    //Scanner sc = new Scanner(System.in);
        
    System.out.print("Ingrese la longitud del lado a:");
        double a=sc.nextDouble();
        
        System.out.print("Ingrese la longitud del lado b:");
        double b=sc.nextDouble();
        
        System.out.print("Ingrese la longitud del lado c:");
        double c=sc.nextDouble();
        double p=(a+b+c)/2;
        double area=Math.sqrt(a*(p-a)*(p-b)*(p-c));
        
        System.out.print("El area del triangulo es:"+area);
}
public void Variables(){
    //Scanner sc=new Scanner(System.in);
       
    System.out.print("Ingrese el valor de A:");
        int a=sc.nextInt();
        
        System.out.print("Ingrese el valor de b:");
        int b=sc.nextInt();
        int temp=a; a=b;b=temp;
        
        System.out.print("El nuevo valor de A es:"+a);
        System.out.print("El nuevo valor de B es:"+b);
}

public void Recta(){
    System.out.print("Ingrese el valor de x0");
double x0=sc.nextDouble(); 
System.out.print("Ingrese el valor de y0");
  double y0=sc.nextDouble();   
  System.out.print("Ingrese el valor de x1");   
  double x1=sc.nextDouble();  
  System.out.print("Ingrese el valor de y1");
  double y1=sc.nextDouble();  
  double m=(y0-y1)/(x0-x1); 
  double b=y0-(m*x0); 
    System.out.print("La ecuacion es: y="+m+"x+"+b);
}
public void NúmeroNatural(){
    System.out.print("Ingrese un núro natural:"); 
    int k=sc.nextInt(); 
    int suma=0; 
    for(int i=1; i<=k ; i++){
        suma+=i; 
    }
    System.out.print("La suma:"+k+"es"+suma); 
}
public void Promedio(){
    System.out.print("ingrese la cantidad de númros"); 
    int n = sc.nextInt();
    int suma = 0; 

    for(int i = 1; i<=n; i++){
        System.out.print("Ingrese el número"+i+":");
        int número = sc.nextInt(); 
        suma +=número; 
    }
double promedio =(double)suma/n; 
System.out.print("El promedio es:"+promedio); 
}

public void paresEimpares(){
    int Spares =0; 
    int Simpares =0; 
    int Stotal =0; 
    int pares =0; 
    int impares =0; 
System.out.print("ingrese 10 números enteros:");
for (int i = 0; i<10; i++){
    int num=sc.nextInt(); 
    Stotal += num; 
    if (num % 2==0){
        Spares += num; 
        pares++; 
    }else{
        Simpares += num;
        impares++;
        
        System.out.print("la suma de pares es:"+Spares);
 System.out.print("La suma de impares es:"+Simpares);
  System.out.print("La suma total es:"+Stotal);
   System.out.print("La cantidad de pares es:"+pares);
    System.out.print("La cantidad de impares es:"+impares);
    }
    }
}
public void Pares_Impares(){
    int numImpares=0; 
    for (int i =1; i<200; i++){
        if(i%2==0){
            numImpares+=i; 
        }else{
            numImpares +=i; 
        }
        }
        System.out.print("La suma de pares entre el 1 y 200 es:"+numImpares); 
        System.out.print("=============================================="); 
        System.out.print("la suma de numeros impres entre de 1 y el 200 es:"+numImpares);

    }

    public void Suma_cuadrados(){
         int suma_cuadros=0;
        for(int i=1; i<=100; i++){
            suma_cuadros+=i*i;
        }
        System.out.print("La suma de los cuadrados de los 100 primeros numeros es:"+suma_cuadros);

    }
    public void Caluculo_fact(){
         System.out.print("ingrese el número para aclcular su factorial:"); 
         int n = sc.nextInt(); 
         long factorial =1; 
         for(int i=1;i<=n;i++){

            factorial*=i;
            }
            System.out.print("El factorial de"+n+"es"+factorial); 
    }
public void Maximo(){
     int max=Integer.MIN_VALUE;
        for(int i=1;i<=10;i++){
            System.out.print("Ingrese el numero"+i+":");
            int numero=sc.nextInt();
            if(numero>max){
                max=numero;
            }
        }
        System.out.print("El valor maximo de los numeros es:"+max);

}
}

    







