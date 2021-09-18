package week3;

import java.util.List;

/**
 * This class represents a command in Command design pattern. It also supports
 * management of history with undo and redo operations.
 * 
 * @author Dheeraj
 *
 */
public abstract class Command {

	protected History historyInstance = History.getInstance();
	protected List<String> history = historyInstance.getHistory();
	protected static int pointer = -1;
	protected String description = "";

	/**
	 * Must be implemented by subclass to execute the command.
	 */
	public abstract void execute();

	/**
	 * Must be implemented by subclass to perform undo operation.
	 */
	public abstract void undo();

	/**
	 * Must be implemented by subclass to perform redo operation.
	 */
	public abstract void redo();

	/**
	 * Adds the performed operation to the history.
	 */
	public void addToHistory() {
		history.add(description);
		pointer++;
		clearRemainingHistory();
	}

	/**
	 * Removes the operations after current operation from the history.
	 */
	public void clearRemainingHistory() {
		for (int i = history.size() - 1; i > pointer; i--) {
			history.remove(i);
		}
	}

}
