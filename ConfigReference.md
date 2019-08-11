# Config reference
For each type, the table will list each config and potentially its' purpose and default values.

### IntoType
| Keyword | Type | Default | Purpose |
|----------------|------|----------------------------|----------------------------------------------------------------|
| Model | String | ~ | The name of the model file |
| ModelScale | Float | 1 | The scale to transform |
| Name | String | ~ | The name of the model (Names are set in the lang file, not here) |
| Description | String | ~ | The item description |
| ShortName | String | ~ | The item's shortname |
| Colour / Color | Int Int Int | 255 255 255 | The colour of the item (Not sure where this is actually used?) |
| Icon | String | ~ | The texture path of the item icon |
| RecipeOutput | Integer | 1 | The number of items produced when crafted |
| Recipe | RecipeFormat (See line 20) | ~ | Recipe for the item |
| ShapelessRecipe | List of recipe items? | ~ | Shapeless recipe for the item |
| SmeltableFrom | String | ~ | The shortname of the item that it may be smelted from |
| CanDrop | Bool | true | Whether the item can be.. dropped? |

Recipe format: 
```
A ItemTypeOne B ItemTypeTwo
ABA
BAB
   
```

### PaintableType extends InfoType
| Keyword | Type | Default | Purpose |
|-------------|------------------------------------------------------------------|---------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Paintjob | iconName textureName [dyeName dyeAmount (dyeDamage)] | ~ | Sets up a new paintjob with the dyes required dyeDamage is optional and I'm not entirely sure how that works. The dye setup in [] can be repeated. (you don't need to add the []) |
| AdvPaintjob | displayName iconName textureName [dyeName dyeAmount (dyeDamage)] | ~ | Creates an advanced paintjob |

