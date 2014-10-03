/**
 * 
 */
package manager;

/**
 * @author Karthy
 * 
 */
public class MasheryManagerImpl implements ApiManager {

	private String question;

	MasheryManagerImpl(String question) {

		this.question = question;
	}

	public String popQuestion() {

		return question;
	}

}
