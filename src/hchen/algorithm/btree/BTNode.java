package hchen.algorithm.btree;

public class BTNode {
	
	private int[] values = new int[BTree.RANK - 1];
	
	private int valueIndex;
	
	private BTNode[] children = new BTNode[BTree.RANK];
	
	private BTNode parent;

	public BTNode(BTNode parent){
		this.parent = parent;
	}
	
	
	public BTNode getParent() {
		return parent;
	}

	public void setParent(BTNode parent) {
		this.parent = parent;
	}

	public int[] getValues() {
		return values;
	}

	public BTNode[] getChildren() {
		return children;
	}
	
	public int getValueIndex() {
		return valueIndex;
	}

	public void addValue(int value){
		values[valueIndex++] = value;
	}
	
	public void addValue(int index, int value){
		for(int i=valueIndex;i>index;i--){
			values[i + 1] = values[i];
		}
		values[index] = value;
	}
	
	public int findValuePosition(int value){
		
		if(values[0] > value){
			return 0;
		}
		for(int i=0;i<valueIndex;i++){
			if(values[i] <=value && values[i + 1] > value){
				return i + 1;
			}
		}
		
		return valueIndex;
	}
	
}
