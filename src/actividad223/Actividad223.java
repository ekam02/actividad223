/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad223;
import static java.lang.Math.*;
import java.util.Scanner;

/**
 *
 * @author Enrique Martínez Agudelo
 */
public class Actividad223 {

    /**
     * @param args the command line arguments
     */
    
    public static int inversor(int value) {
        int inv = 0;
        int aux = 0;
        do{
            //aux++;
            inv *= 10;
            inv += value%10;
            value /= 10;
            aux++;
        } while (value != 0);
        return inv;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Digite el valor a invertir");
        
        Scanner val = new Scanner(System.in);
        
        System.out.println("El valor inverso es: "+inversor(val.nextInt()));
    }
    
}
