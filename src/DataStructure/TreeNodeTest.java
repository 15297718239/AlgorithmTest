package DataStructure;

class TreeNode {
    int val;        // 节点值
    TreeNode left;  // 左子节点
    TreeNode right; // 右子节点

    TreeNode(int x) {
        val = x;
    }
}

public class TreeNodeTest {
    public static void main(String[] args) {
        // 初始化节点
        TreeNode n1 = new TreeNode(3); // 根节点 root
        TreeNode n2 = new TreeNode(4);
        TreeNode n3 = new TreeNode(5);
        TreeNode n4 = new TreeNode(1);
        TreeNode n5 = new TreeNode(2);
// 构建引用指向
        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;


    }
}
