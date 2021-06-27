package br.convertisseur.fr;

import java.util.Scanner;

public class Devise {

    public static void devise(){
        System.out.println("\nConversion des devises:\n" +
                            "*---*---*---*---*---*--\n" +
                "Entrez une valeur:\n"+
                "\n1. Franc Congolais -> Dollar" +
                "\n2. Franc Congolais -> Euro" +
                "\n3. Dollar -> Franc Congolais" +
                "\n4. Dollar -> Euro " +
                "\n5. Euro -> Franc Congolais" +
                "\n6. Euro -> Dollar" +
                "\n7. Quitter"
        );

        Scanner sc = new Scanner( System.in);
        int dev = sc.nextInt();

        switch (dev){
            case 1 -> francDollar();
            case 2 -> francEuro();
            case 3 -> dollarFranc();
            case 4 -> dollarEuro();
            case 5 -> euroFranc();
            case 6 -> euroDollar();
            case 7 -> sortir();
            default -> repeter();
        }

    }

    private static void euroDollar() {
        System.out.println("\nConversion de euro a dollar\n" +
                            "--------------------------\n" +
                " Entrez une valeur:\n"
        );
        Scanner sc = new Scanner(System.in);
        double euro = sc.nextDouble();
        double dollar = (euro * 1.19);
        System.out.println(euro+"€ = "+dollar+"$");
        repeter();
    }

    private static void euroFranc() {
        System.out.println("\nConversion de euro a francs congolais\n" +
                            "-------------------------------------\n" +
                "Entrez une valeur:\n"
        );
        Scanner sc = new Scanner(System.in);
        double euro = sc.nextDouble();
        double franc = (euro * 2384.23);
        System.out.println(euro+"€ = "+franc+"FC");
        repeter();
    }


    private static void dollarEuro() {
        System.out.println("\nConversion de dollar a euro\n" +
                            "--------------------------\n" +
                "Entrez une valeur:\n"
        );
        Scanner sc = new Scanner(System.in);
        double dollar = sc.nextDouble();
        double euro = (dollar * 0.84);
        System.out.println(dollar+"$ = "+euro+"€");
        repeter();
    }

    private static void dollarFranc() {
        System.out.println("\nConversion de dollar a franc congolais\n" +
                            "--------------------------------------\n" +
                "Entrez une valeur:\n"
        );
        Scanner sc = new Scanner(System.in);
        double dollar = sc.nextDouble();
        double franc = (dollar * 1997.50);
        System.out.println(dollar+"$ = "+franc+"FC");
        repeter();
    }

    private static void francDollar() {
        System.out.println("\nConversion de franc congolais a dollar\n" +
                            "--------------------------------------\n" +
                "Entrez une valeur:\n"
        );
        Scanner sc = new Scanner(System.in);
        double franc = sc.nextDouble();
        double dollar = (franc * (1/1997.50));
        System.out.println(franc+"FC = "+dollar+"$");
        repeter();
    }

    private static void francEuro() {
        System.out.println("\nConversion de franc congolais a dollar\n" +
                "--------------------------------------\n" +
                "Entrez une valeur:\n"
        );
        Scanner sc = new Scanner(System.in);
        double franc = sc.nextDouble();
        double dollar = (franc * (1/2384.23));
        System.out.println(franc+"FC = "+dollar+"€");
        repeter();
    }

    private static void sortir() {
        br.convertisseur.fr.General.repete();
    }


    public static void repeter() {
        devise();
    }
}
