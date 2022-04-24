package practicaMona;

class Mona{
    public void octoMeow(){
        System.out.println("Mona goes Meow-Meow");
    }
    public void octoAction(){
        System.out.println("Mona does a special action");
    }
}

class Boxertocat extends Mona{
    @Override
    public void octoMeow() {
        super.octoMeow();
    }

    public void octoAction() {
        System.out.println("Mona puts her gloves and punches a bag \n");
    }
}

class Scubatocat extends Mona{
    @Override
    public void octoMeow() {
        super.octoMeow();
    }

    public void octoAction() {
        System.out.println("Mona goes scuba-diving \n");
    }
}

class OkalEltocat extends Mona{
    @Override
    public void octoMeow() {
        super.octoMeow();
    }

    public void octoAction() {
        System.out.println("Mona saves a cat from a tree \n");
    }

}

class OctdreyCatburn extends Mona{
    @Override
    public void octoMeow() {
        super.octoMeow();
    }

    public void octoAction() {
        System.out.println("Mona sings 'Moon River' by her window \n");
    }
}

class DoctocatBrown extends Mona{
    @Override
    public void octoMeow() {
        super.octoMeow();
    }

    public void octoAction() {
        System.out.println("Mona dirves her DeLorean at 88mph \n");
    }
}

class Codercat extends Mona{
    @Override
    public void octoMeow() {
        super.octoMeow();
    }

    public void octoAction() {
        System.out.println("Mona codes an example of Inheritence and Polymorphism in Java \n");
    }
}

public class MonaTheOctocat {
    public static void main(String[] args) {
        Mona theBoxertocat = new Boxertocat(),
                theScubatocat = new Scubatocat(),
                theOkalEltocat = new OkalEltocat(),
                theOctdreyCatburn = new OctdreyCatburn(),
                theDoctocatBrown = new DoctocatBrown(),
                theCodercat = new Codercat();

        theBoxertocat.octoMeow();
        theBoxertocat.octoAction();

        theScubatocat.octoMeow();
        theScubatocat.octoAction();

        theOkalEltocat.octoMeow();
        theOkalEltocat.octoAction();

        theOctdreyCatburn.octoMeow();
        theOctdreyCatburn.octoAction();

        theDoctocatBrown.octoMeow();
        theDoctocatBrown.octoAction();

        theCodercat.octoMeow();
        theCodercat.octoAction();
    }
}
