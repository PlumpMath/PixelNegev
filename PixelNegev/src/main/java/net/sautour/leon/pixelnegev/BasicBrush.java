package net.sautour.leon.pixelnegev;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;

public class BasicBrush {
	public void BasicBrushUse(Location loc) {
		int length = 5;
		
		int xPlayer = loc.getBlockX() - 1;
		int yPlayer = loc.getBlockY() - 1;
		int zPlayer = loc.getBlockZ();
		
		int xOpposite = loc.getBlockX() + length;
		int yOpposite = loc.getBlockY() + length;
		int zOpposite = loc.getBlockZ() + length;
		
		World world = loc.getWorld();
		
		//Loop over the cube in the X dimension
		for (int xPoint = xPlayer; xPoint <= xOpposite; xPoint++) {
			//Loop over the cube in the Y dimension
			for (int yPoint = yPlayer; xPoint <= yOpposite; yPoint++) {
				//Loop over the cube in the Z dimension
				for (int zPoint = zPlayer; zPoint <= zOpposite; zPoint++) {
					//Get the current block
					Block currentBlock = world.getBlockAt(xPoint, yPoint, zPoint);
					
					//Set the block to dirt
					currentBlock.setType(Material.DIRT);
					
					
				}
			}
		}
	}
}
