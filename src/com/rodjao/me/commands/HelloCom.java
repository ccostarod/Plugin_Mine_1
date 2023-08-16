package com.rodjao.me.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Objects;

public class HelloCom implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){
        if(args.length != 1) {
            return false;
        }
        if (args[0].equalsIgnoreCase("testeum")){
            sender.sendMessage(ChatColor.YELLOW + "Voce executou o primeiro teste! \n" +
                    ChatColor.RED + "Testando Strings - " + ChatColor.GOLD + sender.getName());
        }
        else if(args[0].equalsIgnoreCase("testedois")){
            sender.sendMessage(ChatColor.RED + "Voce executou o segundo teste! \n"
                    + ChatColor.BLUE + "Testando Strings - " + ChatColor.AQUA + sender.getName());
        }
        return true;
    }
}


