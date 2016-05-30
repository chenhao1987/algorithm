package hchen.algorithm.btree;

import java.util.List;

public class BTree {

	public static final int RANK = 5;
	
	private BTNode root;
	
	
	public void insert(BTNode node, int value, List<BTNode> parents){
		
		int childIndex = node.findValuePosition(value);
		BTNode childNode = node.getChildren()[childIndex];
		if(childNode != null){
			parents.add(node);
			insert(childNode, value, parents);
		}else{
			if(node.getValueIndex() == RANK - 1){
				split(node, value, parents);
			}else{
				node.addValue(childIndex, value);
			}
		}
	}
	
	
	public void split(BTNode node, int value, List<BTNode> parents){
		
		if(node.getValueIndex() == RANK - 1){
			int splitIndex = (RANK + 1) / 2;
			
			
			
			
		}
		
		
		
		
		
		
		
		
	}
	
	
}
