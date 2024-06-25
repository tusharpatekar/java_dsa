package BST;

public class MirrorOfTree {

    public static BST.Node mirror(BST.Node root){
        if(root == null){
            return null;
        }

        BST.Node left = mirror(root.left);
        BST.Node right = mirror(root.right);

        root.left = right;
        root.right = left;
        return root;

    }
    public static void main(String[] args){
        int[] values = {8, 5, 3, 1, 4, 6, 10, 11, 14};

        BST.Node root = null;

        for (int i=0; i<values.length; i++){
            root =  BST.insert(root, values[i]);
        }
        BST.inorder(root);
        System.out.println();
        BST.inorder(mirror(root));
        System.out.println();

    }
}
