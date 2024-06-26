package BST;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeMap;

public class Merge2BST {
    private static   ArrayList<Integer> arr = new ArrayList<>();
    public static void getInorder(BST.Node root){
        if(root == null){
            return;
        }
        getInorder(root.left);
        arr.add(root.data);
        getInorder(root.right);

    }

    public static BST.Node mergeTree(BST.Node root1, BST.Node root2){
        getInorder(root1);
        getInorder(root2);
        Collections.sort(arr);
        return createBST(arr, 0, arr.size()-1);
    }

    public static BST.Node createBST(ArrayList<Integer> arr, int start, int end){
        if(start > end){
            return null;
        }

        int mid = (start + end)/2;
        BST.Node root = new BST.Node(arr.get(mid));
        root.left = createBST(arr, start, mid-1);
        root.right = createBST(arr, mid+1, end);
        return root;
    }
    public static void main(String[] args){
        int[] arr1 = {1, 2, 4};
        int[] arr2 = {3, 9, 12};


        BST.Node root1 = null;
        BST.Node root2 = null;

        for (int i=0; i<arr1.length; i++){
            root1 =  BST.insert(root1, arr1[i]);
            root2 = BST.insert(root2, arr2[i]);
        }
        BST.inorder(root1);
        System.out.println();
        BST.inorder(root2);
        System.out.println();

        BST.inorder(mergeTree(root1, root2));
    }
}
