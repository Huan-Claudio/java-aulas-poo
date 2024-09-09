package br.sesi.hcsv.poo.cabeca;

public class Cabeca {
    public olho olho;
    public Orelha orelhao;
    public Nariz nariz;
    public Boca boca;

    public Cabeca(){
        this.olho = new olho();
        this.orelhao = new Orelha();
        this.nariz = new Nariz();
        this.boca = new Boca();
    }
}
