package ch.mh.logger.log;

public abstract class AbstractDecorator implements ILog {
	private ILog log = null;
	
	public AbstractDecorator(ILog log) {
		this.log = log;
	}

	@Override
	public void logMessage(String message) {
		log.logMessage(message);
	}

	@Override
	public int getMessageCount() {
		return log.getMessageCount();
	}

	@Override
	public void logMesssageCount() {
		log.logMesssageCount();
	}
	
	
}
