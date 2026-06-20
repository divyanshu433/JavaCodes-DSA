import java.util.*;;
public class Greedy_05_indian_coins {

    public static int indianCoins(Integer coins[], int amount){
        ArrayList <Integer> list = new ArrayList<>();
        Arrays.sort(coins, Comparator.reverseOrder());
        int count = 0;
        for(int i = 0; i < coins.length; i++){
            if(coins[i] <= amount){
                while(coins[i] <= amount){
                    amount -= coins[i];
                    list.add(coins[i]);
                    count++;
                }   
            }
        }
        System.out.println(list);
        return count;
    }

    public static void main(String[] args) {
        int amount = 595;
        Integer coins[] = {1, 2, 5, 10, 20, 50, 100, 500, 2000};

        System.out.println("MIN notes/coins : " + indianCoins(coins, amount));
    }
}
