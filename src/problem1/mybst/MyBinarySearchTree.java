/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.mybst;

public class MyBinarySearchTree {
 static Queue<TreeNode> q;


    public TreeNode insert(TreeNode root, int x) {



        if (root == null)
            return new TreeNode(x);
        else if (x > root.getData())
            root.setRight(insert(root.getRight(), x));

    }
    }
