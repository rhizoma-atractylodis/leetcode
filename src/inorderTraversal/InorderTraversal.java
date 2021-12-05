package inorderTraversal;

import java.util.ArrayList;
import java.util.List;

public class InorderTraversal {
    public static void main(String[] args) {
        TreeNode tree = new TreeNode(1);
        tree.left=null;
        tree.right=new TreeNode(2);
        tree.right.left = new TreeNode(3);
        tree.right.right=null;
        List<Integer> result = new ArrayList<>();
        order(result, tree);
        result.forEach(System.out::println);
    }

    public static void order(List<Integer> list, TreeNode tree) {
        if(tree==null) {
            return;
        }
        order(list, tree.left);
        list.add(tree.val);
        order(list, tree.right);
    }
}
