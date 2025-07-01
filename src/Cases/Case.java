/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cases;
import java.time.LocalDate;

/**
 *
 * @author samue
 */
public class Case {
    private int id;
    private String victim;
    private String decription;
    private String type;
    private LocalDate date;
    private TypesPriority prioritypes;

    public int getId() {
        return id;
    }

    public String getVictim() {
        return victim;
    }

    public String getDecription() {
        return decription;
    }

    public String getType() {
        return type;
    }

    public LocalDate getDate() {
        return date;
    }

    public TypesPriority getPrioritypes() {
        return prioritypes;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Case(int id, String victim, String decription, String type) {
        this.id = id;
        this.victim = victim;
        this.decription = decription;
        this.type = type;
        if(!date.isAfter(LocalDate.now())){
            this.date = date;
        }
        this.prioritypes = TypesPriority.LOW;
    }

    @Override
    public String toString() {
        return "Case{" + "id=" + id + ", victim=" + victim + ", decription=" + decription + ", type=" + type + ", date=" + date + ", prioritypes=" + prioritypes + '}';
    }
    
    
}
