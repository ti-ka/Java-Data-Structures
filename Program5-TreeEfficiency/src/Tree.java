public class Tree {
	public TreeNode root;
	
	
	public Tree(){
		
	}
	
	public Tree(int[] array){
		
		if(root == null){
			root = new TreeNode();
		}
		
		for(int i = 0; i < array.length; i++){
			int num = array[i];
			TreeNode current = root;
			
			while(true){
				if(num < current.data && current.left != null)
				{
					current = current.left;
				}
				else if (num > current.data && current.right != null)
				{
					current = current.right;
				}
				else
				{			
					break;
					
				}
			}
			
			//Set Data
			if(num < current.data){
				current.left = new TreeNode(num);
			} else if (num > current.data){
				current.right = new TreeNode(num);
			} else {
				current.freq++;
			}
			
			
			
		}
	}

	public void inOrder(TreeNode t){
		if(t.left != null){
			inOrder(t.left);
		}
		
		System.out.println(t.data);
		
		if(t.right != null){
			inOrder(t.right);
		}
		
	}
	
}