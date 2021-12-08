package tree.isSymmetric;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class IsSymmetric {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(2);
        root.left.left=new TreeNode(3);
        root.left.right=new TreeNode(4);
        root.right.left=new TreeNode(4);
        root.right.right=new TreeNode(3);
        LinkedList<TreeNode> queue = new LinkedList<>();
        List<String> info = new ArrayList<>();
        info.add(String.valueOf(root.val));
        while (root.left!=null || root.right!=null) {
            queue.add(root.left);
            queue.add(root.right);
            TreeNode head = queue.removeFirst();
            if(head==null) {
                info.add("null");
            } else {
                info.add(String.valueOf(head.val));
                while((head.left==null && head.right==null) && queue.size()>0) {
                    head = queue.removeFirst();
                    if(head==null) {
                        info.add("null");
                        head = queue.removeFirst();
                    } else {
                        info.add(String.valueOf(head.val));
                    }
                }
                root=head;
            }
        }
        info.forEach(System.out::println);
    }
}
