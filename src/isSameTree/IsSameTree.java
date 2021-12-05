package isSameTree;

import java.util.ArrayList;
import java.util.List;

public class IsSameTree {
    public static void main(String[] args) {
        TreeNode p = new TreeNode(1);
        p.left=new TreeNode(1);
        p.right=new TreeNode(2);
        TreeNode q = new TreeNode(1);
        q.left=new TreeNode(2);
        q.right=new TreeNode(1);
        List<String> pInfo = new ArrayList<>();
        preOrder(pInfo, p);
        List<String> qInfo = new ArrayList<>();
        preOrder(qInfo, q);
    }

    public static void preOrder(List<String> list, TreeNode root) {
        if(root == null) {
            list.add("null");
            return;
        }
        list.add(String.valueOf(root.val));
        preOrder(list, root.left);
        preOrder(list, root.right);
    }
}
