/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_project;

/**
 *
 * @author MBANZA Lionel
 */
public class Personne {
    
  String nom;
  String prenom;
  int age;
  String preference;
  String tentatives, interet;
  int satisfaction;
  
  
   public Personne(){
        System.out.println("Nouvelle personne");
        nom = "ADOTEVI";
        prenom = "Alan";
        age = 23;
        
    }
     public Personne(String nom, String prenom, int age, String preference, String interet){
        System.out.println("Nouvelle personne");
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.preference = preference;
        this.interet = interet;
        
    }

 
    
    // Getter et Setter __________________________________________________________

    public String getNom() {
        return nom;
    }
    public String getPreference() {
        return preference;
    }
       public void setInteret(String interet) {
        this.interet = interet;
    }

    public String getInteret() {
        return interet;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getAge() {
        return age;
    }

    public int getSatisfaction() {
        return satisfaction;
    }

    public String getTentatives() {
        return tentatives;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
     public void setPreference(String preference) {
        this.preference = preference;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSatisfaction(int satisfaction) {
        this.satisfaction = satisfaction;
    }

    public void setTentatives(String tentatives) {
        this.tentatives = tentatives;
    }
    //____________________________________________________________________
    
     //Retourne la description de la personne
  public String presentation(){ // on pourra modifier comment la personne se presente apres 
    return "Bonjour, je m'appelle "+this.nom+" "+this.prenom+", j'ai "+this.age+" ans. J'ai plutot une preference pour les "+this.preference+".Mes centres d'interets sont :"+this.interet ;
  }
  
}

