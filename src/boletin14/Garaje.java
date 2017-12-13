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
public class Garaje{
    private int numeroCoches=0;
    private final int PLAZAS=5;
    private String mat;
    byte inicio=0,aux,aux2;
    
    Coche coches[]=new Coche[6];
        

    //Constructor
    public Garaje(){
    }

    public Garaje(int numeroCoches){
        this.numeroCoches=numeroCoches;
    }

    //Getters and Setters
    public int getNumeroCoches(){
        return numeroCoches;
    }

    public int getPlazas(){
        return PLAZAS;
    }

    public void setNumeroCoches(int numeroCoches){
        this.numeroCoches=numeroCoches;
    }

    @Override
    public String toString(){
        return "numeroCoches="+numeroCoches+" numeroPlazas="+PLAZAS;
    }
    
    //program
    public void añadirCoche(){
        if(inicio==0){
            for(byte i=0;i<6;i++){
                coches[i]=new Coche("0");
            }
            inicio=1;
        }

        if(numeroCoches<PLAZAS){
            for(byte i=0;i<PLAZAS;i++){
                if(coches[i].getMatricula().equals("0")){
                    coches[i].setMatricula(JOptionPane.showInputDialog("Inserte matrícula:"));
                    coches[i].setTiempoE(System.currentTimeMillis());
                    numeroCoches++;
                    
                    JOptionPane.showMessageDialog(null, "Coche dentro!");
                    break;
                }
            }
        }else if(numeroCoches==PLAZAS) {
            JOptionPane.showMessageDialog(null, "Garaje Lleno, no puede entrar.");
        }
        
    }
    
    public void retirarCoche(){

        if(numeroCoches==0){
            JOptionPane.showMessageDialog(null, "No hay coches que retirar");
            aux2=0;
        } else {
            mat=JOptionPane.showInputDialog("Inserte matrícula: ");
            for(byte i=0;i<PLAZAS;i++){
                try{
                    if(coches[i].getMatricula().equals(mat)){
                        coches[i].setMatricula("0");
                        coches[i].setTiempoS(System.currentTimeMillis());
                        coches[i].setTiempo((coches[i].getTiempoS()-coches[i].getTiempoE())/1000);
                        numeroCoches=numeroCoches-1;
                        aux=i;
                        JOptionPane.showMessageDialog(null, "Coche fuera!");
                    break;
                    } else{
                        JOptionPane.showMessageDialog(null, "La matrícula no existe.");
                        mat=null;
                    }
                }catch(Exception ex2){
                    break;
                }
            }
            aux2=1;
        }
    }
    
    public void factura(){
        double total=0,dinero=0;
        if(mat!=null && aux2==1){
            if(coches[aux].getTiempo()<10){
                total=1.5;
            } else{
                total=1.5+(0.2*(coches[aux].getTiempo()-10));
            }
            
            while(true){
                dinero=Double.parseDouble(JOptionPane.showInputDialog("Importe: "+total+ " Introduzca dinero: "));
            
                if(dinero<total){
                    JOptionPane.showMessageDialog(null,"Debe introducir una cantidad no inferior a: "+total);
                } else{
                    JOptionPane.showMessageDialog(null, "Matrícula: "+mat+
                    "\nTiempo: "+coches[aux].getTiempo()+" s"+
                    "\nPrecio: "+total+
                    "\nDinero recibido: "+dinero+
                    "\nVuelta: "+(dinero-total)+
                    "\nGRACIAS");
                    coches[aux].setTiempo(0); coches[aux].setTiempoE(0); coches[aux].setTiempoS(0); 
                    break;
                    
                }
            }
        }
    }
}
