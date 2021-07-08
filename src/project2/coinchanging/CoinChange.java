package project2.coinchanging;
import java.util.Arrays;
import java.util.Objects;


public class CoinChange {
    public int change;
    public int amount;
    public int[] coins;
    public int[] changes;

    public CoinChange(int change, int amount, int[] coins) {
        this.change = change;
        this.amount = amount;
        this.coins = coins;
        this.changes = new int[coins.length];
    }

    public CoinChange(int change, int amount, int[] coins, int[] changes) {
        this.change = change;
        this.amount = amount;
        this.coins = coins;
        this.changes = changes;
    }



    @Override
    public String toString() {

        var sb = new StringBuilder();
        sb.append( String.format("Change:%d\n", change));
        sb.append( String.format("Amount:%d\nCoins:\n", amount));
        sb.append(String.format("%s\nChanges:\n[%s]\n", Arrays.toString(coins), Arrays.toString(changes) ));

        int actual = 0;
        for (int i = 0; i < coins.length; i++) {
            actual += coins[i]*changes[i];
        }
        sb.append(String.format("Actual:%d\n", actual));

        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CoinChange that = (CoinChange) o;
        return change == that.change && amount == that.amount && Arrays.equals(coins, that.coins) && Arrays.equals(changes, that.changes);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(change, amount);
        result = 31 * result + Arrays.hashCode(coins);
        result = 31 * result + Arrays.hashCode(changes);
        return result;
    }
}
