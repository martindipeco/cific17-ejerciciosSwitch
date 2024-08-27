import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //ejemplo 1 días de la semana
        System.out.println("Ingresa un número del 1 al 7");
        //proximamente: try catch para evitar NumberFormatException
        int diaSemana = scanner.nextInt();
        String nombreDia;
        switch (diaSemana) {
            case 1:
                nombreDia = "Lunes";
                break;
            case 2:
                nombreDia = "Martes";
                break;
            case 3:
                nombreDia = "Miércoles";
                break;
            case 4:
                nombreDia = "Jueves";
                break;
            case 5:
                nombreDia = "Viernes";
                break;
            case 6:
                nombreDia = "Sábado";
                break;
            case 7:
                nombreDia = "Domingo";
                break;
            default:
                nombreDia = "Día no válido";
                break;
        }
        System.out.println("Que tengas un buen " + nombreDia);

        //ejemplo 2: calculadora simple
        System.out.println("Ingresá un número");
        //proximamente try catch para evitar number format exception
        double num1 = scanner.nextDouble();
        System.out.println("Ingresá otro número");
        double num2 = scanner.nextDouble();

        // Consumir la linea "residual", para no tratar de leer una string vacia y provocar una excepción "out of range"
        //porque nextDouble() lee el número pero no consume el (\n) que se genera al presionar enter
        //entonces antes de hacer un nuevo pedido de input, es necesario consumir ese caracter de salto de línea
        scanner.nextLine();

        System.out.println("Ingresa ´+´, ´-´, ´*´ o ´/´");
        char operador = scanner.nextLine().charAt(0);
        double resultado;
        switch (operador) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    // Manejo de división por cero
                    resultado = Double.NaN;
                    System.out.println("No se puede dividir por 0");
                }
                break;
            default:
                resultado = Double.NaN; // Operador no válido
                break;
        }
        System.out.println("Resultado: " + resultado);

        //Ejemplo 3: Clasificación de calificaciones
        System.out.println("Ingrese su calificación numérica entre 1 y 100");
        int calificacion = scanner.nextInt();
        char clasificacion;
        switch (calificacion / 10) {
            case 10:
            case 9:
                clasificacion = 'A';
                break;
            case 8:
                clasificacion = 'B';
                break;
            case 7:
                clasificacion = 'C';
                break;
            case 6:
                clasificacion = 'D';
                break;
            default:
                clasificacion = 'F';
                break;
        }
        System.out.println("Clasificación: " + clasificacion);

    }
}