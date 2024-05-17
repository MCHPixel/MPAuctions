package mchpixel.mpauctions.commands;

import mchpixel.mpauctions.commands.AuctionHouseUtil.AuctionManage;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class AuctionHouse implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Only players can use this command.");
            return true;
        }else{
            Player player = (Player) sender;
            AuctionManage.openAuctionhouse(player);
            return true;
        }

    }
}
