package net.permutated.reversebubbles;

import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(ReverseBubbles.MODID)
public class ReverseBubbles
{
    public static final String MODID = "reversebubbles";

    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    @SuppressWarnings("java:S1118")
    public ReverseBubbles() {
        LOGGER.info("registering mod: {}", MODID);
    }
}
