/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;
import controler.FileFormatException;
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
}