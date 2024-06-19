package BST;

public class PrintInRange {

    public static void printInRange(BST.Node root, int k1, int k2){
        if(root == null){
            return;
        }
        if(root.data >= k1 && root.data <= k2){ // if root is between k1 and k2
            printInRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printInRange(root.right, k1, k2);
        } else if (root.data > k2) {
            printInRange(root.right, k1, k2);
        }else {
            printInRange(root.left, k1, k2);
        }
    }

    public static void  main(String[] args){
        int[] values = {8, 5, 3, 1, 4, 6, 10, 11, 14};

        BST.Node root = null;

        for (int i=0; i<values.length; i++){
            root =  BST.insert(root, values[i]);
        }
        BST.inorder(root);
        System.out.println();
        printInRange(root, 5, 12);

    }
}
