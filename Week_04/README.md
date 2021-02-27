学习笔记
DFS java模板
void dfs(TreeNode node){
        if (node == null){
            return;
        }
        //逻辑处理
        dfs(node.left);
        dfs(node.right);
    }
BFS java模板
void bfs(TreeNode root) {
    Queue<TreeNode> queue = new ArrayDeque<>();
    queue.add(root);
    while (!queue.isEmpty()) {
        TreeNode node = queue.poll(); 
        if (node.left != null) {
            queue.add(node.left);
        }
        if (node.right != null) {
            queue.add(node.right);
        }
    }
贪心算法：
基本思路：
1. 建立数学模型来描述问题。
2. 把求解的问题分成若干个子问题。
3. 对每一子问题求解，得到子问题的局部最优解。
4. 把子问题的解局部最优解合成原来解问题的一个解。
贪心算法适用的问题：
　　贪心策略适用的前提是：局部最优策略能导致产生全局最优解。也就是当算法终止的时候，局部最优等于全局最优。
    例如：找零问题。
}