### GunType extends PaintableType
| Keyword | Type | Default | Purpose |
|-----------------------------|------------|----------------|-------------------------------------------------------------------------------------------|
| Damage | Float | 0 | Multiplies the damage of the bullet |
| MeleeDamage | Float | 1 | The damage caused by punching with the gun |
| CounterRecoilForce | Float | 0.8 | Constant to determine how quickly the gun returns to centre after firing. Higher = longer |
| CounterRecoilForceSneaking | Float | 0.7 | ~ |
| CounterRecoilForceSprinting | Float | 0.9 | ~ |
| CanForceReload | Bool | true | Whether R can be used to reload the gun |
| AllowRearm | Bool | true | Ammo bags give ammo when right clicked with the gun |
| ReloadTime | Integer | ~ | Ticks taken to reload the gun |
| Recoil | Float | 0 | Upwards view recoil |
| RecoilYaw | Float | 0 | Sideways view recoil |
| RandomRecoilRange | Float | 0.5 | Maximum divergence of the recoil vertically |
| RandomRecoilYawRange | Float | 0.5 | ~ Horizontally |
| Knockback | Float | 0 | Amount of knockback to push the player when shot |
| Accuracy / Spread | Float | 0 | Amount that the bullets spread out |
| NumBullets | Integer | 1 | The number of bullets created by each shot |
| AllowNumBulletsByBulletType | Bool | false | The NumBullets of the ammo overrides the guns NumBullets. |
| AllowSpreadByBullet | Bool | false | The Spread of the ammo overrides the guns Spread. |
| CanLockAngle | Integer | 5 | The angle between entity and player view that a launcher can lock on with |
| LockOnSoundTime | Integer | 0 |  |
| LockOnToDriveables | Bool |  | Whether the launcher can lock on to planes, vehicles, mechas |
| LockOnToVehicles | Bool | false | ~ |
| LockOnToPlanes | Bool | false |  |
| LockOnToMechas | Bool | false |  |
| LockOnToPlayers | Bool | false |  |
| LockOnToLivings | Bool | false |  |
| ConsumeGunOnUse | Bool | false | Gun deletes when shot. (E.g. Panzerfaust) |
| ShowCrosshair | Bool | false | Show a crosshair when holding the gun |
| DropItemOnShoot | Bool | false | Drop the item when gun has been shot onto the floor |
| NumBurstRounds | Integer | 3 | Number of bullets to fire per burst in burst fire mode |
| MinigunStartSpeed | Float | 15 | Required speed of revolution for minigun to start firing |
| ItemUseAction | EnumAction | EnumAction.bow | The type of action MC thinks you're doing. |
| MaxRangeLockOn | Integer | 80 | Max range in... blocks? That lockon will work. |
| ShootDelay | Float | 0 | Ticks between shots (Supposedly outdated?) |
| RoundsPerMin | Float | 0 | Fire rate of the gun in rounds per minute. 1200 is supposedly the max (60*20). |
| SoundLength | Integer | ~ | Length of the shoot sound for looping |
| DistortSound | Bool | true | Whether to distort the sound played |
| IdleSoundRange | Integer | 50 | Block range that players can hear the idle sound (minigun spin) |
| MeleeSoundRange | Integer | 50 | ~ |
| ReloadSoundRange | Integer | 50 | ~ |
| GunSoundRange | Integer | 50 | ~ |
| ShootSound | String | ~ |  |
| BulletInsertSound | String | ~ |  |
| BulletInsertSound | String | ~ |  |
| ActionSound | String | ~ |  |
| LastShootSound | String | ~ |  |
| SuppressedShootSound | String | ~ |  |
| ReloadSound | String | ~ |  |
| EmptyReloadSound | String | ~ |  |
| EmptyClickSound | String | ~ |  |
| IdleSound | String | ~ |  |
| IdleSoundLength | String | ~ |  |
| MeleeSound | String | ~ |  |
| WarmupSound | String | ~ |  |
| WarmupSoundLength | String | ~ |  |
| LoopedSound / SpinSound | String | ~ |  |
| LoopedSoundLength / SpinSoundLength | String | ~ |  |
| CooldownSound | String | ~ |  |
| LockOnSound | String | ~ |  |
| Mode | String | FULLAUTO | The mode of the gun. (fullauto, minigun, burst, semiauto) |
| Scope | String | ~ | None = NoScope, otherwise scopeTexture |
| AllowNightVision | Bool | false | Gives night vision effect when scoped |
| ZoomLevel | Float | 1 | Zoom level of the default scope |
| FOVZoomLevel | Float | 1.5 | The FOV zoom level of the default scope |
| Deployable | Bool | false | Whether the gun is placeable |
| DeployedModel | String | ~ | The model name of the deployed model |
| CasingModel | String | ~ | The model name of the casings to eject |
| FlashModel | String | ~ | The model name of the muzzle flash |
| CasingTexture | String | ~ | The texture name of the casings to eject |
| FlashTexture | String | ~ | The texture name of the muzzle flash |
| ModelScale | Float | 1 | The scale to transform by |
| Texture | String | ~ | The name of the texture file to use |
| HitTexture | String | ~ | The name of the hit texture file to use |
| DeployedTexture | String | ~ | The name of the deployed texture file to use |
| StandBackDistance | Float | 1.5 | How far behind the player should be behind a deployed gun |
| TopViewLimit | Float | -60 | How far the players view should be limited upwards (Deployed) |
| BottomViewLimit | Float | 30 | How far the players view should be limited downwards (Deployed) |
| SideViewLimit | Float | 45 | How far the players view should be limited sideways (Deployed) |
| PivotHeight | Float | 0.375 | Something to do with deployables |
| Ammo | String | ~ | Add to the list of types of ammo that the gun will take |
| NumAmmoSlots / NumAmmoItemsInGun / LoadIntoGun | Integer | 1 | The number of bullets to take into the gun when loading |
| BulletSpeed | Float | 5 | Speed of the bullet when leaving the gun |
| CanShootUnderwater | Bool | true | Whether the gun may be used underwater |
| CanSetPosition | Bool | false | Whether the gun will move with the target when locked on |
| OneHanded | Bool | false | Whether the gun may be dual wielded |
| SecondaryFunction | EnumSecondaryFunction | ADS_ZOOM | The function of left click (Zoom, melee, custommelee, ads_zoom) |
| UsableByPlayers | Bool | true | Whether the gun may be used by players |
| UsableByMechas | Bool | true | Whether the gun may be used by mechas |
| UseCustomMelee | Bool | false ( kind of ) | Whether to use the custom melee function |
| UseCustomMeleeWhenShot | Bool | false ( kind of ) | Whether to use the custom melee function when shot |
| MeleeTime | Integer | 1 | Time delay between custom melee attacks |
| AddNode | 2x Vec3 ( x y z ) | ~ | Add a node to the animation track for melee/other |
| MeleeDamagePoint / MeleeDamageOffset | Vec3 ( x y z ) | ~ | Add a point where damage should be dealt |
| MoveSpeedModifier / Slowness | Float | 1 | Modifier to player movement speed |
| KnockbackModifier / KnockbackReduction | Float | 0 | Modifier to player knockback |
| AllowAllAttachments | Bool | false | Allow all attachments to be used with the gun |
| AllowAttachments | List of attachments | ~ | Add attachments to gun |
| AllowBarrelAttachments | Bool | false | Allow x attachments to be used with this gun |
| AllowScopeAttachments | Bool | false | Allow x attachments to be used with this gun |
| AllowStockAttachments | Bool | false | Allow x attachments to be used with this gun |
| AllowGripAttachments | Bool | false | Allow x attachments to be used with this gun |
| AllowGadgetAttachments | Bool | false | Allow x attachments to be used with this gun |
| AllowSlideAttachments | Bool | false | Allow x attachments to be used with this gun |
| AllowPumpAttachments | Bool | false | Allow x attachments to be used with this gun |
| AllowAccessoryAttachments | Bool | false | Allow x attachments to be used with this gun |
| NumGenericAttachments | Integer | 0 | The number of generic attachments that can be used |
| shield | damageAbsorption (origin) X Y Z (dimensions) X Y Z | false | Allow x attachments to be used with this gun |

