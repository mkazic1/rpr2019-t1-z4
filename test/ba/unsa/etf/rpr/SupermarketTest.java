package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {

    @Test
    void getArtikli() {
    }

    @Test
    void dodajArtikl() {
        Supermarket moj_supermarket=new Supermarket();
        moj_supermarket.dodajArtikl(new Artikl("Auto", 50000, "1"));
        moj_supermarket.dodajArtikl(new Artikl("Auto", 50000, "2"));
        assertEquals(2, moj_supermarket);
    }

    @Test
    void izbaciArtiklSaKodom() {
    }
}