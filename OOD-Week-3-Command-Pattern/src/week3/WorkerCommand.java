package week3;

/**
 * A class representing generic command for Workers.
 * 
 * @author Dheeraj
 *
 */
public class WorkerCommand extends Command {

	public static String ENTER = "enter";
	public static String LEAVE = "leave";
	public static String START = "start";
	public static String STOP = "stop";

	Worker worker;

	/**
	 * Create worker command.
	 * 
	 * @param worker Worker
	 */
	public WorkerCommand(Worker worker) {
		this.worker = worker;
	}

	/**
	 * To be overridden by subclasses if necessary.
	 */
	public void execute() {
	}

	/**
	 * Undoes last operation that the worker has performed.
	 */
	@Override
	public void undo() {

		if (pointer >= 0) {
			String prevDesc = history.get(pointer--);

			if (prevDesc.equals(ENTER)) {
				worker.leave();
			} else if (prevDesc.equals(LEAVE)) {
				worker.enter();
			} else if (prevDesc.equals(START)) {
				worker.stop();
			} else if (prevDesc.equals(STOP)) {
				worker.start();
			}
		}
	}

	/**
	 * Redoes the last undone operation.
	 */
	@Override
	public void redo() {
		if (pointer < history.size() - 1) {
			String nextDesc = history.get(++pointer);

			if (nextDesc.equals(ENTER)) {
				worker.enter();
			} else if (nextDesc.equals(LEAVE)) {
				worker.leave();
			} else if (nextDesc.equals(START)) {
				worker.start();
			} else if (nextDesc.equals(STOP)) {
				worker.stop();
			}
		}
	}

}
