package at.fhj.iit;
import org.junit.*;
import java.util.NoSuchElementException;

/** JUnit Tests of the StringQueue */
public class StringQueueTest {
    private StringQueue test_StringQueue;
    /** before the tests -> create a Queue with a Maxsize of 5 */
    @Before
    public void setup()
    {
    	test_StringQueue = new StringQueue(2);
    }

    /**
     * Add Test Objects and see if they are added in the right order and remove them
     */
    @Test
    public void test_offer() {
        Assert.assertTrue(test_StringQueue.offer("OBJ1"));
        Assert.assertTrue(test_StringQueue.offer("OBJ2"));

        Assert.assertEquals("OBJ1", test_StringQueue.remove());
        Assert.assertEquals("OBJ2", test_StringQueue.remove());
    }

    /**
     * Test deleting non-existing Object
     */
    @Test (expected = NoSuchElementException.class)
    public void test_remove_without_data() throws NoSuchElementException {
    	test_StringQueue.remove();
    }

    /**
     * Test peek, should return first element
     */
    @Test
    public void test_peek()
    {
        Assert.assertTrue(test_StringQueue.offer("OBJ1"));
        Assert.assertTrue(test_StringQueue.offer("OBJ2"));

        Assert.assertEquals("OBJ1", test_StringQueue.peek());
    }
    /**
     * Test peek, should return first element
     */

   /**
     * Test peek without data, should return null
     */
    @Test
    public void test_peek_without_data()
    {
        Assert.assertNull(test_StringQueue.peek());
    }    

    /**
     * Test poll, should return first element and remove it
     */
    @Test
    public void test_poll()
    {
        Assert.assertTrue(test_StringQueue.offer("OBJ1"));
        Assert.assertTrue(test_StringQueue.offer("OBJ2"));

        Assert.assertEquals("OBJ1", test_StringQueue.poll());
        Assert.assertEquals("OBJ2", test_StringQueue.peek());

    }

    /**
     * Test poll without data, should return null
     */
    @Test
    public void test_poll_without_data()
    {
        Assert.assertNull(test_StringQueue.poll());
    }    
    
    /**
     * Test element, should return first element
     */
    @Test
    public void test_element()
    {
        Assert.assertTrue(test_StringQueue.offer("OBJ1"));
        Assert.assertTrue(test_StringQueue.offer("OBJ2"));

        Assert.assertEquals("OBJ1", test_StringQueue.element());

    }
    
    
    /**
     * Test element without data, should return exception
     */
   @Test (expected = NoSuchElementException.class)
    public void test_element_without_data() {
	   test_StringQueue.element();
    }
    
    /**
    * Clean up after test
    */
    @After 
    public void cleanup()
    {
        try
        {
            while (true)
            {
                test_StringQueue.remove();
            }
        }
        catch (NoSuchElementException e)
        {
            //nothing to do here, everything is deleted
        }
    }
}
