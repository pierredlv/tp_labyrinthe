/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;
import controler.FileFormatException;
import controler.ImpossibleMoveException;
import java.util.*;
import java.io.*;

/**
 *
 * @author jorge
 */
public class Labyrinthe {
    
    private int tailleX, tailleY; // largeur et hauteur
    private int departX, departY; // coordonnées de départ
    private int arriveeX, arriveeY; // coordonnées d'arrivée
    private int posX, posY; // coordonnées courantes
    private ArrayList<Case> grille; // liste des cases du labyrinthe

    public Labyrinthe(File fic) throws FileFormatException {
        System.out.println("Ok");
    }
    
    public ArrayList<Case> getGrille() {
        return grille;
    }
    
    public int getTailleX() {
        return tailleX;
    }
    
     /**
     * Tente de se déplacer dans la case ligne et colonne en paramètres du labyrinthe et de la visiter.
     * Il génère et propage l’exception ImpossibleMoveException en cas d’impossibilité de déplacement : voir la méthode
     *  canMoveToCase définie dans l’interface Case et implémentée dans la classe CaseImplementee.
     *  S’il est possible de s’y déplacer, on la visite grâce à la méthode setVisited de la classe CaseImplementee
     *
     * @param ligne
     * @param colonne
     * @throws ImpossibleMoveException :  déplacement impossible
     */
    public void move(int ligne, int colonne) throws ImpossibleMoveException {
        int caseNewPosition = ligne * tailleX + colonne;
        if (!grille.get(caseNewPosition).canMoveToCase()) {
            throw new ImpossibleMoveException("Cannot move to this case");
        }
        else {
            grille.get(caseNewPosition).setVisited();
            posX = colonne;
            posY = ligne;
        }
    }

}