/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;




/**
 *
 * @author MBANZA Lionel
 */
public class Game {

JFrame window;
Container con;
JPanel titleNamePanel, startButtonPanel, mainTextPanel, choiceButtonPanel, playerPanel;
JLabel titleNameLabel, satisfactionLabel, placeLabel, placeLabelName, satisfactionLabelNumber;
JButton startButton, choice1, choice2, choice3, choice4;
JTextArea mainTextArea;
int satisfaction;
String lieu;

TitleScreenHandler tsHandler = new TitleScreenHandler();
ChoiceHandler choiceHandler = new ChoiceHandler();


Font titleFont = new Font("Times New Roman", Font.PLAIN, 50);
Font normalFont = new Font("Times New Roman", Font.PLAIN, 25);

    public static void main(String[] args) {
        
        new Game();
    }
    public Game() {
    
    window = new JFrame();
    window.setSize(800,600);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.getContentPane().setBackground(Color.black);
    window.setLayout(null);
    con = window.getContentPane();
           
    titleNamePanel = new JPanel();
    titleNamePanel.setBounds(100, 100, 600, 150);
    titleNamePanel.setBackground(Color.BLACK);
    titleNameLabel =  new JLabel("FLIRTING SIMULATOR <3");
    titleNameLabel.setForeground(Color.WHITE);
    titleNameLabel.setFont(titleFont);
    
    startButtonPanel = new JPanel();
    startButtonPanel.setBounds(300, 400, 200, 100);
    startButtonPanel.setBackground(Color.black);
    
    startButton = new JButton();
    startButton.setBackground(Color.magenta);
    startButton.setForeground(Color.white);
    startButton.setFont(normalFont);
    startButton.setText("PLAY");
    startButton.setMaximumSize(new Dimension(100,100));
    startButton.setPreferredSize(new Dimension(100,50));
    startButton.addActionListener(tsHandler); // quand je clique sur le bouton, il appele la fonction tsHandler
    startButton.setFocusPainted(false);
    
    
    titleNamePanel.add(titleNameLabel);
    startButtonPanel.add(startButton);
    con.add(titleNamePanel);
    con.add(startButtonPanel);
    
    window.setVisible(true);
    }
    
    public void createGameScreen()
    {
        
        
        
        titleNamePanel.setVisible(false);
        startButtonPanel.setVisible(false);
        
        
        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(100,100,600,250);
        mainTextPanel.setBackground(Color.black);
        con.add(mainTextPanel);
        
        
        mainTextArea = new JTextArea("Ici entrer phrase du jeu. blablablablablablablablablablablablablablablablablablablablablablablabla");
        mainTextArea.setBounds(100,100,600,250);
        mainTextArea.setBackground(Color.black);
        mainTextArea.setForeground(Color.white);
        mainTextArea.setFont(normalFont);
        mainTextArea.setLineWrap(true); //pour mettre automatiquement à la ligne quand on atteint les limites de la fenêtre
        mainTextPanel.add(mainTextArea);
        
        choiceButtonPanel = new JPanel();
        choiceButtonPanel.setBounds(50,350,700,150);
        choiceButtonPanel.setBackground(Color.black);
        choiceButtonPanel.setLayout(new GridLayout(4,1));
        con.add(choiceButtonPanel);
        
        choice1 = new JButton("phrase1");
        choice1.setBackground(Color.black);
        choice1.setForeground(Color.white);
        choice1.setFont(normalFont);
        choice1.setMaximumSize(new Dimension(100,100));
        choice1.setPreferredSize(new Dimension(100,50));
        choiceButtonPanel.add(choice1);
        choice1.setFocusPainted(false);
        
        choice2 = new JButton("phrase2");
        choice2.setBackground(Color.black);
        choice2.setForeground(Color.white);
        choice2.setFont(normalFont);
        choice2.setMaximumSize(new Dimension(100,100));
        choice2.setPreferredSize(new Dimension(100,50));
        choiceButtonPanel.add(choice2);
        choice2.setFocusPainted(false);
        
        choice3 = new JButton("phrase3");
        choice3.setBackground(Color.black);
        choice3.setForeground(Color.white);
        choice3.setFont(normalFont);
        choice3.setMaximumSize(new Dimension(100,100));
        choice3.setPreferredSize(new Dimension(100,50));
        choiceButtonPanel.add(choice3);
        choice3.setFocusPainted(false);
        
        choice4 = new JButton("QUITTER LE JEU");
        choice4.setBackground(Color.black);
        choice4.setForeground(Color.white);
        choice4.setFont(normalFont);
        choice4.setMaximumSize(new Dimension(100,100));
        choice4.setPreferredSize(new Dimension(100,50));
        choiceButtonPanel.add(choice4);
        choice4.setFocusPainted(false);
        
        playerPanel = new JPanel();
        playerPanel.setBounds(100,15,600,50);
        playerPanel.setBackground(Color.blue);
        playerPanel.setLayout( new GridLayout(1,4));
        con.add(playerPanel);
        
        satisfactionLabel = new JLabel("Satisfaction : ");
        satisfactionLabel.setFont(normalFont);
        satisfactionLabel.setForeground(Color.WHITE);
        playerPanel.add(satisfactionLabel);
        
        satisfactionLabelNumber = new JLabel();
        satisfactionLabelNumber.setFont(normalFont);
        satisfactionLabelNumber.setForeground(Color.WHITE);
        playerPanel.add(satisfactionLabelNumber);
        
        placeLabel = new JLabel("Lieu : ");
        placeLabel.setFont(normalFont);
        placeLabel.setForeground(Color.WHITE);
        playerPanel.add(placeLabel);
        
        placeLabelName = new JLabel();
        placeLabelName.setFont(normalFont);
        placeLabelName.setForeground(Color.WHITE);
        playerPanel.add(placeLabelName);
        
        playerSetup();
        
        
        
    }
    
    public void playerSetup(){
        lieu = "rue";
        satisfaction = 0;
        satisfactionLabelNumber.setText(""+ satisfaction);
        placeLabelName.setText(lieu);
        etape1();
        
    }
    
    public void etape1() {
    
        mainTextArea.setText("Vous voyez cette fille qui vous plait marcher vers vous dans la rue. \n\nQue faites vous?");
        choice1.setText("Choix 1 : Lui attraper les cheveux");
        choice2.setText("Choix 2 : Se placer en face de sa trajectoire");
        choice3.setText("");
    
    }
    
    public void etape1choix1() {
        mainTextArea.setText("Putin je kiff vazy tire moi les veush grand fou");
        satisfaction = 10000;
        choice1.setText(">");
        choice2.setText("");
        choice3.setText("");
     
    }
    
    public class TitleScreenHandler implements ActionListener {
        
        public void actionPerformed(ActionEvent event) {
            
            createGameScreen();
        }
    
    }
    
    public class ChoiceHandler implements ActionListener {
    
        
        public void actionPerformed(ActionEvent event) {
            
            etape1choix1();
        }
        
    }
    
}
