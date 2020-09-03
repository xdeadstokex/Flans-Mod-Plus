# Guide to Driveable Guns



## Passenger Guns

Passenger guns are guns that passengers can fire from their seat. You have to add these to your model in toolbox, which I won't cover here.

The config to add the guns:

`Passenger passengerNumber XPos YPos ZPos partName minYaw maxYaw minPitch maxPitch gunType gunName`
* `passengerNumber` is the ID of the seat you're creating. 0 = driver (handled separately), 1 is the first passenger.
* `XPos YPos ZPos` is the point on the model which the seat (and therefore the gun) should rotate around.
* `partName` the DriveablePart which the seat is located in (e.g. core, turret)
* `minYaw maxYaw minpitch maxPitch` these are limits which control how far you can rotate the camera in pitch and yaw.
* `gunType` this is the shortname of the gun you're going to use.
* `gunName` this is the name of the gun that appears in the guns tab when pressing "r". Name it something useful!



`PassengerAimSpeed ID X Y Z` changes how quickly the passenger can aim.



`PassengerLegacyAiming ID true/false` chooses between new and old aiming features. (I wouldn't touch it) 



`PassengerTraverseSounds ID true/false` plays a sound when the passenger gun rotates to aim, which can be set using:

`PassengerPitchSoundLength ID soundLength`

`PassengerYawSoundLength ID soundLength`

`PassengerPitchSound ID sound`

`PassengerYawSound ID sound`



`PassengerRotatedOffset ID X Y Z` Offset from the passengers position (also the rotation point) for turret rotation.



`GunOrigin ID X Y Z` The point to spawn the bullets in, so they don't appear to be coming from within the vehicle. 



## Driver Operated Gun


#### Primary and secondary

* Primary
    * Fired with left click
    * Often a gun.

* Secondary
    * Fired with right click
    * Often missiles, bombs or a secondary gun



You can change what type of ammunition the gun will fire using the `Primary` and `Secondary` keyword.

You can use: `Missile`, `Bomb`, `Gun`, `Shell` or `None`.

(I am not sure that Gun can be used properly, it's used for internal use.)

For example, `Primary Shell` will fire shells from the primary gun.


#### Customisation

The rate of fire can be set using:

`ShootDelayPrimary ticks`

`ShootDelaySecondary ticks`

The delay between the driveable being placed and the guns being able to fire:

`PlaceTimePrimary ticks`

`PlaceTimeSecondary ticks`

How long each takes to load:

`ReloadTimePrimary ticks`

`ReloadTimeSecondary ticks`

Wether to alternate barrels shot from, or shoot them all at once

`AlternatePrimary true/false`

`AlternateSecondary true/false`

What firemode to use: (Modes: `fullauto`, `minigun`, `burst`, `semiauto`)

`ModePrimary mode`

`ModeSecondary mode`

Spread (for any shells and missiles):

`BulletSpread float`

Speed (for any shells and missiles):

`BulletSpeed float`

Particles:

`ShootParticlesPrimary X Y Z`

`ShootParticlesSecondary X Y Z`


#### Ammo

To determine how many (missile slots in a plane)/(shell slots in a vehicle) a driveable has:

`MissileSlots number`

or

`ShellSlots number`

To determine how many (bomb slots in a plane)/(mine slots in a vehicle) a driveable has:

`BombSlots number`

or

`MineSlots number`


To add ammo for Primary or Secondary to use, 

`AddAmmo ammoShortName`

Alternatively, you can go insane and:

`AllowAllAmmo true/false`

`AcceptAllAmmo true/false`

Please don't do this. Means your cute T-34 with missile racks can start firing Trident missiles.


#### Driver Gun - Complication 1.

Drivers can have their own guns.

I don't really know how this works, I can't find any packs that actually use this feature.

`DriverGun gunShortName`

`DriverGunOrigin X Y Z`

`DriverAimSpeed X Y Z`

`DriverLegacyAiming true/false`

`DriverTraverseSounds true/false`

Similar to passenger traverse sounds.



#### Shoot points - Complication 2.

Shoot points are the points where bullets are spawned. You can set these for the Primary and Secondary.



To set these:

`ShootPointPrimary X Y Z partName gunName`

`ShootPointSecondary X Y Z partName gunName`

Alternatively, you can also add secondary shoot points with:

`AddGun X Y Z partName gunName offsetX offsetY offsetZ`

which adds them to the turret to rotate? (not sure)



This will add the guns to the guns menu - and will copy a lot of the functionality/specs from the gun, such as spread.



gunName is optional. If you're not adding a gun, that's fine, `ShootPointPrimary X Y Z partName` will still work.



If you're firing bombs or shells, the following can also be used.

`BombPosition X Y Z offsetX offsetY offsetZ` - Sets primary to BOMB

`BarrelPosition X Y Z offsetX offsetY offsetZ` - Sets primary to SHELL.

The offset here could be used in rotating turrets?

