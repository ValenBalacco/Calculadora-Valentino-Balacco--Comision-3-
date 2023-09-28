import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        while (salir == false) {
            System.out.print("\nSelecciona una operacion: \n");
            System.out.print("Suma:(1) \n");
            System.out.print("Resta:(2) \n");
            System.out.print("Multiplicacion:(3) \n");
            System.out.print("Division:(4) \n");
            System.out.print("Salir:(5) \n");

            int menu = scanner.nextInt();


            if (menu == 1) {
                System.out.print("\nCual es el primer valor?");
                int numero1 = scanner.nextInt();
                System.out.print("\nCual es el segundo valor?");
                int numero2 = scanner.nextInt();
                int resultado = numero1 + numero2;
                System.out.print("\nEl resultado es: " + resultado);

            }
            if (menu == 2) {
                System.out.print("\nCual es el primer valor?");
                int numero1 = scanner.nextInt();
                System.out.print("\nCual es el segundo valor?");
                int numero2 = scanner.nextInt();
                int resultado = numero1 - numero2;
                System.out.print("\nEl resultado es: " + resultado);

            }
            if (menu == 3) {
                System.out.print("\nCual es el primer valor?");
                int numero1 = scanner.nextInt();
                System.out.print("\nCual es el segundo valor?");
                int numero2 = scanner.nextInt();
                int resultado = numero1 * numero2;
                System.out.print("\nEl resultado es: " + resultado);



            }
            if (menu == 4) {
                System.out.print("\nCual es el primer valor?");
                double numero1 = scanner.nextDouble();
                System.out.print("\nCual es el segundo valor?");
                double numero2 = scanner.nextDouble();
                double resultado = numero1 / numero2;
                System.out.print("\nEl resultado es: " + resultado);


            }
            if (menu == 5) {
             break;
            }
        }

        scanner.close();
    }
}