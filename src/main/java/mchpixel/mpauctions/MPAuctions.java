package mchpixel.mpauctions;

import mchpixel.mpauctions.commands.AuctionHouse;
import mchpixel.mpauctions.commands.AuctionHouseUtil.AuctionManage;
import org.bukkit.command.CommandExecutor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class MPAuctions extends JavaPlugin implements CommandExecutor, Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("auction").setExecutor(new AuctionHouse());
        getServer().getPluginManager().registerEvents(this, this);
        getServer().getPluginManager().registerEvents(new AuctionManage(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

}