public class BonusMilesService {

    public int cost(int price, int miles) {
        int result;
        if (price > miles) {
            result = price;
        } else {
            result = miles;
        }
        return result;
    }
}
