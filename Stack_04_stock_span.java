import java.util.Stack;

public class Stack_04_stock_span {

    public static void stockSpan(int stock[], int span[]){
        Stack <Integer> stk = new Stack<>();
        span[0] = 1;
        stk.push(0);

        for(int i = 1; i < stock.length; i++){
            int currPrice = stock[i];
            while(!stk.isEmpty() && currPrice > stock[stk.peek()]){
                stk.pop();
            }

            if(stk.isEmpty()){
                span[i] = i + 1;
            }

            else{
                span[i] = i - stk.peek();
            }
            stk.push(i);       
        }
    }

    public static void main(String[] args) {
        int stock[] = {100, 80, 60, 70, 60, 85, 100};
        int span[] = new int[stock.length];

        stockSpan(stock, span);

        for(int i = 0; i < span.length; i++){
            System.out.print(span[i] + " ");
        }
        System.err.println();
    }
}
