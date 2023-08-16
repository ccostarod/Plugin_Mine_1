package com.rodjao.me.commands;

import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Teleporthome implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Este comando só pode ser executado por um jogador.");
            return true;
        }

        Player player = (Player) sender;

        if (!player.hasMetadata("home_x") || !player.hasMetadata("home_y") || !player.hasMetadata("home_z")) {
            player.sendMessage("A casa não foi definida ainda.");
            return true;
        }

        double homeX = player.getMetadata("home_x").get(0).asDouble();
        double homeY = player.getMetadata("home_y").get(0).asDouble();
        double homeZ = player.getMetadata("home_z").get(0).asDouble();

        player.teleport(new Location(player.getWorld(), homeX, homeY, homeZ));
        player.sendMessage("Teleportado para a sua casa!");

        return true;
    }
}