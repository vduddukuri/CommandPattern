package week3;

/**
 * A class representing an instructor of LawnMower driving classes.
 * 
 * @author Dheeraj
 *
 */
public class Instructor {

	/**
	 * Instructs the worker to enter in the lawnmower.
	 * 
	 * @param student Student
	 */
	public void instructEnter(Worker worker) {
		Command command = new EnterLawnMowerCommand(worker);
		command.execute();
	}

	/**
	 * Instructs the student to leave the LawnMower.
	 * 
	 * @param student Student
	 */
	public void instructLeave(Worker worker) {
		Command command = new LeaveLawnMowerCommand(worker);
		command.execute();
	}

	/**
	 * Instructs the student to start the car engine.
	 * 
	 * @param student Student
	 */
	public void instructStart(Worker worker) {
		Command command = new StartLawnMowerCommand(worker);
		command.execute();
	}

	/**
	 * Instructs the worker to stop the LawnMower engine.
	 * 
	 * @param worker Worker
	 */
	public void instructStop(Worker worker) {
		Command command = new StopLawnMowerCommand(worker);
		command.execute();
	}

	/**
	 * Undoes last instruction.
	 * 
	 * @param student Student
	 */
	public void instructUndo(Worker worker) {
		Command command = new WorkerCommand(worker);
		command.undo();
	}

	/**
	 * Redoes undone instruction.
	 * 
	 * @param student Student
	 */
	public void instructRedo(Worker worker) {
		Command command = new WorkerCommand(worker);
		command.redo();
	}
}
