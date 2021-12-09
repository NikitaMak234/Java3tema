public class BonusMilesService {
    public int calculate(int price) {
        int percentInKopecks = 20;
        int bonus = price / percentInKopecks;
        return bonus;
    }
}


