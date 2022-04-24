package practicaMultiverse;

public class GwenStacy extends SpideyAttacks implements GwenInterface{

    public GwenStacy(String identity, int punchNum, int kickNum) {
        super(identity, punchNum, kickNum);
        System.out.println(displayAttack());
        gymnasticKicks();
        ribbonWeb();
    }

    @Override
    public void gymnasticKicks() {
        System.out.println("Spider-Gwen does Gymnastic Kicks");
    }

    @Override
    public void ribbonWeb() {
        System.out.println("Spider-Gwen uses Ribbon Web");
    }

}
