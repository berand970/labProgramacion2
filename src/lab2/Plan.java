/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labprogramacion2;

/**
 *
 * @author andru
 */
public abstract class Plan {
    
    //Atributos
    protected int numtel;
    protected String nombreC;
    
    public Plan(int numT,String name){
        numtel=numT;
        nombreC=name;
    }

    public int getNumtel() {
        return numtel;
    }

    public String getNombreC() {
        return nombreC;
    }
    
    public abstract double pagoMensual(int mins,int msgs);
    
    public String imprimir(){
       return "Numero Telefono: "+numtel+" Nombre: "+nombreC+" ";
    }
}
