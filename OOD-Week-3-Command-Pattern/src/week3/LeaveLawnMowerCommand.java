package week3;

/**
 * A class representing a command to be given to a student to leave the car.
 * 
 * @author Dheeraj
 *
 */
public class LeaveLawnMowerCommand extends WorkerCommand {

	/**
	 * Create command object.
	 * 
	 * @param student Student
	 */
	public LeaveLawnMowerCommand(Worker worker) {
		super(worker);
		description = LEAVE;
	}

	/**
	 * Execute the operation and add to the history.
	 */
	@Override
	public void execute() {
		worker.leave();
		addToHistory();
	}
}
