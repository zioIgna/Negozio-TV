/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negozio.tv;

import java.util.ArrayList;

/**
 *
 * @author ignaz
 */
public class Rivendita {
    private ArrayList<Televisore> televisori = new ArrayList<>();
    
    
    public Rivendita(){
        televisori.add(new TelevisoreMarca0("TV0"));
        televisori.add(new TelevisoreMarca1("TV1"));
        televisori.add(new TelevisoreMarca2("TV2"));
        televisori.add(new TelevisoreMarca3("TV3"));
    }

    public ArrayList<Televisore> getTelevisori(){
        return televisori;
    }

}
