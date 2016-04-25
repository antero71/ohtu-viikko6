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
        int valisumma;
        valisumma = Integer.parseInt(tulos.getText());
        int lisattava = Integer.parseInt(syote.getText());
        valisumma+=lisattava;
        tulos.setText(""+valisumma);
        
    }


    @Override
    public void peru() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
    
}
