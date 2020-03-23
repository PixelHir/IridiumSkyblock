package com.iridium.iridiumskyblock.commands;

import com.iridium.iridiumskyblock.IridiumSkyblock;
import com.iridium.iridiumskyblock.User;
import com.iridium.iridiumskyblock.Utils;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PrivateCommand extends Command {

    public PrivateCommand() {
        super(Arrays.asList("prywatny", "private"), "Zabroń innym graczom odwiedzać twoją wyspę.", "", true);
    }

    @Override
    public void execute(CommandSender sender, String[] args) {
        Player p = (Player) sender;
        User user = User.getUser(p);
        if (user.getIsland() != null) {
            if (user.bypassing || user.getIsland().getPermissions(user.role).islandprivate) {
                user.getIsland().setVisit(false);
                sender.sendMessage(Utils.color(IridiumSkyblock.getMessages().islandNowPrivate.replace("%prefix%", IridiumSkyblock.getConfiguration().prefix)));
            } else {
                sender.sendMessage(Utils.color(IridiumSkyblock.getMessages().noPermission.replace("%prefix%", IridiumSkyblock.getConfiguration().prefix)));
            }
        } else {
            sender.sendMessage(Utils.color(IridiumSkyblock.getMessages().noIsland.replace("%prefix%", IridiumSkyblock.getConfiguration().prefix)));
        }
    }

    @Override
    public List<String> TabComplete(CommandSender cs, org.bukkit.command.Command cmd, String s, String[] args) {
        return null;
    }
}
