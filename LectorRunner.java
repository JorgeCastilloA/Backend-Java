import practicaComic.*;

import java.awt.*;
import java.util.Locale;
import java.util.Scanner;

public class LectorRunner {

    public static void main(String[] args) throws InterruptedException {
        Screen screen = new Screen();
        Dialog d = new Dialog();
        String str;
   
        //Inicia Primera Parte del Comic
        
        str = d.readString("¿Quieres iniciar el comic?\n( Y / N )");
        if (str.charAt(0) == 'Y' || str.charAt(0) == 'y') {
            Comic1 comic1 = new Comic1();

            comic1.titulo();
            Thread.sleep(3000);

            comic1.billyInicio();
            Thread.sleep(7000);

            comic1.clarkInicio();
            Thread.sleep(6500);

            comic1.llegadaBilly();
            Thread.sleep(6500);

            comic1.ataqueRestaruante();
            Thread.sleep(2000);

            comic1.ataqueRestauranteDos();
            Thread.sleep(1500);

            comic1.ataqueRestauranteTres();
            Thread.sleep(1500);

            comic1.blackAdam();
            Thread.sleep(7000);

            comic1.supermanInicia();
            Thread.sleep(6000);

            str = d.readString("¿Quieres continuar el comic?\n( Y / N )");
            if (str.charAt(0) == 'Y' || str.charAt(0)== 'y'){
            Comic2 comic2 = new Comic2();
            comic2.supermanAtaca();
            Thread.sleep(5000);

            comic2.billyEsconde();
            Thread.sleep(5000);

            comic2.cuevaShazam();
            Thread.sleep(7500);

            comic2.historiaShazam();
            Thread.sleep(8500);

            comic2.shazamInicia();
            Thread.sleep(5500);

            comic2.blackAdamAtaca();
            Thread.sleep(6000);

            comic2.blackAdamAtaca2();
            Thread.sleep(6000);

            comic2.shazamDefiende();
            Thread.sleep(6500);

            str = d.readString("¿Quieres terminar el comic?\n( Y / N )");
            if (str.charAt(0) == 'Y' || str.charAt(0)== 'y'){
            Comic3 comic3 = new Comic3();

            comic3.shazamAnaliza();
            Thread.sleep(6500);

            comic3.shazamAnaliza2();
            Thread.sleep(5000);

            comic3.adamAtaca();
            Thread.sleep(4500);

            comic3.supermanDefiende();
            Thread.sleep(5000);

            comic3.supermanDefiende2();
            Thread.sleep(5000);

            comic3.heroesUnidos();
            Thread.sleep(5000);

            comic3.heroesAtacan();
            Thread.sleep(5000);

            comic3.heroesAtacan2();
            Thread.sleep(5000);

            comic3.heroesGanan();
            Thread.sleep(5000);

            comic3.terminaComic();
            Thread.sleep(5000);
                }else
                    screen.cls();
                screen.out("Comic Cerrado ", Colors.NYCTaxi);
                screen.setVisible(true);
           }else
                screen.cls();
                screen.out("Comic Cerrado ", Colors.NYCTaxi);
            screen.setVisible(true);
        }else
            screen.cls();
            screen.out("Comic Cerrado", Colors.NYCTaxi);
            screen.setVisible(true);


        }
    }
