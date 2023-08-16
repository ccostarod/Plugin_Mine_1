package com.rodjao.me;

import com.rodjao.me.commands.HelloCom;

import com.rodjao.me.commands.Sethome;
import com.rodjao.me.commands.Teleporthome;
import com.rodjao.me.events.BedEvent;
import com.rodjao.me.events.ExitEvent;
import com.rodjao.me.events.FirstEvent;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    private static Main instance;
    @Override
    public void onEnable(){
        instance = this;
        System.out.println("Mariana eh linda");
        Bukkit.getPluginManager().registerEvents(new FirstEvent(), this);
        Bukkit.getPluginManager().registerEvents(new BedEvent(), this);
        Bukkit.getPluginManager().registerEvents(new ExitEvent(), this);
        getCommand("hello").setExecutor(new HelloCom());
        getCommand("sethome").setExecutor(new Sethome());
        getCommand("telhome").setExecutor(new Teleporthome());


    }

    public static Main getInstance(){
        return instance;
    }

    @Override
    public void onDisable(){
        System.out.println("Mariana continua linda");
    }

}
