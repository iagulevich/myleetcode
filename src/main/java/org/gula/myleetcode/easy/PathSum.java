package org.gula.myleetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.
 *
 * Note: A leaf is a node with no children.
 *
 * Example:
 *
 * Given the below binary tree and sum = 22,
 *
 *       5
 *      / \
 *     4   8
 *    /   / \
 *   11  13  4
 *  /  \      \
 * 7    2      1
 * return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.
 *
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
public class PathSum {
    public boolean hasPathSum(TreeNode root, int sum) {

        List<Integer> sums = new ArrayList<>();
        loop(sums, root, 0);
        System.out.println(sums);
        return sums.contains(sum);
    }

    private void loop(List<Integer> list, TreeNode node, int rootValue) {
        if (node == null){
            return;
        }
        int value = node.val + rootValue;
        TreeNode right = node.right;
        TreeNode left = node.left;
        if (left == null && right == null){
            list.add(value);
        }
        if (left != null) {
            loop(list, left, value);
        }
        if (right != null) {
            loop(list, right, value);
        }
    }

}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }


    @Override
    public String toString() {
        return "TreeNode{" + val + '}';
    }

    public TreeNode addLeft(TreeNode leftNode) {
        this.left = leftNode;
        return this;
    }

    public TreeNode addRight(TreeNode rightNode) {
        this.right = rightNode;
        return this;
    }
}

