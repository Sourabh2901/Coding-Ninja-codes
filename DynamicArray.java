public class DynamicArray {

	private int arr[];
	private int nextIndex;
	private int size;
	
	public DynamicArray(){
		arr = new int[10];
		nextIndex = 0;
		size = 0;
	}

	public void add(int i){
		if(nextIndex >= arr.length){
			reStructure();
		}
		arr[nextIndex] = i;
		nextIndex++;
		size++;
	}

	private void reStructure() {
		int temp[] = arr;
		arr = new int[temp.length * 2];
	
		for(int i=0;i<temp.length;i++){
			arr[i] = temp[i];
		}
	}

	public void print() {
		for(int i=0;i<this.size();i++){
			System.out.print(this.get(i)+" ");
		}
	}

	private int size() {
		return size;
	}

	public void set(int i, int j) {
		if(i > nextIndex){
			return;
		}else if(i < nextIndex){
			arr[i] = j;
		}else{
			add(j);
		}
	}

	public int get(int i) {
		if(i < this.size()){
			return arr[i];
		}else{
			return -1;
		}
	}
	
	public boolean isEmpty(){
		return size == 0;
	}
	
	public int removeLast(){
		if(this.size() == 0){
			return -1;
		}
		int temp = this.get(size-1);
		size--;
		return temp;
	}
	
}