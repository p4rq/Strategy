import java.util.Scanner;

public class Buyer {
    private AreaAndGroup areaAndGroup;
    Scanner scanner = new Scanner(System.in);
    int squareMeters = scanner.nextInt();
    public void setArea(AreaAndGroup areaAndGroup) {
        this.areaAndGroup = areaAndGroup;
    }

    public int getSquareMeters() {
        return squareMeters;
    }

    public void askingArea(){
        areaAndGroup.HowManySquareMeters(squareMeters);
    }
}
