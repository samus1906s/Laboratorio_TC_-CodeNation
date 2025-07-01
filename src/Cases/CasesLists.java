/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cases;

/**
 *
 * @author je110
 */
public class CasesLists {
    
    private Case[] ListCase = new Case[100];
    
    public int CaseLow(TypesPriority prioritypes){
        
        int cont = 0;
        for (int i = 0; i < cont; i++){
            if(ListCase[i] != null && ListCase[i].getPrioritypes() == prioritypes){
                cont++;
            }
        }
        return cont;
    }
    
}
