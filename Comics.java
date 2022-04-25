import practicaComic.*;

class Comic1 implements PrimerActo {

    Screen comicScreen = new Screen();
    @Override
    public void titulo() {
        comicScreen.setVisible(true);
        comicScreen.showImage("src/practicaComic/img/00_comic.jpg");
        comicScreen.setBounds(0,0,1920,1080);

    }

    @Override
    public void billyInicio() {
        comicScreen.cls();
        comicScreen.out("Nuestra historia inicia con Billy Batson. Un niño huérfano que vive con sus hermanos adoptivos\n\nBilly va tarde para una cita con un reportero de Metropolis\n","Helvetica",35,Colors.PrestigeBlue);
        comicScreen.showImage("src/practicaComic/img/01_comic.jpg");
        comicScreen.setBounds(0,0,1920,1080);

    }

    @Override
    public void clarkInicio() {
        comicScreen.cls();
        comicScreen.out("Clark Kent, reportero del Daily Planet, decidió entrevistar a Billy para contar su experiencia viviendo en la ciudad, esperando que con esta historia Billy pueda ser adoptado\n","Helvetica",30,Colors.PrestigeBlue);
        comicScreen.showImage("src/practicaComic/img/02_comic.jpg");
        comicScreen.setBounds(0,0,1920,1080);
    }

    @Override
    public void llegadaBilly() {
        comicScreen.cls();
        comicScreen.out("Billy llega apresurado, disculpándose con Clark por llegar tarde.\nÉl le responde que no hay problema, mientras le señala la comida que pidió para que ambos desayunen\n","Helvetica",35,Colors.PrestigeBlue);
        comicScreen.showImage("src/practicaComic/img/03_comic.jpg");
        comicScreen.setBounds(0,0,1920,1080);

    }

    @Override
    public void ataqueRestaruante() {
        comicScreen.cls();
        comicScreen.out("Mientras Billy le cuenta su experiencia a Clark, algo extraño...\n","Helvetica",30,Colors.PrestigeBlue);
        comicScreen.showImage("src/practicaComic/img/04.1_comic.jpg");
        comicScreen.setBounds(0,0,1920,1080);
    }
    @Override
    public void ataqueRestauranteDos(){
        comicScreen.cls();
        comicScreen.out("...parece...\n","Helvetica",35,Colors.PrestigeBlue);
        comicScreen.showImage("src/practicaComic/img/04.2_comic.jpg");
        comicScreen.setBounds(0,0,1920,1080);

    }
    @Override
    public void ataqueRestauranteTres(){
        comicScreen.cls();
        comicScreen.out("...ACERCARSE.\n","Helvetica",40,Colors.PrestigeBlue);
        comicScreen.showImage("src/practicaComic/img/04.3_comic.jpg");
        comicScreen.setBounds(0,0,1920,1080);

    }
    @Override
    public void blackAdam() {
        comicScreen.cls();
        comicScreen.out("Un individuo que se hace llamar Black Adam ha irrumpido en el restaurante con el único propósito de matar al joven Batson\n","Helvetica",30,Colors.PrestigeBlue);
        comicScreen.showImage("src/practicaComic/img/05_comic.jpg");
        comicScreen.setBounds(0,0,1920,1080);

    }

    @Override
    public void supermanInicia() {
        comicScreen.cls();
        comicScreen.out("Clark sabe que siendo él, no puede hacer mucho.\nPero sabe bien que esto es un trabajo para Superman\n","Helvetica",35,Colors.PrestigeBlue);
        comicScreen.showImage("src/practicaComic/img/06_comic.jpg");
        comicScreen.setBounds(0,0,1920,1080);
    }

}
class Comic2 implements SegundoActo{
    Screen comicScreen2=new Screen();
    @Override
    public void supermanAtaca () {
        comicScreen2.cls();
        comicScreen2.setVisible(true);
        comicScreen2.out("Rápidamente, Superman ataca a Black Adam para rescatar a Billy.\n","Helvetica",35,Colors.PrestigeBlue);
        comicScreen2.showImage("src/practicaComic/img/07_comic.jpg");
        comicScreen2.setBounds(0,0,1920,1080);
    }

    @Override
    public void billyEsconde () {
        comicScreen2.cls();
        comicScreen2.out("En un momento de respiro, Superman le pide a Billy que escape lo más lejos posible\n","Helvetica",30,Colors.PrestigeBlue);
        comicScreen2.showImage("src/practicaComic/img/08_comic.jpg");
        comicScreen2.setBounds(0,0,1920,1080);
    }

    @Override
    public void cuevaShazam () {
        comicScreen2.cls();
        comicScreen2.out("Al intentar esconderse, Billy es transportado a un lugar oscuro y extraño\n Nota en este un gran pasillo lleno de estatuas\n Al final se alcanza a ver la figura de una persona\n","Helvetica",45,Colors.PrestigeBlue);
        comicScreen2.showImage("src/practicaComic/img/09_comic.jpg");
        comicScreen2.setBounds(0,0,1920,1080);
    }

    @Override
    public void historiaShazam () {
        comicScreen2.cls();
        comicScreen2.out("El hechicero Shazam se presenta ante Billy\n \nLe comparte su historia y la de Adam\nAntes de ser Black Adam, Shazam lo eligió para ser su campeón\nPero el poder corrompió a Adam y este fue enviado hasta el final del Universo de donde logró regresar con un único objetivo:\nVengarse de Shazam y de su nuevo campeón\n","Helvetica",35,Colors.PrestigeBlue);
        comicScreen2.showImage("src/practicaComic/img/010_comic.jpg");
        comicScreen2.setBounds(0,0,1920,1080);
    }

