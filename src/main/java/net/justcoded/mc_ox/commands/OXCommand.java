package net.justcoded.mc_ox.commands;

import net.justcoded.mc_core.components.commands.CommandClass;
import net.justcoded.mc_ox.OXEvent;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class OXCommand extends CommandClass<OXEvent> {

    public OXCommand(String command, String permission, OXEvent plugin) {
        super(command, permission, plugin);
    }

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {
        if (args.length == 0) {

            return false;
        }
        if ("wand".equalsIgnoreCase(args[0])) {
            return new WandSubCommand(this).onSubCommand(commandSender, command, s, Arrays.stream(args).skip(1).toList().toArray(new String[args.length - 1]));
        }
        return false;
    }

    @Override
    public List<String> onTabComplete(CommandSender commandSender, Command command, String s, String[] strings) {
        return null;
    }

    private List<String> arguments = Stream.of("wand", "").toList();

}