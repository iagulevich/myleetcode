package org.gula.myleetcode.easy;

public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p != null && q == null) {
            return false;
        }
        if (p == null && q != null) {
            return false;
        }

        boolean result = p.val == q.val;
        result &= isSameTree(p.left, q.left);
        result &= isSameTree(p.right, q.right);
        return result;
    }
}
