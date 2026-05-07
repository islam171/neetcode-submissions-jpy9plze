class MyStack {
public:
        queue<int> q1;
        queue<int> q2;
    MyStack() {
    }
    
    void push(int x) {
        q1.push(x);
    }
    
    int pop() {
        int a = q1.back();
        int y = q1.size() -1;
        cout << y;
        for(int i = 0; i < y; i++){
            q2.push(q1.front());
            q1.pop();
        }
        q1 = q2;
        while(!q2.empty()) q2.pop();
        // cout << q2.size() << " " << q1.size() << "\n";
        return a;
    }
    
    int top() {
        
        return q1.back();
    }
    
    bool empty() {
        return q1.empty();
    }
};

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack* obj = new MyStack();
 * obj->push(x);
 * int param_2 = obj->pop();
 * int param_3 = obj->top();
 * bool param_4 = obj->empty();
 */