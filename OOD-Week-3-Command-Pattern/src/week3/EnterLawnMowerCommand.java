package week3;

/**
 * A class representing a command to be given to a Worker to enter in the Lawnmower.
 * 
 * @author Dheeraj
 *
 */
public class EnterLawnMowerCommand extends WorkerCommand {

	/**
	 * Create command object.
	 * 
	 * @param worker Worker
	 */
	public EnterLawnMowerCommand(Worker worker) {
		super(worker);
		description = ENTER;
	}

	/**
	 * Execute the operation and add to the history.
	 */
	@Override
	public void execute() {
		worker.enter();
		addToHistory();
	}

}
