/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Victims;

import java.util.List;


/**
 *
 * @author je110
 */
public abstract class VictimsLists implements List <Victim> {
    
    private Victim victimList[];
    
    public Victim Search(Object id) {
       
        String idString = String.valueOf(id);
        for (int i = 0; i < victimList.length; i++){
            if (victimList[i] != null && String.valueOf(victimList[i].getId()).equals(idString)){
              return victimList[i];
            }
        }
        return null;
    }

}
