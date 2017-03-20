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
public class TelevisoreMarca3 extends Televisore implements ITelevisore{

    public TelevisoreMarca3(String string) {
        super(string);
        funzionalità = "Non funziono";
    }

    @Override
    public void setCanale() {
        canale+=3;
    }
    
}
