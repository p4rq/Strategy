public class ComfortBIGroup implements AreaAndGroup {
    @Override
    public void HowManySquareMeters(int squareMeters) {
        int how_cost = squareMeters*440000;
        System.out.println("The average price of econom " + how_cost);
    }
}
