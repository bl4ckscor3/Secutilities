package bl4ckscor3.plugin.secutilities.features.listener.timedisplayer;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoinListener implements Listener
{
	@EventHandler(priority = EventPriority.HIGHEST)
	public void onPlayerJoin(PlayerJoinEvent event) 
	{
		Bukkit.dispatchCommand(event.getPlayer(), "playtimetop 10");
	}
}