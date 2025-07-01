/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrabajadorSocial;

/**
 *
 * @author Valdelomaar
 */
class TrabajadorSocial {
    private int cedula;
    private String nombre;
    private String correo;
    private int telefono;
    private String canton;

    public int getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getCanton() {
        return canton;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setCanton(String canton) {
        this.canton = canton;
    }

    public TrabajadorSocial(int cedula, String nombre, String correo, int telefono, String canton) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.canton = canton;
    }
    
    
    
}
