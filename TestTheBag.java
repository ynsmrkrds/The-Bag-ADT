public class TestTheBag
{
	public static void main(String[] args)
	{	
		//create a new object using the 'Bag' class
		Bag<String> strBag = new Bag<>();
				
		//add elements using the 'add' method
		strBag.add("Mehmet");
		strBag.add("Ahmet");
		strBag.add("Ali");
		strBag.add("Ayşe");
		strBag.add("Fatma");
		strBag.add("Hatice");
		strBag.add("Sefa");
		strBag.add("Ayşe");
		strBag.add("Ahmet");
		strBag.add("Hatice");
		
		//print the elements using the 'toString' method
		System.out.println("The 'strBag' contains : " + strBag);
		
		//check the element exist or not exist using the 'contains' method
		System.out.println("Does the object 'strBag' contain the element 'Ali' ? : " + strBag.contains("Ali"));
		System.out.println("Does the object' strBag' contain the element 'Berk' ? : " + strBag.contains("Berk"));
		
		//print the element distict size using the 'getDistictSize' method
		System.out.println("The 'strBag' contains " + strBag.getDistictSize() + " different elements.");
		
		//print the element size using the 'getSize' method
		System.out.println("The 'strBag' contains " + strBag.getSize() + " elements.");
		
		//print how many of the desired element using the 'elementSize' method
		System.out.println("How many is 'Ayşe' in the 'strBag' object ? : " + strBag.elementSize("Ayşe"));
		System.out.println("How many is 'Mehmet' in the 'strBag' object ? : " + strBag.elementSize("Mehmet"));
		System.out.println("How many is 'Sefa' in the 'strBag' object ? : " + strBag.elementSize("Sefa"));
		System.out.println("How many is 'Berk' in the 'Berk' object ? : " + strBag.elementSize("Berk"));
	
		//check if the class is empty using the 'isEmpty' method
		System.out.println("Is object 'strBag' empty ? : " + strBag.isEmpty());
		
		//remove the element using the 'remove' method
		System.out.println("Remove the element 'Ayşe' : " + strBag.remove("Ayşe"));
		System.out.println("Remove the element 'Ayşe' : " + strBag.remove("Ayşe"));
		System.out.println("Remove the element 'Ayşe' : " + strBag.remove("Ayşe"));

		
		//remove the all element using 'clear' method
		strBag.clear();
		System.out.println("The 'strBag' contains : " + strBag);		
		
		//test the 'equals' method		
		Bag<Integer> bag1 = new Bag<>();
		Bag<Integer> bag2 = new Bag<>();
		
		bag1.add(15);
		bag1.add(15);
		bag1.add(10);
		bag1.add(10);
		bag1.add(20);
		
		bag2.add(20);
		bag2.add(10);
		bag2.add(15);
		bag2.add(15);
		bag2.add(10);
				
		System.out.println("Does object 'bag1' equal to 'bag2' ? : " + bag1.equals(bag2));	
		
		bag1.add(30);		
		
		System.out.println("Does object 'bag1' equal to 'bag2' ? : " + bag1.equals(bag2));		
		
		bag2.add(30);		
		
		System.out.println("Does object 'bag1' equal to 'bag2' ? : " + bag1.equals(bag2));
	}
}