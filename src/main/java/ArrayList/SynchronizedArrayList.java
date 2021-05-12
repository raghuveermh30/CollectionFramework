package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayList {

	public static void main(String[] args) {

		List<String> namesList = Collections.synchronizedList(new ArrayList<String>());
		namesList.add("Java");
		namesList.add("Python");
		namesList.add("Ruby");

		// add, remove - we dont need explicit synchronization
		// To fetch the value from this list we have to use Explict synchronisation

		synchronized (namesList) { // this is called Explixt Synchronisation
			Iterator<String> it = namesList.iterator();
			while (it.hasNext()) {
				System.out.println(it.next());
			}
		}

		System.out.println("********");

		// 2. copyOnWriteArrayList - this is a class in jdk

		// All the operations are synchronised
		CopyOnWriteArrayList<String> employeeList = new CopyOnWriteArrayList<String>();
		employeeList.add("Tom");
		employeeList.add("Peter");

		// We dont need any synchronized keyword because by default that class is
		// already Thread safe -
		Iterator<String> it1 = employeeList.iterator();
		while (it1.hasNext()) {
			System.out.println(it1.next());
		}

	}

}
