package week3;

/**
 * A class representing a command to be given to a Worker to start the LawanMower.
 * 
 * @author Dheeraj
 *
 */
public class StartLawnMowerCommand extends WorkerCommand {

	/**
	 * Create command object.
	 * 
	 * @param worker Worker
	 */
	public StartLawnMowerCommand(Worker worker) {
		super(worker);
		description = START;
	}

	/**
	 * Execute the operation and add to the history.
	 */
	@Override
	public void execute() {
		worker.start();
		addToHistory();
	}

}
