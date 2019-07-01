import java.util.*;

public class AllPaths {
	ArrayList<String> myList;

	public String[] paths(TreeNode root) {
		myList = new ArrayList<>();
		if (root == null) {
			return new String[0];
		}
		findPaths(root,"");
		Collections.sort(myList);
		return myList.toArray(new String[0]);
	}
	public void findPaths(TreeNode root,String path) {
	      if (root == null) {
	    	  return;
	      }
	      if (root.right == null && root.left == null) {
	         path+= root.info;
	         myList.add(path);
	         return;
	      }
	      path+= root.info + "->";
	      findPaths(root.left,path);
	      findPaths(root.right,path);
		
	}

}
