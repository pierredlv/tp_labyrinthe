/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;
import java.util.Scanner;
import modele.Case;
import modele.Labyrinthe;
import modele.CaseMur;
import modele.CaseTrou;

/**
 *
 * @author pidlv
 */
public class LabyConsole {
   public LabyConsole()
   {
   }
   
    
    public int menu() 
    {
        Scanner entree =   new Scanner(System.in);
        String choix = entree.nextLine();
        while( (Integer.parseInt(choix) < 0 ) || (Integer.parseInt(choix) >2 )) {
            System.out.println("1-Deplacer automatiquement en profondeur");
            System.out.println("2-Deplacement aléatoire");
            System.out.println("0-quitter le programme ");
            choix = entree.nextLine();
        }
        return Integer.parseInt(choix);
    }
    
    
    public void affiche(Case c) 
    {
        System.out.println(c.getPositionX() + ',' + c.getPositionY());
         
   }
    
    public void affiche(Labyrinthe laby) 
    {
        for(int caseIndex=0; caseIndex < laby.getGrille().size(); caseIndex++){
            if (laby.getGrille().get(caseIndex).getVisited()) {
                System.out.println('V');
            }
            if (laby.getGrille().get(caseIndex) instanceof CaseTrou) {
                System.out.println('_');
            }
            if (laby.getGrille().get(caseIndex) instanceof CaseMur ) {
                System.out.println('X');
            }
            String newLine = System.getProperty("line.separator");
            if (caseIndex % laby.getTailleX() == 0) {
                System.out.println(newLine);
            }
        }
    } 
}

