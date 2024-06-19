package BST;

import java.util.ArrayList;

public class LeafToNodePath {

    public static void printPath(ArrayList<Integer> path){
        for(int i=0; i<path.size(); i++){
            System.out.print(path.get(i) + "->");
        }
        System.out.println("null");
    }

    public static void leaf2Node(BST.Node root, ArrayList<Integer> path){
        if(root == null){
            return;
        }
        path.add(root.data);
        if(root.left == null && root.right == null){
            printPath(path);
        }
        leaf2Node(root.left, path);
        leaf2Node(root.right, path);

        path.remove(path.size() - 1);
    }

    public static void  main(String[] args){
        int[] values = {8, 5, 3, 1, 4, 6, 10, 11, 14};

        BST.Node root = null;

        for (int i=0; i<values.length; i++){
            root =  BST.insert(root, values[i]);
        }
        BST.inorder(root);
        System.out.println();

        leaf2Node(root, new ArrayList<>());

    }
}
