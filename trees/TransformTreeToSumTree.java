package trees;

public class TransformTreeToSumTree {

    public static int sum(BinaryTree.Node root){
        if(root == null){
            return 0;
        }

        int leftChildSum = sum(root.left);
        int rightChildSum = sum(root.right);

        int data = root.data;

        int leftData = root.left == null ? 0:root.left.data;
        int rightData = root.right == null ? 0: root.right.data;
        root.data = leftChildSum + leftData + rightChildSum + rightData;


        return data;
    }

    public static void preorder(BinaryTree.Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args){
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree.tree t = new BinaryTree.tree();
        BinaryTree.Node newNode = t.buildTree(nodes);

        sum(newNode);
        preorder(newNode);

    }
}
