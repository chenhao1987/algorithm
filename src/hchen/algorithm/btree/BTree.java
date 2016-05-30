package hchen.algorithm.btree;

public class BTree {

	public static final int RANK = 5;
	
	private BTNode root;
	
	
	public void insert(BTNode node, int value){
		
		int childIndex = node.findValuePosition(value);
		BTNode childNode = node.getChildren()[childIndex];
		if(childNode != null){
			insert(childNode, value);
		}else{
			if(node.getValueIndex() == RANK - 1){
				split(node, value);
			}else{
				node.addValue(childIndex, value);
			}
		}
	}
	
	
	public void split(BTNode node, int value){
		
		if(node.getValueIndex() == RANK - 1){
			int splitIndex = (RANK + 1) / 2;
			
		}
		
		
		
		
		
		
		
		
	}
	
	
}
