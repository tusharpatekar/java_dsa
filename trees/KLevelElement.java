package trees;

public class KLevelElement {

    public static void kthLevel(BinaryTree.Node root, int level, int k){
        if(root == null){
            return;
        }
        if(level == k){
            System.out.print(root.data + " ");
        }

        kthLevel(root.left, level+1, k);
        kthLevel(root.right, level+1, k);
    }

    public static void main(String[] args){
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree.tree t = new BinaryTree.tree();
        BinaryTree.Node newNode = t.buildTree(nodes);

        kthLevel(newNode, 1, 3);
    }
}
