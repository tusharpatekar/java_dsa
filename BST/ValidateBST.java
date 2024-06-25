package BST;

public class ValidateBST {

    public static boolean isValid(BST.Node root, BST.Node min, BST.Node max){
        if(root == null){
            return true;
        }
        if(min != null && root.data <= min.data){
            return false;
        }else if (max != null && root.data >= max.data){
            return false;
        }

        return isValid(root.left, min, root) && isValid(root.right, root, max);
    }

    public static void main(String[] args){
        //int[] values = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        int[] values = {1, 1, 1};

        BST.Node root = null;

        for (int i=0; i<values.length; i++){
            root =  BST.insert(root, values[i]);
        }
        BST.inorder(root);
        System.out.println();

        System.out.println(isValid(root, null,null));
    }
}
