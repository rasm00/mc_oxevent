package net.justcoded.mc_ox;

import org.bukkit.plugin.java.JavaPlugin;

public final class OXEvent extends JavaPlugin {

    private static OXEvent oxEvent;
    @Override
    public void onEnable() {
        oxEvent = this;

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static OXEvent getInstance() {
        return oxEvent;
    }
}
