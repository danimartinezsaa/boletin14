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
    private final int plazas=5;
    byte inicio=0;
    
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
        return plazas;
    }

    public void setNumeroCoches(int numeroCoches){
        this.numeroCoches=numeroCoches;
    }

    @Override
    public String toString(){
        return "numeroCoches="+numeroCoches+" numeroPlazas="+plazas;
    }
    
    //program
    public void añadirCoche(){
        if(inicio==0){
            coches[0]=new Coche();
            coches[1]=new Coche();
            coches[2]=new Coche();
            coches[3]=new Coche();
            coches[4]=new Coche();
            coches[5]=new Coche();
            inicio=1;
        }

        if(numeroCoches<plazas){
            for(byte i=0;i<plazas;i++){
                if(coches[i].getMatricula()==null){
                    String a=JOptionPane.showInputDialog("Inserte matrícula:");
                    coches[i].setMatricula(a);
                    numeroCoches++;
                    JOptionPane.showMessageDialog(null, "Coche dentro!");
                    break;
                }
            }
        }else if(numeroCoches==plazas) {
            JOptionPane.showMessageDialog(null, "Garaje Lleno, no puede entrar.");
        }
        
    }
    
    public void retirarCoche(){

        if(numeroCoches==0){
            JOptionPane.showMessageDialog(null, "No hay coches que retirar");
        } else {
            String b=JOptionPane.showInputDialog("Inserte matrícula: ");
            for(byte i=0;i<plazas;i++){
                try{
                    if(coches[i].getMatricula().equals(b)){
                    coches[i].setMatricula(null);
                    numeroCoches=numeroCoches-1;
                    JOptionPane.showMessageDialog(null, "Coche fuera!");
                    break;
                    }
                }catch(Exception ex2){
                    break;
                }
            }  
        }
    }
}
