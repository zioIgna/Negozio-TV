/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negozio.tv;

/**
 *
 * @author ignaz
 */
public class Televisore {
    private String nome;            
    protected String funzionalità = "Non impostata";
    protected boolean acceso = false;
    protected int canale = 0;
    

    Televisore(String string) {
        nome = string;
    }
    
    public String getName(){
        return nome;
    }
    
    public String getFunz(){
        return funzionalità;
    }
    
    public int getCanale(){
        return canale;
    }
    
    public boolean getStato(){
        return acceso;
    }
    
    public void setStato(){
        acceso=!acceso;
    }
        
}
