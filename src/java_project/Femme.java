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
    
    boolean isWellDressed;
    boolean isCooker;
    boolean isPretty;
    boolean isClean;
    boolean isFeminist;
    boolean isVegan;
    String[] answers;
    
    public Femme () {
        
    }
    
    public Femme ( String[] answers )
    {
        answers = new String[8];
    }

    public boolean getIsWellDressed() {
        return isWellDressed;
    }

    public void setIsWellDressed(boolean isWellDressed) {
        this.isWellDressed = isWellDressed;
    }
    
    
    
    

    public boolean getIsCooker() {
        return isCooker;
    }

    public void setIsCooker(boolean isCooker) {
        this.isCooker = isCooker;
    }

    public boolean getIsPretty() {
        return isPretty;
    }

    public void setIsPretty(boolean isPretty) {
        this.isPretty = isPretty;
    }

    public boolean getIsClean() {
        return isClean;
    }

    public void setIsClean(boolean isClean) {
        this.isClean = isClean;
    }

    public boolean getIsFeminist() {
        return isFeminist;
    }

    public void setIsFeminist(boolean isFeminist) {
        this.isFeminist = isFeminist;
    }

    public boolean getIsVegan() {
        return isVegan;
    }

    public void setIsVegan(boolean isVegan) {
        this.isVegan = isVegan;
    }


     public String presentation(){
        return super.presentation()+"\nEn cuisine je dirais que je me situe plutot a "+this.isCooker+"/100";
        //return phr;
    }
     
     public void settingAnswer1(String[] answers) {
         
        answers[0] = "Ce n'est pas une façon de parler à une femme ";
        answers[1] = " Heu..Bonsoir je m'appele"+"enchantée";
        answers[2] = " /Elle se met à marcher vite dans le sens contraire à vous/ ";
        
        answers[3] = " Ah, c'est une information très utile... ";
        answers[4] = " Qu'est ce que ?! ";
        answers[5] = " Ravie, bon je dois rentrer chez moi, merci du compliment ! ";
        
        answers[6] = " Je veux bien te le donner, ton approche a été sympathique ";
        answers[7] = " Non je dois vraiment rentrer chez moi  ";
        answers[8] = " Félicitations, tu dormira encore vierge ce soir ";
         
     }
     
     public void settingAnswer2(String[] answers) {
         
        answers[0] = "(1) Oui Allo, alors comment était ta journée ";
        answers[1] = "(2) Oui allo, désolé mais qui est ce déjà ? ";
        answers[2] = "(3) Ouais salut, je te rappelle j'ai une amie qui m'appelle la ";
        
        answers[3] = "(1)	Wow meuf, j'ai vu de ces fessiers auj au centre commercial ";
        answers[4] = "(2)	Je suis allé bosser aujourd'hui, et fais quelques courses.";
        answers[5] = "(3)	Oh tu sais rein de ouf, fumé tranquille chez moi au lit, jeux vidéos";
        
        answers[6] = "(1) T'es plutôt ennuyante au téléphone, tu veux pas qu'on se voit plutôt ?";
        answers[7] = "(2)'Tain ta voix me rappelle celle de mon grand père, bien grave. C'es chaud ";
        answers[8] = "(3)	J'aime bien t'entendre et discuter avec toi, j'espere te voir bientot.";
         
     }
     
     public void settingAnswer3(String[] answers) {
        
        answers[0] = " Oui. ";
        answers[1] = " Hahaha, non j'ose pas.. Je préfère regarder des chaines comme Luffylosophe, tu devrais t'abonner c'est mon youtubeur préféré ";
        answers[2] = " Je n'avais pas prévu que tu payes à ma place. ";
        
        answers[3] = " Je pense que tu as vraiment un problème avec les femmes ";
        answers[4] = " hmmmm j'aurai du commander celui-là \n\n La soirée continue et vous vous amusez bien ";
        answers[5] = " Je t'en commande un si tu veux ? ";
        
        answers[6] = " Je trouve qu'on a beaucoup de point commun, je suis vraiment content de t'avoir croisé dans cette rue ";
        answers[7] = " Tu vas y aller tout seul. ";
        answers[8] = " Mon père est mort... \n\n\n non je rigole relax ";
        
    }
     
     public void settingStage4(String[] sentences) {
        
       
    
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
