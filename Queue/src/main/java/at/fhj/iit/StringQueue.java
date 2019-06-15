package at.fhj.iit;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

// there's some Bugs included, try to debug the code and fix the Bugs
// there are different Bugs, wrong implementation, typos, ...
// write Test-Cases (read Queue Interface for understanding methods) and use Debugging possibilies of your IDE

public class StringQueue implements Queue {

	private static final Logger logger = LogManager.getLogger(StringQueue.class);
	private List<String> elements = new ArrayList<String>();
	private int maxSize = 5;

	/** Constructor **/
	public StringQueue(int maxSize){
		logger.info("Calling StringQueue constructor");
		maxSize = maxSize;
	}
	
	/**  This method adds the "obj" element to the queue **/
	@Override
	public boolean offer(String obj) {

		logger.info("Calling method 'offer'.");

		if(elements.size()!= maxSize)
			elements.add(obj);
		else
			return false;
		
		return true;
	}

	/** This method returns the first element and deletes it **/
	@Override
	public String poll() {

		logger.info("Calling method 'poll'.");

		String element = peek();
		
		if(elements.size() != 0){
			elements.remove(0);
		}
		
		return element;
	}

	/** This element returns the first element and deletes it. If the queue is empty "NoSuchElementException" will be thrown  **/
	@Override
	public String remove() {

		logger.info("Calling method 'remove'.");

		String element = poll();		
		if(element == null)
			throw new NoSuchElementException("there's no element any more");
		logger.error("throw NoSuchElementException");
		return element;
	}

	/** This method returns the first element **/
	@Override
	public String peek() {

		logger.info("Calling method 'peek'.");

		String element;
		if(elements.size() > 0)
			element = elements.get(0);
		else
			element = null;
		
		return element;
	}

	/** This method returns the first element. If the queue is empty "NoSuchElementException" will be thrown  **/
	@Override
	public String element() {

		logger.info("Calling method 'element'.");
		
		String element = peek();
		if(element == null)
			throw new NoSuchElementException("there's no element any more");
		logger.error("throw NoSuchElementException");
		return element;
	}

}