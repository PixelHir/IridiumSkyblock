package com.iridium.iridiumskyblock.commands;

import com.iridium.iridiumskyblock.IridiumSkyblock;
import com.iridium.iridiumskyblock.User;
import com.iridium.iridiumskyblock.Utils;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Arrays;
import java.util.List;

public class WorldBorderCommand extends Command {

    public WorldBorderCommand() {
        super(Arrays.asList("granica", "border", "worldborder", "color", "colour"), "Otwiera interfejs zarządzania granicą.", "", true);
    }

    @Override
    public void execute(CommandSender sender, String[] args) {
        Player p = (Player) sender;
        User user = User.getUser(p);
        if (user.getIsland() != null) {
            p.openInventory(user.getIsland().getBorderColorGUI().getInventory());
        } else {
            sender.sendMessage(Utils.color(IridiumSkyblock.getMessages().noIsland.replace("%prefix%", IridiumSkyblock.getConfiguration().prefix)));
        }
    }

    @Override
    public List<String> TabComplete(CommandSender cs, org.bukkit.command.Command cmd, String s, String[] args) {
        return null;
    }
}
