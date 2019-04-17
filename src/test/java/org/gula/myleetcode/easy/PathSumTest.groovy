package org.gula.myleetcode.easy

import spock.lang.Specification

class PathSumTest extends Specification {
    def "should return true if TreeNode has path sum"() {
        expect:
        new PathSum().hasPathSum(treeNode, sum) == result
        where:
        treeNode                || sum || result
        new TreeNode(1) || 1   || true
        new TreeNode(1) || 2   || false
        new TreeNode(2) || 2   || true
        buildTreeNode()         || 18  || true
        buildTreeNode()         || 22  || true
        buildTreeNode()         || 26  || true
        buildTreeNode()         || 27  || true
        buildTreeNode()         || 0   || false
        buildTreeNode()         || 17  || false
        buildTreeNode()         || 28  || false

    }

    private TreeNode buildTreeNode() {
        new TreeNode(5)
                .addLeft(new TreeNode(4).addLeft(new TreeNode(11).addLeft(new TreeNode(7)).addRight(new TreeNode(2))))
                .addRight(new TreeNode(8).addLeft(new TreeNode(13)).addRight(new TreeNode(4).addRight(new TreeNode(1))))
    }
}
