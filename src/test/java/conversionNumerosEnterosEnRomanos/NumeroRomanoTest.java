package conversionNumerosEnterosEnRomanos;

import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class NumeroRomanoTest {

    private NumeroRomano numeroRomano = new NumeroRomano();


    //Pruebas para unidades
    @Test
    public void convertirNumero1EnRomano(){
        String romano = numeroRomano.conversorRomano(1);
        assertEquals(romano, "I");
    }

    @Test
    public void convertirNumero2EnRomano(){
        String romano = numeroRomano.conversorRomano(2);
        assertEquals(romano, "II");
    }

    @Test
    public void convertirNumero3EnRomano(){
        String romano = numeroRomano.conversorRomano(3);
        assertEquals(romano, "III");
    }

    @Test
    public void convertirNumero4EnRomano(){
        String romano = numeroRomano.conversorRomano(4);
        assertEquals(romano, "IV");
    }

    @Test
    public void convertirNumero5EnRomano(){
        String romano = numeroRomano.conversorRomano(5);
        assertEquals(romano, "V");
    }

    @Test
    public void convertirNumero6EnRomano(){
        String romano = numeroRomano.conversorRomano(6);
        assertEquals(romano, "VI");
    }

    @Test
    public void convertirNumero7EnRomano(){
        String romano = numeroRomano.conversorRomano(7);
        assertEquals(romano, "VII");
    }
    @Test
    public void convertirNumero8EnRomano(){
        String romano = numeroRomano.conversorRomano(8);
        assertEquals(romano, "VIII");
    }

    @Test
    public void convertirNumero9EnRomano(){
        String romano = numeroRomano.conversorRomano(9);
        assertEquals(romano, "IX");
    }

    //Pruebas para decenas
    @Test
    public void convertirNumero10EnRomano(){
        String romano = numeroRomano.conversorRomano(10);
        assertEquals(romano, "X");
    }

    @Test
    public void convertirNumero13EnRomano(){
        String romano = numeroRomano.conversorRomano(13);
        assertEquals(romano, "XIII");
    }

    @Test
    public void convertirNumero14EnRomano(){
        String romano = numeroRomano.conversorRomano(14);
        assertEquals(romano, "XIV");
    }

    @Test
    public void convertirNumero15EnRomano(){
        String romano = numeroRomano.conversorRomano(15);
        assertEquals(romano, "XV");
    }

    @Test
    public void convertirNumero18EnRomano(){
        String romano = numeroRomano.conversorRomano(18);
        assertEquals(romano, "XVIII");
    }

    @Test
    public void convertirNumero19EnRomano(){
        String romano = numeroRomano.conversorRomano(19);
        assertEquals(romano, "XIX");
    }

    @Test
    public void convertirNumero20EnRomano(){
        String romano = numeroRomano.conversorRomano(20);
        assertEquals(romano, "XX");
    }

    @Test
    public void convertirNumero30EnRomano(){
        String romano = numeroRomano.conversorRomano(30);
        assertEquals(romano, "XXX");
    }

    @Test
    public void convertirNumero40EnRomano(){
        String romano = numeroRomano.conversorRomano(40);
        assertEquals(romano, "XL");
    }

    @Test
    public void convertirNumero50EnRomano(){
        String romano = numeroRomano.conversorRomano(50);
        assertEquals(romano, "L");
    }

    @Test
    public void convertirNumero80EnRomano(){
        String romano = numeroRomano.conversorRomano(80);
        assertEquals(romano, "LXXX");
    }


    @Test
    public void convertirNumero90EnRomano(){
        String romano = numeroRomano.conversorRomano(90);
        assertEquals(romano, "XC");
    }

    @Test
    public void convertirNumero95EnRomano(){
        String romano = numeroRomano.conversorRomano(95);
        assertEquals(romano, "XCV");
    }

    //pruebas de centenas

    @Test
    public void convertirNumero100EnRomano(){
        String romano = numeroRomano.conversorRomano(100);
        assertEquals(romano, "C");
    }

    @Test
    public void convertirNumero194EnRomano(){
        String romano = numeroRomano.conversorRomano(194);
        assertEquals(romano, "CXCIV");
    }

    @Test
    public void convertirNumero200EnRomano(){
        String romano = numeroRomano.conversorRomano(200);
        assertEquals(romano, "CC");
    }

    @Test
    public void convertirNumero300EnRomano(){
        String romano = numeroRomano.conversorRomano(300);
        assertEquals(romano, "CCC");
    }

    @Test
    public void convertirNumero400EnRomano(){
        String romano = numeroRomano.conversorRomano(400);
        assertEquals(romano, "CD");
    }

    @Test
    public void convertirNumero999EnRomano(){
        String romano = numeroRomano.conversorRomano(999);
        assertEquals(romano, "CMXCIX");
    }
}
