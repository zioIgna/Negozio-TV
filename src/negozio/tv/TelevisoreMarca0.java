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
public class TelevisoreMarca0 extends Televisore implements ITelevisore{

    public TelevisoreMarca0(String string) {
        super(string);
        funzionalità = "Ricevo il digitale terrestre";
    }

    @Override
    public void setCanale() {
        canale+=0;
    }
    
}
