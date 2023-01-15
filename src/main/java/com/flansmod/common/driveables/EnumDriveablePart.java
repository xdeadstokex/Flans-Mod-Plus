package com.flansmod.common.driveables;

import java.util.ArrayList;

public enum EnumDriveablePart 
{
	//Plane parts
	tailWheel(new EnumDriveablePart[] { }, "tailWheel", "Wheel (Tail)"),
	tail(new EnumDriveablePart[] { tailWheel }, "tail", "Tail"),
	bay(new EnumDriveablePart[] { tail }, "bay", "Bay"),
	topWing(new EnumDriveablePart[] {}, "topWing", "Top Wing"),
	leftWingWheel(new EnumDriveablePart[] { }, "leftWingWheel", "Wheel (Left Wing)"),
	leftWing(new EnumDriveablePart[] { topWing, leftWingWheel }, "leftWing", "Left Wing"),
	rightWingWheel(new EnumDriveablePart[] { }, "rightWingWheel", "Wheel (Right Wing)"),
	rightWing(new EnumDriveablePart[] { topWing, rightWingWheel }, "rightWing", "Right Wing"),
	nose(new EnumDriveablePart[] { }, "nose", "Nose"),
	coreWheel(new EnumDriveablePart[] { }, "coreWheel", "Wheel (Core)"),
	airframe(new EnumDriveablePart[] { },"airframe", "Airframe Integrity"),
	floatsRight(new EnumDriveablePart[] { }, "floatsRight", "Right Floats"),
	floatsLeft(new EnumDriveablePart[] { }, "floatsLeft", "Left Floats"),
	floats(new EnumDriveablePart[] { }, "floats", "Floats"),

	//Helicopter parts
	skids(new EnumDriveablePart[] { }, "skids", "Skids"),
	blades(new EnumDriveablePart[] { }, "blades", "Blades"),
	
	//Vehicle parts
	turret(new EnumDriveablePart[] { }, "turret", "Turret"),
	backWheel(new EnumDriveablePart[] { }, "backWheel", "Back Wheel"),
	frontWheel(new EnumDriveablePart[] { }, "frontWheel", "Front Wheel"),
	backLeftWheel(new EnumDriveablePart[] { }, "backLeftWheel", "Back Left Wheel"),	
	frontLeftWheel(new EnumDriveablePart[] { }, "frontLeftWheel", "Front Left Wheel"),
	backRightWheel(new EnumDriveablePart[] { }, "backRightWheel", "Back Right Wheel"),
	frontRightWheel(new EnumDriveablePart[] { }, "frontRightWheel", "Front Right Wheel"),
	leftTrack(new EnumDriveablePart[] { }, "leftTrack", "Left Track"),
	rightTrack(new EnumDriveablePart[] { }, "rightTrack", "Right Track"),
	trailer(new EnumDriveablePart[] { }, "trailer", "AdditionArmor"),	
	harvester(new EnumDriveablePart[] { }, "harvester", "Harvester"),	//This is the drill bit, combine blades or excavator for utility vehicles
	//New parts
	frontalArmor(new EnumDriveablePart[] { }, "frontalArmor", "Frontal Armor"),
	leftsideArmor(new EnumDriveablePart[] { }, "leftsideArmor", "Left Side Armor"),
	rightsideArmor(new EnumDriveablePart[] { }, "rightsideArmor", "Right Side Armor"),
	additionalArmor(new EnumDriveablePart[] { }, "additionalArmor", "Additional Armor"),
	ERA(new EnumDriveablePart[] { }, "ERA", "ERA"),
	APS(new EnumDriveablePart[] { }, "APS", "APS"),
	ADS(new EnumDriveablePart[] { }, "ADS", "ADS"),

