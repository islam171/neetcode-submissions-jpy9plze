
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> a = new Stack<Integer>();


        int sum = 0;

        for(int i =0; i < tokens.length; i++){
            if(a.empty()){
                a.push(Integer.parseInt(tokens[i]));
                continue;
            }
            if(tokens[i].equals("+")){
                int num1  = a.peek();
                a.pop();
                int num2 = a.peek();
                sum  = num1 + num2;
                a.pop();
                a.push(sum);
            }
            else if(tokens[i].equals("-")){
                int num1  = a.peek();
                a.pop();
                int num2 = a.peek();
                sum  = num2 - num1;
                a.pop();
                a.push(sum);
            }

            else if(tokens[i].equals("*")){
                int num1  = a.peek();
                a.pop();
                int num2 = a.peek();
                a.pop();
                sum  = num1 * num2;
                a.push(sum);
            }
            else if(tokens[i].equals("/")){
                int num1  = a.peek();
                a.pop();
                int num2 = a.peek();
                a.pop();
                sum  = num2 / num1;
                a.push(sum);
            }
            else
                a.push(Integer.parseInt(tokens[i]));
        }
        return a.peek();
    }
}
