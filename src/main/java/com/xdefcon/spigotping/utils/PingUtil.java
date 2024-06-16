package com.xdefcon.spigotping.utils;

import org.bukkit.Bukkit;
import org.bukkit.craftbukkit.entity.CraftPlayer;
import org.bukkit.entity.Player;

public class PingUtil {
    public static int getPing(Player p) {
        if (!(p instanceof CraftPlayer)) { //compatibility with some plugins
            p = Bukkit.getPlayer(p.getUniqueId()); //cast to org.bukkit.entity.Player
        }
        try {
            return p.getPing();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
}
