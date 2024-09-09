package br.sesi.hcsv.poo;


import br.sesi.hcsv.poo.cabeca.Cabeca;
import br.sesi.hcsv.poo.inferior.MembrosInferiores;
import br.sesi.hcsv.poo.inferior.Pernas;
import br.sesi.hcsv.poo.tronco.Tronco;

public class Pessoa {
    public Cabeca cabeca;
    public Tronco tronco;
    public MembrosInferiores inferior;

    public Pessoa(){
        this.cabeca = new Cabeca();
        this.tronco = new Tronco();
        this.inferior = new MembrosInferiores();
    }
}
