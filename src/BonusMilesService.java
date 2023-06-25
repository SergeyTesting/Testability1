public class BonusMilesService {
    public int calculate(int price) {
        int miles = price / 20; //расчет количества миль
        return miles;
    }
}
