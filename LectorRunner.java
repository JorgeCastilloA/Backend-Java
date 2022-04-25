import practicaComic.*;

import java.awt.*;
import java.util.Locale;
import java.util.Scanner;

public class LectorRunner {

    public static void main(String[] args) throws InterruptedException {
        Screen screen = new Screen();
        Dialog d = new Dialog();
        String str;
        //screen.out(); to print out
        //screen.setVisible(true); to make it visible

        // str = d.readString("Ejemplo");


        //Inicia Primera Parte del Comic
        //  screen.out("¿Quieres iniciar el comic?\n( Y / N )");
        // screen.setVisible(true);

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


/*
        String respuesta2 = null;
        screen.out("¿Quieres continuar con el siguiente capítulo?\n (Y/N)", Colors.FussionRed);
        screen.setVisible(true);
        Scanner scanner = new Scanner(System.in);
        respuesta2 = scanner.next();

        if(respuesta2.toUpperCase() == "Y"){
            screen.out("Cúal es el capítulo con el que quieres continuar?\nElige 2 0 3");
            screen.setVisible(true);
            Scanner scanner2 = new Scanner(System.in);
            int numCap = scanner2.nextInt();
            if (numCap == 2){
                //instancia obj que corra cap 2
            }else if (numCap==3){
                //instancia que corra cap 3
            }else
                scanner2.close();
        }else if (respuesta2.toUpperCase() == "N"){
            screen.out("Fin de Lectura");
            screen.setVisible(true);

            //mensaje de terminar comic
        }else
            screen.out("Respuesta invalida\n Elige entre (Y/N)");
            screen.setVisible(true);
             scanner.close();
    }


    */

        /*
        String respuesta = scanner.next();

        scanner.close();

        transicion(respuesta);
    }

    private static void transicion(String respuesta){
      if(respuesta == "Y"){
          System.out.println("Cúal es el capítulo con el que quieres continuar?\nElige 2 0 3");
          Scanner scanner2 = new Scanner(System.in);
          int numCap = scanner2.nextInt();
          if (numCap == 2){
              //instancia obj que corra cap 2
          }else if (numCap==3){
              //instancia que corra cap 3
          }else
              scanner2.close();
      }else if (respuesta == "N"){
          //mensaje de terminar comic
      }else
          System.out.println("Respuesta inválida\n Elige entre (Y/N)");
    }*/


        }/*
    private static void continuarComic(String iniciar, String continuar, String terminar){

        if(iniciar.toUpperCase() == "Y"){
            Comic1 comic1 = new Comic1();
            comic1.titulo();
            comic1.billyInicio();
            comic1.clarkInicio();
            comic1.llegadaBilly();
            comic1.ataqueRestaruante();
            comic1.blackAdam();
            comic1.supermanInicia();
        }else return;
        if(continuar.toUpperCase()=="Y"){
            Comic2 comic2 = new Comic2();
            comic2.supermanAtaca();
            comic2.billyEsconde();
            comic2.cuevaShazam();
            comic2.historiaShazam();
            comic2.shazamInicia();
            comic2.blackAdamAtaca();
            comic2.shazamDefiende();
        }else return;
        if (terminar.toUpperCase()=="Y"){
            Comic3 comic3 = new Comic3();
            comic3.shazamAnaliza();
            comic3.adamAtaca();
            comic3.supermanDefiende();
            comic3.heroesUnidos();
            comic3.heroesAtacan();
            comic3.heroesGanan();
            comic3.terminaComic();
}
    }*/

    }
