/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_project;
import java.io.BufferedReader;
import java.util.Scanner;
import java.util.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author adala
 */
public abstract class Femme extends Personne {
    
    boolean isCooker;
    boolean isPretty;
    boolean isClean;
    boolean isFeminist;
    boolean isVegan;

    public boolean isIsCooker() {
        return isCooker;
    }

    public void setIsCooker(boolean isCooker) {
        this.isCooker = isCooker;
    }

    public boolean isIsPretty() {
        return isPretty;
    }

    public void setIsPretty(boolean isPretty) {
        this.isPretty = isPretty;
    }

    public boolean isIsClean() {
        return isClean;
    }

    public void setIsClean(boolean isClean) {
        this.isClean = isClean;
    }

    public boolean isIsFeminist() {
        return isFeminist;
    }

    public void setIsFeminist(boolean isFeminist) {
        this.isFeminist = isFeminist;
    }

    public boolean isIsVegan() {
        return isVegan;
    }

    public void setIsVegan(boolean isVegan) {
        this.isVegan = isVegan;
    }


     public String presentation(){
        return super.presentation()+"\nEn cuisine je dirais que je me situe plutot a "+this.isCooker+"/100";
        //return phr;
    }
    
    public void ecriture(String nom, String prenom, int age,int isCooker, String preference, String interet) throws IOException{
               //ecriture dans un fichiers txt. reflechir comment mettre en parametre apre juste l'objet, pour avoir un truc global
        // pour homme et femme. et ecriture dans deux fichiers differents selon le sexe. a voir, pas obligatoire
        FileWriter out = null;
       try {
        
        out = new FileWriter ("femmes.txt",true); // mode ajout
        out.write(nom+"\t"+prenom+"\t"+String.valueOf(age)+"\t"+String.valueOf(isCooker)+"\t"+"\t"+preference+"\t"+interet);
        
        out.write("\n");
        System.out.println("------writen-------");
       }catch ( FileNotFoundException e){
           System.out.println("fichier non trouve");
           e.printStackTrace();
       } catch (IOException e ){
           //System.out.println("Une erreur est survenue");
           e.printStackTrace();
       }
       
       // probleme : ecrse ce qui est deja la et fait une nouvelle ecriture, voir commment plutot ajouter a ce qui etait deja dans le fichier. 
       
        
        out.close(); //fermeture du fichier 
        
    }
    
    public void lecture() throws IOException{
       
       
       
       ArrayList listnom = new ArrayList();
       ArrayList listprenom = new ArrayList();
       ArrayList listcharisme = new ArrayList();
       ArrayList listage = new ArrayList();
       ArrayList listisCooker = new ArrayList();
       ArrayList listpreference = new ArrayList();
       ArrayList listinteret = new ArrayList();
       int taille = listnom.size();
      
    FileReader monFichier = null;
    BufferedReader tampon = null;

    try {
	monFichier = new FileReader("femmes.txt");
	tampon = new BufferedReader(monFichier);
        String [] str;
				
	while (true) {
	  // Lit une ligne de scores.txt
	  String ligne = tampon.readLine();
          //System.out.println("la ligne : "+ligne); // pour verifier que la ligne s'affiche
   	  // Vérifie la fin de fichier
 	  if (ligne == null)
	    break;
  	  
          System.out.println(ligne);
          // on classe chaque element dans des liste pour faciliter tri et recherhce.
          str = ligne.split("\\t");
          listnom.add(str[0]);
          listprenom.add(str[1]);
          listage.add(str[2]);
          listisCooker.add(str[3]);
          listpreference.add(str[4]); 
          listinteret.add(str[5]);
          
        } // Fin du while
    } catch (IOException exception) {
	exception.printStackTrace();
    } finally {
      try {
        tampon.close();
        monFichier.close();
      } catch(IOException exception1) {
          exception1.printStackTrace();
      }
    }
        //System.out.println("liste des nom : ");
        //System.out.println(listnom);
  }
    
}
