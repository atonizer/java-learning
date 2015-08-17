/**
 * This Class creates a calculator
 */
public class Calculator {
	/**
	 The result of calculating
	 */
	private int result;

	/**
	 * Summ an arguments.
	 * @param params The arguments to sum.
	 */
	public void add(int ... params) {
		for (int param : params) {
			this.result += param;
		}
	}

	/**
	 * Calculate division.
	 * @param args Incoming arguments.
	 * @throws ru.lessons.lesson_8.UserException If no arguments throws an exception.
	 */
	public void div(int ... args) throws UserException {
		if (args.length > 0) {
			this.result = args[0];
			for (int params : args) {
				if (params == 0) {
					throw new IllegalArgumentException("You try to div by 0. Please change arg!");
				}
				this.result /= params;
			}
		} else {
			throw new UserException("You should enter args!");
		}
	}

	/**
	 * Get result.
	 * @return The result of calculating.
	 */
	public int getResult() {
		return this.result;
	}

	/**
	 * Clear the results of calculating.
	 */
	public void cleanResult() {
		this.result = 0;
	}
}