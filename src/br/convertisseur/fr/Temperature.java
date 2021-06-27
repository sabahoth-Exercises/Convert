package br.convertisseur.fr;

import java.util.Scanner;

public class Temperature {

    public static void temperature(){
        System.out.println("Conversion des temperatures:\n" +
                            "---*---*---*---*---*---*---*" +
                "\n1. Kelvin -> Celsius" +
                "\n2. Kelvin -> Fahrenheit" +
                "\n3. Celsius -> Kelvin" +
                "\n4. Celsius -> Fahrenheit " +
                "\n5. Fahrenheit -> Celsius" +
                "\n6. Fahrenheit -> Kelvin" +
                "\n7. Quitter"
        );

        Scanner sc = new Scanner( System.in);
        int temp = sc.nextInt();

        switch (temp){
            case 1 -> kelvinCelsius();
            case 2 -> kelvinFahernheit();
            case 3 -> celsiusKelvin();
            case 4 -> celsiusFahrenheit();
            case 5 -> fahrenheitCelsius();
            case 6 -> fahrenheitKelvin();
            case 7 -> sortir();
            default -> repeter();
        }

    }

    private static void sortir() {

        br.convertisseur.fr.General.repete();
    }

    private static void fahrenheitKelvin() {
        System.out.println("\nConversion de Fahrenheit a Kelvin \n" +
                "----------------------------------\n" +
                "Entrez une valeur:\n"
        );
        Scanner sc = new Scanner( System.in );
        double fahr = sc.nextDouble();
        double kel = (((fahr - 32) * 5/9 )+ 273.15 );
        System.out.println(fahr +"°F = "+kel+"K");
        repeter();
    }

    private static void fahrenheitCelsius() {
        System.out.println("\nConversion de Fahrenheit a Celsius  \n" +
                "----------------------------------\n" +
                "Entrez une valeur:\n"
        );
        Scanner sc = new Scanner( System.in );
        double fahre = sc.nextDouble();
        double cels = ((fahre - 32) * (5/9));
        System.out.println(fahre +"°F = "+cels+"°C");
        repeter();
    }

    private static void celsiusFahrenheit() {
        System.out.println("\nConversion de Celsius a  Fahrenheit\n" +
                            "----------------------------------\n" +
                "Entrez une valeur:\n"
        );
        Scanner sc = new Scanner( System.in );
        double cel = sc.nextDouble();
        double fahr = (cel * (9/5)) + 32;
        System.out.println(cel +"°C = "+fahr+"°F");
        repeter();

    }

    private static void celsiusKelvin() {
        System.out.println("\nConversion de Celsius a Kelvin\n" +
                "----------------------------------\n" +
                "Entrez une valeur:\n"
        );
        Scanner sc = new Scanner( System.in );
        double cel = sc.nextDouble();
        double kel = (cel + 273.15);
        System.out.println(cel +"°C = "+kel+"K");
        repeter();
    }

    private static void kelvinFahernheit() {
        System.out.println("\nConversion de Kelvin a Fahrenheit \n" +
                "----------------------------------\n" +
                "Entrez une valeur:\n"
        );
        Scanner sc = new Scanner( System.in );
        double kelv = sc.nextDouble();
        double fahr = ((kelv - 273.15) * (9/5) )+ 32;
        System.out.println(kelv +"K = "+fahr+"°F");
        repeter();
    }


    private static void kelvinCelsius() {
        System.out.println("\nConversion de Kelvin a Celsius \n" +
                "----------------------------------\n" +
                "Entrez une valeur:\n"
        );
        Scanner sc = new Scanner( System.in );
        double kelv = sc.nextDouble();
        double cel = (kelv - 273.15);
        System.out.println(kelv +"K = "+cel+"°C");
        repeter();
    }

    public static void repeter() {
        temperature();
    }
}
