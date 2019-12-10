/* Sabra Grace
 * ITC 115
 * Final Exam
 * Fall 2019
*/ 
package library;

public abstract class Library {

	public static void main(String[] args) {
		Library[] l = { new Books(),   new Multimedia(), 
                new Author(), new Magazines() };

for (int i = 0; i < l.length; i++) {
	
	l[i].showItem();
	l[i].showStatus();
	System.out.println();
}
System.out.println(" ")
}

	public static boolean showItem() {
		String itemName;
		if itemName == true
				return itemName;
		System.out.println(itemName);
	} else
		return false;
	System.out.println("The library does not have this item. Please email the help desk to suggest the title.")
	}

	public static boolean showStatus() {
		int status; {
			1 == available;
			2 == checked out;
			3 == on hold, reserved;
		}if status = 1 {
				System.out.println("Your item is available!");
		}else status = 2 {
				System.out.println("The item is checked out. Submit a hold request.");
		]else status = 3 {
				System.out.println("This item is already on hold. You can submit another hold request.);")
		}
			
		
	}
	}
	}


