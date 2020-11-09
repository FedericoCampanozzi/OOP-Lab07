/**
 * 
 */
package it.unibo.oop.lab.enum2;

/**
 * Represents an enumeration for declaring sports.
 * 
 * 1) You must add a field keeping track of the number of members each team is
 * composed of (1 for individual sports)
 * 
 * 2) A second field will keep track of the name of the sport.
 * 
 * 3) A third field, of type Place, will allow to define if the sport is
 * practiced indoor or outdoor
 * 
 */
public enum Sport {
	
    /*
     * TODO
     * 
     * Declare the following sports:
     * 
     * - basket
     * 
     * - volley
     * 
     * - tennis
     * 
     * - bike
     * 
     * - F1
     * 
     * - motogp
     * 
     * - soccer
     * 
     */
	BASKET(Place.INDOOR,6,"Basket"),
	VOLLEY(Place.INDOOR,6,"Volley"),
	TENNIS(Place.INDOOR,4,"Tennis"),
	BIKE(Place.OUTDOOR,1,"Bike"),
	F1(Place.OUTDOOR,1,"F1"),
	MOTOGP(Place.OUTDOOR,1,"MotoGP"),
	SOCCER(Place.OUTDOOR,11,"Soccer");
    /*
     * TODO
     * 
     * [FIELDS]
     * 
     * Declare required fields
     */
	private final Place place;
	private final int nTeamMembers;
	private final String actualName;
    /*
     * TODO
     * 
     * [CONSTRUCTOR]
     * 
     * Define a constructor like this:
     * 
     * - Sport(final Place place, final int noTeamMembers, final String actualName)
     */
	private Sport(Place place, int nTeamMembers, String actualName) {
		this.place = place;
		this.nTeamMembers = nTeamMembers;
		this.actualName = actualName;
	}

    /*
     * TODO
     * 
     * [METHODS] To be defined
     * 
     * 
     * 1) public boolean isIndividualSport()
     * 
     * Must return true only if called on individual sports
     * 
     * 
     * 2) public boolean isIndoorSport()
     * 
     * Must return true in case the sport is practices indoor
     * 
     * 
     * 3) public Place getPlace()
     * 
     * Must return the place where this sport is practiced
     * 
     * 
     * 4) public String toString()
     * 
     * Returns the string representation of a sport
     */
	
	public boolean isIndividualSport() {
		return this.nTeamMembers == 1;
	}
	
	public boolean isIndoorSport() {
		return this.place == Place.INDOOR;
	}
	
	public Place getPlace() {
		return this.place;
	}
	
	public String toString() {
		return "place : " + this.place + " nTeamMembers : " + this.nTeamMembers 
				+ " actualName : " + this.actualName;
	}
	
}
