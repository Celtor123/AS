
package libreria;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ficheiro {
    Scanner sc;
    
    String nome,autor;
    double precio;
    int unidades;
    File fich=new File("Libro.txt");
    Scanner ar = new Scanner("Libro.txt");
    PrintWriter escribo; 

    public void menu() throws FileNotFoundException{
         escribo=new PrintWriter(fich);
        
       String a=JOptionPane.showInputDialog("qué qere facer: \n 1.engadir \n 2.consultar \n 3.Visualizar \n 4.borrar \n 5.modificar");
        int r=Integer.parseInt(a);
       switch(r){
            case 1:
              nome= JOptionPane.showInputDialog("Escriba o nome do libro:");
              escribo.write(nome);
             break;      
             case 2:
               precio=OptionPane.showInputDialog("Escriba o nome do libro:");
             break;   
             case 3:
                
             break;   
             case 4:
                
             break; 
             
             case 5:
                
             break;   
            
        }
    
    
    
    }

    public static void main(String[] args) throws FileNotFoundException {
      Ficheiro s= new Ficheiro();
      s.menu();
    }
    
}

//Supoñer que queredes facer o mantemento dun ficheiro dunha librería .  Dos libros imos considerar 4 atributos :
//Nome do libro
//Autor
//Precio
//unidades
//     Para facer o mantemento  utiliza un menú cos seguintes puntos :
//a) engadir  engade un novo libro ao noso ficheiro
//b) consultar dado o título dun libro visualizar o seu precio . se o libro non o temos na librería visualizamos unha mensaxe
//c) visualizar visualiza todos os datos do ficheiro
//d) borrar  borra os libros que teñan 0 unidades
//e) modificar  modifica o precio dun libro determinado