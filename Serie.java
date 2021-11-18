import java.util.Scanner;
public class Serie {

    public static void main(String args[]){

         //Paso 1. Variables para generar números primos
        Scanner teclado = new Scanner( System.in );
        System.out.println( "Ingrese el número de términos a generar" ); 
        int nro = teclado.nextInt();
        int cont = 0;

         //Paso 2. Variables para generar números primos
        var numPrimo = 2;
        boolean esPrimo;

        //Paso 3. Variables para el trabajo con Fibonacci
        int fibo = 0;
        int primero = 0; 
        int segundo = 1;

        //Paso 4. Variables para el signo.
        int signo = 1;
        int contSignos = 1;
        int contCambioSigno = 1;
        char simboloSigno = '+';

        //Paso 5. Otras variables 
        Double suma = 0.0;
        Double termino = 0.0;
        
        //Generación de términos
        int k;
        while (cont < nro) { 
            // PROCESO PARA CALCULAR EL NUMERO PRIMO
            do {  
                numPrimo ++; 
                esPrimo = true;
                k = 2;
                while (k < numPrimo) {
                    if (numPrimo % k == 0) { 
                        esPrimo = false;
                    }
                    k ++; 
                }
            } while (esPrimo == false);

            //GENERO EL VALOR DE LA SERIE DE FIBONACCI
            
            // El primer termino de la serie de fibonacci es 0 = primero;
            if (cont == 0) {
                fibo = primero;
            }
            else{
                fibo = primero + segundo;
            }
            primero = segundo;
            segundo = fibo;

            //CAMBIO EL SIMBOLO DEL SIGNO A IMPRIMIR, (+ o -)
            if (signo > 0) simboloSigno='+';
            else simboloSigno ='-';

            //Si la posicion de la serie es PAR, imprimo el exponente en el denominador
            if (cont % 2 == 0) {
                System.out.printf(" %c(%d/%d^%d)\n", simboloSigno, fibo, numPrimo, Math.abs(fibo-numPrimo));
                termino = (fibo / Math.pow(numPrimo, Math.abs(fibo - numPrimo)) )* signo;
            }
            //Si la posicion de la serie es IMPAR, imprimo el exponente en el denominador
            else{ 
                System.out.printf(" %c(%d^%d/%d)\n", simboloSigno, fibo,  Math.abs(fibo-numPrimo), numPrimo);
                termino =  (Math.pow(fibo, Math.abs(fibo - numPrimo)) / numPrimo) * signo;
            }
            // Acumulo el valor del resultado
            suma = suma + termino;


            if (contCambioSigno >= contSignos) {
                // alerno el signo
                signo = signo * (-1);
                // incremento el contador de signos
                contSignos = contSignos + 1;
                // reinicio
                contCambioSigno = 0;
            }
            // 
            contCambioSigno++;

            //Incremento el contador general
            cont = cont + 1;
        }
        System.out.printf("Suma = %.2f\n\n", suma); 
        //System.getProperties().forEach((kk, v) -> System.out.printf("%s: %s\n", kk, v));
    }
}           