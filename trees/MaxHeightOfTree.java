package trees;

public class MaxHeightOfTree {

    public static int height(BinaryTree.Node root){
        if(root == null){
            return 0;
        }
        int lth = height(root.left);
        int rth = height(root.right);
        return Math.max(lth, rth) + 1;
    }

    public static void main(String[] args){
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree.tree t = new BinaryTree.tree();
        BinaryTree.Node newNode = t.buildTree(nodes);
        System.out.println(height(newNode));
    }
}
