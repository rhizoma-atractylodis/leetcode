package tree.isBalanced;

public class IsBalanced {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(2);
        root.right.left=new TreeNode(3);
        root.right.right=new TreeNode(3);
        root.right.right.right=new TreeNode(4);
        System.out.println(judge(root));
    }

    public static int height(TreeNode root) {
        int leftHeight=0;
        int rightHight=0;
        if(root==null) {
            return 0;
        }
        leftHeight+=height(root.left)+1;
        rightHight+=height(root.right)+1;
        return Math.max(leftHeight, rightHight);
    }

    public static boolean judge(TreeNode node) {
        int left=height(node.left);
        int right=height(node.right);
        int abs = Math.abs(left-right);
        System.out.println(abs);
        boolean isBalanced = Math.abs(height(node.left)-height(node.right))<=1;
        if(isBalanced) {
            if(node.left!=null) {
                isBalanced=judge(node.left);
            } 
            if(isBalanced) {
                if(node.right!=null) {
                    isBalanced=judge(node.right);
                }
            }
        }
        return isBalanced;
    }
}
