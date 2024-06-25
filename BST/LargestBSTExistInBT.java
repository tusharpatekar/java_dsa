package BST;

public class LargestBSTExistInBT {

    static class Info{
        boolean isBST;
        int size;
        int min;
        int max;

        public Info(boolean isBST, int size, int min, int max){
            this.isBST = isBST;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }
    public static int maxBST = 0;
    public static Info longestBST(BST.Node root){
        if(root == null){
            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }

        Info leftInfo = longestBST(root.left);
        Info rightInfo = longestBST(root.right);
        int size = leftInfo.size + rightInfo.size + 1;
        int min = Math.min(leftInfo.min,Math.min(root.data, rightInfo.min));
        int max = Math.max(leftInfo.max,Math.max(root.data, rightInfo.max));
        if(root.data <= leftInfo.max || root.data >= rightInfo.min){
            return new Info(false, size, min, max);
        }
        if(leftInfo.isBST && rightInfo.isBST){
            maxBST = Math.max(maxBST, size);
            return new Info(true, size, min, max);
        }
        return new Info(false, size, min, max);
    }
    public static void main(String[] args){
        BST.Node root = new BST.Node(50);
        root.left = new BST.Node(30);
        root.left.left = new BST.Node(5);
        root.left.right = new BST.Node(20);
        root.right = new BST.Node(60);
        root.right.left = new BST.Node(45);
        root.right.right = new BST.Node(70);
        root.right.right.left = new BST.Node(65);
        root.right.right.right = new BST.Node(80);
        longestBST(root);
        System.out.println(maxBST);
    }
}
