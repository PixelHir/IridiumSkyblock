package com.iridium.iridiumskyblock.commands;

import com.iridium.iridiumskyblock.IridiumSkyblock;
import com.iridium.iridiumskyblock.User;
import com.iridium.iridiumskyblock.Utils;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CreateCommand extends Command {

    public CreateCommand() {
        super(Arrays.asList("utworz", "create"),"Tworzy nową wyspę.", "", true);
    }

    @Override
    public void execute(CommandSender sender, String[] args) {
        Player p = (Player) sender;
        User user = User.getUser(p);
        if (user.getIsland() != null) {
            sender.sendMessage(Utils.color(IridiumSkyblock.getMessages().alreadyHaveIsland.replace("%prefix%", IridiumSkyblock.getConfiguration().prefix)));
        } else {
            IridiumSkyblock.getIslandManager().createIsland(p);
        }
    }

    @Override
    public List<String> TabComplete(CommandSender cs, org.bukkit.command.Command cmd, String s, String[] args) {
        return null;
    }
}
