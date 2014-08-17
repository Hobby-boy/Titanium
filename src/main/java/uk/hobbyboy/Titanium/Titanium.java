package uk.hobbyboy.Titanium;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

public final class Titanium extends JavaPlugin {
	@Override
	public void onEnable() {
		getLogger().info("Titanium has been enabled!");
	}
	@Override
	public void onDisable() {
		getLogger().info("Titanium has been disabled :(");
		
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("titanium")) {
			
			return true;
		}
		return false;
	}

}
