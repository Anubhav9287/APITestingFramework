package mathworks.technical.assignment.utils;
/*
 * This class is get the values form config file.
 * This help in keeping data aside.
 */

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigManager {
	private static ConfigManager manager;
	private static final Properties prop = new Properties();
	private ConfigManager() throws IOException {
		InputStream inputStream = ConfigManager.class.getResourceAsStream("/config.properties");
		prop.load(inputStream);
	}
	/*
	* We need to create only one instance of this class 
	* therefore use sync so that no two thread or instance can be created at once.
	*/
	public static ConfigManager getInstance() {
		if(manager == null) {
			synchronized(ConfigManager.class) {
				try {
					manager = new ConfigManager();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}
		
		return manager;
	}
	
	public String getString(String key) {
		return System.getProperty(key,prop.getProperty(key));
	}
	
}
