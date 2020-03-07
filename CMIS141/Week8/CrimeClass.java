/**
 * File: CrimeClass.java Author: 
 * Brian Miranda Perez Date: March 02, 2020 
 * Constructors, getter and setters class
 */
public class CrimeClass {

    // fields
    private int years;
    private int population;
    private int violentCrimes;
    private float violentCrimeRates;
    private int murdersNonnegligent;
    private float murdersNonnegligentRates;
    private float robberyRate;
    private int vehicleTheft;

    // Constructors
    public CrimeClass() {

    }

    public CrimeClass(String list) {

        String[] row = list.split(",");
        this.years = Integer.parseInt(row[0]);
        this.population = Integer.parseInt(row[1]);
        this.violentCrimes = Integer.parseInt(row[2]);
        this.violentCrimeRates = Float.parseFloat(row[3]);
        this.murdersNonnegligent = Integer.parseInt(row[4]);
        this.murdersNonnegligentRates = Float.parseFloat(row[5]);
        this.robberyRate = Float.parseFloat(row[9]);
        this.vehicleTheft = Integer.parseInt(row[18]);

    }

    public CrimeClass(int year, int population, int violentCrimes, float violentCrimeRates, int murdersNonnegligent,
            float murdersNonnegligentRates, int robberyRate, int vehicleTheft) {
        this.years = year;
        this.population = population;
        this.violentCrimes = violentCrimes;
        this.violentCrimeRates = violentCrimeRates;
        this.murdersNonnegligent = murdersNonnegligent;
        this.murdersNonnegligentRates = murdersNonnegligentRates;
        this.robberyRate = robberyRate;
        this.vehicleTheft = vehicleTheft;
    }

    // Getters and setters
    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getViolentCrimes() {
        return violentCrimes;
    }

    public void setViolentCrimes(int violentCrimes) {
        this.violentCrimes = violentCrimes;
    }

    public float getViolentCrimeRates() {
        return violentCrimeRates;
    }

    public void setViolentCrimeRates(float violentCrimeRates) {
        this.violentCrimeRates = violentCrimeRates;
    }

    public int getMurdersNonnegligent() {
        return murdersNonnegligent;
    }

    public void setMurdersNonnegligent(int murdersNonnegligent) {
        this.murdersNonnegligent = murdersNonnegligent;
    }

    public float getMurdersNonnegligentRates() {
        return murdersNonnegligentRates;
    }

    public void setMurdersNonnegligentRates(float murdersNonnegligentRates) {
        this.murdersNonnegligentRates = murdersNonnegligentRates;
    }

    public float getRobberyRate() {
        return robberyRate;
    }

    public void setRobberyRate(int roberyRate) {
        this.robberyRate = roberyRate;
    }

    public int getVehicleTheft() {
        return vehicleTheft;
    }

    public void setVehicleTheft(int vehicleTheft) {
        this.vehicleTheft = vehicleTheft;
    }

}