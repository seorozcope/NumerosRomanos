package conversionNumerosEnterosEnRomanos;


import org.apache.commons.lang3.ArrayUtils;
import org.jetbrains.annotations.NotNull;

import java.util.Dictionary;
import java.util.Hashtable;

public class NumeroRomano {


    private final Dictionary EQUIVALENCIA_ROMANOS=new Hashtable<Integer, String>() {{
        put(0, "");
        put(1, "I");
        put(5, "V");
        put(10, "X");
        put(50, "L");
        put(100, "C");
        put(500, "D");
        put(1000, "M");
    }};


    public String conversorRomano(int numeroNatural) {
        char [] cifras =Integer.toString(numeroNatural).toCharArray();
        String romano="";
        if(cifras.length>=4){
            romano =contruirBase(Character.getNumericValue(cifras[0]), 1000,0,0) +
                    contruirBase(Character.getNumericValue(cifras[1]), 100,500,1000) +
                    contruirBase(Character.getNumericValue(cifras[2]), 10,50,100) +
                    contruirBase(Character.getNumericValue(cifras[3]), 1,5,10) ;
        }else if(cifras.length>=3){
            romano =contruirBase(Character.getNumericValue(cifras[0]), 100,500,1000) +
                    contruirBase(Character.getNumericValue(cifras[1]), 10,50,100) +
                    contruirBase(Character.getNumericValue(cifras[2]), 1,5,10) ;
        }else if(cifras.length>=2){
            romano =contruirBase(Character.getNumericValue(cifras[0]), 10,50,100) +
                    contruirBase(Character.getNumericValue(cifras[1]), 1,5,10) ;
        }else if(cifras.length>=1){
            romano = contruirBase(Character.getNumericValue(cifras[0]), 1,5,10);
        }

        return romano;
    }


    private String contruirBase(int unidad, int base,int restaA,int restaB) {
        switch (unidad){
            case 4:
                return EQUIVALENCIA_ROMANOS.get(base).toString()+EQUIVALENCIA_ROMANOS.get(restaA).toString();
            case 9:
                return EQUIVALENCIA_ROMANOS.get(base).toString()+EQUIVALENCIA_ROMANOS.get(restaB).toString();
        }

        if (unidad<=3){
            return sumar(1, unidad, "", EQUIVALENCIA_ROMANOS.get(base).toString());
        }
        if (unidad <=8){
            return sumar(6, unidad, EQUIVALENCIA_ROMANOS.get(restaA).toString(), EQUIVALENCIA_ROMANOS.get(base).toString());
        }
        return "";
    }

    private String sumar(int inicio, int numeronatural, String inicioNumeroRomao, String base) {
        for (int i =inicio; i<=numeronatural;i++){
            inicioNumeroRomao = inicioNumeroRomao+base;
        }
        return inicioNumeroRomao;
    }

}
