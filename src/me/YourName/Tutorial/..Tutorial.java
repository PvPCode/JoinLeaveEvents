package me.Vicious.Main;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Tutorial extends JavaPlugin implements Listener {

	public void onEnable() {
		getLogger().info("Tutorial was enabled!");
		PluginManager pm = getServer().getPluginManager();
		pm.registerEvents(new Tutorial(), this);
	}
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event) {
		Player p = event.getPlayer();
		event.setJoinMessage(ChatColor.GOLD + p.getName() + ChatColor.BLUE + " has joined the server.");
		p.sendMessage(ChatColor.DARK_AQUA + "Welcome to my awesome server! " + ChatColor.GREEN + "Enjoy!");
	}
	
	@EventHandler
	public void onPlayerQuit(PlayerQuitEvent event) {
		Player p = event.getPlayer();
		event.setQuitMessage(ChatColor.GOLD + p.getName() + ChatColor.BLUE + " has left the server. :(");
	}
	
}
