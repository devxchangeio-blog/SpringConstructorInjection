/**
 * 
 */
package manager;

/**
 * @author Karthy
 *
 */
public class ApigeeManagerImpl implements  ApiManager{
	
	private String question;
	
	ApigeeManagerImpl(String question){
		
		this.question=question;
	}

	public String popQuestion() {
		
		return question;
	}

}
