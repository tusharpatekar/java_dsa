package trees;

public class SubTreeOfAnotherTree {

    public static boolean isIdentical(BinaryTree.Node node, BinaryTree.Node subRoot){
        if(node == null && subRoot == null){
            return true;
        } else if (node == null || subRoot == null || node.data != subRoot.data) {
            return false;
        }

        if(!isIdentical(node.left, subRoot.left)){
            return false;
        }
        if(!isIdentical(node.right, subRoot.right)){
            return false;
        }

        return true;
    }

    public static boolean isSubTree(BinaryTree.Node root, BinaryTree.Node subRoot){
        if(root == null){
            return false;
        }
        if(root.data == subRoot.data){
            if(isIdentical(root, subRoot)){
                return true;
            }
        }

        return isSubTree(root.left, subRoot) || isSubTree(root.right, root);
    }

    public static void main(String[] args){
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree.Node subTree = new BinaryTree.Node(2);
        subTree.left = new BinaryTree.Node(4);
//        subTree.right = new BinaryTree.Node(5);
        BinaryTree.tree t = new BinaryTree.tree();
        BinaryTree.Node newNode = t.buildTree(nodes);

        System.out.println(isSubTree(newNode, subTree));
    }
}
