package ba.unsa.etf.rpr;

public class Supermarket {
    private Artikl[] moji_artikli=new Artikl[1000]; // max 1000 artikala
    private int broj_artikala=0;

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

}
