package net.sautour.leon.pixelnegev;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.inventory.Inventory;

public class PixelNegevCommandExecuter implements CommandExecutor {
	
	@SuppressWarnings("unused")
	private PixelNegev plugin;

	public static Inventory myInventory = Bukkit.createInventory(null, 9, "My custom Inventory");

	public void MyPluginCommandExecutor(PixelNegev plugin) {
		this.plugin = plugin;
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("negevate")) {
			
			return true;
		}
		
		return false;
	}

}
