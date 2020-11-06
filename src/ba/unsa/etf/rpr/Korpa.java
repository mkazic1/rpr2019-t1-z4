package ba.unsa.etf.rpr;

public class Korpa {
    private Artikl[] moji_artikli=new Artikl[50]; //max 50 artikala
    private int broj_artikala=0;

    public boolean dodajArtikl(Artikl novi_artikl) {
        if(broj_artikala<50) {
            moji_artikli[broj_artikala]=new Artikl(novi_artikl.getNaziv(), novi_artikl.getCijena(), novi_artikl.getKod());
            broj_artikala++;
            return true;
        }
        return false;
    }//uspjesno ili neuspjesno dodavanje artikala u korpu

    public Artikl[] getArtikli() {
        return moji_artikli;
    }//citanje koliko imamo artikala

    /*public Artikl izbaciArtiklSaKodom(String kod) {
    }*/





}
