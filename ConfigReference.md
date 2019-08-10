# Config reference
For each type, the table will list each config and potentially its' purpose and default values.

### GunType
| Keyword | Type | Default | Purpose |
|-----------------------------|------------|----------------|-------------------------------------------------------------------------------------------|
| Damage | Float | 0 | Multiplies the damage of the bullet |
| MeleeDamage | Float | 1 | The damage caused by punching with the gun |
| CounterRecoilForce | Float | 0.8 | Constant to determine how quickly the gun returns to centre after firing. Higher = longer |
| CounterRecoilForceSneaking | Float | 0.7 | ~ |
| CounterRecoilForceSprinting | Float | 0.9 | ~ |
| CanForceReload | Bool | true | Wether R can be used to reload the gun |
| AllowRearm | Bool | true | Ammo bags give ammo when right clicked with the gun |
| ReloadTime | Integer | ~ | Ticks taken to reload the gun |
| Recoil | Float | 0 | Upwards view recoil |
| RecoilYaw | Float | 0 | Sideways view recoil |
| RandomRecoilRange | Float | 0.5 | Maximum divergence of the recoil vertically |
| RandomRecoilYawRange | Float | 0.5 | ~ Horizontally |
| DecreaseRecoil | Float |  | Not implemented. |
| DecreaseRecoilYaw | Float |  | Not implemented. |
| Knockback | Float | 0 | Amount of knockback to push the player when shot |
| Accuracy / Spread | Float | 0 | Amount that the bullets spread out |
| NumBullets | Integer | 1 | The number of bullets created by each shot |
| AllowNumBulletsByBulletType | Bool | false | The NumBullets of the ammo overrides the guns NumBullets. |
| AllowSpreadByBullet | Bool | false | The Spread of the ammo overrides the guns Spread. |
| CanLockAngle | Integer | 5 | The angle between entity and player view that a launcher can lock on with |
| LockOnSoundTime | Integer | 0 |  |
| LockOnToDriveables | Bool |  | Wether the launcher can lock on to planes, vehicles, mechas |
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
| DistortSound | Bool | true | Wether to distort the sound played |
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
| Deployable | Bool | false | Wether the gun is placeable |
| DeployedModel | String | ~ | The model name of the deployed model |
| CasingModel | String | ~ | The model name of the casings to eject |
| FalseModel | String | ~ | The model name of the muzzle flash |
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
| CanShootUnderwater | Bool | true | Wether the gun may be used underwater |
| CanSetPosition | Bool | false | Wether the gun will move with the target when locked on |
| OneHanded | Bool | false | Wether the gun may be dual wielded |
| SecondaryFunction | EnumSecondaryFunction | ADS_ZOOM | The function of left click (Zoom, melee, custommelee, ads_zoom) |
| UsableByPlayers | Bool | true | Wether the gun may be used by players |
| UsableByMechas | Bool | true | Wether the gun may be used by mechas |
| UseCustomMelee | Bool | false ( kind of ) | Wether to use the custom melee function |
| UseCustomMeleeWhenShot | Bool | false ( kind of ) | Wether to use the custom melee function when shot |
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

I apologise for mistakes in this file. Please PR if you spot any, or modify when things change.