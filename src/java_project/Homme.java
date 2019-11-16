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
public abstract class Homme extends Personne {
    Boolean isCharismatic;
    Boolean isMuscled;
    Boolean  isFat;
    Boolean drivingLicense ;
    Boolean isBeautiful;
    Boolean isFunny; 
    int id; // un moyen de faire une recherche, ou s'authentifier 
    String[] stage1Phrases;
    String[] stage2Phrases;
    String[] stage3Phrases;
    String[] stage4Phrases;
    
    public Homme (){
        //super();
    }
    
    //__________________________________________________________________
    //constructeur avec parametre
    public Homme ( String[] stage1Phrases , String[]  stage2Phrases ,String[]  stage3Phrases , String[] stage4Phrases )
    {
        stage1Phrases = new String[8];
        stage2Phrases = new String[8];
        stage3Phrases = new String[8];
        stage4Phrases = new String[8];
    }
            
           
    

    public Boolean getIsCharismatic() {
        return isCharismatic;
    }

    public void setIsCharismatic(Boolean isCharismatic) {
        this.isCharismatic = isCharismatic;
    }

    public Boolean getIsMuscled() {
        return isMuscled;
    }

    public void setIsMuscled(Boolean isMuscled) {
        this.isMuscled = isMuscled;
    }

    public Boolean getIsFat() {
        return isFat;
    }

    public void setIsFat(Boolean isFat) {
        this.isFat = isFat;
    }

    public Boolean getDrivingLicense() {
        return drivingLicense;
    }

    public void setDrivingLicense(Boolean drivingLicense) {
        this.drivingLicense = drivingLicense;
    }

    public Boolean getIsBeautiful() {
        return isBeautiful;
    }

    public void setIsBeautiful(Boolean isBeautiful) {
        this.isBeautiful = isBeautiful;
    }

    public Boolean getIsFunny() {
        return isFunny;
    }

    public void setIsFunny(Boolean isFunny) {
        this.isFunny = isFunny;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    //____________________________________________________________________________
    
   /* public void inscriptionMan(){
        System.out.println("Votre nom: ");
        Scanner clavier = new Scanner(System.in);
        name = clavier.nextLine();
        System.out.println("Votre prenom: ");
        firstName = clavier.nextLine();
        System.out.println("Votre age: ");
        age = clavier.nextInt();
        System.out.println("Vous etes a la recherche d'un homme ou d'une femme ? ");
        preferences = clavier.nextLine();
        System.out.println("Vtre isCharismatic ( de 1 a 10) ? ");
        isCharismatic = clavier.nextBoolean();
       // Homme(nom,prenom,age,isCharismatic,humour,preference);
        System.out.println(name);
       
    } // pas utilisé */
    
    public void settingStage1(String[] stage1Phrases) {
        stage1Phrases[0] = "Hé mademoiselle t'es charmante, t'a un 06 ?";
        stage1Phrases[0] = "";
        stage1Phrases[0] = "";
        
        stage1Phrases[0] = "";
        stage1Phrases[0] = "";
        stage1Phrases[0] = "";
        
        stage1Phrases[0] = "";
        stage1Phrases[0] = "";
        stage1Phrases[0] = "";
            
       
    
    }
    
    public void settingStage2(String[] stage2Phrases) {
        stage2Phrases[0] = "(1) Oui Allo, alors comment était ta journée ";
        stage2Phrases[1] = "(2)	Oui allo, désolé mais qui est ce déjà ? ";
        stage2Phrases[2] = "(3)	Ouais salut, je te rappelle j'ai une amie qui m'appelle la ";
        
        stage2Phrases[3] = "(1)	Wow meuf, j'ai vu de ces fessiers auj au centre commercial ";
        stage2Phrases[4] = "(2)	Je suis allé bosser aujourd'hui, et fais quelques courses.";
        stage2Phrases[5] = "(3)	Oh tu sais rein de ouf, fumé tranquille chez moi au lit, jeux vidéos";
        
        stage2Phrases[6] = "(1)T'es plutôt ennuyante au téléphone, tu veux pas qu'on se voit plutôt ?";
        stage2Phrases[7] = "(2)'Tain ta voix me rappelle celle de mon grand père, bien grave. C'es chaud";
        stage2Phrases[8] = "(3)	J'aime bien t'entendre et discuter avec toi, j'espere te voir bientot.";
        
       
    
    }
    
    public void settingStage3(String[] stage3Phrases) {
        
        stage3Phrases[0] = "";
        stage3Phrases[0] = "";
        stage3Phrases[0] = "";
        
        stage3Phrases[0] = "";
        stage3Phrases[0] = "";
        stage3Phrases[0] = "";
        
        stage3Phrases[0] = "";
        stage3Phrases[0] = "";
        stage3Phrases[0] = "";
        
       
    
    }
    
    public void settingStage4(String[] stage4Phrases) {
        
       
    
    }
    
    @Override
    public String presentation(){
        return super.presentation()+"\nJ'ai un humour de "+" et un isCharismatic de "+this.isCharismatic;
        //return phr;
    }
    
    public void ecriture(String nom, String prenom, int age, int isCharismatic,int humour, String preference, String interet) throws IOException {
        //ecriture dans un fichiers txt. reflechir comment mettre en parametre apre juste l'objet, pour avoir un truc global
        // pour homme et femme. et ecriture dans deux fichiers differents selon le sexe. a voir, pas obligatoire
        FileWriter out = null;
       try {
        
        out = new FileWriter ("hommes.txt",true); // mode ajout
        out.write(nom+"\t"+prenom+"\t"+String.valueOf(age)+"\t"+String.valueOf(isCharismatic)+"\t"+String.valueOf(humour)+"\t"+preference+"\t"+interet);
        
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
       ArrayList listisCharismatic = new ArrayList();
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
          listisCharismatic.add(str[3]);
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
       
        
     

