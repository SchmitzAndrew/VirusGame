package virusgame;

public class Country extends Game {
    private final String myName;

    private boolean myHotRes;
    private boolean myColdRes;
    private int myPopulation;
    private int myInfected;
    private double myPercentInf;

    public Country() {
        myName = "";
        myHotRes = false;
        myColdRes = false;
        myPopulation = 1;
        myInfected = 0;
        myPercentInf = myInfected / myPopulation;
    }

    public Country(String name, boolean hot, boolean cold, int population, int infected) {
        myName = name;
        myHotRes = hot;
        myColdRes = cold;
        myPopulation = population;
        myInfected = infected;
        myPercentInf = myInfected / myPopulation;
    }

    public void setInfected(int i) {
        myInfected = i;
    }

    public int getMyInfected() {
        return myInfected;
    }

    //determines how fast the disease spreads outside the country
    public void spread(Disease disease) {
        if (compareResistance(disease)) {

            int test = (int)((Math.random() * 10) + (1+(disease.getMySpreadRate() )/ 10) * (getMyInfected()));
            if (test>=myPopulation) {
                setMyInfected(myPopulation);
            }
            else {

                setMyInfected(test);
            }
        }
    }

    //determines how many people die
    public void death(Disease disease) {
        myPopulation-=((disease.getMyDeathRate()/100)*myInfected);
    }

    //determines whether or not there are enough upgrades for it to work
    private boolean compareResistance(Disease disease) {
        if (myColdRes && myHotRes) {
            if (disease.isMyColdResistance() && disease.isMyHeatResistance())
                return true;
            else
                return false;
        } else if (myColdRes) {
            if (disease.isMyColdResistance()) {
                return true;
            } else
                return false;
        } else if (myHotRes) {
            if (disease.isMyHeatResistance())
                return true;
            else
                return false;
        } else
            return true;
    }

    public int getMyPopulation() {
        return myPopulation;
    }

    public void setMyPopulation(int myPopulation) {
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

    public void setMyInfected(int myInfected) {
        this.myInfected = myInfected;
    }

    public double getMyPercentInf() {
        return myPercentInf;
    }

    public void setMyPercentInf() {
        myPercentInf=myInfected/myPopulation;
    }

    public String toString() {
        return "Name is " + myName + " Population= " + myPopulation + " Infected= " + myInfected + " Hot Resistance= " + myHotRes + " Cold Resistance= " + myColdRes;
    }
}
