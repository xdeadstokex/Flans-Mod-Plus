# Guide to bullet penetration

The penetration system is a way to make armour toughness and bullet power more realistic, to make low power bullets relatively useless on vehicles and such.

Guide values for penetration:
| Armour | Power to fully penetrate | Power to do full damage |
|--------|--------------------------|-------------------------|
| Naked player head or body | 1 | 0.7 |
| Riot shield | 4 | ~ |
| Jeep | 5 | 3.5 |
| Light Tank | 10 | 7 |
| Medium Tank | 20 14 |

## Bullet

When a bullet is fired, it is given a penetration value equal to the value set with the `Penetration` config option in the BulletType file. This by default will be `1` and `0.7` if `Penetrates` is set to `False`.

Each thing the bullet passes through will take away its penetration resistance value from the bullets penetration value. When the bullet has 0 or less penetration, it will stop.

## Armour

### Vehicles

Vehicle hitboxes by default have a penetration resistance of 5, you can change this with the `SetupPart` config - the format is `SetupPart partName health(int) x y z height width depth (penetration)`.

### Player Armour

The head and body are handled seperately. Their penetration resistance values both add up to one individually by default.

Head (1) = Helmet (1)
Body (1) = Chest (0.5) + Legs (0.35) + Feet (0.15)

Vanilla armour will not modify these values, this is an area for future improvement.

For each piece of Flansmod armour you can set the penetration resistance with the `PenetrationResistance` keyword. By default this is 0, so it is reccomended to set your own value. This does not add to the naked/default values, it will set the value instead.

## Damage infliction

When a bullet intersects with a player or armour, if the bullet has a penetration value of more than 70% of the penetration resistance of the armour, it will do full damage. If less than this, the following damage will be done:

`(bullet/(armour*0.7))^(5/2) * bulletDamage`

This means, if the bullet does not have the power to penetrate 70% of the way, it will do exponentially less damage, the further it is away from 70%.

The graph shows `(bullet/armour)` against the damage modifier.

![Graph](https://i.ibb.co/S5QCJfY/Screenshot-from-2020-07-17-23-04-18.png)