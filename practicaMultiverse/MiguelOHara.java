package practicaMultiverse;

public class MiguelOHara extends SpideyAttacks implements OHaraInterface  {

    public MiguelOHara(String identity, int punchNum, int kickNum) {
        super(identity, punchNum, kickNum);
        System.out.println(displayAttack());
        fangAttack();
        armsBlades();
    }

    @Override
    public void fangAttack() {
        System.out.println("Spider-Man 2099 does a Fang Attack");
    }

    @Override
    public void armsBlades() {
        System.out.println("Spider-Man 2099 uses his Arms Blades");
    }

}
