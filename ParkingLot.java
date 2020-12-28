
/**
 * ParkingLot keeps track of number of cars in it.
 * 
 * @author Aronson
 * @version .01
 */
public class ParkingLot
{
    // instance variables - replace the example below with your own
    private int numCars;
    public final int MAX_CARS = 2500;

    /**
     * Default Constructor for objects of class ParkingLot
     */
    public ParkingLot()
    {
        // initialise instance variables
        numCars = 0;
    }

    public ParkingLot(int theNum)
    {
        numCars = theNum;
    }

    /**
     * accessor (get) getNumCars returns the number of cars
     */
    public int getNumCars()
    {
        return numCars;
    }

    /**
     * mutator (set) 
     */
    void setNumCars(int theNum)
    {
        if (0 <= theNum)
            if (theNum < MAX_CARS)
                numCars = theNum;

    }

    public String toString()
    {
        return "Number of cars is " + numCars;
    }

    public boolean equals(Object other)
    {
        ParkingLot temp = (ParkingLot)other;

        return numCars == temp.numCars;

    
    }
}
