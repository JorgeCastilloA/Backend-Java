package practicaMultiverse;

public class SpideyAttacks{
    private String identity;
    private int punchNum;
    private int kickNum;


    public SpideyAttacks(String identity, int punchNum, int kickNum){
        this.identity=identity.toLowerCase();
        this.punchNum=punchNum;
        this.kickNum=kickNum;

    }

    public String getIdentity() {
        return identity;
    }
    public int getPunchNum() {
        return punchNum;
    }
    public int getKickNum() {
        return kickNum;
    }



    public boolean setIdentity(String identity){
        if(identity == "miles" || identity == "gwen" || identity== "miguel"){
            this.identity=identity;
            return true;
        }else
            return false;
    }

    public boolean setPunchNum(int punchNum) {
        if(punchNum > 0) {
            this.punchNum = punchNum;
            return true;
        }else
            return false;
    }

    public boolean setKickNum(int kickNum) {
        if(kickNum > 0){
            this.kickNum = kickNum;
            return true;
        }else
            return false;
    }


    public String displayAttack(){
        return
                identity + " suits up!! \n"+
                        "throws " + punchNum + " punches"+
                        " and " + kickNum + " kicks\n" ;

    }


}

