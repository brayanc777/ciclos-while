package org.example;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        String name,cc;
        Integer option, cantidad;
        Double costoTotal=0.0;
        Double sumaDeCostos=0.0;
        Scanner lea = new Scanner(System.in);

        System.out.println("PELUCHITOS SA");
        System.out.println(
                "1. Cumpleanhos: $180.000 \n" +
                "2. Dia de la mujer: $60.000 \n" +
                "3. Baby shawers: $250.000 \n" +
                "4. Salir y terminar");

        System.out.println("Elija su ancheta: ");
        option = lea.nextInt();
        do{

            switch(option){
                case 1:
                    System.out.println("digita cuantas anchetas de cumpleanhos quieres: ");
                    cantidad = lea.nextInt();
                    costoTotal=costoTotal+sumaDeCostos;
                    sumaDeCostos=180000.0*cantidad;
                    System.out.println("el costo es de: $" + sumaDeCostos);
                    lea.nextLine();
                    System.out.println("Deseas anhadir otra ancheta?");
                    option = lea.nextInt();
                    System.out.println(
                        "1. Cumpleanhos: $180.000 \n" +
                                "2. Dia de la mujer: $60.000 \n" +
                                "3. Baby shawers: $250.000 \n" +
                                "4. Salir y terminar");
                    break;
                case 2: System.out.println("digita cuantas anchetas de la mujer quieres: ");
                    cantidad = lea.nextInt();
                    sumaDeCostos=180000.0*cantidad;
                    sumaDeCostos=60000.0*cantidad;
                    System.out.println("el costo es de: $" + sumaDeCostos);
                    lea.nextLine();
                    System.out.println("Deseas anhadir otra ancheta?");
                    option = lea.nextInt();
                    System.out.println(
                        "1. Cumpleanhos: $180.000 \n" +
                                "2. Dia de la mujer: $60.000 \n" +
                                "3. Baby shawers: $250.000 \n" +
                                "4. Salir y terminar");

                    break;
                case 3: System.out.println("digita cuantas anchetas de babyshawers quieres: ");
                    cantidad = lea.nextInt();
                    sumaDeCostos=180000.0*cantidad;
                    sumaDeCostos=250000.0*cantidad;
                    System.out.println("el costo es de: $" + sumaDeCostos);
                    lea.nextLine();
                    System.out.println("Deseas anhadir otra ancheta?");
                    option = lea.nextInt();
                    System.out.println(
                        "1. Cumpleanhos: $180.000 \n" +
                                "2. Dia de la mujer: $60.000 \n" +
                                "3. Baby shawers: $250.000 \n" +
                                "4. Salir y terminar");
                    break;
                case 4: System.out.println("----- gracias y hasta luego -----");
                option = lea.nextInt();
                    break;
                default:System.out.println("----- papi sea serio -----");
                    break;
            }

        }while(option!=4);
        System.out.println("Total: $" + costoTotal);

    }
}