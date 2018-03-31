package de.mats.testplugin;

import de.mats.testplugin.listener.player.PlayerJoinListener;
import de.mats.testplugin.utils.TabUtil;
import de.mats.testplugin.utils.TimeUtil;
import lombok.Getter;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Erstellt von Boss
 */
public class Tab extends JavaPlugin {

    @Getter
    private static Tab instance;

    @Getter
    private TabUtil tabUtil;

    @Getter
    private TimeUtil timeUtil;

    @Override
    public void onLoad() {
        instance = this;
    }

    @Override
    public void onEnable() {
        intialize();
    }

    @Override
    public void onDisable() {
    }

    private void intialize() {

        tabUtil = new TabUtil();

        timeUtil = new TimeUtil();

        registerListener();
    }

    private void registerListener() {
        PluginManager pluginManager = Bukkit.getPluginManager();

        pluginManager.registerEvents(new PlayerJoinListener(), this);
    }
}
