package virusgame;

public class Country {
    //instance variables for attributes of a country
    private final String myName;

    private boolean myHotRes;
    private boolean myColdRes;
    private long myPopulation;
    private int initialPop;
    private long myInfected;
    private long myDead;
    private double myPercentInf;

    public Country() {
        myName = "";
        myHotRes = false;
        myColdRes = false;
        myPopulation = 1;
        myInfected = 0;
        myDead = 0;
        myPercentInf = myInfected / myPopulation;
    }

    public Country(String name, boolean hot, boolean cold, int population, long infected, long dead) {
        myName = name;
        myHotRes = hot;
        myColdRes = cold;
        myPopulation = population;
        initialPop = population;
        myInfected = infected;
        myDead = dead;
        myPercentInf = myInfected / myPopulation;
    }

    public void setInfected(int i) {
        myInfected = i;
    }

    public long getMyInfected() {
        return myInfected;
    }

    //determines how fast the disease spreads outside the country
    public void spread(Disease disease) {
        if (compareResistance(disease)) {
            //Spread Rate 10, 20, 30, 40
            int test = (int) ((Math.random() * 10) + (1 + (disease.getMySpreadRate() / 12.5)) * (getMyInfected()));
            if (test >= myPopulation) {
                setMyInfected(myPopulation);
            } else {

                setMyInfected(test);
            }
        }
    }

    //determines how many people die
    int test = 0;

    public void death(Disease disease) {
        //My Death Rate: Starts at: 10-> goes down by 1 each upgrade
        test += myInfected / disease.getMyDeathRate();
        if (test >= initialPop) {
            setMyDead(initialPop);
        } else {
            setMyDead(test);
        }
    }

    //determines whether or not there are enough upgrades for it to work
    private boolean compareResistance(Disease disease) {
        if (myColdRes && myHotRes) {
            if (disease.isMyColdResistance() && disease.isMyHeatResistance()) {
                return true;
            }
            else return false;
        } else if (myColdRes && !myHotRes) {
            if (disease.isMyColdResistance()) {
                return true;
            }
            else return false;
        } else if (myHotRes && !myColdRes) {
            if (disease.isMyHeatResistance()) {
                return true;
            }
            else{
                return false;
            }
        } else if (!myHotRes && !myColdRes) {
            return true;
        }
        else{
            return false;
        }
    }


    public long getMyPopulation() {
        return myPopulation;
    }

    public void setMyPopulation(long myPopulation) {
        this.myPopulation = myPopulation;
    }

    public boolean getMyHotRes() {
        return myHotRes;
    }

    public void setMyHotRes(boolean myHotRes) {
        this.myHotRes = myHotRes;
    }

    public boolean getMyColdRes() {
        return myColdRes;
    }

    public void setMyColdRes(boolean myColdRes) {
        this.myColdRes = myColdRes;
    }

    public long getMyDead() {
        return myDead;
    }

    public void setMyDead(long myDead) {
        this.myDead = myDead;
    }

    public void setMyInfected(long myInfected) {
        this.myInfected = myInfected;
    }

    public double getMyPercentInf() {
        return myPercentInf;
    }

    public void setMyPercentInf() {
        myPercentInf = myInfected / myPopulation;
    }

    public String toString() {
        return "Name is " + myName + " Population= " + myPopulation + " Infected= " + myInfected + " My Dead= " + myDead + " Hot Resistance= " + myHotRes + " Cold Resistance= " + myColdRes;
    }
}
