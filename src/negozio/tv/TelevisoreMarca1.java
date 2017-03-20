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
public class TelevisoreMarca1 extends Televisore implements ITelevisore{
    
    public TelevisoreMarca1(String _nome) {
        super(_nome);
        funzionalità = "Mi connetto a internet";
    }

    @Override
    public void setCanale() {
        canale+=1;
    }
    
}
