
import java.util.List;

/**
 * A parent tree contains left and right subtrees as well as a value.
 * @param <E> The type we store.
 */
public class BinaryTreeParent<E> implements BinaryTree<E> {
    /**
     * Creates a new binary parent tree.
     * @param value Value at this node.
     * @param right Right sub-tree.
     * @param left Left sub-tree.
     */
	public BinaryTreeParent(E value, BinaryTree<E> right, BinaryTree<E> left){
		// TODO write me
		throw new RuntimeException("Not yet implemented.");
	}

	@Override
	/** @see BinaryTree#getValue() */
	public E getValue() {
		// TODO write me
		throw new RuntimeException("Not yet implemented.");
	}

	@Override
	/** @see BinaryTree#getLeft() */
	public BinaryTree<E> getLeft() {
		// TODO write me
		throw new RuntimeException("Not yet implemented.");
	}

	@Override
	/** @see BinaryTree#getRight() */
	public BinaryTree<E> getRight() {
		// TODO write me
		throw new RuntimeException("Not yet implemented.");
	}

	@Override
	/** @see BinaryTree#getInOrder() */
	public List<E> getInOrder() {
		// TODO write me
		throw new RuntimeException("Not yet implemented.");
	}

	@Override
	/** @see BinaryTree#getPreOrder() */
	public List<E> getPreOrder() {
		// TODO write me
		throw new RuntimeException("Not yet implemented.");
	}
}
