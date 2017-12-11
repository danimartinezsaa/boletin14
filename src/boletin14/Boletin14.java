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
        Coche coches[]=new Coche[6];
        
        coches[0]=new Coche();
        coches[1]=new Coche();
        coches[2]=new Coche();
        coches[3]=new Coche();
        coches[4]=new Coche();
        coches[5]=new Coche();
        
        
        while (true){
            
            int opcion=JOptionPane.showOptionDialog(null, "Añada o retire coche", "Garage", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, null);
            if(opcion==0){
                boolean b=false;
                
                try{
                    for(byte i=0;i<garaje.getPlazas();i++){
                            if(coches[i].getMatricula()==null){
                                String a=JOptionPane.showInputDialog("Inserte matrícula:");
                                coches[i].setMatricula(a);
                                garaje.añadirCoche();
                                b=true;
                                break;
                                }    
                    }
                }catch(Exception ex1){
                            JOptionPane.showMessageDialog(null,"Matrícula existente.");
                            break;
                            }
                if(b==false) JOptionPane.showMessageDialog(null, "Garage Lleno, espere.");
                else JOptionPane.showMessageDialog(null, "Coche dentro!");
                
            }else if (opcion==1){
                boolean c=false;
                String b=JOptionPane.showInputDialog("Inserte matrícula: ");
                for(byte i=0;i<=garaje.getPlazas();i++){
                    try{
                        if(coches[i].getMatricula().equals(b)){
                            coches[i].setMatricula(null);
                            garaje.retirarCoche();
                            c=true;
                            break;
                        }
                    }catch(Exception ex2){
                        break;
                    }
                }
                
                if(c==false) JOptionPane.showMessageDialog(null, "Matrícula no encontrada.");
                else JOptionPane.showMessageDialog(null, "Coche fuera!");
            } else break;
        
        }
    }
    
}
