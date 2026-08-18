package org.powernukkitx.alwaysspawn;

import org.powernukkitx.Server;
import org.powernukkitx.event.EventHandler;
import org.powernukkitx.event.EventPriority;
import org.powernukkitx.event.Listener;
import org.powernukkitx.event.player.PlayerTeleportEvent;
import org.powernukkitx.level.Location;
import org.powernukkitx.level.Position;
import org.powernukkitx.plugin.PluginBase;
import org.powernukkitx.plugin.annotation.EventListener;
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
@EventListener
public class AlwaysSpawn extends PluginBase implements Listener {

    private static AlwaysSpawn INSTANCE;

    @Override
    public void onEnable() {
        INSTANCE = this;
    }

    @EventHandler(priority = EventPriority.LOW)
    public void onTeleport(PlayerTeleportEvent event) {
        if (event.getCause() == PlayerTeleportEvent.TeleportCause.PLAYER_SPAWN) {
            Position spawn = Server.getInstance().getDefaultLevel().getSpawnLocation();
            Location to = event.getTo();
            to.setX(spawn.getX());
            to.setY(spawn.getY());
            to.setZ(spawn.getZ());
            to.setLevel(spawn.getLevel());
        }
    }

    public static AlwaysSpawn get() {
        return INSTANCE;
    }
}