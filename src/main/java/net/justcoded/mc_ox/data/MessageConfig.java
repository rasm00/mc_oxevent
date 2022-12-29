package net.justcoded.mc_ox.data;

import net.justcoded.mc_core.annotations.ConfigPath;
import net.justcoded.mc_core.components.configuration.ConfigurationClass;
import net.justcoded.mc_core.injectors.DataInjector;
import org.bukkit.plugin.Plugin;

public class MessageConfig extends ConfigurationClass {

    public MessageConfig(String name, Plugin main) {
        super(name, main);
    }

    @Override
    public void injectData() {
        DataInjector.injectClassDataFromFile(this, super.config);
    }

    @ConfigPath(path = "access.no-permission")
    public String noPermission;


}
