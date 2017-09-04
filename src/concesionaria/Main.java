/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package concesionaria;

import java.io.IOException;

/**
 *
 * @author Josman
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        int [][][] Matriz = new int [10][15][3];
        int [][] v = new int [3][10];
        Agencias ejemplo = new Agencias();
        ejemplo.llenado(Matriz);
        ejemplo.inAgencias(Matriz);
        v = ejemplo.inVendedores(Matriz);
        ejemplo.inModelos(Matriz);
        ejemplo.MyMn(v);
    }

}
