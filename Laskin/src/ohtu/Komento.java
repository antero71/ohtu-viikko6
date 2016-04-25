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
public abstract class Komento {
    
    protected Sovelluslogiikka sovellus;
    protected JTextField tulos;
    protected JTextField syote;
    
    public Komento(Sovelluslogiikka sovellus,JTextField tuloskentta,JTextField syotekentta){
        this.sovellus=sovellus;
        tulos=tuloskentta;
        syote=syotekentta;
    }
    
    public abstract void suorita();
    public abstract void peru();
}
