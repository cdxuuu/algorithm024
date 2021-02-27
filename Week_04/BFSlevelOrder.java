import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class BFSlevelOrder {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        //声明一个存储队列
        Queue<TreeNode> queue = new ArrayDeque<>();

        queue.add(root);

        while (!queue.isEmpty()){
            List<Integer> level = new ArrayList<>();
            int levelSize = queue.size();
            for (int i = 0; i < levelSize; i++) {
                TreeNode poll = queue.poll();
                //本层业务处理
                level.add(poll.val);

                //left
                if (poll.left != null){
                    queue.add(poll.left);
                }
                //right
                if (poll.right != null){
                    queue.add(poll.right);
                }
            }
            result.add(level);
        }
        return result;
    }

    void dfs(TreeNode node){
        if (node == null){
            return;
        }
        //逻辑处理
        dfs(node.left);
        dfs(node.right);
    }
}