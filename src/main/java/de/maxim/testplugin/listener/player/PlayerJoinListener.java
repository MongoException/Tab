package de.maxim.testplugin.listener.player;

import de.maxim.testplugin.MainClass;
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
        Bukkit.getScheduler().scheduleSyncRepeatingTask(MainClass.getInstance(), () -> {
            MainClass.getInstance().getTabUtil().sendTab(player, "Dies ist die Tab", MainClass.getInstance().getTimeUtil().getTimeString());
        }, 0, 10);
    }
}
