package tree.minDepth;

public class MinDepth {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(3);
        root.left=new TreeNode(9);
        root.right=new TreeNode(20);
        root.right.left=new TreeNode(15);
        root.right.right=new TreeNode(7);
        System.out.println(depth(root));
    }

    public static int depth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        if(root.left == null && root.right == null) {
            return 1;
        }
        int ans = Integer.MAX_VALUE;
        if(root.left != null) {
            ans = Math.min(depth(root.left), ans);
        }
        if(root.right != null) {
            ans = Math.min(depth(root.right), ans);
        }
        return ans + 1;
    }
}
