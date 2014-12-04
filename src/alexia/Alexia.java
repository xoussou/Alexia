/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package alexia;


/**
 *
 * @author jessica
 */
public class Alexia {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("hello world");
        Lapin lap = new Lapin("Chocolat", 1);
        int i=0;
        while(i<=10){
            lap.crier();
            i=i+1;
        }
    }

}
