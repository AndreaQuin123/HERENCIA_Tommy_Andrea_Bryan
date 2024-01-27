package lab_semana2;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author adalb
 */
public class Tigo {

    private ArrayList<Plan> planes;

    public Tigo() {
        this.planes = new ArrayList<>();
    }

    public void agregarPlan(int numeroTel, String nombre, String extra, String tipo) {

        if (búsqueda(numeroTel)) {
            JOptionPane.showMessageDialog(null, "Un plan con el numero de "+numeroTel+" ya existe.");
            return;
        }

        Plan nuevoPlan;
        if (tipo.equalsIgnoreCase("iphone")) {
            nuevoPlan = new PlanIphone(numeroTel, nombre, extra);
            JOptionPane.showMessageDialog(null, "El plan para un IPHONE de "+nombre+" fue agregado exitosamente.");
            planes.add(nuevoPlan);
        } else if (tipo.equalsIgnoreCase("samsung")) {
            nuevoPlan = new PlanSamsung(numeroTel, nombre, extra);{
            JOptionPane.showMessageDialog(null, "El plan para un SAMSUNG de "+nombre+" fue agregado exitosamente.");
            planes.add(nuevoPlan);
        }
        }
    
    }

    private boolean búsqueda(int numeroTel, String datoExtra, String tipo) {
        
        for (int indice = 0; indice < planes.size(); indice++) {
            if (planes.get(indice).getTelefono() == numeroTel) {
                return true;
            }
        }
        return false;
    }

    public boolean búsqueda(int numeroTel) {
        return búsqueda(numeroTel, "", "");
    }

    public double pagoPlan(int numeroTel, int mins, int msgs) {

        if (búsqueda(numeroTel)) {
            for (Plan plan : planes) {
                if (plan.getTelefono() == numeroTel) {
                    return plan.pagoMensual(mins, msgs);
                }
            }
        }
        return 0;
    }

    public void agregarAmigo(int numeroTel, String pin) {
    Plan amigo = null;

    for (Plan plan : planes) {
        if (plan.getTelefono() == numeroTel) {
            amigo = plan;
            break;
        }
    }

    if (amigo == null) {
        JOptionPane.showMessageDialog(null, "No existe un plan con el número " + numeroTel);
        return;
    }

    if (amigo instanceof PlanSamsung) {
        PlanSamsung samsungAmigo = (PlanSamsung) amigo;
        if (samsungAmigo.getPin().equals(pin)) {
            JOptionPane.showMessageDialog(null, "Esta persona ya está en su lista de amigos.");
        } else {
            samsungAmigo.agregarPinAmigo(pin);
            JOptionPane.showMessageDialog(null, "Se ha agregado exitosamente.");
        }
    } else {
        JOptionPane.showMessageDialog(null, "Este plan no es de tipo Samsung y no se pueden agregar amigos.");
    }
    }

    public String lista() {
        StringBuilder mensaje = new StringBuilder();
        for (int indice = 0; indice < planes.size(); indice++) {
            if (planes.get(indice) != null) {
                mensaje.append(planes.get(indice).print().toString()).append("\n");
            }
        }
        return mensaje.toString();
    }

    public String listaCantidad() {
        int contarSamsung = 0;
        int contarIphone = 0;
        
        StringBuilder mensaje1 = new StringBuilder();

        for (int indice = 0; indice < planes.size(); indice++) {
            if (planes.get(indice) != null) {
                if (planes.get(indice) instanceof PlanIphone) {
                    contarIphone++;
                } else if (planes.get(indice) instanceof PlanSamsung) {
                    contarSamsung++;
                }
            }
        }
        
        mensaje1.append("Cantidad de Iphone: ").append(contarIphone).append("\nCantidad de Samsung: ").append(contarSamsung);
        return mensaje1.toString();
    }
    
    
}
