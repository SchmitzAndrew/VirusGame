public class Country {
    private String name;
    private double hotRes; //from 0-4
    private double coldRes; //from 0-4
    private double population;
    private double infected;
    private double percentInf;

    public Country ()
    {
        hotRes=0;
        coldRes=0;
        population=0;
        infected=0;
        percentInf= infected/population;
    }

    public Country(double h, double c, double p, double i)
    {
        hotRes=h;
        coldRes=c;
        population=p;
        infected=i;
        percentInf=infected/population;
    }

public void setInfected(double i){
        infected=i;
}

public void Spread(Country other) {
    double chance = Math.random();
    double probability;
    if (other.coldRes == 0) {
        probability = percentInf * (other.hotRes / 4); //+method for accessing level of disease hotRes/transmition
    } else if (other.hotRes == 0) {
        probability = percentInf * (other.coldRes / 4); //+method for accessing level of disease coldRes/transmittion
    } else {
        probability = percentInf * (hotRes / 4) * (other.coldRes / 4);
    }
    if (chance<=probability){

    }
}
public String toString()
{
    return "Population= "+population+" Percent Infected= "+percentInf+
            " Hot Resistance= "+hotRes+" Cold Resistance+ "+coldRes;
}
}
