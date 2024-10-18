/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labprogramacion2;

import java.util.ArrayList;

/**
 *
 * @author andru
 */
public class PlanSamsung extends Plan{
    
    protected ArrayList<String> bbm;
    protected String pin;
    
     public PlanSamsung(int numtel, String nombreC, String pin) {
        super(numtel, nombreC);
        this.pin = pin;
        this.bbm = new ArrayList<>();
    }
     

   public double pagoMensual(int mins, int msgs) {
       int minutos=0; 
       int msj=0;
       if(mins>200){
          minutos=200-mins;  
        }
       if(msgs>300){
           msj=300-msj;
       }
        return 40 + (0.8 * minutos) + (0.2 * msj);
    }
   
    @Override
    public String imprimir() {
       return super.imprimir()+"PIN: " + pin;
       
    }

    public void agregarPinAmigo(String pin) {
        if (!bbm.contains(pin)) {
            bbm.add(pin);
            System.out.println("PIN agregado: " + pin);
        } else {
            System.out.println("El PIN ya existe");
        }
        
    }
    
    public String getPin(){
        return pin;
    }
    


     
     

}
