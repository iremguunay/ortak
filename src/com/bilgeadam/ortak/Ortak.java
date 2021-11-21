package com.bilgeadam.ortak;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Ortak {

    private static Locale localeTR = new Locale("tr", "TR");

    public static String buyukHarfeCevir(String p_kelime) {

        return p_kelime.toUpperCase(localeTR);

    }

    public static String kucukHarfeCevir(String p_kelime) {

        return p_kelime.toLowerCase(localeTR);

    }

    public static String tarihToStr(Date p_tarih) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(p_tarih);

    }

    public static Date strToTarih(String p_tarih) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YY");
        return sdf.parse(p_tarih);

    }
}
