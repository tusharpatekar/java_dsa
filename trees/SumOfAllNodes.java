package trees;

public class SumOfAllNodes {

    public static int sum(BinaryTree.Node root){
        if(root == null){
            return 0;
        }
        int lSum = sum(root.left);
        int rSum = sum(root.right);
        return lSum + rSum + root.data;
    }

    public static void main(String[] args){
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree.tree t = new BinaryTree.tree();
        BinaryTree.Node newNode = t.buildTree(nodes);
        System.out.println(sum(newNode));


    }
}
