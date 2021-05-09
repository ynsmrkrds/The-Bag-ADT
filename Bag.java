public class Bag<AnyType extends Comparable<AnyType>>
{
	private Node<AnyType> root;
	private int size;
	private int repeatSize;
	private String str;
	private boolean cntrlElemnts = true;
	private boolean cntrlElementSize = true;
	
	public Bag()
	{
		root = null;
		size = 0;
		repeatSize = 0;
	}
	
	public void add(AnyType item)
	{
		root = add(item , root);
		size++;
	}
	
	private Node<AnyType> add(AnyType item , Node<AnyType> temp)
	{
		if(temp == null)
		{
			Node<AnyType> node = new Node<>();
			node.setValue(item);
			
			return node;
		}
		
		if(compare(item , temp.getValue()) == -1)
		{
			temp.setLeft(add(item , temp.getLeft()));
		}
		else if(compare(item , temp.getValue()) == 1)
		{
			temp.setRight(add(item , temp.getRight()));
		}
		else if(compare(item , temp.getValue()) == 0)
		{
			temp.setNumber(temp.getNumber() + 1);
			repeatSize++;
		}
		
		return temp;
	}
	
	public void clear()
	{
		root = null;
		size = 0;
	}	
	
	public boolean contains(AnyType item)
	{	
		Node<AnyType> temp = getNode(item, root);
		
		if(temp == null)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	
	public Integer getDistictSize()
	{
		return (size - repeatSize);
	}
	
	@Override
	public boolean equals(Object obj)
	{
		Bag<AnyType> bag = (Bag<AnyType>) obj;
		
		Node<AnyType> node = bag.root;	
		
		equalsElements(node);
		
		if(this.getSize() == bag.getSize() && cntrlElemnts == true && cntrlElementSize == true)
		{
			return true;
		}
		else
		{
			return false;
		}	
	}
	
	private void equalsElements(Node<AnyType> node)
	{		
		if(node == null)
		{
			return;
		}			
		
		equalsElements(node.getLeft());
				
		if(contains(node.getValue()) == false)
		{
			cntrlElemnts = false;
		}
		
		if(elementSize(getNode(node.getValue(), this.root).getValue()) != elementSize(node.getValue()))
		{
			cntrlElementSize = false;
		}
		
		equalsElements(node.getRight());
	}	
		
	public Integer elementSize(AnyType item)
	{
		Node<AnyType> temp = getNode(item, root);
		
		if(temp != null)
		{
			return temp.getNumber();
		}
		
		return null;	
	}
	
	public boolean isEmpty()
	{
		if(size == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean remove(AnyType item)
	{
		Node<AnyType> temp = getNode(item, root);
		
		if(temp != null && elementSize(item) > 0)
		{
			temp.setNumber(temp.getNumber() - 1);
			
			size--;
			
			return true;
		}
		else
		{
			remove(item , root);
			
			return false;
		}
	}
	
	private Node<AnyType> remove(AnyType item , Node<AnyType> temp)
	{	
		if(temp == null)
		{
			return temp;
		}
		
		if(compare(item, temp.getValue()) == -1)
		{
			temp.setLeft(remove(item , temp.getLeft()));
		}
		else if(compare(item , temp.getValue()) == 1)
		{
			temp.setRight(remove(item , temp.getRight()));
		}
		else
		{
			if(temp.getLeft() == null && temp.getRight() == null)
			{
				return null;
			}
			else if(temp.getLeft() == null)
			{
				return temp.getRight();
			}
			else if(temp.getRight() == null)
			{
				return temp.getLeft();
			}
			else
			{
				AnyType minValue = getMinValue(temp.getRight());
				
				temp.setValue(minValue);
				temp.setRight(remove(minValue , temp.getRight()));				
			}
		}
		
		return temp;
	} 
	
	private AnyType getMinValue(Node<AnyType> temp)
	{
		if(temp.getLeft() != null)
		{
			return getMinValue(temp.getLeft());
		}
		
		return temp.getValue();
	}
	
	public Integer getSize()
	{
		return size;
	}
	
	@Override
	public String toString()
	{
		str = "{-";
		return printInorder(root);	
	}

	private String printInorder(Node<AnyType> temp)
	{
		if(temp == null)
		{
			return "null";
		}	
		
		printInorder(temp.getLeft());
		str += "'" + temp.getValue() + "'-";
		printInorder(temp.getRight());
		
		return str + "}";
	}
	
	private Node<AnyType> getNode(AnyType item , Node<AnyType> temp)
	{
		for(int i=0 ; i < getDistictSize() ; i++)
		{
			if(temp != null)
			{
				if(compare(item , temp.getValue()) == -1)
				{
					temp = temp.getLeft();
				}
				else if(compare(item , temp.getValue()) == 1)
				{
					temp = temp.getRight();
				}
				else if(compare(item , temp.getValue()) == 0)
				{
					return temp;
				}
			}
		}		
		
		return null;
	}
	
	private int compare(AnyType item1 , AnyType item2)
	{
		if(item1.compareTo(item2) < 0)
		{
			return -1;
		}
		else if(item1.compareTo(item2) > 0)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
}