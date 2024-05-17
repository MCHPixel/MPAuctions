package mchpixel.mpauctions.commands.AuctionHouseUtil;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class AuctionManage implements Listener {

    public static void openAuctionhouse(Player player) {
        Inventory inv = Bukkit.createInventory(null, 27, "Page 1");

        ItemStack item = new ItemStack(Material.DIAMOND);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.AQUA + "Switch Pages");
        item.setItemMeta(meta);

        inv.setItem(13, item);

        player.openInventory(inv);

        player.sendMessage(ChatColor.AQUA + "Auction opened");
    }

    @EventHandler
    public void onClick(InventoryClickEvent event) {
        // Check if the clicked slot is 13
        if (event.getSlot() == 13) {
            ItemStack clickedItem = event.getCurrentItem();

            // Ensure the clicked item and its meta are not null
            if (clickedItem != null && clickedItem.hasItemMeta()) {
                ItemMeta itemMeta = clickedItem.getItemMeta();

                // Check if the item meta has a display name and it matches the target name
                if (itemMeta.hasDisplayName() && itemMeta.getDisplayName().equals(ChatColor.AQUA + "Switch Pages")) {
                    event.setCancelled(true);
                    // Add your code here to handle the switch pages action
                }
            }
        }
    }
}
