public class BonusMilesService {
    public int calculate(int x) {
        int priceOfFreeMiles = 20;
        int miles = 0;
        if (x > 0) {
            miles = x / priceOfFreeMiles;
        }
        return miles;
    }
}