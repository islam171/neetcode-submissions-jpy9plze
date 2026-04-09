
class MinStack {

    private Vector<Integer> array;
    private int[] min = {0, 0};

    public MinStack() {
        this.array = new Vector<>();
    }

    public void push(int val) {
        this.array.add(val);
    }

    public void pop() {
        this.array.remove(this.array.size() - 1);
    }

    public int top() {
        return this.array.get(this.array.size() - 1);
    }

    public int getMin() {
        int min = Integer.MAX_VALUE;
        for(int i : array){
            min = Math.min(min, i);
        }
        return min;
    }
}
