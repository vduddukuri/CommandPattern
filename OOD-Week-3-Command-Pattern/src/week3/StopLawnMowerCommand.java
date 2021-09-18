package week3;

/**
 * A class representing a command to be given to a worker to stop the LawnMower.
 * 
 * @author Dheeraj
 *
 */
public class StopLawnMowerCommand extends WorkerCommand {

	/**
	 * Create command object.
	 * 
	 * @param student Worker
	 */
	public StopLawnMowerCommand(Worker worker) {
		super(worker);
		description = STOP;
	}

	/**
	 * Execute the operation and add to the history.
	 */
	@Override
	public void execute() {
		worker.stop();
		addToHistory();
	}

}
