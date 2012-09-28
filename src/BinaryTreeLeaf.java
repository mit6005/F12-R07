
import java.util.List;

/**
 * A leaf node stores only one value and has no children.
 * @param <E> The type we're storing.
 */
public class BinaryTreeLeaf<E> implements BinaryTree<E> {
    /**
     * Creates a new {@link BinaryTreeLeaf}.
     * @param value The value.
     */
    public BinaryTreeLeaf(E value) {
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
