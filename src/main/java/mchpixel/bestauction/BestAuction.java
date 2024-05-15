package mchpixel.bestauction;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public final class BestAuction extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvent(null, this, null, null, this);
        getCommand(Auction);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {

        Inventory inv = Bukkit.createInventory(null, 27, "Page 1");

        ItemStack item = new ItemStack(Material.DIAMOND);

        ItemMeta meta = item.getItemMeta();

        meta.setDisplayName(ChatColor.RED + "Best Auction");

        item.setItemMeta(meta);

        inv.setItem(13, item);

        Player player = event.getPlayer();

        player.openInventory(inv);

        player.sendMessage(ChatColor.GREEN + "Auction opened");
    }
}
