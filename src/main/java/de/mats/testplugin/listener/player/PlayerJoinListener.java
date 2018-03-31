package de.mats.testplugin.listener.player;

import de.mats.testplugin.Tab;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

/**
 * Erstellt von Boss
 */
public class PlayerJoinListener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        Bukkit.getScheduler().scheduleSyncRepeatingTask(Tab.getInstance(), () -> {
            Tab.getInstance().getTabUtil().sendTab(player, "Dies ist die Tab", Tab.getInstance().getTimeUtil().getTimeString());
        }, 0, 10);
    }
}
