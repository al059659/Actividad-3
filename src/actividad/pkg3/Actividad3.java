package actividad.pkg3;

import java.util.Scanner;

//@author reyapazc

public class Actividad3 {
    
    public static void suma(){
        int suma = 0;
        for (int i = 1; i <= 10; i++) {
            suma += i;
            
        }
        
        System.out.println("La suma de los primeros 10 números es: " + suma);
        
    }
    
    public static void factorial(){
        int factorial = 1;
        for (int i = 10; i >= 1; i--) {
            factorial *= i;
            
        }
        
        System.out.println("El factorial del número 10 es: " + factorial);
        
    }
    
    public static void readFactorial(int numeroA){
        int numero = numeroA;
        int factorial = 1;
        for (int i = numero; i >= 1; i--) {
            factorial *= i;
            
        }

        System.out.println("El número introducido " + numero + " tiene como factorial: " + factorial);
        
    }
    
    public static void media(double numeroA){
        double numeroB = numeroA;
        double suma = 0;
        for (int i = 1; i <= numeroB; i++) {
            suma += i;
            
        }
        
        double media = suma / numeroB;
        System.out.println("La media de 0 y entre " + numeroB + " es: " + media);
        
    }
    
    public static void sumaPromedio(int numeroB){
        Scanner read = new Scanner(System.in);
        int numero = numeroB;
        int suma = 0;
        double promedio;
        int diferencia;
        int arrays[] = new int[numero];
        for (int i = 0; i < arrays.length; i++) {
            System.out.print("Ingresa el numero " + (i + 1) + ": ");
            arrays[i] = read.nextInt();
            
        }
        
        int mayor, menor;
        mayor = menor = arrays[0];
        for (int i = 0; i < arrays.length; i++) {
            if(arrays[i] > mayor){
                mayor = arrays[i];
            } else if(arrays[i] < menor){
                menor = arrays[i];
            }
            
            suma += arrays[i];
            
        }
        
        promedio = (double)suma / (double)numero;
        diferencia = mayor - menor;
        System.out.println("Ingresaste esta cantidad de números: " + numero);
        System.out.println("El promedio de los números ingresados es: " + promedio);
        System.out.println("El mayor de los números ingresados es: " + mayor);
        System.out.println("El menor de los números ingresados es: " + menor);
        System.out.println("La diferencia entre el número menor y el mayor es: " + diferencia);
        
    }
    
    public static void diaSemana(){
        String dia[] = new String[7];
        dia[0] = "Lunes";
        dia[1] = "Martes";
        dia[2] = "Miércoles";
        dia[3] = "Jueves";
        dia[4] = "Viernes";
        dia[5] = "Sábado";
        dia[6] = "Domingo";
        for(String dias: dia){
            System.out.println(dias);
            
        }
        
    }
    
    public static void gato(){
        String gato[][] = new String[3][3];
        for(String vertical[]: gato){
            for(String horizontal: vertical){
                System.out.print("+" + " ");
                
            }
            
            System.out.println("");
            
        }
        
    }

    public static void main(String[] args) {
        
        System.out.println("-Universidad Autónoma de Campeche-");
        System.out.println("------Facultad de Ingeniería------");
        System.out.println("-------Rey A. Paz-Carrillo-------");
        System.out.println("");
        System.out.println("Escoge un número de la lista para ejecutar el programa deseado:");
        System.out.println("");
        System.out.println("(1). Realiza la suma de los 10 primeros números.");
        System.out.println("(2). Calcula el factorial del 10.");
        System.out.println("(3). Calcula el factorial de un número ingresado.");
        System.out.println("(4). Calcula la media del 0 hasta el numero ingresado.");
        System.out.println("(5). Calcula el promedio de la cantidad de números ingresados.");
        System.out.println("(6). Imprime los días de la semana.");
        System.out.println("(7). Imprime el modelo del juego de gato.");
        
        Scanner read = new Scanner(System.in);
        int numero = read.nextInt();
        
        switch(numero){
            case 1:
                System.out.println("(1). Realiza la suma de los 10 primeros números.");
                suma();
                break;
            case 2:
                System.out.println("(2). Calcula el factorial del 10.");
                factorial();
                break;
            case 3:
                System.out.println("(3). Calcula el factorial de un número ingresado.");
                System.out.print("Ingresa un número para calcular su factorial:");
                readFactorial(read.nextInt());
                break;
            case 4:
                System.out.println("(4). Calcula la media del 0 hasta el numero ingresado.");
                System.out.print("Ingresa un número para calcular su media con respecto al 0: ");
                media(read.nextDouble());
                break;
            case 5:
                System.out.println("(5). Calcula el promedio de la cantidad de números ingresados.");
                System.out.print("Ingresa una cantidad de números para calcular su promedio: ");
                sumaPromedio(read.nextInt());
                break;
            case 6:
                System.out.println("(6). Imprime los días de la semana.");
                diaSemana();
                break;
            case 7:
                System.out.println("(7). Imprime el modelo del juego de gato.");
                gato();
                break;
        }    
    }
}
