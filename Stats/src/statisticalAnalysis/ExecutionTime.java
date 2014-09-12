package statisticalAnalysis;

/**
 * ExecutionTime class allows to measure the execution time of programs in nanoseconds.
 * @author sonagrigoryan
 *
 */
public class ExecutionTime {
	private long startTime = 0;
	private long stopTime = 0;
	private boolean isStarted = false;
	
	public void start() throws Exception{
		if (isStarted) {
			throw new Exception("The exectution time clock is already started");
		}
		startTime = System.nanoTime();
		isStarted = true;
	}
	
	
	public void stop() throws Exception {
		if (!isStarted) {
			throw new Exception("The exectution time clock has not been started yet");
		}
		stopTime = System.nanoTime();
		isStarted = false;
	}
	
	public long getElapsedTime() {
		return stopTime - startTime;
	}
	
	public void printElapsedTime() throws Exception{
		if (isStarted) {
			throw new Exception("The clock is still running. Stop it first.");
		}
		System.out.println();
		System.out.println(String.format("Execution time = %d nanoseconds.", getElapsedTime()));
	}
	
	
}
