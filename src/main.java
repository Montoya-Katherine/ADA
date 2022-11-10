import java.util.Scanner;

public class main {
    public static void main(String[] args) {
       /* Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la edad de la persona correspondiente");
        int edad = scanner.nextInt();
        if (edad < 18){
            System.out.println("No puede votar");
        } else {
            System.out.println("Puede votar");
        }
-------2
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de horas trabajadas");
        int horasTrabajadas = scanner.nextInt();
        System.out.println("Ingrese valor por hora trabajada");
        int pagoXHora = scanner.nextInt();
        int pagoFinal;

        if(horasTrabajadas > 40){
            int cantHoras= horasTrabajadas - 40;

            pagoFinal = pagoXHora * 40 + (cantHoras * 2) ;
        } else {
            pagoFinal = pagoXHora * horasTrabajadas;
        }

        System.out.println("El pago final es de $ = " + pagoFinal);

        // --------3

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese presupuesto para regalo");

         int presupuesto = scanner.nextInt();

         if (presupuesto >= 251){
             System.out.println("Puede comprar un anillo ");
         } else if (presupuesto >= 101 && presupuesto < 251) {
             System.out.println("Puede comprar flores");
         } else if (presupuesto > 10 && presupuesto <= 100 ) {
             System.out.println("Puede comprar chocolates ");
         } else {
             System.out.println("Puede comprar un tarjeta");
         }
        // --------4

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese horas de estacionamiento utilizadas: ");

        int horas = scanner.nextInt();
        int costoTotal;

        if (horas < 3) {
            costoTotal = horas * 5;
        } else if (horas < 6) {
            costoTotal = horas * 4;
        } else if (horas < 11) {
            costoTotal = horas * 3;
        } else {
            costoTotal = horas * 2;
        }

        System.out.println(" Total a pagar: " + costoTotal);
//----------5 falta ingresar los nombres


        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese edad 1");
        float edad1 = scanner.nextFloat();

        System.out.println("Ingrese edad 2");
        float edad2 = scanner.nextFloat();

        System.out.println("Ingrese edad 1");
        float edad3 = scanner.nextFloat();


            if (edad1 < edad2) {
                if (edad1 < edad3) {
                    System.out.println("La persona de menor edad es " + edad1);
                } else {
                    System.out.println("La persona de menor edad es " + edad3);

                }
            } else if (edad2 < edad3) {
                System.out.println("La persona de menor edad es "  + edad2);
            } else {
                System.out.println("La persona de menor edad es " +  edad3);
            }*/
//------------6
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese costo del producto: ");
        double precio = scanner.nextInt();
        double costoTotal;
        int descuento;

        if (precio > 100){
           if (precio >= 200){
               descuento = 15;
               costoTotal = precio - (precio * 0.15);
           }else {
               descuento = 12;
               costoTotal = precio - ( precio * 0.12);
           }
        }else {
            descuento = 10;
            costoTotal = precio - ( precio * 0.10);
        }

        System.out.println( "Total: " + costoTotal  +", con un descuento de: " + descuento +"%");
    }
}