# The "Bag" ABSTRACT DATA STRUCTURE

This project is about an implementation for abstract data type “Bag” as a Java class which is like a Set, but it may contain several instances of the same member. For example, {'to', 'be', 'or', 'not', 'to', 'be'} is a bag of words, which is equal to {'be', 'be', 'not', 'or', 'to', 'to'} (since order of members is insignificant), but is unequal to {'be', 'not', 'or', 'to'} (since the number of instances is significant). Adding a member increases the number of instances in the bag by one and removing a member decreases the number of instances in the bag by one. The member is deleted from the bag when it has no instances.

I used binary search tree to make the bag logic in this project. Because, searching an element makes is faster than others in the binary search tree. If I used linked list to make the bag logic, searching the last node would be slower than binary search tree. Because, all node must be checked one by one until the desired node reaches in the linked list.

This project includes three class: _Node.class_ , _Bag.class_ , _TestTheBag.class_.

Thanks to the “Node” class, tree nodes are created. The “Node” class contains informations left and right childs of node, value of node and on how many of the same node.

Thanks to the “TestTheBag” class, you can test the “Bag” class. The implementation works in this class.

The “Bag” class made is an abstract data type. Thanks to the “Bag” class, you can create a bag, add a few elements, or remove an element to the bag. You can access information about these elements or the bag at any time.

The “Bag” class includes these public methods :

* add(AnyType item): Inserts item in the bag.

* clear(): Removes all of the elements from this bag.

* contains(AnyType item): Returns true if this bag contains the specified element and false otherwise.

* distictSize(): Returns the distinct number of elements in this bag. (For example, for the bag {'to', 'be', 'or', 'not', 'to', 'be'} distinct size is 4). This method makes that process by subtracting from repeatSize to size. The “size” field keeps the number of all elements. The “repeatSize” field keeps the number of repeated element total size.

* equals(Object obj): Indicates whether some bag object is "equal to" this one. This method does casting for comparing two same type objects. If size, elements and elements size of the same type objects are equal, this method returns true otherwise false.

* elementSize(AnyType item): Returns the number of this item in this bag. (For example, for the bag {'to', 'be', 'or', 'not', 'to', 'be'} element size (‘be’) is 2)

* isEmpty() : Returns true if this collection contains no elements.

* remove(AnyType item): Removes a single instance of item from this bag and returns true if it is present; otherwise returns false.
* size(): Returns the total number of elements in this bag. (For example, for the bag {'to', 'be', 'or', 'not', 'to', 'be'} size is 6) toString() : Returns a string that displays the elements in the bag. (Sample output : {-'Ahmet'-'Ali'-'Ayşe'-'Fatma'-} )

There are a few more private methods. These methods:

* add(AnyType item , Node\<AnyType> temp) : Compares the value with value of parent. If the value is smaller than value of parent, adds the value in the left of parent. If the value is bigger than value of parent, adds the value in the right of parent. If the value is equal to value of parent, increases number of same node. This method makes that process with recursive method logic.

* equalsElements(Node\<AnyType> node) : This mehod travels as inorder(LNR) in the tree. Compares value of all elements of the tree to be compared with the value of elements of the compared tree. If an element is not found in the compared tree, cntrlElemnts is false. I used the field to check for the presence of elements. Then this method compares elements size of elements of two trees. If any elements size of elements of two trees is not equal, cntrlElementSize is false. I used the field to check whether the element size are equal.

* remove(AnyType item , Node\<AnyType> temp) : Compares the value with value of parent. There are four process for different situation, when reaches the item to be deleted. If the item to be deleted hasn’t any child, removes it. If it has a right child, the child replaces the parent after the item is remove. If it has a left child, the same applies to this situation. If it has two child(left and right), the smallest child of right child of the deleted item replaces it after the item is remove.

* getMinValue(Node\<AnyType> temp) : Returns the smallest
value of element in the binary search tree.

* printInorder(Node\<AnyType> temp) : This mehod travels as
inorder(LNR) in the tree. Adds instant value formally to the strstring. Then returns str string.

* getNode(AnyType item , Node\<AnyType> temp) : Returns
the desired node of item. If desired node of item is not exist,
returns “null”. This method compares desired item with in the
items of the tree according by size. For example, if “item” is
smaller than value of “temp”, searching process continues in the
left of the binary search tree.

* compare(AnyType item1 , AnyType item2) : I used this
method with “compareTo” method of “Comparable” interface.
According to this, if “item1” is smaller than “item2”, returns -1.
If “item1” is bigger than “item2”, returns 1. If “item1” equals
“item2”, returns 0. When programmer is used this “compare”
method to compares two AnyType objects, where the
programmer calls the method, the programmer should take
action accordingly.
