# Content Packs to *Content Mods*
Mirroring the new feature of [Flan's Mod 1.12](https://github.com/FlansMods/FlansMod),
you can now convert your Flan's Mod content packs to Forge mods. This document will explain why this is 
a big deal, how to do it, and what to expect.

### Why does this matter?
Flan's Mod has loaded content packs from its own directory for nearly a decade, why bother creating a Forge
mod to accomplish the same thing?

Truth is, Flan's method works fine. We will continue to support loading content packs from the `Flan` folder
for as long as necessary, and we don't expect a large majority of content creators to spend a lot of their
time reworking their content packs that work perfectly fine as-is.

However, that being said...
There's a lot of features Forge provides that Flan's doesn't implement itself, such as
dependency management, mod checking when connecting to a server, or update checking.

### How do I convert my content pack?
This will require a little coding knowledge (but not too much, I promise!).

Assuming your content pack is already configured in this repository, all you need to do is create a new
package (like for example `com.flansmod.ww2`). Inside your new package, create a new class with the 
title of your mod (such as [WW2PackMod.java](src/main/java/com/flansmod/ww2/common/WW2PackMod.java)).

Inside your newly created class, we'll add the following:

```java
//Note that you can add more dependencies, separated by a comma.
@Mod(modid = NewContentMod.MODID, name = NewContentMod.NAME, version = NewContentMod.VERSION, dependencies = "required-after: " + FlansMod.MODID)
public class NewContentMod implements IFlansContentProvider {
    public static final String MODID = "new_content_mod";
    public static final String VERSION = "1.0";
    public static final String NAME = "New Content Pack";

    @Override
    public String getContentDirectory() {
        //Return the name of your content pack directory.
        return "Content Pack Directory";
    }

    @Override
    public void registerModelLocations() {
        //Your models will now be located inside this mod package instead.
        //This means you'll need to define where your models are located, using a shorthand prefix.
        FlansMod.registerModelLocation("ww2", "com.flansmod.ww2.client.model");
    }
}
```

...and voilà! Now your content pack has become a content *mod*!

Want your content pack to automatically check for updates? [Check the Forge docs.](https://mcforge.readthedocs.io/en/latest/gettingstarted/autoupdate/)
Need to add the Simple Parts pack to your dependencies? Just add its mod ID to your `@Mod()` declaration, and you're good!