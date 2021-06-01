public class Country {
    private final String myName;

    private double myHotRes; //from 0-4
    private double myColdRes; //from 0-4
    private double myPopulation;
    private double myInfected;
    private double myPercentInf;

    public Country() {
        myName = "";
        myHotRes = 0;
        myColdRes = 0;
        myPopulation = 0;
        myInfected = 0;
        myPercentInf = myInfected / myPopulation;
    }

    public Country(String name, double hot, double cold, double population, double infected) {
        myName = name;
        myHotRes = hot;
        myColdRes = cold;
        myPopulation = population;
        myInfected = infected;
        myPercentInf = myInfected / myPopulation;
    }

    public void setInfected(double i) {
        myInfected += i;
    }

    public double getMyInfected() {
        return myInfected;
    }

    public void spread(Country other, Disease disease) {
        double chance = Math.random();
        double probability;
        compareResistance(disease);
        if (other.myColdRes == 0) {
            probability = (myPercentInf * (other.myHotRes / 4)) / disease.diseaseSpread(); //+method for accessing level of disease hotRes/transmition
        } else if (other.myHotRes == 0) {
            probability = (myPercentInf * (other.myColdRes / 4)) / disease.diseaseSpread(); //+method for accessing level of disease coldRes/transmittion
        } else {
            probability = (myPercentInf * (myHotRes / 4) * (other.myColdRes / 4)) / disease.diseaseStrength();
        }
        if (chance <= probability) {
            other.setInfected((.5 * other.myInfected) + 1000);
        }
    }

    private void compareResistance(Disease disease) {
        if (disease.isMyColdResistance()&&myColdRes>=1)
        {
            myColdRes-=1;
        }
        if (disease.isMyHeatResistance()&&myHotRes>=1)
        {
            myHotRes-=1;
        }
    }
    public double getMyPopulation() {
        return myPopulation;
    }

    public void setMyPopulation(double myPopulation) {
        this.myPopulation = myPopulation;
    }
    public double getMyHotRes() {
        return myHotRes;
    }

    public void setMyHotRes(double myHotRes) {
        this.myHotRes = myHotRes;
    }

    public double getMyColdRes() {
        return myColdRes;
    }

    public void setMyColdRes(double myColdRes) {
        this.myColdRes = myColdRes;
    }

    public void setMyInfected(double myInfected) {
        this.myInfected = myInfected;
    }

    public double getMyPercentInf() {
        return myPercentInf;
    }

    public void setMyPercentInf(double myPercentInf) {
        this.myPercentInf = myPercentInf;
    }

    public String toString() {
        return "Population= " + myPopulation + " Percent Infected= " + myPercentInf + " Hot Resistance= " + myHotRes + " Cold Resistance+ " + myColdRes;
    }
}
