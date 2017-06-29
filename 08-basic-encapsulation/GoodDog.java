/** 
* Shows a basic example of encapsulating a class
*
* Creates an accessor (getter) and a mutator (setter) method.
* 
* Rule of thumb: make the instance variables private and the accessor
* and mutator methods public
*/

class GoodDog {
	
	// make the instance variable private
	private int size;

	// make the accessor (getter) public
	public int getSize() {
		return size;
	}

	// make the mutator (setter) public
	public void setSize(int s) {
		size = s;
	}

	void bark() {
		if (size > 60) {
			System.out.println("Wooof!, Woooof!");
		} else if (size > 14) {
			System.out.println("Ruff!, Ruff!");
		} else {
			System.out.println("Yip!, Yip!");
		} //end of if

	} // end of bark method

} //end of class GoodDog
