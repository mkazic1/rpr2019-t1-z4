package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {

    @Test
    void dodajArtikl() {
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
    void izbaciArtiklSaKodom() {
    }

    @Test
    void dajUkupnuCijenuArtikala() {
    }
}