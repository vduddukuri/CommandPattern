package week3;

/**
 * A class representing a Worker lawnmower driving classes.
 * 
 * @author Dheeraj
 *
 */
public class Worker {

	private String name;

	/**
	 * Create a worker object.
	 * 
	 * @param name Name of the worker
	 */
	public Worker(String name) {
		this.name = name;
	}

	/**
	 * Returns worker's name
	 * 
	 * @return worker's name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets worker's name
	 * 
	 * @param name worker's name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Acts on "enter" command.
	 */
	public void enter() {
		System.out.println(name + " entered in the lawnmower.");
	}

	/**
	 * Acts on "leave" command.
	 */
	public void leave() {
		System.out.println(name + " left the lawnmower.");
	}

	/**
	 * Acts on "start" command.
	 */
	public void start() {
		System.out.println(name + " started the lawnmower.");
	}

	/**
	 * Acts on "stop" command.
	 */
	public void stop() {
		System.out.println(name + " stopped the lawnmower.");
	}

}
