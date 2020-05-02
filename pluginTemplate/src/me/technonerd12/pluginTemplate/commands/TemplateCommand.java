package me.technonerd12.pluginTemplate.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.technonerd12.pluginTemplate.Main;

public class TemplateCommand implements CommandExecutor{
	private final Main plugin;

	public TemplateCommand(Main plugin) {
		this.plugin = plugin; // Store the plugin in situations where you need it.
	}
	
	
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (sender instanceof Player) {
			Player p = (Player) sender;
		}
		
		return false;
	}
	
}
