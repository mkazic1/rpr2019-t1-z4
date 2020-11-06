package ba.unsa.etf.rpr;

public class Supermarket {
    private Artikl[] moji_artikli=new Artikl[1000]; // max 1000 artikala
    private int broj_artikala=0;

    public int getBroj_artikala() {
        return broj_artikala;
    }

    public Artikl[] getArtikli() {
        return moji_artikli;
    }

    public boolean dodajArtikl(Artikl a) {
        if(broj_artikala<1000) {
            moji_artikli[broj_artikala]=new Artikl(a.getNaziv(), a.getCijena(), a.getKod());
            broj_artikala++;
            return true;
        }
        return false;
    } // ako je korpa puna artikl ostaje u supermarketu

    public Artikl izbaciArtiklSaKodom(String kod) {
        for(int i=0; i<broj_artikala; i++) {
            if(moji_artikli[i].getKod().equals(kod)) {
                Artikl pomocni=new Artikl(moji_artikli[i].getNaziv(), moji_artikli[i].getCijena(), moji_artikli[i].getKod());
                moji_artikli[i]=null;
                pomjeriUnazad(i);
                return pomocni;
            }
        }
        return null;
    } // biranje artikla iz supermarketa od strane kupca

    private void pomjeriUnazad(int indeks) {
        if (broj_artikala - indeks >= 0)
            System.arraycopy(moji_artikli, indeks + 1, moji_artikli, indeks, broj_artikala - indeks);
        moji_artikli[broj_artikala]=null; //sada je ovo visak artikl
        broj_artikala--; //smanji ukupni broj artikala

    }



}
