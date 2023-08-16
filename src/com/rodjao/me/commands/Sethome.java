package com.rodjao.me.commands;

import com.rodjao.me.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.metadata.FixedMetadataValue;

public class Sethome implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Este comando só pode ser executado por um jogador.");
            return true;
        }

        Player player = (Player) sender;
        double homeX = player.getLocation().getX();
        double homeY = player.getLocation().getY();
        double homeZ = player.getLocation().getZ();
        player.setMetadata("home_x", new FixedMetadataValue(Main.getInstance(), homeX));
        player.setMetadata("home_y", new FixedMetadataValue(Main.getInstance(), homeY));
        player.setMetadata("home_z", new FixedMetadataValue(Main.getInstance(), homeZ));

        player.sendMessage("A casa foi definida com sucesso!");

        return true;
    }
}