    @Override
    public void shazamInicia () {
        comicScreen2.cls();
        comicScreen2.out("El hechicero Shazam le da su poder a Billy para convertirse en su nuevo campeón\n Con los poderes de SHAZAM!!!, Billy sabe lo que debe hacer:\n\nDETENER A BLACK ADAM\n","Helvetica",25,Colors.PrestigeBlue);
        comicScreen2.showImage("src/practicaComic/img/011_comic.jpg");
        comicScreen2.setBounds(0,0,1920,1080);
    }

    @Override
    public void blackAdamAtaca () {
        comicScreen2.cls();
        comicScreen2.out("Mientras tanto, en Metropolis, Black Adam logra dañar a Superman, al ser este último vulnerable a la magia\n","Helvetica",45,Colors.PrestigeBlue);
        comicScreen2.showImage("src/practicaComic/img/012_comic.jpg");
        comicScreen2.setBounds(0,0,1920,1080);
    }
    @Override
    public void blackAdamAtaca2 () {
        comicScreen2.cls();
        comicScreen2.out("Con Superman derrotado, todo parece estar perdido, hasta que...\n","Helvetica",50,Colors.PrestigeBlue);
        comicScreen2.showImage("src/practicaComic/img/013_comic.jpg");
        comicScreen2.setBounds(0,0,1920,1080);
    }

    @Override
    public void shazamDefiende () {
        comicScreen2.cls();
        comicScreen2.out("¡Shazam ha llegado para salvar a Superman!\n","Helvetica",50,Colors.PrestigeBlue);
        comicScreen2.showImage("src/practicaComic/img/014_comic.jpg");
        comicScreen2.setBounds(0,0,1920,1080);
    }

}
class Comic3 implements TercerActo{
    Screen comicScreen3 = new Screen();

    @Override
    public void shazamAnaliza() {
        comicScreen3.cls();
        comicScreen3.setVisible(true);
        comicScreen3.out("Shazam analiza la situación\nSabe que Black Adam tiene los mismos podéres que él y más experiencia\n","Helvetica",30,Colors.PrestigeBlue);
        comicScreen3.showImage("src/practicaComic/img/015_comic.jpg");
        comicScreen3.setBounds(0,0,1920,1080);
    }
    @Override
    public void shazamAnaliza2() {
        comicScreen3.cls();
        comicScreen3.out("Con la sabiduría de Solomon, Billy sabe que su mejor opción es hacer tiempo...\n\nEsperar a que Superman se recupere...\n\nY atacar juntos\n","Helvetica",35,Colors.PrestigeBlue);
        comicScreen3.showImage("src/practicaComic/img/016_comic.jpg");
        comicScreen3.setBounds(0,0,1920,1080);
    }
    @Override
    public void adamAtaca() {
        comicScreen3.cls();
        comicScreen3.out("Billy hace su mejor esfuerzo, pero no es rival para Adam\nParece que Shazam será derrotado\n","Helvetica",40,Colors.PrestigeBlue);
        comicScreen3.showImage("src/practicaComic/img/017_comic.gif");
        comicScreen3.setBounds(0,0,1920,1080);
    }

    @Override
    public void supermanDefiende() {
        comicScreen3.cls();
        comicScreen3.out("Hasta que la visión de calor de Superman detiene a Black Adam\n","Helvetica",35,Colors.PrestigeBlue);
        comicScreen3.showImage("src/practicaComic/img/018_comic.jpg");
        comicScreen3.setBounds(0,0,1920,1080);
    }
    @Override
    public void supermanDefiende2() {
        comicScreen3.cls();
        comicScreen3.out("Kal-el se ha recuperado y está listo para continuar\n","Helvetica",50,Colors.PrestigeBlue);
        comicScreen3.showImage("src/practicaComic/img/019_comic.jpg");
        comicScreen3.setBounds(0,0,1920,1080);
    }
    @Override
    public void heroesUnidos() {
        comicScreen3.cls();
        comicScreen3.out("Una vez juntos, Shazam intenta presentarse, pero Superman sabe bien quién es\n","Helvetica",35,Colors.PrestigeBlue);
        comicScreen3.showImage("src/practicaComic/img/020.1_comic.jpg");
        comicScreen3.setBounds(0,0,1920,1080);
    }

    @Override
    public void heroesAtacan() {
        comicScreen3.cls();
        comicScreen3.out("Ambos héroes preparan su ataque\n","Helvetica",35,Colors.PrestigeBlue);
        comicScreen3.showImage("src/practicaComic/img/020.2_comic.jpg");
        comicScreen3.setBounds(0,0,1920,1080);
    }
    @Override
    public void heroesAtacan2() {
        comicScreen3.cls();
        comicScreen3.out("Deben derrotar a Adam lo más pronto posible\n","Helvetica",45,Colors.PrestigeBlue);
        comicScreen3.showImage("src/practicaComic/img/021_comic.jpg");
        comicScreen3.setBounds(0,0,1920,1080);
    }
    @Override
    public void heroesGanan() {
        comicScreen3.cls();
        comicScreen3.out("Deben detenerlo definitivamente\n","Helvetica",50,Colors.PrestigeBlue);
        comicScreen3.showImage("src/practicaComic/img/022_comic.jpg");
        comicScreen3.setBounds(0,0,1920,1080);
    }

    @Override
    public void terminaComic() {
        comicScreen3.cls();
        comicScreen3.out("Black Adam es derrotado y encerrado por siempre por Shazam en una prisión sin salida\nCon todos lo problemas resueltos, Billy sabe que es hora de terminar su desayunoo y la entrevista\n\nFIN","Helvetica",40,Colors.PrestigeBlue);
        comicScreen3.showImage("src/practicaComic/img/023_comic.jpg");
        comicScreen3.setBounds(0,0,1920,1080);
    }
}
