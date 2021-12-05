package tree.sortedArrayToBST;

public class SortedArrayToBST {
    public static void main(String[] args) {
        int[] nums = {-10,-3,0,5,9};
        TreeNode root = insert(nums, 0, nums.length-1);
        print(root);
    }

    public static TreeNode insert(int[] nums, int start, int end) {
        if(start<=end) {
            int mid = (start+end+1)/2;
            TreeNode root = new TreeNode(nums[mid]);
            root.left = insert(nums, start, mid-1);
            root.right = insert(nums, mid+1, end);
            return root;
        } else {
            return null;
        }
    }

    public static void print(TreeNode root) {
        if (root == null) {
            return ;
        }
        System.out.println(root.val);
        print(root.left);
        print(root.right);
    }
}
