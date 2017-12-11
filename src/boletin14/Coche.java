/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin14;

/**
 *
 * @author dani
 */
public class Coche{
    private String matricula;
    private long tiempoE,tiempoS,tiempo;
    
    public Coche(){
    }
    
    public Coche(String matricula, long tiempoE, long tiempoS,long tiempo){
        this.matricula=matricula;
        this.tiempoE=tiempoE;
    }

    public String getMatricula(){
        return matricula;
    }
    
    public long getTiempoE(){
        return tiempoE;
    }

    public long getTiempoS(){
        return tiempoS;
    }

    public long getTiempo(){
        return tiempo;
    }
    
    public void setMatricula(String matricula){
        this.matricula=matricula;
    }

    public void setTiempoE(long tiempoE){
        this.tiempoE=tiempoE;
    }

    public void setTiempoS(long tiempoS){
        this.tiempoS=tiempoS;
    }

    public void setTiempo(long tiempo){
        this.tiempo=tiempo;
    }

    @Override
    public String toString(){
        return "matricula="+matricula;
    }
}
