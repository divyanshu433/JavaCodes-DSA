public class buy_and_sell_stocks {

    public static int best_time (int stocks[]){
        int profit = 0;
        int max_profit = 0;
        int buy_price = stocks[0];
        for (int i = 1; i < stocks.length; i++){
            if (buy_price < stocks[i]){
                profit = stocks[i] - buy_price;
                max_profit = Math.max(max_profit, profit);
            }
            else{
                buy_price = stocks[i];
            }
        }
        return max_profit;
    }

    public static void main(String[] args) {
        int stocks[] = {7, 1, 5, 3, 6 ,4};

        System.out.println(best_time(stocks));
    }
}
