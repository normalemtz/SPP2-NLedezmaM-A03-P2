/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.nledezmam.a03.p2;
import java.util.Scanner;
/**
 *
 * @author normaledezma
 */
public class SPP2NLedezmaMA03P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tecl = new Scanner (System.in);
        System.out.println("Calculadora de ángulos");
       
        //variables
        double co, ca;
        double r,r1, r2;
        
        //valores
        System.out.println("Introducir la medida del cateto opuesto:");
        co = tecl.nextDouble();
        System.out.println("Introducir la medida del cateto adyacente");
        ca = tecl.nextDouble();
        
        //operaciones
        // se utilizo arctan
        r= (co/ca);
        r1= Math.atan2(co, ca);
        r2= 90-r1;
        
        //Resultados
        System.out.println("Los resultados son:" + "\n" + "Angulo 1:" + r + "\n" + "Angulo 2:" + r2);
        
        
    }
    
}
