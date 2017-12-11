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
public class Garage{
    private int numeroCoches;
    private final int plazas=5;
    Coche coche=new Coche();

    //Constructor
    public Garage(){
    }

    public Garage(String matricula){
        coche.setMatricula(matricula);
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
        if(numeroCoches>=plazas) {
            JOptionPane.showMessageDialog(null, "Garage Lleno, no puede entrar.");
        } else numeroCoches++;
        
    }
    
    public void retirarCoche(){
        if(numeroCoches==0){
            JOptionPane.showMessageDialog(null, "No hay coches que retirar");
        } else numeroCoches--;
    }
}
