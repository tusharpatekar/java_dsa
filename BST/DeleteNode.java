package BST;

public class DeleteNode {

    public static BST.Node delete(BST.Node root, int val){
        if(root.data < val){
            root.right = delete(root.right, val);
        } else if (root.data > val) {
            root.left = delete(root.left, val);
        }
        else {
            // case - 1 leaf node
            if(root.left == null && root.right == null){
                return null;
            }
            // case 2 - single child
            if (root.left == null){
                return root.right;
            }else if (root.right == null){
                return root.left;
            }
            // case 3 both children
            BST.Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);

        }
        return root;
    }

    public static BST.Node findInorderSuccessor(BST.Node root){
        while (root.left != null){
            root = root.left;
        }
        return root;
    }

    public static void  main(String[] args){
        int[] values = {8, 5, 3, 1, 4, 6, 10, 11, 14};

        BST.Node root = null;

        for (int i=0; i<values.length; i++){
            root =  BST.insert(root, values[i]);
        }
        BST.inorder(root);
        System.out.println();

        delete(root, 4);

        BST.inorder(root);
    }

}
