package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {

    @Test
    void izbaciArtiklSaKodom() {
        Korpa moja_korpa=new Korpa();
        moja_korpa.dodajArtikl(new Artikl("Voda", 2, "1"));
        moja_korpa.dodajArtikl(new Artikl("Sok", 3, "2"));
        moja_korpa.dodajArtikl(new Artikl("Kruh", 1, "3"));

        int br_el=moja_korpa.getBroj_artikala();
        Artikl izbaceni_artikl=moja_korpa.izbaciArtiklSaKodom("2");
        int br_el2=moja_korpa.getBroj_artikala();
        assertEquals(br_el-1, br_el2);
    }

    @Test
    void getArtikli() {
    }

    @Test
    void dodajArtikl() {
        Korpa moja_korpa=new Korpa();
        moja_korpa.setBroj_artikala(15);
        moja_korpa.dodajArtikl(new Artikl("Cokolada", 2, "4"));
        assertEquals(16, moja_korpa.getBroj_artikala());
    }

    @Test
    void dajUkupnuCijenuArtikala() {
        Korpa moja_korpa=new Korpa();
        moja_korpa.dodajArtikl(new Artikl("Kapa", 20, "1"));
        moja_korpa.dodajArtikl(new Artikl("Kapa", 20, "2"));
        moja_korpa.dodajArtikl(new Artikl("Kapa", 20, "3"));
        moja_korpa.dodajArtikl(new Artikl("Kapa", 20, "4"));

        int cijena=4*20;
        assertEquals(cijena, moja_korpa.dajUkupnuCijenuArtikala());
    }
}