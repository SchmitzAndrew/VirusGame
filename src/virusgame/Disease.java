package virusgame;

public class Disease {



    //virusgame.Disease Name Determined by User
    String myName;


    //Spread and Death Rate
    int mySpreadRate;
    int myDeathRate;

    //Upgrades
    boolean myColdResistance;
    boolean myHeatResistance;
    boolean myCureResistance;

    //Symptoms
    boolean myRunnyNose;
    boolean myCough;
    boolean myFever;
    boolean myHeadache;
    boolean myVomiting;
    boolean myDeath;

    //Transmission
    boolean myAir;
    boolean myBlood;
    boolean myDroplet;
    boolean myAnimal;
    boolean myIngestion;

    public Disease () {

    }

    public Disease(String name, int mySpreadRate, int myDeathRate, boolean myColdResistance, boolean myHeatResistance, boolean myCureResistance, boolean myRunnyNose, boolean myCough, boolean myFever, boolean myHeadache, boolean myVomiting, boolean myDeath, boolean myAir, boolean myBlood, boolean myDroplet, boolean myAnimal, boolean myIngestion) {
        this.myName = name;
        this.mySpreadRate = mySpreadRate;
        this.myDeathRate = myDeathRate;
        this.myColdResistance = myColdResistance;
        this.myHeatResistance = myHeatResistance;
        this.myCureResistance = myCureResistance;
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

    //This is good non-repetitive code
    //Thank you to IntelliJ's generate feature

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

    public void setMyHeatResistance(boolean myHeatResistance) {
        this.myHeatResistance = myHeatResistance;
    }

    public boolean isMyCureResistance() {
        return myCureResistance;
    }

    public void setMyCureResistance(boolean myCureResistance) {
        this.myCureResistance = myCureResistance;
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

    public void setSpreadRate() {
        this.mySpreadRate = 10;
        if (myAnimal) {
            mySpreadRate += 10;
        }
        if (myAir) {
            mySpreadRate += 10;
        }

        if (myBlood) {
            mySpreadRate += 10;
        }

        if (myIngestion) {
            mySpreadRate += 10;
        }

        if (myDroplet) {
            mySpreadRate += 10;
        }

    }

}

