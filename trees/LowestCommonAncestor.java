package trees;

import java.util.ArrayList;

public class LowestCommonAncestor {

    public static boolean getPath(BinaryTree.Node root, int n, ArrayList<BinaryTree.Node> path){
        if(root == null){
            return false;
        }

        path.add(root);
        if( root.data == n){
            return true;
        }

        boolean foundLeft = getPath(root.left, n, path);
        boolean foundRight = getPath(root.right, n, path);

        if(foundLeft || foundRight){
            return true;
        }

        path.remove(path.size() - 1);
        return false;
    }

    public static BinaryTree.Node lca(BinaryTree.Node root, int n1, int n2){
        ArrayList<BinaryTree.Node> path1 = new ArrayList<>();
        ArrayList<BinaryTree.Node> path2 = new ArrayList<>();

        getPath(root, n1, path1);
        getPath(root, n2, path2);

        int i = 0;
        for(; i<path1.size() && i<path2.size(); i++){
            if(path1.get(i) != path2.get(i)){
                break;
            }
        }

        BinaryTree.Node lca = path1.get(i - 1);
        return lca;

    }

    public static BinaryTree.Node lca2(BinaryTree.Node root, int n1, int n2){
        if(root == null || root.data == n1 || root.data == n2){
            return root;
        }

        BinaryTree.Node leftlca = lca2(root.left, n1, n2);
        BinaryTree.Node rightlca = lca2(root.right, n1, n2);

        if(leftlca == null){
            return rightlca;
        }
        if(rightlca == null){
            return leftlca;
        }

        return root;
    }
    public static void main(String[] args){
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree.tree t = new BinaryTree.tree();
        BinaryTree.Node newNode = t.buildTree(nodes);
        System.out.print(lca(newNode, 4, 5).data);
        System.out.println();
        System.out.println(lca2(newNode, 4, 6).data);

    }
}
