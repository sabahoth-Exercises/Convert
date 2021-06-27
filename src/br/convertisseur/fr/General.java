package br.convertisseur.fr;

import java.util.Random;
import java.util.Scanner;

import static br.convertisseur.fr.Devise.devise;
import static br.convertisseur.fr.Temperature.temperature;

public class General {

    static int choix;
    public static void salutation() {
        System.out.println( "\n\nBonjour-Bonsoir! Cela depend de votre fuseau horaire!\n" +
                "Moi, c'est convert! Un convertisseur simple cree par Brunnotte Wasaulua!\n" +
                "Coucou, bruna! Nous t'aimons!\n\n" +
                "Rappelez-moi votre nom, svp?\n(Veuillez saisir votre nom puis cliquez sur la touche enter:)\n"
        );
    }

    public static void intro(){
        Scanner sc = new Scanner( System.in );
        String nom = sc.nextLine();
        System.out.println("\nHeureux de faire votre connaissance, "+nom+"!"
        );


    }

    public static void convert(){
        Scanner sc = new Scanner( System.in );
        System.out.println("\nQuel type de conversion aimeriez-vous effectuer?\n"+
                "1 -> Convertir les temperatures;\n" +
                "2 -> Convertir les devises\n" +
                "3 -> Initier une conversion au hasard\n" +
                "4 -> Demander de l'aide\n"+
                "5 -> arreter le convertisseur"
        );

        choix = sc.nextInt();

        switch (choix){
            case 1 -> temperature();
            case 2 -> devise();
            case 3 -> hasard();
            case 4 -> aide();
            case 5 -> arreter();
            default -> repete();
        }


    }

    public static void aide(){
        Scanner sc = new Scanner( System.in );
        System.out.println("Section aide:\n" +
                "Utiliser ce convertisseur est simple. Premierement, choisissez un type de conversion.\n" +
                "Par exemple: Pour une conversion de temperature, tapez 1 puis la touche \'enter\'" +
                "\nAinsi de suite..."
        );
        convert();
    }

    public static void repete(){
        convert();
    }

    public static void hasard(){
        Random rand = new Random();
        switch(rand.nextInt(2)+1)
        // default range is from(0 to 1) +1 at the end makes the range from(1 to 2)
        {
            case 1 -> temperature();
            case 2 -> devise();
            default -> repete();
        }

    }

    public static void arreter(){
        System.out.println("\nC'est tout pour aujourd'hui!\nN'oubliez pas de dire a Brunnotte vos impressions!");
    }

}
