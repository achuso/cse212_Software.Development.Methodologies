/*******************************************
 * CSE 212 Section 3
 * Assignment 4
 * Name: Onat Ribar
 * Student number: 20210702099
 *******************************************/

// I used enums as parameters for the super constructors only for practice 
// The class definition is at the bottom of the code
enum RoomTypes {
	
	SINGLE("Single", 100, 15, false),
	DOUBLE("Double", 180, 30, false),
	CLUB("Club", 250, 45, true),
	FAMILY("Family", 400, 50, false),
	FAMILY_WITH_VIEW("Family with View", 450, 50, true),
	SUITE("Suite", 650, 80, true);
		
	private final String roomType;
	private final int dailyCost, roomSize;
	private final Boolean hasBath;
		
	RoomTypes(String roomType, int dailyCost, int roomSize, Boolean hasBath) {
		this.roomType = roomType;
		this.dailyCost = dailyCost;
		this.roomSize = roomSize;
		this.hasBath = hasBath;
	}
		
	public String getRoomType() {return roomType;}
	public int getDailyCost() {return dailyCost;}
	public int getRoomSize() {return roomSize;}
	public Boolean getHasBath() {return hasBath;}
		
}

// All class definitions
public class RoomSubclasses {
	
	static class Single extends Room { 
		Single() { 
			super(
				RoomTypes.SINGLE.getRoomType(), 
				RoomTypes.SINGLE.getDailyCost(), 
				RoomTypes.SINGLE.getRoomSize(),
				RoomTypes.SINGLE.getHasBath()
				); }
	}
	
	static class Double extends Room {
		Double() { 
			super(
				RoomTypes.DOUBLE.getRoomType(), 
				RoomTypes.DOUBLE.getDailyCost(), 
				RoomTypes.DOUBLE.getRoomSize(),
				RoomTypes.DOUBLE.getHasBath()
				); }
	}
	
	static class Club extends Room {
		Club() { 
			super(
				RoomTypes.CLUB.getRoomType(), 
				RoomTypes.CLUB.getDailyCost(), 
				RoomTypes.CLUB.getRoomSize(),
				RoomTypes.CLUB.getHasBath()
				); }
	}
	
	static class Family extends Room {
		Family() { 
			super(
				RoomTypes.FAMILY.getRoomType(), 
				RoomTypes.FAMILY.getDailyCost(), 
				RoomTypes.FAMILY.getRoomSize(),
				RoomTypes.FAMILY.getHasBath()
				); }
	}
	
	static class FamilyView extends Room {
		FamilyView() { 
			super(
				RoomTypes.FAMILY_WITH_VIEW.getRoomType(), 
				RoomTypes.FAMILY_WITH_VIEW.getDailyCost(), 
				RoomTypes.FAMILY_WITH_VIEW.getRoomSize(),
				RoomTypes.FAMILY_WITH_VIEW.getHasBath()
				); }
	}
	
	static class Suite extends Room {
		 Suite( ){ 
			super(
				RoomTypes.SUITE.getRoomType(), 
				RoomTypes.SUITE.getDailyCost(), 
				RoomTypes.SUITE.getRoomSize(),
				RoomTypes.SUITE.getHasBath()
				); }
	}
}