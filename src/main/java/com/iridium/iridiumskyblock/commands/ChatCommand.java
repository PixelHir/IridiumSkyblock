package com.iridium.iridiumskyblock.commands;

import com.iridium.iridiumskyblock.IridiumSkyblock;
import com.iridium.iridiumskyblock.User;
import com.iridium.iridiumskyblock.Utils;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Collections;
import java.util.List;

public class ChatCommand extends Command {

    public ChatCommand() {
        super(Collections.singletonList("chat"), "Rozmowa z członkami twojej wyspy.", "", true);
    }

    @Override
    public void execute(CommandSender sender, String[] args) {
        Player p = (Player) sender;
        User user = User.getUser(p);
        if (user.getIsland() != null) {
            user.islandChat = !user.islandChat;
            if (user.islandChat) {
                p.sendMessage(Utils.color(IridiumSkyblock.getMessages().chatEnabled.replace("%prefix%", IridiumSkyblock.getConfiguration().prefix)));
            } else {
                p.sendMessage(Utils.color(IridiumSkyblock.getMessages().chatDisabled.replace("%prefix%", IridiumSkyblock.getConfiguration().prefix)));
            }
        } else {
            p.sendMessage(Utils.color(IridiumSkyblock.getMessages().noIsland.replace("%prefix%", IridiumSkyblock.getConfiguration().prefix)));
        }
    }

    @Override
    public List<String> TabComplete(CommandSender cs, org.bukkit.command.Command cmd, String s, String[] args) {
        return null;
    }
}
