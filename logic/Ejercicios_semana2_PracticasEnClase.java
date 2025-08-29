package logic;
  import java.util.Arrays;
  import java.util.Random; 
  import java.util.Scanner; 

public class Ejercicios_semana2_PracticasEnClase{
 public Ejercicios_semana2_PracticasEnClase(){

 }

public void Piramide_1(int n){
    for(int i = 1; i <= n ; i ++){

        for (int j = 1; j <=(n-i); j++){
System.out.print(" "); 
        }
        for (int k = 1; k <=(2*i-1); k++){
            System.out.print("*");
        }
        System.out.println(" ");
    }
}

public void Cuadrado_lab(int f , int c){
   
    for(int i = 1; i <= f ; i ++)
    {
        for (int j = 1; j <=c; j++){
            if(i == 1 || i== f||j==1||j==c){
                System.out.print("*");
            }
 else if (i == (f + 1) /2 && j == (c+ 1)/2) {
             System.out.print("*");
            }
        else{
                System.out.print(" ");
            }
        }
        System.out.println();  
        }
}
       public void Cuadrado_vacio(int f , int c){
   
    for(int i = 1; i <= f ; i ++)
    {
        for (int j = 1; j <=c; j++){
            if(i == 1 || i== f||j==1||j==c){
                System.out.print("* ");
             } else{
                System.out.print("  ");
            }
        }
        System.out.println();  
        }
       }
    
 public void Piramide_b(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
      
        }
      
    
public void Piramide_C(int n) {
        for (int i = n; i >= 1; i--) {
             for (int j = 0; j <n -i; j++){
System.out.print(" "); 
            }for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
      
        }
    }
      
    
public void Ejercicio_D(){
Scanner sc =new Scanner(System.in); 
int[] Números = new int [10];

System.out.println("Digite diez números enteros: "); 
for ( int i = 0; i < 10;i++){
    System.out.println("Número"+(i+1)+ ": ");
    Números[i]=sc.nextInt();
    Arrays.sort(Números); 
    System.out.println("Arreglo ordenado:" ); 
     for (int n : Números) {
            System.out.print(n + " ");
        }
 System.out.println();
}
}

public void Ejercicio_E(){

      Random rand = new Random();
        int[] numeros = new int[100];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rand.nextInt(1000); // valores entre 0 y 999
        }
Arrays.sort(numeros); // ordena ascendente

        System.out.println("=== Ejercicio E: Ordenar Descendente ===");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println("\n");
    }

public void Ejercicio_F(){
        char[][] tablero = new char[8][8];


      
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (i < 3 && (i + j) % 2 == 0) tablero[i][j] = 'N'; 
                else if (i > 4 && (i + j) % 2 == 0) tablero[i][j] = 'R'; 
                else tablero[i][j] = ' '; 
            }
        }

     
        System.out.println("=== Ejercicio F: Tablero ===");
        System.out.print("   ");
        for (int j = 1; j <= 8; j++) System.out.print(j + " ");
        System.out.println();
        for (int i = 0; i < 8; i++) {
            System.out.print((char) ('A' + i) + "  ");
            for (int j = 0; j < 8; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();

        }
    }
    public void conteo_descendente(int n){
    int[] numero=new int[n];
    Scanner sc=new Scanner(System.in);
    System.out.println("ingrese 100 numeros enteros:");
    for(int i=0; i<100; i++){
        System.out.print("numero"+(i+1)+":");
        numero[i]=sc.nextInt();
    }
    Arrays.sort(numero);
    System.out.println("Los numeros ordenados de manera descendente son:");
    for(int i=n-1; i>=0; i--){
        System.out.print(numero[i] + " ");
    }
    System.out.println();

}
public void mostrarTableroDamas() {
    char[][] tablero = new char[8][8];
    
    for (int i = 0; i < 8; i++) {
        for (int j = 0; j < 8; j++) {
            if (i < 3 && (i + j) % 2 == 1) {
                tablero[i][j] = 'N'; // Fichas negras
            } else if (i > 4 && (i + j) % 2 == 1) {
                tablero[i][j] = 'R'; // Fichas rojas
            } else {
                tablero[i][j] = '-'; // Casilla vacía
            }
        }
    }
    System.out.println("Tablero inicial de damas:");
    for (int i = 0; i < 8; i++) {
        for (int j = 0; j < 8; j++) {
            System.out.print(tablero[i][j] + " ");
        }
        System.out.println();
    }
    System.out.println("==============================");
}
}









        

    

