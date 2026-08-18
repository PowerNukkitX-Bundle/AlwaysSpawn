package org.powernukkitx.alwaysspawn;

import org.powernukkitx.plugin.PluginBase;
import org.powernukkitx.plugin.annotation.PluginMeta;

@PluginMeta(
        name = "AlwaysSpawn",
        version = "1.0.0",
        authors = {
                "Buddelbubi"
        },
        api = {
                "3.0.0"
        },
        website = "https://github.com/PowerNukkitX-Bundle/AlwaysSpawn"
)
public class AlwaysSpawn extends PluginBase {

    private static AlwaysSpawn INSTANCE;

    @Override
    public void onEnable() {
        INSTANCE = this;
    }

    public static AlwaysSpawn get() {
        return INSTANCE;
    }
}