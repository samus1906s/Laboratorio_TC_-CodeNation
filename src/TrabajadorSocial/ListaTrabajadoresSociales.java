/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrabajadorSocial;
/**
 *
 * @author Valdelomaar
 */
public class ListaTrabajadoresSociales implements MetodosComportamientoGenerico   {
    
    private TrabajadorSocial trabajadores[];
    
    
    @Override
    public boolean Agregar(int cedula) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean Eliminar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean find(int cedula) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
  
    public TrabajadorSocial RetornarTrabajadores(String CantonBuscado){
        for( int i = 0; i<trabajadores.length; i++){
            if(trabajadores[i] != null && trabajadores[i].getCanton().equalsIgnoreCase(CantonBuscado)){
                System.out.println(trabajadores[i]);
                return trabajadores[i];
            }
        }
        return null;
    }

    
    
}
