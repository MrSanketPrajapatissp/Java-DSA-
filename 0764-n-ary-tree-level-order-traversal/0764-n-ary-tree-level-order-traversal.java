/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new ArrayList<>();

        Queue<Node> q = new LinkedList<>();
        if(root == null) return res;
        q.add(root);

        while(!q.isEmpty())
        {
           List<Integer> level = new ArrayList<>();

           for(int i = q.size(); i > 0; i--)
           {
             Node node = q.remove();
           
             level.add(node.val);
              for(Node child : node.children)
             {
                q.add(child);
             }
             
             
           }

           if(level.size() > 0)
           {
            res.add(level);
           }



        }

        return res;
    }
}