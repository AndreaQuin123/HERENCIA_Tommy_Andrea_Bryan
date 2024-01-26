package lab_herencia;
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
public class PlanSamsung extends Plan{
    public String pin;
    public ArrayList<String> bbm;
    
    public PlanSamsung(int telefono,String cliente,String pin){
        super(telefono, cliente);
        this.pin=pin;
        bbm=new ArrayList<>();
    }
    
    @Override
    public double pagoMensual(int mins, int msgs){
        double planPago=40;
        double tasaMinExtra=0.8;
        double tasaMsgsExtra=0.2;
        
        double pagoMinExtra = mins>200 ? (mins-200)*0.8 : 0;
        double pagoMsgsExtra = msgs>300 ? (msgs-300)*0.8 : 0;
        
        return planPago+pagoMinExtra+pagoMsgsExtra;
    }
    
    @Override
    public StringBuilder print(){
    
        StringBuilder mensaje=super.print();
        
        mensaje.append("\nPin: ").append(pin);
        
        return mensaje;
        
        
    }
    
    public void agregarPinAmigo(String pinAmigo){
        boolean coincidencia=false;
        for(String pines : bbm){
            if(pines.equals(pinAmigo)){
                JOptionPane.showMessageDialog(null, "Amigo ya está en la lista!");
                coincidencia=true;
            }
        }
        if(!coincidencia){
            bbm.add(pinAmigo);
            JOptionPane.showMessageDialog(null, "Se ha agregado exitosamente");
        }
    }
    
    public String getPin(){
        return pin;
    }
    
    
}
