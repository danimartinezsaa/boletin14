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
        Garage garage=new Garage();
        
        while (true){
            
            int opcion=JOptionPane.showOptionDialog(null, "Añada o retire coche", "Garage", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, null);
            if(opcion==0){
                if(garage.getNumeroCoches()<garage.getPlazas()){
                    garage.añadirCoche();
                    Garage coche1=new Garage(JOptionPane.showInputDialog("Introduzca Matrícula:"));
                    JOptionPane.showMessageDialog(null, "Quedan: "+(garage.getPlazas()-garage.getNumeroCoches())+" plazas libres.");
                } else JOptionPane.showMessageDialog(null, "Garage lleno, espere.");
            }else if (opcion==1){
                garage.retirarCoche();
                JOptionPane.showInputDialog("Introduzca Matrícula:");
            } else break;
        
        }
    }
    
}
