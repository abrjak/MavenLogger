package ch.mh.logger.log;

public class SystemLogDecorator extends AbstractDecorator {

	public SystemLogDecorator(ILog log) {
		super(log);
	}

	@Override
	public void logMessage(String message) {
		super.logMessage("Decorator log");
		super.logMessage(message);
	}
	
	

	
}
