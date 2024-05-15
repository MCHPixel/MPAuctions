package mchpixel.mpauctions.commands.AuctionHouseUtil;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.awt.Color;

public class AuctionManage {

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
}

