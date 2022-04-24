package practicaMultiverse;


public class MilesMorales extends SpideyAttacks implements MilesInterface{

    public MilesMorales(String identity, int punchNum, int kickNum) {
        super(identity, punchNum, kickNum);
        System.out.println(displayAttack());
        venomBlast();
        invisiblePunch();
    }

    @Override
    public void venomBlast() {
        System.out.println("Ultimate Spider-Man uses Venom Blast");
    }

    @Override
    public void invisiblePunch() {
        System.out.println("Ultimate Spider-Man throws an Invisible Punch");
    }

}
