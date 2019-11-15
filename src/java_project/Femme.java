/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet;
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
public class Femme extends Personne {
    
    int kitchenSkilz;
    int feminite;

    public void setKitchenSkilz(int kitchenSkilz) {
        this.kitchenSkilz = kitchenSkilz;
    }

    public void setFeminite(int feminite) {
        this.feminite = feminite;
    }
    
    public Femme(){
        super();
    }
    
    public Femme(String nom, String prenom, int age, int kitchenSkilz , String preference,String interet){
        super(nom, prenom, age, preference,interet);
        this.kitchenSkilz = kitchenSkilz;
    }

    public int getKitchenSkilz() {
        return kitchenSkilz;
    }

    public int getFeminite() {
        return feminite;
    }
    
     public String presentation(){
        return super.presentation()+"\nEn cuisine je dirais que je me situe plutot a "+this.kitchenSkilz+"/100";
        //return phr;
    }
    
    public void ecriture(String nom, String prenom, int age,int kitchenSkilz, String preference, String interet) throws IOException{
               //ecriture dans un fichiers txt. reflechir comment mettre en parametre apre juste l'objet, pour avoir un truc global
        // pour homme et femme. et ecriture dans deux fichiers differents selon le sexe. a voir, pas obligatoire
        FileWriter out = null;
       try {
        
        out = new FileWriter ("femmes.txt",true); // mode ajout
        out.write(nom+"\t"+prenom+"\t"+String.valueOf(age)+"\t"+String.valueOf(kitchenSkilz)+"\t"+"\t"+preference+"\t"+interet);
        
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
       ArrayList listkitchenSkilz = new ArrayList();
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
          listkitchenSkilz.add(str[3]);
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
