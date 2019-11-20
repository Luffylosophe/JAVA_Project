/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_project;

import java.util.Scanner;
import java.awt.Color;


/**
 *
 * @author MBANZA Lionel
 */
public class JAVA_PROJECT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
            String[] test = new String[9];
        
           GoodBoy Bruno = new GoodBoy();
           Bruno.createSentences(test);
           Bruno.settingStage1(test);
           inscriptionHomme(Bruno);
           
        
        //System.out.println(" "+test[2]+" ");
    }
    


    public static void inscriptionHomme(GoodBoy test) {
        int i = 0;
        Boolean[] personality = new Boolean[6];
        System.out.println("Bonjour, avant de démarrer l'aventure, \nnous allons vous soumettre à un test afin de savoir votre personnalité \n\n");
        Scanner question = new Scanner(System.in);
        System.out.println("Répondez simplement par oui ou par non aux questions posés \n\n");
        System.out.println("1ère Question : Avez-vous votre permis de conduire ? ");
        String reponse = question.nextLine();
        reponse.toLowerCase();
        if (reponse.equals("oui")) {
            test.setDrivingLicense(Boolean.TRUE);
            personality[i]= test.getDrivingLicense();
            i++;
        }
        else if (reponse.equals("non")) {
            test.setDrivingLicense(Boolean.FALSE);
            personality[i]= test.getDrivingLicense();
            i++;
        }
        else {
            System.out.println("Vous avez rentré une mauvaise réponse votre inscription va redémarrer");
            inscriptionHomme(test);
        }
        System.out.println(" Allez vous plus de 3 fois par semaine à la salle de sport ? ");
        reponse = question.nextLine();
        reponse.toLowerCase();
        if (reponse.equals("oui")) {
            test.setIsMuscled(Boolean.TRUE);
            personality[i]= test.getIsMuscled();
            i++;
        }
        else if (reponse.equals("non")) {
            test.setIsMuscled(Boolean.FALSE);
            personality[i]= test.getIsMuscled();
            i++;
        }
        else {
            System.out.println("Vous avez rentré une mauvaise réponse votre inscription va redémarrer");
            inscriptionHomme(test);
        }
        
        System.out.println(" Allez-vous plus de 4 fois par mois dans un restaurant type Fast-Food ? ");
        reponse = question.nextLine();
        reponse.toLowerCase();
        if (reponse.equals("oui")) {
            test.setIsFat(Boolean.TRUE);
            personality[i]= test.getIsFat();
            i++;
        }
        else if (reponse.equals("non")) {
            test.setIsFat(Boolean.FALSE);
            personality[i]= test.getIsFat();
            i++;
        }
        else {
            System.out.println("Vous avez rentré une mauvaise réponse votre inscription va redémarrer");
            inscriptionHomme(test);
        }
        
        System.out.println(" Lorsque vous parlez-vous sentez-vous écouté ? ");
        reponse = question.nextLine();
        reponse.toLowerCase();
        if (reponse.equals("oui")) {
            test.setIsCharismatic(Boolean.TRUE);
            personality[i]= test.getIsCharismatic();
            i++;
        }
        else if (reponse.equals("non")) {
            test.setIsCharismatic(Boolean.FALSE);
            personality[i]= test.getIsCharismatic();
            i++;           
        }
        else {
            System.out.println("Vous avez rentré une mauvaise réponse votre inscription va redémarrer");
            inscriptionHomme(test);
        }
        
        System.out.println(" Êtes-vous très persécuteur sur le physique d'une femme ? ");
        reponse = question.nextLine();
        reponse.toLowerCase();
        if (reponse.equals("oui")) {
            test.setIsBeautiful(Boolean.FALSE);
            personality[i]= test.getIsBeautiful();
            i++;
        }
        else if (reponse.equals("non")) {
            test.setIsBeautiful(Boolean.TRUE);
            personality[i]= test.getIsBeautiful();
            i++;
        }
        else {
            System.out.println("Vous avez rentré une mauvaise réponse votre inscription va redémarrer");
            inscriptionHomme(test);
        }
        
        System.out.println(" Êtes-vous drôle ");
        reponse = question.nextLine();
        reponse.toLowerCase();
        if (reponse.equals("oui")) {
            test.setIsFunny(Boolean.TRUE);
            personality[i]= test.getIsFunny();
            i++;
        }
        else if (reponse.equals("non")) {
            test.setIsFunny(Boolean.FALSE);
            personality[i]= test.getIsFunny();
            i++;
        }
        else {
            System.out.println("Vous avez rentré une mauvaise réponse votre inscription va redémarrer");
            inscriptionHomme(test);
        }
        System.out.println("Merci grâce à ce test nous pouvons définir votre personnalité et savoir votre compatibilité avec une femme\n\n");
        
        
        /*for (int k = 0; k<6; k++) {
               System.out.println(personality[k]);
           }*/
        System.out.println("Entrez votre nom")
    }

}