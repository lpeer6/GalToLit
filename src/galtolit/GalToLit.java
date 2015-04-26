/*
    Try this 1-1
    This program converst gallons to liters.
    Call this program GalToLit.java.
 */
package galtolit;

class GalToLit {
    public static void main(String[] args) {
        double gallons; //holds the number of gallons
        double liters; //holds converstion of liters
        
        gallons = 10; //start with 10 gallons
        liters = gallons * 3.7854; //convert to liters
                
        //output result
        System.out.println(gallons + " gallons is " + liters + " liters.");
    }
    
}
