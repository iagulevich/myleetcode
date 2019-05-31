package org.gula.myleetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        add(root, result);
        return result;
    }

    private void add(TreeNode note, List<Integer> list){
        if(note!=null){
            add(note.left, list);
            list.add(note.val);
            add(note.right, list);
        }
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
