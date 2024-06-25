package BST;

public class BSTUsingSortedArray {

    public static BST.Node createBST(int[] arr, int start, int end){
        if(start > end){
            return null;
        }

        int mid = (start + end)/2;
        BST.Node root = new BST.Node(arr[mid]);

        root.left = createBST(arr, start, mid-1);
        root.right = createBST(arr, mid+1, end);

        return root;
    }
    public static void main(String[] args){
       int[] arr = {3, 5, 6, 8, 10, 11, 12};
       BST.Node root = createBST(arr, 0, arr.length-1);

       BST.inorder(root);


    }
}
