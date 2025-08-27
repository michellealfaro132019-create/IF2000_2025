package logic;

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
        System.out.print(" ");
}
    

    
    }

}