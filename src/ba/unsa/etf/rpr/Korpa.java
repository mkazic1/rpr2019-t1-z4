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
    } //uspjesno ili neuspjesno dodavanje artikala u korpu

    public Artikl[] getArtikli() {
        return moji_artikli;
    } //citanje koliko imamo artikala

    public Artikl izbaciArtiklSaKodom(String kod) {
        for(int i=0; i<broj_artikala; i++) {
            if(moji_artikli[i].getKod().equals(kod)) { //jednakost kodova provjeravamo sa equals
                Artikl pomocni=new Artikl(moji_artikli[i].getNaziv(), moji_artikli[i].getCijena(), moji_artikli[i].getKod());
                moji_artikli[i]=null; //obrisi prepoznati artikl
                pomjeriUnazad(i); //pomjeri artikle u nizu za jedno mjesto unazad
                return pomocni;
            }
        }
        return null; //null zbog tipa metode
    }

    public int dajUkupnuCijenuArtikala() {
        int ukupna_cijena=0;
        for(int i=0; i<broj_artikala; i++) {
            ukupna_cijena+=moji_artikli[i].getCijena();
        }
        return ukupna_cijena;
    }

    private void pomjeriUnazad(int indeks) {
        if (broj_artikala - indeks >= 0)
            System.arraycopy(moji_artikli, indeks + 1, moji_artikli, indeks, broj_artikala - indeks);
        moji_artikli[broj_artikala]=null; //sada je ovo visak artikl
        broj_artikala--; //smanji ukupni broj artikala
    }

}
