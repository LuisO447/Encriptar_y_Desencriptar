/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package2;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis
 */
public class clsencriptar {
    public static void main(String[] args) {
        
        Scanner detecto = new Scanner(System.in);
        String mensaje;
        String mensajito;
        String mensaje2;
        String mensaje3;
        String mensajeEncriptado;
        String mensajeDesencriptado;
        char array1[];
        boolean opcion = false;
        int opcionInt = 0;
        
        mensaje = JOptionPane.showInputDialog("Ingrese su mensaje a encriptar");
        array1=mensaje.toCharArray();
        
        for (int x = 0; x < array1.length; x++) {
            
            array1[x] = (char)(array1[x] + (char) 10);//ahora puse esto como llave
            
        }
        
        mensajeEncriptado=String.valueOf(array1);
        System.out.println(mensaje);
        System.out.println("Su mensaje ya encripatdo es "+mensajeEncriptado);
        //mensajito = JOptionPane.showInputDialog("Su mensaje ya encriptado es "+mensajeEncriptado+" Ya puedes copiarlo.");
        
        //mensaje2 = JOptionPane.showInputDialog("Quiere desencriptar tu mensaje??\n Si = 1 y No = 2."); 
        System.out.println("Quiere desencriptar tu mensaje?");
        System.out.println("Si = 1 Y No = 2");
        opcionInt = detecto.nextInt();
        
        if(opcionInt == 1){
            for (int i = 0; i < array1.length; i++) {
                
                array1[i] = (char) (array1[i]-(char)10); 
                
            }
            
            mensajeDesencriptado = String.valueOf(array1);
            System.out.println("Su mensaje desencriptado es: "+mensajeDesencriptado);
            //mensaje3 = JOptionPane.showInputDialog("Su mensaje desencriptado es "+ mensajeDesencriptado);
            
        }
    }
}
