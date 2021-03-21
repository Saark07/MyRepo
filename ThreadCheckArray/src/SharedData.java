import java.util.ArrayList;

/**Description of SharedData Class
 * @author Saar
 * @author Vladik
 *
 * @version 1
 */
/**
 * @author Saar
 *
 */
public class SharedData 
{
	private ArrayList<Integer> array;
	private boolean [] winArray;
	private boolean flag;
	private final int b;
	
	/**Description of SharedData(ArrayList array,int b)
	 * @param array array
	 * @param b b
	 */
	public SharedData(ArrayList<Integer> array, int b) {
		
		this.array = array;
		this.b = b;

	}

	/**Description of getWinArray
	 * @return winArray
	 */
	public boolean[] getWinArray() 
	{
		return winArray;
	}

	/**Description of setWinArray(boolean[] winArray)
	 * @param winArray winArray
	 */
	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}

	/**Description of getArray
	 * @return array 
	 */
	public ArrayList<Integer> getArray() 
	{
		return array;
	}

	/**Description of getB
	 * @return b
	 */
	public int getB() 
	{
		return b;
	}

	/**Description of getFlag
	 * @return flag
	 */
	public boolean getFlag() 
	{
		return flag;
	}

	/**Description of setFlag
	 * @param flag flag
	 */
	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
