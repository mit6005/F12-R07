
import java.util.List;

/**
 * A binary tree with a left child, right child, and ability to convert to in- or
 * pre-order list representations.
 * @param <E> Type of elements stored.
 */
public interface BinaryTree<E> {
    /**
     * Gets the value at this node.
     * @return The value at this node.
     */
	public E getValue();

	/**
	 * Gets the left subtree.  This is an "optional" method, meaning it may
	 * throw an {@link OperationUnsupportedException}.
	 * @return The right subtree.
	 */
	public BinaryTree<E> getLeft();

	/**
	 * Gets the right subtree.  This is an "optional" method, meaning it may
	 * throw an {@link OperationUnsupportedException}.
	 * @return The right subtree.
	 */
	public BinaryTree<E> getRight();

	/**
	 * Creates and returns an in-order list of the elements in this tree.
	 * @return The pre-order list of elements.
	 */
	public List<E> getInOrder();

	/**
	 * Creates and returns a pre-order list of the elements in this tree.
	 * @return The pre-order list of elements.
	 */
	public List<E> getPreOrder();
}
