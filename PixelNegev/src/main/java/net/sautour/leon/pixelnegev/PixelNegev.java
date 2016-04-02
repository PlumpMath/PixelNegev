package net.sautour.leon.pixelnegev;

import org.bukkit.plugin.java.JavaPlugin;

public class PixelNegev extends JavaPlugin {
	@Override
	public void onEnable() {
		//To do when enabled
		getLogger().info("PixelNegev has been enabled");
		this.getCommand("basic").setExecutor(new PixelNegevCommandExecuter());
	}

	@Override
	public void onDisable() {
		//To do when disabled
		
	}
}