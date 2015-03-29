package pl.za.xvacuum.qessentials.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerListPingEvent;

import pl.za.xvacuum.qessentials.Main;
import pl.za.xvacuum.qessentials.utils.Util;

public class ServerList implements Listener{
	
	
	@EventHandler(priority = EventPriority.NORMAL)
	public void serverlist(ServerListPingEvent e){
		e.setMotd(Util.setHEX(Main.getInstance().getConfig().getString("server-motd")));
		e.setMaxPlayers(Main.getInstance().getConfig().getInt("server-slots"));
	}
	

}