### AAGunType extends Infotype
| Keyword | Type | Default | Purpose |
|----------------------|----------|------|--------------------------------------------------|
| Model | String | ~ | Location of the model |
| Texture | String | ~ | Name of the texture file |
| ReloadTime | Integer | ~ | Time in ticks that it takes to reload |
| Recoil | Integer | 5 | The recoil |
| Accuracy | Integer | ~ | The accuracy of the gun |
| ShootDelay | Integer | ~ | Delay in ticks between shots |
| ShootSound | String | ~ | Sound to play on shooting |
| ReloadSound | String | ~ | Sound to play on reload |
| FireAlternatiely | Bool | ~ | Alternate firing between shootpoints ? |
| NumBarrels | Integer | ~ | The number of barrels the AAGun has |
| Barrel | ID X Y Z | ~ | Add a barrel with ID at the specified position |
| Health | Integer | ~ | The health of the AAGun |
| TopViewLimit | Float | 75 | The angle which the view is limited to at the top |
| BottomViewLimit | Float | 0 | The angle which the view is limited to at the bottom |
| Ammo | String | ~ | The shortname of the ammo to use |
| GunnerPos | X Y Z | ~ | The position of the gunner on the AAGun |
| TargetMobs | Bool | false | Sentry mode, fire at mobs |
| TargetPlayers | Bool | false | Sentry mode, fire at X |
| TargetVehicles | Bool | false | Sentry mode, fire at X |
| TargetPlanes | Bool | false | Sentry mode, fire at X |
| TargetMechas | Bool | false | Sentry mode, fire at X |
| TargetDriveables | Bool | false | Sentry mode, fire at Planes, Vehicles and Mechas |
| ShareAmmo | Bool | false | Whether all barrels should share the same ammo slot. |
| TargetRange | Float | 10 | Sentry mode, max distance that it will target |
| CanShootHomingMissile | Bool | false | Whether homing missiles may be shot from the AAGun |
| CountExplodeAfterShoot | Integer | -1 | How long after shot should the missile explode. -1 = never/when hit target |
| IsDropThis | Bool | true | Whether it drops item when destroyed? |

