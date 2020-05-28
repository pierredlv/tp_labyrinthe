/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

/**
 *
 * @author pidlv
 */
public class FileFormatException extends Exception {
    public FileFormatException(String errorMessage) {
        super(errorMessage);
        // Pour l'utiliser : throw new IncorrectFileNameException("Bad file format")
    }
}