	bow(new EnumDriveablePart[] { }, "bow", "Bow"),
	stern(new EnumDriveablePart[] { }, "stern", "Stern"),
	conningTower(new EnumDriveablePart[] { }, "conningTower", "Conning Tower"),
	conningTowerAft(new EnumDriveablePart[] { }, "aftTower", "Aft Conning Tower"),
	bridge(new EnumDriveablePart[] { }, "bridge", "Bridge"),
	radar1(new EnumDriveablePart[] { }, "radar1", "Radar 1"),
	radar2(new EnumDriveablePart[] { }, "radar2", "Radar 2"),
	radar3(new EnumDriveablePart[] { }, "radar3", "Radar 3"),
	radar4(new EnumDriveablePart[] { }, "radar4", "Radar 4"),
	director1(new EnumDriveablePart[] { }, "director1", "Director 1"),
	director2(new EnumDriveablePart[] { }, "director2", "Director 2"),
	director3(new EnumDriveablePart[] { }, "director3", "Director 3"),
	director4(new EnumDriveablePart[] { }, "director4", "Director 4"),
	director5(new EnumDriveablePart[] { }, "director5", "Director 5"),
	director6(new EnumDriveablePart[] { }, "director6", "Director 6"),
	director7(new EnumDriveablePart[] { }, "director7", "Director 7"),
	director8(new EnumDriveablePart[] { }, "director8", "Director 8"),
	superstructure(new EnumDriveablePart[] { }, "superstructure", "Superstructure"),
	hangar(new EnumDriveablePart[] { }, "hangar", "Hangar"),
	hangarDeck(new EnumDriveablePart[] { }, "hangarDeck", "Hangar Deck"),
	hangarDeck2(new EnumDriveablePart[] { }, "hangarDeck2", "Hangar Deck 2"),
	hangarDeck3(new EnumDriveablePart[] { }, "hangarDeck3", "Hangar Deck 3"),
	flightDeck(new EnumDriveablePart[] { }, "flightDeck", "Flight Deck"),
	flightDeck2(new EnumDriveablePart[] { }, "flightDeck2", "Flight Deck 2"),
	engineRoom1(new EnumDriveablePart[] { }, "engineRoom1", "Engine Room 1"),
	engineRoom2(new EnumDriveablePart[] { }, "engineRoom2", "Engine Room 2"),
	engineRoom3(new EnumDriveablePart[] { }, "engineRoom3", "Engine Room 3"),
	engineRoom4(new EnumDriveablePart[] { }, "engineRoom4", "Engine Room 4"),
	engineRoom5(new EnumDriveablePart[] { }, "engineRoom5", "Engine Room 5"),
	engineRoom6(new EnumDriveablePart[] { }, "engineRoom6", "Engine Room 6"),
	engineRoom7(new EnumDriveablePart[] { }, "engineRoom7", "Engine Room 7"),
	engineRoom8(new EnumDriveablePart[] { }, "engineRoom8", "Engine Room 8"),
	boilerRoom1(new EnumDriveablePart[] { }, "boilerRoom1", "Boiler Room 1"),
	boilerRoom2(new EnumDriveablePart[] { }, "boilerRoom2", "Boiler Room 2"),
	boilerRoom3(new EnumDriveablePart[] { }, "boilerRoom3", "Boiler Room 3"),
	boilerRoom4(new EnumDriveablePart[] { }, "boilerRoom4", "Boiler Room 4"),
	boilerRoom5(new EnumDriveablePart[] { }, "boilerRoom5", "Boiler Room 5"),
	boilerRoom6(new EnumDriveablePart[] { }, "boilerRoom6", "Boiler Room 6"),
	boilerRoom7(new EnumDriveablePart[] { }, "boilerRoom7", "Boiler Room 7"),
	boilerRoom8(new EnumDriveablePart[] { }, "boilerRoom8", "Boiler Room 8"),
	steering(new EnumDriveablePart[] { }, "steering", "Steering Room"),
	deck(new EnumDriveablePart[] { }, "deck", "First Deck"),
	deck2(new EnumDriveablePart[] { }, "deck2", "Second Deck"),
	deck3(new EnumDriveablePart[] { }, "deck3", "Third Deck"),
	citadel(new EnumDriveablePart[] { }, "citadel", "Citadel"),
	belt(new EnumDriveablePart[] { }, "belt", "Armor Belt"),
	torpedoBulge(new EnumDriveablePart[] { }, "torpedoBulge", "Torpedo Bulge"),
	torpedoBulge2(new EnumDriveablePart[] { }, "torpedoBulge2", "Torpedo Bulge 2"),
	torpedoBulge3(new EnumDriveablePart[] { }, "torpedoBulge3", "Torpedo Bulge 3"),
	torpedoBulge4(new EnumDriveablePart[] { }, "torpedoBulge4", "Torpedo Bulge 4"),
	turret1(new EnumDriveablePart[] { }, "turret1", "Turret 1"),
	turret2(new EnumDriveablePart[] { }, "turret2", "Turret 2"),
	turret3(new EnumDriveablePart[] { }, "turret3", "Turret 3"),
	turret4(new EnumDriveablePart[] { }, "turret4", "Turret 4"),
	turret5(new EnumDriveablePart[] { }, "turret5", "Turret 5"),
	turret6(new EnumDriveablePart[] { }, "turret6", "Turret 6"),
	turret7(new EnumDriveablePart[] { }, "turret7", "Turret 7"),
	turret8(new EnumDriveablePart[] { }, "turret8", "Turret 8"),
	turret9(new EnumDriveablePart[] { }, "turret9", "Turret 9"),
	turret10(new EnumDriveablePart[] { }, "turret10", "Turret 10"),
	turret11(new EnumDriveablePart[] { }, "turret11", "Turret 11"),
	turret12(new EnumDriveablePart[] { }, "turret12", "Turret 12"),
	turret13(new EnumDriveablePart[] { }, "turret13", "Turret 13"),
	turret14(new EnumDriveablePart[] { }, "turret14", "Turret 14"),
	turret15(new EnumDriveablePart[] { }, "turret15", "Turret 15"),
	turret16(new EnumDriveablePart[] { }, "turret16", "Turret 16"),
	bulkhead(new EnumDriveablePart[] { }, "bulkhead", "Bulkhead"),
	bulkhead2(new EnumDriveablePart[] { }, "bulkhead2", "Bulkhead 2"),
	port(new EnumDriveablePart[] { }, "port", "Portside (Left)"),
	starboard(new EnumDriveablePart[] { }, "starboard", "Starboard (Right)"),

