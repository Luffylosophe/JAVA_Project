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
    
  protected String name;
  protected String firstName;
  protected int age;
  int satisfaction;
  protected String interest;
  int attempts;
  private String position;
  protected String[] personality;
  protected String[] preferences; 
  
   public Personne(){
        System.out.println("Nouvelle personne");
        name = "ADOTEVI";
        firstName = "Alan";
        age = 23;
        
    }
     public Personne(String name, String firstName, int age, String preferences, String interest){
        System.out.println("Nouvelle personne");
        this.name = name;
        this.firstName = firstName;
        this.age = age;
        this.interest = interest;
        
    }

     // Getter et Setter __________________________________________________________
    public String getPosition() {
        return position;
    }

  
    public void setPosition(String position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }
    
       public void setInterest(String interet) {
        this.interest = interet;
    }

    public String getInterest() {
        return interest;
    }

    public String getfirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    public int getSatisfaction() {
        return satisfaction;
    }

    public int getAttempts() {
        return attempts;
    }

    public void setName(String name) {
        this.name = name;
    }
    
     

    public void setFirstName(String prenom) {
        this.firstName = prenom;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSatisfaction(int satisfaction) {
        this.satisfaction = satisfaction;
    }

    public void setAttempts(int attempts) {
        this.attempts = attempts;
    }
    
    public void createPersonality( String[] personality  ) {
        personality = new String[6] ;
    }
    //____________________________________________________________________
    
     //Retourne la description de la personne
  public String presentation(){ // on pourra modifier comment la personne se presente apres 
    return "Bonjour, je m'appelle "+this.name+" "+this.firstName+", j'ai "+this.age+" ans. J'ai plutot une preference pour les "+this.preferences+".Mes centres d'interets sont :"+this.interest ;
  }
  
}

