package trees;

public class DiameterOfTree {

    public static int diameter(BinaryTree.Node root){  //O(n^2)
        if(root == null){
            return 0;

        }

        int leftDia = diameter(root.left);
        int rightDia = diameter(root.right);
        int leftHeight = MaxHeightOfTree.height(root.left);
        int rightHeight =  MaxHeightOfTree.height(root.right);

        int selfDia = leftHeight + rightHeight + 1;

        return Math.max(leftDia, Math.max(rightDia, selfDia));


    }

     static class Info{
        int ht;
        int dia;
        public Info(int ht, int dia){
            this.ht = ht;
            this.dia = dia;
        }

    }

    public static Info diameter2(BinaryTree.Node root){
        if( root == null){
            return new Info(0, 0);
        }

        Info leftInfo = diameter2(root.left);
        Info rightInfo = diameter2(root.right);
        int dia = Math.max(Math.max(leftInfo.dia, rightInfo.dia), leftInfo.ht + rightInfo.ht + 1);
        int height = Math.max(leftInfo.ht, rightInfo.ht) + 1;

        return new Info(height, dia);
    }

    public static void main(String[] args){
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree.tree t = new BinaryTree.tree();
        BinaryTree.Node newNode = t.buildTree(nodes);
        System.out.println(diameter(newNode));
        System.out.println(diameter2(newNode).dia);


    }
}