	//ToDo:
	// - Make losing certain parts negate speed by 10-+% such as bow, stern;
	// - make losing steering hitbox lock steering to a bearing
	// - engines loss dramatically slow speed.


	//Mecha parts
	leftArm(new EnumDriveablePart[] { }, "leftArm", "Left Arm"),
	rightArm(new EnumDriveablePart[] { }, "rightArm", "Right Arm"),
	head(new EnumDriveablePart[] { }, "head", "Head"),
	hips(new EnumDriveablePart[] { }, "hips", "Hips"),
	barrel(new EnumDriveablePart[] { }, "barrel", "Barrel"),

	//Shared part
	core(new EnumDriveablePart[]
	{
			bay,
			leftWing,
			rightWing,
			nose,
			turret,
			coreWheel,
			leftArm,
			rightArm,
			head,
			hips,
			blades,
			skids,
			backWheel,
			frontWheel,
			backLeftWheel,
			frontLeftWheel,
			backRightWheel,
			frontRightWheel,
			leftTrack,
			rightTrack,
			trailer,
			harvester,
			airframe,

			bow,
			stern,
			conningTower,
			conningTowerAft,
			bridge,
			radar1, radar2, radar3, radar4,
			director1, director2, director3, director4, director5, director6, director7, director8,
			superstructure,
			hangar,
			hangarDeck, hangarDeck2, hangarDeck3,
			flightDeck, flightDeck2,
			engineRoom1, engineRoom2, engineRoom3, engineRoom4, engineRoom5, engineRoom6, engineRoom7, engineRoom8,
			boilerRoom1, boilerRoom2, boilerRoom3, boilerRoom4, boilerRoom5, boilerRoom6, boilerRoom7, boilerRoom8,
			steering,
			deck, deck2, deck3,
			citadel,
			belt,
			torpedoBulge, torpedoBulge2, torpedoBulge3, torpedoBulge4,
			turret1, turret2, turret3, turret4, turret5, turret6, turret7, turret8, turret9, turret10, turret11, turret12, turret13, turret14, turret15, turret16,
			bulkhead,  bulkhead2,
			port,
			starboard
	}, "core", "Core");
	
	private String shortName;
	private String name;
	private EnumDriveablePart[] children;
	
	private EnumDriveablePart(EnumDriveablePart[] parts, String s, String s2)
	{
		children = parts;
		shortName = s;
		name = s2;
	}
	
	/** Used to determine what falls off when this part is broken */
	public EnumDriveablePart[] getChildren()
	{
		return children;
	}
	
	/** Used to determine when parts can be stuck back on */
	public EnumDriveablePart[] getParents()
	{
		ArrayList<EnumDriveablePart> parents = new ArrayList<EnumDriveablePart>();
		for(EnumDriveablePart part : values())
		{
			for(EnumDriveablePart childPart : part.getChildren())
			{
				if(childPart == this)
					parents.add(part);
			}
		}
		return parents.toArray(new EnumDriveablePart[parents.size()]);
	}
	
	public String getShortName()
	{
		return shortName;
	}
	
	public String getName()
	{
		return name;
	}
	
	/** For reading parts from driveable files */
	public static EnumDriveablePart getPart(String s)
	{
		for(EnumDriveablePart part : values())
			if(part.getShortName().equals(s))
				return part;
		return null;
	}
	
	public static boolean isWheel(EnumDriveablePart part)
	{
		return part == coreWheel || part == tailWheel || part == leftWingWheel || part == rightWingWheel;
	}
}
