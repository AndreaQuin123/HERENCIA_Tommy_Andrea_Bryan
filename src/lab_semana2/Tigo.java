/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_semana2;

import java.util.ArrayList;

/**
 *
 * @author vanes
 */
public class Tigo {
        
    ArrayList<Plan> planes;
    public String mensaje;
    
    public Plan cp=new PlanIphone(0,"","");
    public Plan ch=new PlanSamsung(0,"","");
        
    public Tigo(ArrayList<Plan> planes){
        this.planes=new ArrayList<>();
    }
    
    public void agregarPlan(int numeroTel,String nombre,String extra,String tipo){
        if(tipo.equalsIgnoreCase("iphone")){
            PlanIphone nuevoPlan=new PlanIphone(numeroTel, nombre, extra);
            planes.add(nuevoPlan);
            
        }else if(tipo.equalsIgnoreCase("samsung")){
            PlanSamsung nuevoPlan=new PlanSamsung(numeroTel, nombre, extra);
            planes.add(nuevoPlan);
        }
    }
    
    private boolean búsqueda(int numeroTel,String datoExtra,String tipo){
        for(int indice=0;indice<planes.size();indice++){
            if(planes.get(indice).getTelefono()==numeroTel){
                return true;
            }
        }
        return false;
    }
    
    public boolean búsqueda(int numeroTel){
        return búsqueda(numeroTel,"","");
    }
    
    public double pagoPlan(int numeroTel,int mins,int msgs){
        for(int indice=0;indice<planes.size();indice++){
            if(planes.get(indice).getTelefono()==numeroTel){
                if(planes.get(indice)instanceof PlanIphone){
                    return ((PlanIphone)cp).pagoMensual(mins, msgs); 
                }else{
                    return ((PlanSamsung)ch).pagoMensual(mins, msgs);
                }
            }
            
        }
        return 0;
    }
    
    public void agregarAmigo(int numeroTel, String pin){
        if(búsqueda(numeroTel)){
            for(Plan plan:planes){
                if(plan instanceof PlanSamsung){
                    if(((PlanSamsung)plan).getPin().equals(pin)){
                        ((PlanSamsung)plan).agregarPinAmigo(pin);
                    }
                }
            }
        }
    }
    
    public void lista(){
        int contarSamsung=0;
        int contarIphone=0;
        StringBuilder mensaje=new StringBuilder();
        StringBuilder mensaje1=new StringBuilder();
        for(int indice=0;indice<planes.size();indice++){
            if(planes.get(indice)!=null){ 
                if(planes.get(indice)instanceof PlanIphone){
                    String dato=((PlanIphone)cp).getEmail();
                    mensaje.append("Telefono: "+planes.get(indice).getTelefono()).append("\n").append("Cliente: "+planes.get(indice).getCliente()).append("\n").append("Email: "+dato).append("\n");
                    contarIphone++;
                }else{
                    String dato=((PlanSamsung)ch).getPin();
                    mensaje.append("Telefono: "+planes.get(indice).getTelefono()).append("\n").append("Cliente: "+planes.get(indice).getCliente()).append("\n").append("Pin: "+dato).append("\n");
                    contarSamsung++;               
                }
            }
        }
        mensaje1.append("Cantidad de Iphone: "+contarIphone).append("\n").append("Cantidad de Samsung: "+contarSamsung);
    }
}
