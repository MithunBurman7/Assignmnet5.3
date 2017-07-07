package ListingDemo;

public class ListDemo {
	
	int x;  // here by initializing variable x
	ListDemo next=null;  // Class type variable 
	public ListDemo(int x, ListDemo next) //  Method 
	{
	this.x = x;  //Reference variable of x
	this.next = next; //Reference variable 
	}

	public static void main(String[] args) {
		// Here by Creating  objects  
		ListDemo j = new ListDemo(55, null); 
		ListDemo k = new ListDemo(77, null);
		ListDemo l = new ListDemo(44, null );
		ListDemo m = new ListDemo(60, null);
		ListDemo n = new ListDemo(90, null);

		 /** Taking next reference from the current node 
	         and creating it current element
	     **/
		j.next = k;  
		k.next = l;
		l.next=m; 
		m.next = n;

		System.out.print("Linked list: ");
		for(ListDemo ptr = j; ptr!=null; ptr=ptr.next) //Using pointer to refer the address of the next element in the list
		{
		System.out.print(ptr.x + " " );
		}
		
		}	
		

	}
