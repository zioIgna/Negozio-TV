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
public class Addetto {
    private String NomeAddetto;
    
    public Addetto(String nome){
        NomeAddetto = nome;
    }
    
    public void apriNegozio(ArrayList<Televisore> televisori){
        for(int i=0; i<televisori.size(); i++){
            televisori.get(i).setStato();
            String stato;
            if(televisori.get(i).getStato())
                stato="Acceso";
            else
                stato="Spento";
            System.out.println(televisori.get(i).getName()+" "+ stato + " " + televisori.get(i).getFunz());
            int suoCanale=televisori.get(i).getCanale();
            System.out.println("Suo canale = "+ suoCanale);
//            televisori.get(i).setCanale();
        }
    }
}