### AttachmentType extends PaintableType
| Keyword | Type | Default | Purpose |
|---------|------|---------|---------|
| AttachmentType | String | EnumAttachmentType.generic | The type of attachment |
| Model | String | ~ | The model name of the model to use |
| ModelScale | Float | 1 | Scale to transform |
| Texture | String | ~ | The texture file to use |
| Silencer | Bool | false | Whether this attachment should muffle bullet sounds |
| DisableMuzzleFlash | Bool | false | Whether this attachment should remove any muzzle flash from rendering |
| FlashLight | Bool | false | Whether this attachment is a flashlight |
| FlashLightRange | Float | 10 | Number of blocks range of the flashlight |
| FlashLightStrength | Float | 12 | Light level produced (between 0 and 15) |
| ModeOverride | String | ~ | Override the fire mode of a gun with a valid EnumFireMode (fullauto, minigun, burst, semiauto) |
| SecondaryMode | Bool | false | Whether this attachment is an underbarrel attachment |
| SecondaryAmmo | String | ~ | Add an ammo type for the underbarrel gun |
| SecondaryDamage | Float | 1 | The damage multiplier of the underbarrel gun |
| SecondarySpread / Accuracy | Float | 1 | The inaccuracy of the underbarrel |
| SecondaryBulletSpeed | Float | 5 | Speed of the bullet when leaving the underbarrel |
| SecondaryShootDelay | Integer | 1 | Ticks to wait between firing the underbarrel |
| SecondaryReloadTime | Integer | 1 | Ticks taken to reload the underbarrel |
| SecondaryNumBullets | Integer | 1 | Number of bullets created by the underbarrel when fired |
| LoadSecondaryIntoGun | integer| 1 | Number of bullet stacks in magazine? (Has something to do with underbarrel) |
| SecondaryFireMode | String | SEMIAUTO | The EnumFireMode of the underbarrel (fullauto, minigun, burst, semiauto) |
| SecondaryShootSound | String | ~ | The sound to play when the underbarrel is shot |
| SecondaryReloadSound | String | ~ | ~ |
| ModeSwitchSound | String | ~ | The sound to play when toggling between primary and underbarrel gun |
| MeleeDamageMultiplier | Float | 1 | The multiplier to the X stat of the gun |
| DamageMultiplier | Float | 1 | The multiplier to the X stat of the gun |
| SpreadMultiplier | Float | 1 | The multiplier to the X stat of the gun |
| RecoilMultiplier | Float | 1 | The multiplier to the X stat of the gun |
| RecoilControlMultiplier | Float | 1 | The multiplier to the X stat of the gun |
| RecoilControlMultiplierSneaking | Float | 1 | The multiplier to the X stat of the gun |
| RecoilControlMultiplierSprinting | Float | 1 | The multiplier to the X stat of the gun |
| BulletSpeedMultiplier | Float | 1 | The multiplier to the X stat of the gun |
| ReloadTimeMultiplier | Float | 1 | The multiplier to the X stat of the gun |
| MovementSpeedMultiplier | Float | 1 | The multiplier to the X stat of the gun |
| ZoomLevel | Float | 1 | The zoom of the scope |
| FOVZoomLevel | Float | 1 | The FOV zoom of the scope |
| ZoomOverlay | String | false/none | None = No overlay. Anything else will become the overlay image |
| HasNightVision | Bool | false | Whether to apply night vision |

