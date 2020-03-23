package com.iridium.iridiumskyblock.commands;

import com.iridium.iridiumskyblock.Island;
import com.iridium.iridiumskyblock.User;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PermissionsCommand extends Command {

    public PermissionsCommand() {
        super(Arrays.asList("uprawnienia", "permissions"), "Edit Island Permissions", "", true);
    }

    @Override
    public void execute(CommandSender sender, String[] args) {
        Player player = (Player) sender;
        User user = User.getUser(player);
        Island island = user.getIsland();
        if (island != null) {
            player.openInventory(island.getPermissionsGUI().getInventory());
        }
    }

    @Override
    public List<String> TabComplete(CommandSender cs, org.bukkit.command.Command cmd, String s, String[] args) {
        return null;
    }
}
