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
    protected int edellinenArvo;

    public Komento(Sovelluslogiikka sovellus, JTextField tuloskentta, JTextField syotekentta) {
        this.sovellus = sovellus;
        tulos = tuloskentta;
        syote = syotekentta;
    }

    protected void talletaEdellinenArvo() throws NumberFormatException {
        edellinenArvo = Integer.parseInt(tulos.getText());
    }

    public abstract void suorita();

    public void peru() {
        tulos.setText("" + edellinenArvo);
    }

    protected void asetaTulos() {
        tulos.setText("" + sovellus.tulos());
        syote.setText("");
    }

    protected void alustaSyote() {
        if (syote.getText().equals("")) {
            syote.setText("" + 0);
        }
    }
}
