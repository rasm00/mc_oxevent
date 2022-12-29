package net.justcoded.mc_ox.commands;

import net.justcoded.mc_core.components.SubCommand;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.Collections;
import java.util.List;

import static net.justcoded.mc_core.components.MagicWand.getMagicWand;

public class WandSubCommand extends SubCommand<OXCommand> {

    public WandSubCommand(OXCommand commandExecutor) {
        super(commandExecutor);
    }

    @Override
    public boolean onSubCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (! (commandSender instanceof Player actor)) {
            commandSender.sendMessage("");
            return false;
        }
        if (! actor.hasPermission("")) {
            return false;
        }
        ItemStack magicWand = getMagicWand();
        actor.getInventory().addItem(magicWand);
        return true;
    }

    @Override
    public List<String> onTabComplete(CommandSender commandSender, Command command, String s, String[] strings) {
        return Collections.emptyList();
    }
}
