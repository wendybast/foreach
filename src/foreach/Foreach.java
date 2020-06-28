/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foreach;
import java.util.Scanner;


/**
 *
 * @author GALATEA
 */
public class Foreach {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        String[] Verduras= new String[3];
        float[] Precios = new float[3];
        Scanner leer = new Scanner(System.in);
        
        
       for(int i = 0; i<3; i++){
           //guardo el nombre de la verdura en el arreglo
           System.out.print("ingrese el nombre de una verdura: ");
           Verduras[i]=leer.next();
           
           //guardo el costo/precio en el arreglo
           System.out.print("ingrese el valor: ");
           Precios[i]=leer.nextFloat();
           
       }
       System.out.println(Verduras[0]+" el precio es: "+Precios[0]);
       System.out.println(Verduras[1]+" el precio es: "+Precios[1]);
       System.out.println(Verduras[2]+" el precio es: "+Precios[2]);
    
       
       System.out.println("El total es: "+(Precios[0]+Precios[1]+Precios[2]));
       
     
      
                
    }
    
}
