public class Node<AnyType extends Comparable<AnyType>>
{
	private Node<AnyType> left;
	private AnyType value;
	private int number;
	private Node<AnyType> right;
	
	public Node()
	{
		left = null;
		value = null;
		number = 1;
		right = null;
	}
	
	public void setLeft(Node<AnyType> left)
	{
		this.left = left;
	}
	
	public Node<AnyType> getLeft()
	{
		return left;
	}
	
	public void setValue(AnyType value)
	{
		this.value = value;
	}
	
	public AnyType getValue()
	{
		return value;
	}
	
	public void setNumber(Integer number)
	{
		this.number = number;
	}
	
	public Integer getNumber()
	{
		return number;
	}
	
	public void setRight(Node<AnyType> right)
	{
		this.right = right;
	}
	
	public Node<AnyType> getRight()
	{
		return right;
	}
}