### ShootableType extends InfoType
| Keyword | Type | Default | Purpose |
|---------|------|---------|---------|
| Model | String | ~ | Sets the model of the Shootable |
| Texture | String | ~ | Sets the texture of the Shootable |
| StackSize / NaxStackSize | Integer | 1 | The maximum number of X that can be stacked |
| DropItemOnShoot | String | null | Items dropped on various events |
| DropItemOnReload | String | null | Items dropped on various events |
| DropItemOnHit | String | null | Items dropped on various events |
| RoundsPerItem | Integer | 1 | The number of rounds fired by a gun per item |
| FallSpeed | Float | 1 | Speed at which the projectile should fall after being fired |
| ThrowSpeed / ShootSpeed | Float | 1 | The speed at which the projectile should be launched. 0 Will give it no velocity and drop instantly. |
| HitBoxSize | Float | 0.5 | The size of the hitbox. Units are probably /16ths |
| DamageVsLiving | Float | 1 | Amount of damage to do when hit. |
| DamageVsPlayer | Float | 1 | Amount of damage to do when hit. |
| DamageVsEntity | Float | 1 | Amount of damage to do when hit. |
| DamageVsVehicles | Float | 1 | Amount of damage to do when hit. |
| DamageVsPlanes | Float | 1 | Amount of damage to do when hit. |
| IgnoreArmorProbability | Float | 0 | Not entirely sure. |
| IgnoreArmorDamageFactor | Float | 0 | Not entirely sure. |
| BreaksGlass | Bool | false | Whether the projecticle breaks glass on impact. |
| Fuse | Integer | 0 | Ticks until a grenade explodes. 0 = explode on impact |
| DespawnTime | Integer | 0 | Time until the grenade despawns, without exploding. 0 = no despawn |
| ExplodeOnImpact / DetonateOnImpact | Bool | false | Whether to explode when hitting a block or entity |
| FireRadius / Fire | Float | 0 | The radius in which fire will be placed on impact |
| ExplosionsRadius / Explosion | Float | 0 | The radius of the explosion to create on impact |
| ExplosionBreaksBlocks | Bool | true | Whether the impact explosion breaks blocks |
| ExplosionsDamageVsLiving | Float | 1 | The damage to do to X from the explosion |
| ExplosionsDamageVsLiving | Float | 1 | The damage to do to X from the explosion |
| ExplosionsDamageVsPlane | Float | 1 | The damage to do to X from the explosion |
| ExplosionsDamageVsVehicle | Float | 1 | The damage to do to X from the explosion |
| DropItemOnDetonate | String | null | The item to drop when the projectile explodes |
| DetonateSound | String | ~ | The sound to play on detonation. |
| HasSubmunitions | Bool | false | Whether there are other projectiles by this one. |
| Submunition | String | ~ | Set the submunition |
| NumSubmunitions | Integer | 0 | Number of submunitions to create |
| SubmunitionDelay | Integer | ~ | Delay to create submunitions after impact / firing? |
| FlareParticleCount | Integer | 0 | Number of smoke particles to create |
| DebrisParticleCount | Integer | 0 | Number of debris particles to create |
| TrailParticles / SmokeTrail | Bool | false | Whether to create a trail of particles. |
| TrailParticleType | String | smoke | The type of particle to emity for the trail |

