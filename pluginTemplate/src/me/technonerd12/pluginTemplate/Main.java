package me.technonerd12.pluginTemplate;

import org.bukkit.plugin.java.JavaPlugin;

import me.technonerd12.pluginTemplate.commands.TemplateCommand;
import me.technonerd12.pluginTemplate.listeners.TemplateListener;

public class Main extends JavaPlugin {
	
	public void registerCommands() {
		// Must have "template" defined in plugin.yml or will throw error.
		this.getCommand("template").setExecutor(new TemplateCommand(this));

	}
	
	public void registerListeners() {
        getServer().getPluginManager().registerEvents(new TemplateListener(), this);		
		
	}
	
	
	
	public void onEnable() {
		registerCommands();
		registerListeners();
		//TODO Add methods for when the plugin is enabled
	}
	
	public void onDisable() {
		//TODO Add methods for when the plugin is disabled
		
	}

}
