package mchpixel.mpauctions.commands.AuctionHouseUtil;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import java.awt.Color;

public class AuctionManage implements Listener {

    private final JavaPlugin plugin;

    public AuctionManage(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    public static void openAuctionHouse(Player player) {
        Inventory inv = Bukkit.createInventory(null, 27, "Page 1");

        ItemStack item = new ItemStack(Material.DIAMOND);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(Color.WHITE + "Best Auction");
        item.setItemMeta(meta);

        inv.setItem(13, item);

        player.openInventory(inv);

        player.sendMessage(Color.GREEN + "Auction opened");
    }

    @EventHandler
    public void onInventoryClick(InventoryClickEvent event) {
        if (event.getClickedInventory() != null && event.getClickedInventory().getHolder() instanceof Player) {
            if (event.getClickedInventory().getType().equals("Page 1")) {
                event.setCancelled(true);
            }
        }
    }
}
