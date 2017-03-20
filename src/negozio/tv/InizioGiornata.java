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
public class InizioGiornata {
    
    private Rivendita miaRivendita;
    private Addetto mioAddetto;
    
    public void inizia(){
        miaRivendita = new Rivendita();
        mioAddetto = new Addetto("Carlo");
        mioAddetto.apriNegozio(miaRivendita.getTelevisori());
    }
}
