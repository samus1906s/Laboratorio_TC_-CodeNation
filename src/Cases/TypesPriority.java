/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Cases;

/**
 *
 * @author samue
 */
public enum TypesPriority {
    HIGH("High"),
    HALF("Half"),
    LOW("Low");
    
    private final String prioritypes;

    public String getPrioritypes() {
        return prioritypes;
    }

    private TypesPriority(String prioritypes) {
        this.prioritypes = prioritypes;
    }

    @Override
    public String toString() {
        return "TypesPriority{" + "ordinal=" + ordinal() + ", name=" + name() + ", prioritypes=" + prioritypes + '}';
    }
}
