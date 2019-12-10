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
}



	}
