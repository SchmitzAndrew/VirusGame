package virusgame;

public class Disease {

    // Disease Name Determined by User
    String myName;

    //Spread and Death Rate
    int mySpreadRate;
    int myDeathRate;

    //Upgrades, that determine spreadability of disease
    boolean myColdResistance;
    boolean myHeatResistance;


    //Symptoms, that contribute to death rate of disease
    boolean myRunnyNose;
    boolean myCough;
    boolean myFever;
    boolean myHeadache;
    boolean myVomiting;
    boolean myDeath;

    //Transmission, that contribute to spread rate of disease
    boolean myAir;
    boolean myBlood;
    boolean myDroplet;
    boolean myAnimal;
    boolean myIngestion;

// default constructor
    public Disease() {
        myName="";
        mySpreadRate=0;
        myDeathRate=0;
        myColdResistance=false;
        myHeatResistance=false;
        this.myRunnyNose = false;
        this.myCough = false;
        this.myFever = false;
        this.myHeadache = false;
        this.myVomiting = false;
        this.myDeath = false;
        this.myAir = false;
        this.myBlood = false;
        this.myDroplet = false;
        this.myAnimal = false;
        this.myIngestion = false;
    }

    //constructor with parameters to set every instance variable of disease.
    public Disease(String name, int mySpreadRate, int myDeathRate, boolean myColdResistance, boolean myHeatResistance, boolean myRunnyNose, boolean myCough, boolean myFever, boolean myHeadache, boolean myVomiting, boolean myDeath, boolean myAir, boolean myBlood, boolean myDroplet, boolean myAnimal, boolean myIngestion) {
        this.myName = name;
        this.mySpreadRate = mySpreadRate;
        this.myDeathRate = myDeathRate;
        this.myColdResistance = myColdResistance;
        this.myHeatResistance = myHeatResistance;
        this.myRunnyNose = myRunnyNose;
        this.myCough = myCough;
        this.myFever = myFever;
        this.myHeadache = myHeadache;
        this.myVomiting = myVomiting;
        this.myDeath = myDeath;
        this.myAir = myAir;
        this.myBlood = myBlood;
        this.myDroplet = myDroplet;
        this.myAnimal = myAnimal;
        this.myIngestion = myIngestion;
    }

    //set and get methods for evey instance variable
    public int getMySpreadRate() {
        return mySpreadRate;
    }

    public int getMyDeathRate() {
        return myDeathRate;
    }

    public boolean isMyColdResistance() {
        return myColdResistance;
    }

    public void setMyColdResistance(boolean myColdResistance) {
        this.myColdResistance = myColdResistance;
    }

    public boolean isMyHeatResistance() {
        return myHeatResistance;
    }

    public void  setMyHeatResistance(boolean myHeatResistance) {
        this.myHeatResistance = myHeatResistance;
    }

    public boolean isMyRunnyNose() {
        return myRunnyNose;
    }

    public void setMyRunnyNose(boolean myRunnyNose) {
        this.myRunnyNose = myRunnyNose;
    }

    public boolean isMyCough() {
        return myCough;
    }

    public void setMyCough(boolean myCough) {
        this.myCough = myCough;
    }

    public boolean isMyFever() {
        return myFever;
    }

    public void setMyFever(boolean myFever) {
        this.myFever = myFever;
    }

    public boolean isMyHeadache() {
        return myHeadache;
    }

    public void setMyHeadache(boolean myHeadache) {
        this.myHeadache = myHeadache;
    }

    public boolean isMyVomiting() {
        return myVomiting;
    }

    public void setMyVomiting(boolean myVomiting) {
        this.myVomiting = myVomiting;
    }

    public boolean isDeath() {
        return this.myDeath;
    }

    public void setMyDeath(boolean myDeath) {
        this.myDeath = myDeath;
    }

    public boolean isMyAir() { return myAir; }

    public void setMyAir(boolean myAir) {
        this.myAir = myAir;
    }

    public boolean isMyBlood() {
        return myBlood;
    }

    public void setMyBlood(boolean myBlood) {
        this.myBlood = myBlood;
    }

    public boolean isMyDroplet() {
        return myDroplet;
    }

    public void setMyDroplet(boolean myDroplet) {
        this.myDroplet = myDroplet;
    }

    public boolean isMyAnimal() {
        return myAnimal;
    }

    public void setMyAnimal(boolean myAnimal) {
        this.myAnimal = myAnimal;
    }

    public boolean isMyIngestion() {
        return myIngestion;
    }

    public void setMyIngestion(boolean myIngestion) {
        this.myIngestion = myIngestion;
    }

    /* method to determine death rate of disease based on what symptom upgrades it has
    * death rate is used in a formula of the country class in the denominator, so it decreases as symptoms
    * become worse.
    */
    public void setDeathRate() {
        this.myDeathRate = 10;
        if (myCough)
            myDeathRate --;
        if (myHeadache)
            myDeathRate --;
        if (myRunnyNose)
            myDeathRate --;
        if (myFever)
            myDeathRate --;
        if (myVomiting)
            myDeathRate --;
    }

    /*
    * method to determine spread rate of disease based on the transmission upgrades it has
    * used as a multiplier in a formula from the country class
     */
    public void setSpreadRate() {
        this.mySpreadRate = 10;
        if (myAnimal) {
            mySpreadRate += 1;
        }
        if (myAir) {
            mySpreadRate += 1;
        }
        if (myBlood) {
            mySpreadRate += 1;
        }
        if (myIngestion) {
            mySpreadRate += 1;
        }
        if (myDroplet) {
            mySpreadRate += 1;
        }
    }
}

