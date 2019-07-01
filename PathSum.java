
public class PathSum {
	public int hasPath(int target, TreeNode tree){
        if (tree == null) {
        	return 0;
        }
        if (tree.left == null && tree.right == null) {
        	if (tree.info == target) {
        		return 1;
        	}
        	return 0;
        }
        int leftCall = hasPath(target-tree.info,tree.left);
        int rightCall = hasPath(target-tree.info,tree.right);
        if (leftCall + rightCall > 0) {
        	return 1;
        }
        return 0;
    }

}