### BulletType extends ShootableType
| Keyword | Type | Default | Purpose |
|---------|------|---------|---------|
| FlakParticles | Integer | 0 | The number of flak particles produced when exploding |
| FlakParticleType | String | largesmoke | The type of flak particles to spawn |
| SetEntitiesOnFire | Bool | false | Whether to set entities on fire upon collision |
| HitSoundEnable | Boolean | false | Whether to play the hit sound |
| HitSound | String | ~ | The hit sound to play if enabled |
| HitSoundRange | Float | ~ | The range that the hit sound will play |
| Penetration / PenetratingPower | Float | 1 | Penetration power |
| DragInAir | Float | 0.99 | Drag coefficient (Possibly 1 - )? Between 0 and 1 |
| DragInWater | Float | 0.80 | Drag coefficient in water (Possibly 1 - )? Between 0 and 1 |
| NumBullets | Integer | -1 | Number of bullets to fire per shot. -1 is "let gun decide"? |
| Accuracy / Spread | Float | -1 | Bullet accuracy. -1 is "let gun decide" |
| LivingProximityTrigger | Float | -1 | If greater than 0, the bullet will explode with this radius of a living entity |
| DriveableProximityTrigger | Float | -1 | If greater than 0, the bullet will explode with this radius of a Driveable |
| DamageToTriggerer | Float | 0 | How much damage to do to the entity who triggered it |
| PrimeDelay / TriggerDelay | Integer | 0 | Time after firing which the bullet may not detonate |
| NumExplodeParticles | Integer | 0 | Number of explosion particles to create |
| ExplodeParticles | String | largesmoke | The type of explosion particles to create |
| SmokeTime | Integer | 0 | Time for smoke to remain after explosion |
| SmokeParticles | String | explode | The type of particles to use for smoke |
| SmokeEffect | String | ~ | Add a potion effect to the smoke |
| SmokeRadius | Float | 5 | The radius that the smoke affects |
| VLS / HasDeadZone | Bool | false | Whether this is a vertical launch system/guided thing |
| VLS time / DeadZoneTime | Integer | 0 | How long it takes before guidance kicks in |
| FixedTrackDirection | Boolean | false | Whether.. it can only go in a straight line? |
| GuidedTurnRadius | Float | 3 | The turning radius of the guided missile |
| GuidedPhaseSpeed | Float | 2 | The speed during guiding? |
| GuidedPhaseTurnSpeed | Float | 0.2 | Speed of turning of guided missile? |
| BostParticle | String | ~ | The particle type for "boost phase" ie when it isn't guided yet |
| Torpedo | Boolean | false | Whether this is a torpedo or not |
| Bomb | ~ | ~ | Add this to set this as a BOMB |
| Shell | ~ | ~ | Add this to set this as a SHELL |
| Missile | ~ | ~ | Add this to set this as a MISSILE |
| WeaponType | String | ~ | Set weapon type (MISSILE, BOMB, SHELL, MINE, GUN, NONE) |
| HasLight | Boolean | false | Whether it has.. a light? |
| LockOnToDriveables | Bool | false | Lock on to vehicles, planes and mechas. |
| LockOnToVehicles | Bool | false | Lock on to X |
| LockOnToPlanes | Bool | false | Lock on to X |
| LockOnToMechas | Bool | false | Lock on to X |
| LockOnToPlayers | Bool | false | Lock on to X |
| LockOnToLivings | Bool | false | Lock on to X |
| MaxLockOnAngle | Float | 45 | Maximum angle for locking on to a target |
| LockOnForce / TurningForce | Float | 1 | The force locking the bullet onto the target |
| MaxDegreeOfLockOnMissile | Integer | 20 | The highest degree that the missile will keep its target when locked on |
| TickStartHoming | Integer | 5 | How many ticks before the missile starts to home |
| EnableSACLOS | Boolean | false | Enable Wire/Radio guiding |
| MaxRangeOfMissile | Integer | 150 | Number of blocks that a missile can be guided for |
| CanSpotEntityDriveable | Boolean | false | ? |
| ShootForSettingPos | Boolean | false | ? |
| ShootForSettingPosHeight| Integer | 100 | ? |
| IsDoTopAttack | Boolean | false | ? |
| PotionEffect | String | ~ | The effects done to the entity hit |
| ManualGuidance | Boolean | false | Whether this is manually guided |
| LockOnFuse | Integer | 10 | Ticks before explosion when locked on? |
| MaxRange | Integer | -1 | Maximum distance for something. -1 is infinite. |

