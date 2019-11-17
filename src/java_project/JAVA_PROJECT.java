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
        
        System.out.println(" "+test[2]+" ");
    }
    
}
