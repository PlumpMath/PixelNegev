package net.sautour.leon.pixelnegev;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class myToolInventory {
	public static Inventory myInventory = Bukkit.createInventory(null, 9, "My custom tool inventory");
	
	static {
		myInventory.setItem(0, new ItemStack(Material.FEATHER, 1));
	}
	
	public void onInventoryClick(InventoryClickEvent event) {
		Player player = (Player) event.getWhoClicked();
		ItemStack clicked = event.getCurrentItem();
		Inventory inventory = event.getInventory();
		
		if (inventory.getName().equals(myInventory.getName())) {
			if(clicked.getType() == Material.FEATHER) {
				Location loc = player.getEyeLocation();
				BasicBrush brush = null;
				brush.BasicBrushUse(loc);
				event.setCancelled(true);
				player.sendMessage("Blocks have been placed");
				player.closeInventory();
				player.getInventory().addItem(new ItemStack(Material.FEATHER, 1));
			}
		}
	}
}
