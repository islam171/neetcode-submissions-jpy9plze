class Solution {
    public static int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> h = new HashMap<>();

        for(int c : nums){
            if(h.containsKey(c)){
                h.put(c, h.get(c) + 1);
            }else{
                h.put(c, 1);
            }
        }

        Heap heap = new Heap();
        for(int i : h.keySet()){
            Vector<Integer> vec = new Vector<>(2);
            vec.add(h.get(i));
            vec.add(i);
            heap.add(vec);
        }

        int result[] = new int[k];
        for(int i = 0; i < k; i++){
            result[i] = heap.top().get(1);
            heap.pop();
        }
        return result;
    }

    static class Heap {

    ArrayList<Vector<Integer>> list = new ArrayList<>();

        public int parent(int k){
            return (k-1) /2;
        }

        public int left(int k){
            return (2*k) + 1;
        }

        public int right(int k){
            return (2*k) + 2;
        }

        void add(Vector<Integer> k){

            this.list.add(k);


        int i = this.list.size() - 1;
        while( i >= 0 && list.get(parent(i)).get(0) < list.get(i).get(0)){
            swap(i, parent(i));
            i = parent(i);
        }
    }

    void pop(){
        list.set(0, list.getLast());
        list.removeLast();
        dec(0);
    }

    void dec(int i){


        int left = left(i);
        int right = right(i);
        int highest = i;

        if(left < list.size() && list.get(highest).get(0) < list.get(left).get(0)){
            highest = left;
        }
        if(right < list.size() && list.get(highest).get(0) < list.get(right).get(0)){
            highest = right;
        }

        if(i != highest){
            swap(i, highest);
            dec(highest);
        }
    }

    private void swap(int i, int j){
        Vector<Integer> t = list.get(i);
        list.set(i, list.get(j));
        list.set(j, t);
    }

    public Vector<Integer> top(){
        return this.list.get(0);
    }

}

}