### GrenadeType extends ShootableType
| Keyword | Type | Default | Purpose |
|---------|------|---------|---------|
| MeleeDamage | Integer | 1 | The damage caused by getting hit with the grenade |
| ThrowDelay | Integer | 0 | Time wait between grenade throws |
| ThrowSound | String | ~ | Sound to play when throwing grenade |
| DropItemOnThrow | String | ~ | Whether to drop an item when grenade is thrown |
| CanThrow | Bool | true | Whether the grenade can be thrown with right click |
| Bounciness | Float | 0.9 | When grenade hits an entity or block, the velocity will multiply by this amount |
| PenetratesEntities | Boolean | false | Whether it can go through entities |
| PenetratesBlocks | Boolean | false | Whether it can go through blocks |
| BounceSound | String | ~ | Sound on bound |
| Sticky | Bool | false | Whether the grenade should stick to surfaces |
| LivingProximityTrigger | Float | -1 | If greater than 1, explode when within this radius of a living |
| VehicleProximityTrigger | Float | -1 | If greater than 1, explode when within this radius of a vehicle |
| DamageToTriggerer | Float | 0 | Damage given to the entity who triggered it |
| DetonateWhenShot | Boolean | false | When this entity is shot, it will explode |
| PrimeDelay / TriggerDelay | Integer | 0 | Detonation can only happen after this time in ticks |
| StickToThrower | Boolean | false | Whether the grenade can stick to the person who threw it |
| StickToEntity | Boolean | false | Sticks to X |
| StickToDriveable | Boolean | false | Sticks to X |
| StickToEntityAfter | Boolean | false | ? |
| AllowStickSound | Boolean | false | Whether to play the stick sound |
| StickSoundRange | Integer | 10 | The range to play the stick sound |
| StickSound | String | ~ | The sound to play when sticking |
| NumExplodeParticles | Integer | 0 | Number of explosion particles to create |
| ExplodeParticles | String | largesmoke | The type of explosion particles to create |
| SmokeTime | Integer | 0 | Time for smoke to remain after explosion |
| SmokeParticles | String | explode | The type of particles to use for smoke |
| SmokeEffect | String | ~ | Add a potion effect to the smoke |
| SmokeRadius | Float | 5 | The radius that the smoke affects |
| SpinWhenThrown | Boolean | true | Whether the grenade should spin after thrown |
| Remote | Boolean | false | Whether the grenade can be detonated using a remote detonator |
| FlashBang | Boolean | false | Whether to use flashbang effects|
| FlashTime | Integer | 200 | Number of ticks that the flash lasts for |
| FlashRange | Integer | 8 | The number of blocks radius the flash effects affect |
| FlashSoundEnable | Boolean | false | Enable the flash sound |
| FlashSoundRange | Integer | 16 | The radius of blocks around to play the flash sound |
| FlashSound | String | ~ | The flash sound to play |
| FlashDamageEnable | Boolean | false | Whether to deal those in the flash range damage |
| FlashDamage | Float | ~ | The damage to deal to those in the flash range |
| FlashEffects | Boolean | false | Whether to enable flash effects |
| FlashEffectsID | Integer | ~ | The ID of the flash effects to use |
| FlashEffectsDuration | Integer | ~ | The number of ticks the flash effects last for |
| FlashEffectionsLevel | Integer | ~ | The intensity of flash effects |
| MotionSensor | Boolean | false | Enable motion sensor functionality |
| MotionSensorRange | Float | 5 | The radius in whenceforthward the motion sensor will work |
| MotionSoundRange | Float | 20 | The sound radius when motion is detected |
| MotionSound | String | ~ | The sound to play when motion is detected |
| MotionTime | Integer | 20 | Something in ticks? |
| DeployableBag | Boolean | false | Whether this is actually a deployable bag, and not an explodey thing |
| NumUses | Integer | 1 | The number of times the bag may be used before it runs out |
| HealAmount | Float | 0 | Amount to heal players by who use this bag |
| AddPotionEffect / PotionEffect | String | ~ | Add effect |
| NumClips | Integer | 0 | The number of ammo clips players get when using the ammo bag (multiplied by numBulletsInGun)|

I apologise for mistakes in this file. Please PR if you spot any, or modify when things change.