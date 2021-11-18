import java.util.Scanner;

public class ValidadorCedula {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cedula;
        boolean cedulaValida;

        // INGRESO DE LA CÉDULA
        do {
            System.out.print("Ingrese el numero de cédula: ");
            cedula = sc.nextLine();
            cedulaValida = true;
            // validar que tenga 10 dígitos
            if (cedula.length() ==  10){
                // validar que tenga unicamente números
                for (int i = 0; i < cedula.length(); i++) {
                    if (!Character.isDigit(cedula.charAt(i)) ) {
                        cedulaValida = false;
                    }
                }
                if (!cedulaValida){
                    System.out.println(" Unicamente debe contener números.\n\n");
                }
            }
            else{
                cedulaValida = false;
                System.out.println(" Unicamente debe contener 10 Dígitos.\n\n");
            }
        } while (!cedulaValida);


        
        int suma = 0;
        int digito;
        int resultado;
        // recorro los digitos hasta el penultimo
        for (int i = 0; i < cedula.length() -1; i++) {
            // transformo caracter a número
            digito = Character.getNumericValue(cedula.charAt(i));

            if (i%2 == 0){
                suma += (digito*2);
                if (digito*2 >= 10){
                    suma -= 9;
                }
            }
            else{
                suma += digito;
            }
        }

        // A la suma se le resta la decena superior para compararlo con el último dígito
        resultado = (suma%10 == 0) ? (suma%10) : (10 - suma%10);

        if(resultado == Character.getNumericValue(cedula.charAt(cedula.length()-1))){
            System.out.println("La cedula es válida");
        }
        else{
            System.out.println("La cedula No es válida");

        }

    }
}
