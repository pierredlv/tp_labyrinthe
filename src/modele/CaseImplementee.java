/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;
import java.util.*;

/**
 *
 * @author jorge
 */
public class CaseImplementee implements Case {
    
    protected int positionX, positionY; // position courante dans la case
    protected boolean visited, moved; // booléens de visite visited et d’accès moved à la case
    protected ArrayList<Case> voisins; // Liste des cases voisines
    protected int nb_voisins; // nombre de cases voisines
    
    @Override
    public int getPositionX() { return positionX;}
    @Override
    public int getPositionY() { return positionY;}
    @Override
    public boolean canMoveToCase() { return moved;}
    @Override
    public boolean getVisited() { return visited; }
    @Override
    public int getNbVoisins() { return nb_voisins; }
    
    public Case getVoisin (int i) { return voisins.get(i);}
    
    @Override
    public void setVisited() { if(visited == true)
                               {
                                  visited = false;
                               }
        }
    
    public CaseImplementee(int lig, int col) { this.positionX = lig;
                                               this.positionY = col;
                                               this.moved = false;
                                               this.visited = false;
                                               this.nb_voisins = 0;
                                               }  
}