package ch.mh.logger.log;

import java.nio.file.Paths;

/**
 * Factory used to create instances of different log implementations
 * @author mike
 */
public class LogFactory {
	
	private static LogFactory instance = null;
	
	private LogFactory() {}
	
	public static LogFactory getInstance() {
		if (instance == null) {
			instance = new LogFactory();
		}
		return instance;
	}
	
	public ILog createLog(LogEnum logType) {
		ILog result = null;
		
		switch (logType) {
		case SYSTEMOUT:
			result = new SystemLog();
			break;
		case FILE:
			result = new FileLog(Paths.get("C:\\temp\\log.txt"));
			break;
		}
		
		return result;
	}
}
