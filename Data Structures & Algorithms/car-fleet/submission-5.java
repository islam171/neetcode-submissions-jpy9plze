class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        ArrayList<Double[]> a = new ArrayList<>();
        for(int i = 0; i < position.length; i++){
            Double[] temp = {(double)position[i], (double)speed[i]};
            a.add(temp);
        }

        MS(0, a.size()-1, a);

        Stack<Double> st = new Stack<>();
        for(int i = 0; i < a.size(); i++){
            double time = (target - a.get(i)[0]) / a.get(i)[1];
            if (st.empty() || st.peek() < time) {
                st.push(time);
            }
        }

        return st.size();
    }

    public void MS(int l, int r, ArrayList<Double[]> a) {
        if (l >= r) return;
        int mid = (l + r) / 2;
        MS(l, mid, a);
        MS(mid + 1, r, a);
        merge(l, mid, r, a);
    }


    public void merge(int l, int mid, int r, ArrayList<Double[]> a) {
        int left = l;
        int right = mid + 1;
        ArrayList<Double[]> temp = new ArrayList<>();

        while (left <= mid && right <= r) {
            if (a.get(left)[0] > a.get(right)[0]) {
                temp.add(a.get(left));
                left++;
            } else {
                temp.add(a.get(right));
                right++;
            }
        }
        while (left <= mid) {
            temp.add(a.get(left));
            left++;
        }
        while (right <= r) {
            temp.add(a.get(right));
            right++;
        }


        for(int i = l; i <= r; i++){
            a.set(i, temp.get(i - l));
        }
    }
}

class Merge {

    public static void sort(ArrayList<Double[]> a) {
        MS(0, a.size() - 1, a);
    }

    public static void MS(int l, int r, ArrayList<Double[]> a) {
        if (l >= r) return;
        int mid = (l + r) / 2;
        MS(l, mid, a);
        MS(mid + 1, r, a);
        merge(l, mid, r, a);
    }


    public static void merge(int l, int mid, int r, ArrayList<Double[]> a) {
        int left = l;
        int right = mid + 1;
        ArrayList<Double[]> temp = new ArrayList<>();

        while (left <= mid && right <= r) {
            if (a.get(left)[0] > a.get(right)[0]) {
                temp.add(a.get(left));
                left++;
            } else {
                temp.add(a.get(right));
                right++;
            }
        }
        while (left <= mid) {
            temp.add(a.get(left));
            left++;
        }
        while (right <= r) {
            temp.add(a.get(right));
            right++;
        }


        for(int i = l; i <= r; i++){
            a.set(i, temp.get(i - l));
        }
    }
}