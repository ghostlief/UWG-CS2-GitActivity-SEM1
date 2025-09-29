package edu.westga.cs1302.javafx_sample_starter;

/** Creating Task objects 
 * 
 * @author aubre
 * @version Fall 2025
 */
public class Task {

	private final String name;
	private String description;
	private final String priority;
	
	/** Creates task object
	 * @param name task name
	 * @param description task description
	 * @param priority task priority
	 */
	public Task(String name, String description, String priority) {
			this.name = name;
			this.description = description;
			this.priority = priority;
	}
	
	/** returns the Task object's description
	 * @return the description
	 */
	public String getDescription() {
		return this.description;
	}
	/** allows user to reset Task description
	 * 
	 * @param description the description to set
	 */
	
	public void setDescription(String description) {
		this.description = description;
	}
	/** returns the name of the Task object
	 * @return name the task name
	 */
	
	public String getName() {
		return this.name;
	}
	/** returns the priority of the Task
	 * @return the priority
	 */
	
	public String getPriority() {
		return this.priority;
	}
	
	/** Returns a string of the name of the Task object, returns the name of the task.
	 * @return Task object's name
	 */
	
	public String toString() {
		return this.getName();
	}
	
}
