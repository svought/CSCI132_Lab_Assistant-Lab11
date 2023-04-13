package Lab11;

public class BikeRental {

	//Fields
	private static int numRented = 0;
	
	private String firstName = "--";
	private String lastName = "--";
	private double hoursRented = 0;
	private boolean available = true;

	// Constructor
	public BikeRental() {}
	
	/**
	 * Initializes the BikeRental fields with the renter's name and how many hours
	 * 
	 * @param first				First Name of the renter
	 * @param last				Last Name of the renter
	 * @param hours				Number of hours for reservation
	 * @param available			Whether the bike is available
	 */
	public void checkBikeOut(String first, String last, double hours) {
		this.firstName = first;
		this.lastName = last;
		this.hoursRented = hours;
		this.available = false;
		this.numRented++;
	}

	/**
	 * Make a Bike available - set instance variables to defaults
	 */
	public void checkBikeIn() {
		this.firstName = "--";
		this.lastName = "--";
		this.hoursRented = 0;
		this.available = true;
		this.numRented--;
	}

    /**
     * Returns the the number of bikes currently checked out
     *
     * @return the the number of bikes currently checked out
     */
	public static int getNumRented() {
		return numRented;
	}
	
    /**
     * Returns the first name of the renter
     *
     * @return the first name of the renter
     */
	public String getFirstName() {
		return this.firstName;
	}
	
    /**
     * Returns the last name of the renter
     *
     * @return the last name of the renter
     */
	public String getLastName() {
		return this.lastName;
	}
	
    /**
     * Returns the number of hours bike is checked out (0 if checked in)
     *
     * @return the number of hours bike is checked out (0 if checked in)
     */
	public double getHoursRented() {
		return this.hoursRented;
	}
	
    /**
     * Returns {@code true} if bike is checked in
     *
     * @return {@code true} if bike is checked in
     */
	public boolean isAvailable() {	
		return this.available; 
	}
	
	/**
	 * Print Bike fields
	 */
	public void printReservation() {
		System.out.println(this.getFirstName() + "\t" + this.getLastName() + "\t" + this.getHoursRented());

	}
}
