/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin14;

import javax.swing.JOptionPane;

/**
 *
 * @author dani
 */
public class Boletin14{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        String[] opciones={"Añadir","Retirar","Salir"};
        Garaje garaje=new Garaje();
           
        while (true){
            int opcion=JOptionPane.showOptionDialog(null, "Añada o retire coche", "Garage", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, null);
            if(opcion==0){
                try{
                    garaje.añadirCoche();
                }catch(Exception ex1){
                    JOptionPane.showMessageDialog(null, "Error, dato no válido.");
                }
            }else if (opcion==1){
                try{
                    garaje.retirarCoche();
                    garaje.factura();
                }catch(Exception ex2){
                    JOptionPane.showMessageDialog(null, "Error, dato no válido.");
                }
                
            }else break;
        
        }
    }
}
