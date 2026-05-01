class MyHashSet {
        ArrayList<Integer> list = new ArrayList<Integer>(); 

    public MyHashSet() {
    }
    
    public void add(int key) {
        for(int i : this.list){
            if(i == key){
                return;
            }
        }
        this.list.add(key);
    }
    
    public void remove(int key) {
        this.list.remove(Integer.valueOf(key));
        // if(contains(key))
        //     this.list.removeif(item -> item == key);
    }
    
    public boolean contains(int key) {
        for(int i : this.list){
            if(i == key){
                return true;
            }
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */