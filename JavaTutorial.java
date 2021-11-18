import java.util.Arrays;
import java.util.Scanner;
public class JavaTutorial {
    
    public static void main(String[] args) {
        
        // TIPOS DE DATOS PRIMITIVOS
        int entero = 5;
        long enteroLargo = 121312;
        char caracter = 'f';
        double decimal_D = 123.123; // ocupa más memoria (64Bytes) - más preciso respecto float
        float decimal_F = 123.123f; // (32Bytes)
        boolean esVerdad = true;

        // TIPOS DE DATOS OBJETOS
        String animal = "gato";

        // ARREGLOS UNIDIMENCIONALES
        String arregloDeAnimales[] = new String[10];
        String arregloDeColores[] = new String[]{"rojo", "azul","blanco", "negro"};

        arregloDeAnimales[0] = animal;
        arregloDeAnimales[1] = "perro";
        arregloDeAnimales[2] = "vaca";

        // arregloDeAnimales[11] = "tigre";
        // arregloDeColores[4] = "amarillo";


        // OPERADOR TERNARIO
        //operadorTernario();


        // CICLOS
        //cicloFor();
        //cicloWhile();
        //cicloDoWhile();


        serie();


        //System.out.println(decimal_D+"  "+decimal_F);
        //System.out.println(Arrays.toString(arregloDeAnimales));
        //System.out.println(Arrays.toString(arregloDeColores));
        


    }
    
    public static void cicloFor(){
        System.out.println("CICLO FOR");
        String arregloDeColores[] = new String[]{"rojo", "azul","blanco", "negro"};
        for (int i = 0; i < arregloDeColores.length; i++) {
            System.out.println(arregloDeColores[i]);
        }

    }

    public static void cicloWhile(){
        System.out.println("CICLO WHILE");
        String arregloDeColores[] = new String[]{"rojo", "azul","blanco", "negro"};
        int i = 0;
        int numColores = arregloDeColores.length;
        while (i < numColores) {
            System.out.println(arregloDeColores[i]);
            i ++; // ó i = i+1  ó  i += 1
        }

    }

    public static void cicloDoWhile(){
        System.out.println("CICLO DO WHILE");
        String arregloDeColores[] = new String[]{"rojo", "azul","blanco", "negro"};
        int i = 0;
        int numColores = arregloDeColores.length;
        do {
            System.out.println(arregloDeColores[i]);
            i ++; 
        }while (i < numColores) ;

    }

    public static void operadorTernario(){

        int a = 5;
        int b = 10;
        int mayor;

        mayor = (a>b) ? a : b;
        System.out.println("el mayor es: "+mayor);

        if (a>b){
            mayor = a;
        }
        else{
            mayor = b;
        }
        System.out.println("el mayor es: "+mayor);


    }

    public static void serie(){
        int serie = 1;
		boolean sumar=true;
		int cont;
		String cadena="Serie: ";
		
		System.out.println("Indique cuantos numeros de la serie quiere ver: " );
		
		Scanner sc = new Scanner (System.in);
		cont=sc.nextInt();
		
		do{
			
			cadena=cadena.concat(String.valueOf(serie) + "  ");	
			cont --;	
			if(sumar==true){		
				serie+=4;
			}else{		
				serie-=2;
			}
			
			sumar=!sumar;
		}while(cont>0);
		
		System.out.println(cadena);
    }
}
