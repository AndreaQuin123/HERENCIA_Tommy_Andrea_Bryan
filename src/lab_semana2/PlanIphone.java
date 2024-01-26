package lab_herencia;
import javax.swing.JOptionPane;

 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author adalb
 */
public class PlanIphone extends Plan {
    
    //ATRIBUTOS
    
    String email;

    //CONSTRUCTOR
    public PlanIphone(int telefono, String cliente, String email){
        super(telefono, cliente);
        this.email=email;
    }
    
    //METODOS
    
    @Override
    public double pagoMensual(int mins,int msgs){
        int planPago=22;
        double pagoMin=0.4;
        double pagoMensaje=0.1;
        
        return ((mins*pagoMin)+(msgs*pagoMensaje)+planPago);
    }
    
    @Override
    public StringBuilder print(){
    
        StringBuilder mensaje=super.print();
        
        mensaje.append("\nEmailo: ").append(email);
        
        return mensaje;
        
        
    }
    
    public String getEmail(){
        return email;
    }
    
}
