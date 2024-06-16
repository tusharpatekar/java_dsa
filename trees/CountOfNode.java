package trees;

public class CountOfNode {
    public static int count(BinaryTree.Node root){
        if(root == null){
            return 0;
        }
        int lCount = count(root.left);
        int rCount = count(root.right);
        return lCount + rCount + 1;
    }
    public static void main(String[] args){
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree.tree t = new BinaryTree.tree();
        BinaryTree.Node newNode = t.buildTree(nodes);
        System.out.println(count(newNode));

    }
}
