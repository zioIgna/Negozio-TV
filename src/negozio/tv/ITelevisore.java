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
public interface ITelevisore {
    
        public String getName();
        
        public String getFunz();
        
        public int getCanale();
        
        public boolean getStato();
        
        public void setStato();
    
        public void setCanale();
}
