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
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;


/**
 *
 * @author adala
 */
public class Homme extends Personne {
    int charisme;
    String morphologie;
    Boolean aLepermis ;
    int humour; 
    int id; // un moyen de faire une recherche, ou s'authentifier 
    
    //__________________________________________________________________
    public Homme(){
        super();
    }
    //constructeur avec parametre
    public Homme(String nom, String prenom, int age, int charisme,int humour, String preference,String interet){
        super(nom, prenom, age, preference,interet);
        this.charisme = charisme;
        this.humour = humour;
    }

    public int getCharisme() {
        return charisme;
    }

    public String getMorphologie() {
        return morphologie;
    }

    public Boolean getaLepermis() {
        return aLepermis;
    }

    public int getHumour() {
        return humour;
    }

    public void setCharisme(int charisme) {
        this.charisme = charisme;
    }

    public void setMorphologie(String morphologie) {
        this.morphologie = morphologie;
    }

    public void setaLepermis(Boolean aLepermis) {
        this.aLepermis = aLepermis;
    }

    public void setHumour(int humour) {
        this.humour = humour;
    }
    //____________________________________________________________________________
    
    public void inscriptionMan(){
        System.out.println("Votre nom: ");
        Scanner clavier = new Scanner(System.in);
        nom = clavier.nextLine();
        System.out.println("Votre prenom: ");
        prenom = clavier.nextLine();
        System.out.println("Votre age: ");
        age = clavier.nextInt();
        System.out.println("Vous etes a la recherche d'un homme ou d'une femme ? ");
        preference = clavier.nextLine();
        System.out.println("Vtre charisme ( de 1 a 10) ? ");
        charisme = clavier.nextInt();
       // Homme(nom,prenom,age,charisme,humour,preference);
        System.out.println(nom);
       
    } // pas utilisé
    
    @Override
    public String presentation(){
        return super.presentation()+"\nJ'ai un humour de "+this.humour+" et un charisme de "+this.charisme;
        //return phr;
    }
    
    public void ecriture(String nom, String prenom, int age, int charisme,int humour, String preference, String interet) throws IOException {
        //ecriture dans un fichiers txt. reflechir comment mettre en parametre apre juste l'objet, pour avoir un truc global
        // pour homme et femme. et ecriture dans deux fichiers differents selon le sexe. a voir, pas obligatoire
        FileWriter out = null;
       try {
        
        out = new FileWriter ("hommes.txt",true); // mode ajout
        out.write(nom+"\t"+prenom+"\t"+String.valueOf(age)+"\t"+String.valueOf(charisme)+"\t"+String.valueOf(humour)+"\t"+preference+"\t"+interet);
        
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
       ArrayList listhumour = new ArrayList();
       ArrayList listpreference = new ArrayList();
       ArrayList listinteret = new ArrayList();
       int taille = listnom.size();
      
    FileReader monFichier = null;
    BufferedReader tampon = null;

    try {
	monFichier = new FileReader("hommes.txt");
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
          listcharisme.add(str[3]);
          listhumour.add(str[4]);
          listpreference.add(str[5]); 
          listinteret.add(str[6]);
          
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
  } // Fin de main 
    
    /*public void recherche(String nom) throws IOException{
        ArrayList listnom = new ArrayList();
        ArrayList listprenom = new ArrayList();
        FileReader monFichier = null;
        BufferedReader tampon = null;
        String buff;
        StringBuffer inputBuffer = new StringBuffer();
        String inputStr;

    try {
	monFichier = new FileReader("hommes.txt");
	tampon = new BufferedReader(monFichier);
        String [] str;
        
				
	while (true) {
	  // Lit une ligne de scores.txt
	  String ligne = tampon.readLine();
          //System.out.println("la ligne : "+ligne); // pour verifier que la ligne s'affiche
   	  // Vérifie la fin de fichier
 	  if (ligne == null)
	    break;
  	  //System.out.println(ligne);
          // on classe chaque element dans des liste pour faciliter tri et recherhce.
          str = ligne.split("\\t");
          listnom.add(str[0]);
          buff = str[0];// on met le nom dans une variable tampon
          if( nom.equalsIgnoreCase(buff)){ // trouve un moyen maintenant de supprimer la ligne correspondante
            System.out.println("trouve");
            inputBuffer.append(ligne);
            inputStr = inputBuffer.toString();
            
            
            
        }
          //listprenom.add(str[1]);
         
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
    
    
    } */
    
    public void supprimerHomme (String nom){
            try {
        // input the file content to the StringBuffer "input"
        BufferedReader file = new BufferedReader(new FileReader("hommes.txt"));
        String line;
        StringBuffer inputBuffer = new StringBuffer();
        String [] str;
        String buff;
        ArrayList listnom = new ArrayList();
        

        while ((line = file.readLine()) != null) {
          str = line.split("\\t");
          //listnom.add(str[0]);
          buff = str[0];// on met le nom dans une variable tampon
          if( nom.equalsIgnoreCase(buff)){
              System.out.println("trouve");
              line  = file.readLine();
          }
          inputBuffer.append(line);
          inputBuffer.append('\n');
        }
        String inputStr = inputBuffer.toString();

        file.close();

        System.out.println(inputStr); // check that it's inputted right

        // this if structure determines whether or not to replace "0" or "1"
       

        // check if the new input is right
        System.out.println("----------------------------------\n"  + inputStr);

        // write the new String with the replaced line OVER the same file
        FileOutputStream fileOut = new FileOutputStream("hommes.txt");
        fileOut.write(inputStr.getBytes());
        fileOut.close();

    } catch (Exception e) {
        System.out.println("Problem reading file.");
    }
    }
    
   
    
}
       
        
     

