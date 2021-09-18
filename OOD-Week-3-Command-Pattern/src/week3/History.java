package week3;

import java.util.ArrayList;
import java.util.List;

/**
 * A class to store history of operations following the Singleton pattern.
 * 
 * @author Dheeraj
 *
 */
public class History {

	private static History instance;
	private List<String> history;

	/**
	 * Private constructor to prevent initialization of the object from outside the
	 * class.
	 */
	private History() {
		history = new ArrayList<>();
	}

	/**
	 * Creates and maintains single object of the class throughout the application.
	 * 
	 * @return
	 */
	public static History getInstance() {
		if (instance == null) {
			instance = new History();
		}
		return instance;
	}

	/**
	 * Returns history as a list.
	 * 
	 * @return history as list
	 */
	public List<String> getHistory() {
		return history;
	}

}
