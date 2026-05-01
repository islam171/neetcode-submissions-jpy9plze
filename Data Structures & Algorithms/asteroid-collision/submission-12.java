class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < asteroids.length; i++) {
            if (st.isEmpty()) {
                st.push(asteroids[i]);
            } else {
                if (isSame(st.peek(), asteroids[i])) {
                    st.push(asteroids[i]);
                } else {
                    if (Math.abs(st.peek()) < Math.abs(asteroids[i])) {
                        st.pop();
                        i--;
                    } else if (Math.abs(st.peek()) == Math.abs(asteroids[i])) {
                        st.pop();
                    }
                }
            }
        }
        int newArr[] = new int[st.size()];
        int i = st.size() - 1;
        while (!st.isEmpty()) {
            newArr[i] = st.peek();
            st.pop();
            i--;
        }
        return newArr;
    }

    public boolean isSame(int i, int j) {
        if (i > 0 && j > 0) {
            return true;
        } else if (i < 0 && j < 0) {
            return true;
        }else if(i < j){
            return true;
        }
        return false;
    }
}