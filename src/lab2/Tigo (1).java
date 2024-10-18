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
class Tigo {
   protected ArrayList<Plan> planes;

    public Tigo() {
        planes = new ArrayList<>();
    }

    public void agregarPlan(int numeroTel, String nombre, String extra, String tipo) {
        if (busqueda(numeroTel, extra, tipo)) {
            System.out.println("El numero ");
            return;
        }
        if (tipo.equalsIgnoreCase("IPHONE")) {
            planes.add(new PlanIPhone(numeroTel, nombre, extra));
            System.out.println("Plan iPhone agregado.");
        } else if (tipo.equalsIgnoreCase("SAMSUNG")) {
            planes.add(new PlanSamsung(numeroTel, nombre, extra));
            System.out.println("Plan Samsung agregado.");
        } else {
            System.out.println("Tipo de plan desconocido.");
        }
    }

    public boolean busqueda(int numeroTel, String datoExtra, String tipo) {
        for (Plan plan : planes) {
            if (plan.getNumtel() == numeroTel) {
                return true;
            }
            if (tipo.equalsIgnoreCase("IPHONE") && plan instanceof PlanIPhone) {
                if (((PlanIPhone) plan).getEmail().equals(datoExtra)) {
                    return true;
                }
            } else if (tipo.equalsIgnoreCase("SAMSUNG") && plan instanceof PlanSamsung) {
                if (((PlanSamsung) plan).getPin().equals(datoExtra)) {
                    return true;
                }
            }
        }
        return false;
    }

    public double pagoPlan(int numeroTel, int mins, int msgs) {
        for (Plan plan : planes) {
            if (plan.getNumtel() == numeroTel) {
                return plan.pagoMensual(mins, msgs);
            }
        }
        System.out.println("No se encontro el numero");
        return -1;
    }

    public void agregarAmigo(int numeroTel, String pin) {
        for (Plan plan : planes) {
            if (plan.getNumtel() == numeroTel && plan instanceof PlanSamsung) {
                ((PlanSamsung) plan).agregarPinAmigo(pin);
                return;
            }
        }
        System.out.println("No se encontro el plan Samsung con ese numero.");
    }

    public void lista() {
        int totalIPhone = 0, totalSamsung = 0;
        for (Plan plan : planes) {
            plan.imprimir();
            if (plan instanceof PlanIPhone) {
                totalIPhone++;
            } else if (plan instanceof PlanSamsung) {
                totalSamsung++;
            }
            System.out.println();
        }
        System.out.println("Total de planes iPhone: " + totalIPhone);
        System.out.println("Total de planes Samsung: " + totalSamsung);
    }

    
}
