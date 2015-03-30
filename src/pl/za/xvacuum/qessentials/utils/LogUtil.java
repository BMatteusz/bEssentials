package pl.za.xvacuum.qessentials.utils;

import java.io.PrintStream;

import org.bukkit.configuration.file.FileConfiguration;

import pl.za.xvacuum.qessentials.Main;

public class LogUtil {

    /**
     * System zwraca informacje do konsoli, kt�ra b�dzie informacj�, errorem, lub ostrze�eniem.
     * Warto pami�ta� aby errora u�ywa� jedynie gdy wyst�puje takowy gdy� mo�e to by� nieobliczalne w skutkach! 
    */
	private static LogUtil instance;
	
	private static PrintStream l = System.out;
	private static String name = Main.getInstance().getDescription().getName();
	private static String prefixInfo = "[" + name + "] ";
	private static String prefixWarn = "[" + name + " / WARNING] ";
	private static String prefixError = "[" + name + " / ERROR] ";
	private static String prefixCritical = "[" + name + " / CRITICAL ERROR] ";
	private static String prefixDebug = "[" + name + " / DEBUG] ";
	private static FileConfiguration cfg = Main.getInstance().getConfig();
	
	public static LogUtil getLogger(){
		return instance;
	}
	
	public static void info(String info){
		l.println(prefixInfo+info);
	}
	public static void warn(String warn){
		l.println(prefixWarn+warn);
	}
	public static void error(String error){
		l.println(prefixError+error);
	}
	public static void critical(String critical){
		l.println(prefixCritical+critical);
	}
	/**
	 * Debugowanie systemu, gdy jest w��czone, pojawiaj� si� wiadomo�ci.
	 */
	public static void debug(String debug){
		if(cfg.getBoolean("config.debug") == true){
			l.println(prefixDebug+debug);
		}
	}
 
}
