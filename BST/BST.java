package BST;

public class BST {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }


    public static Node insert(Node root, int val){
        if(root == null){
            return new Node(val);
        }

        if(val < root.data){
            root.left = insert(root.left, val);
        }else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void inorder(Node root){
        if(root == null){
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static boolean search(Node root, int key){
        if(root == null){
            return false;
        }

        if(root.data == key){
            return true;

        }

        if(root.data > key){
            return search(root.left, key);
        }else {
            return search(root.right, key);
        }
    }
    public static void main(String[] args){
        int[] values = {5, 1, 3, 4, 2, 7};

        Node root = null;

        for (int i=0; i<values.length; i++){
           root =  insert(root, values[i]);
        }
        //inorder(root);

        if(search(root, 6)){
            System.out.print("Found");
        }else {
            System.out.print("Not found");
        }
    }
}
