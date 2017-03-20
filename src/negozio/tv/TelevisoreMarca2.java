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
public class TelevisoreMarca2 extends Televisore implements ITelevisore{

    public TelevisoreMarca2(String string) {
        super(string);
        funzionalità = "Ricevo canali satellitari";
    }

    @Override
    public void setCanale() {
        canale+=2;
    }
    
}
