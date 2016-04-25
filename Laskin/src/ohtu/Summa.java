/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtu;

import javax.swing.JTextField;

/**
 *
 * @author Antero Oikkonen
 */
public class Summa extends Komento{

    public Summa(Sovelluslogiikka sovellus, JTextField tuloskentta, JTextField syotekentta) {
        super(sovellus, tuloskentta, syotekentta);
    }

    @Override
    public void suorita() {
        talletaEdellinenArvo();

        alustaSyote();
        sovellus.nollaa();
        sovellus.plus(Integer.parseInt(tulos.getText()));
        sovellus.plus(Integer.parseInt(syote.getText()));
        asetaTulos();
        
    }

   
}
