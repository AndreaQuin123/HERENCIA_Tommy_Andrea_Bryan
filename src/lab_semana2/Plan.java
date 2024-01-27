package lab_semana2;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author adalb
 */
public abstract class Plan {
    public abstract double pagoMensual(int mins,int msgs);
    
    public int telefono;
    public String cliente;
    
    public Plan(int telefono,String cliente){
        this.telefono=telefono;
        this.cliente=cliente;
    }
    
    public StringBuilder print(){
    
        StringBuilder mensaje = new StringBuilder();
        
        mensaje.append("\nNumero telefonico: ").append(telefono).append("\nNombre del cliente: ").append(cliente);
        
        return mensaje;
        
        
    }
    
    public int getTelefono(){
        return telefono;
    }
    
    public String getCliente(){
        return cliente;
    }
}
