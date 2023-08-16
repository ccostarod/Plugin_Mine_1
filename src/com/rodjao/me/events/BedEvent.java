package com.rodjao.me.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedLeaveEvent;

public class BedEvent implements Listener {

    @EventHandler
    public void onLeave(PlayerBedLeaveEvent e){
        Player player = e.getPlayer();
        player.sendMessage("Bom dia, flor do dia!");
    }
}
