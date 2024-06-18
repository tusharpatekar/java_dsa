package trees;

public class MinDistanceBetweenNodes {


    public static int lcaDist(BinaryTree.Node root, int n){
        if(root == null){
            return -1;
        }

        if(root.data == n){
            return 0;
        }

        int leftDist = lcaDist(root.left, n);
        int rightDist = lcaDist(root.right, n);

        if(leftDist == -1 && rightDist == -1){
            return -1;
        } else if (leftDist == -1) {
            return rightDist+1;

        }else {
            return leftDist + 1;
        }
    }

    public static int minDist(BinaryTree.Node root, int n1, int n2){
        BinaryTree.Node lca = LowestCommonAncestor.lca2(root, n1, n2);

        int dist1 = lcaDist(lca, n1);
        int dist2 = lcaDist(lca, n2);

        return dist1 + dist2;
    }

    public static void main(String[] args){
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree.tree t = new BinaryTree.tree();
        BinaryTree.Node newNode = t.buildTree(nodes);

        System.out.println(minDist(newNode, 4, 6));


    }
}
