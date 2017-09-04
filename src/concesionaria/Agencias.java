/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package concesionaria;
import java.io.*;
/**
 *
 * @author Josman
 */
public class Agencias {

BufferedReader Teclado = new BufferedReader (new InputStreamReader(System.in));
    
public Agencias() {
}

    void llenado (int [][][] Matriz) throws IOException {
        int limfila,limcol,limprof;
        int f,c,p;
     
        limfila=Matriz.length;
        limcol=Matriz[0].length;
        limprof=Matriz[0][0].length;
        
        for (f=0;f<limfila;f++)
            for (c=0;c<limcol;c++)
                for (p=0;p<limprof;p++)
                    Matriz[f][c][p]=Integer.parseInt(Teclado.readLine());
    }
    
    void inAgencias (int [][][] Matriz) {
        int limfila,limcol,limprof;
        int f,c,p;
        int suma = 0, total=0;
     
        limfila=Matriz.length;
        limcol=Matriz[0].length;
        limprof=Matriz[0][0].length;
        
        for (p=0;p<limprof;p++)
            for (f=0;f<limfila;f++)
                for (c=0;c<limcol;c++)
                    suma = suma + Matriz [f][c][p];
            System.out.print(suma);            
            total = total + suma;
            suma=0;
        System.out.print(total);
   
    }
    
    int [][] inVendedores (int [][][] Matriz) {
        int limfila,limcol,limprof;
        int f=0,c=0,p;
        int vendedores [][] = new int [3][10];
        int suma = 0, total=0;
     
        limfila=Matriz.length;
        limcol=Matriz[0].length;
        limprof=Matriz[0][0].length;
        
        for (p=0;p<limprof;p++)
            for (f=0;f<limfila;f++)
                for (c=0;c<limcol;c++)
                    suma = suma + Matriz [f][c][p];
                    vendedores [p][f] = vendedores [p][f] + Matriz [f][c][p];
                System.out.print(suma);            
                total = total + suma;
                suma=0;
        System.out.print(total);
        
        return vendedores;
    }
    
    void inModelos (int [][][] Matriz) {
        int limfila,limcol,limprof;
        int f=0,c=0,p;
        int modelos [][] = new int [3][15];
        int suma = 0, total=0;
     
        limfila=Matriz.length;
        limcol=Matriz[0].length;
        limprof=Matriz[0][0].length;
        
        for (p=0;p<limprof;p++)
            for (c=0;c<limcol;c++)
                for (f=0;f<limfila;f++)
                    suma = suma + Matriz [f][c][p];
                    modelos [p][c] = modelos [p][c] + Matriz [f][c][p];
                System.out.print(suma);            
                total = total + suma;
                suma=0;
        System.out.print(total);
    }
    
    void MyMn (int [][] vendedores) {
        int limfila,limcol;
        int f=0,c=0,MyA,vMyA=0,MyC,vMyC=0,Age=0;
        int suma = 0, total=0;
     
        limfila=vendedores.length;
        limcol=vendedores[0].length;
        
        MyA = 0;
        MyC= 0;
        for (f=0;f<limfila;f++)
                for (c=0;c<limcol;c++)
                    if (vendedores[f][c] > MyA) { 
                        MyA=vendedores[f][c];
                        vMyA=c;
                    }  
                 
                 System.out.print(vMyA);
                 System.out.print(MyA);
                 
                 if (MyA > MyC) { 
                        MyC=MyA;
                        vMyC=vMyA;
                        Age=f;
                    }
        
        System.out.print(vMyC);
        System.out.println(Age);
        System.out.print(MyC);
    }
}