import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static Buyer buyer = new Buyer();
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static AreaAndGroup area;
    public static void main(String[] args) throws IOException {
        System.out.println("Please, select a group:" + "\n" +
                "1 - BIGroup" + "\n" +
                "2 - BazisA" + "\n" +
                "3 - Global Expert Development Group");
        String group = reader.readLine();


        if (group.equals("1")) {
            System.out.println("Please, select a class:" + "\n" +
                    "1 - Econom" + "\n" +
                    "2 - Comfort" + "\n" +
                    "3 - Business");
            String selected = reader.readLine();
            if(selected.equals("1")){
                buyer.setArea(new EconomBIGroup());
                buyer.askingArea();

            } else if (selected.equals("2")) {
                buyer.setArea(new ComfortBIGroup());
                buyer.askingArea();
            }
            else if(selected.equals("3")){
                buyer.setArea(new BusinessBIGroup());
                buyer.askingArea();

            }
        } else if (group.equals("2")) {
            System.out.println("Please, select a class:" + "\n" +
                    "1 - Econom" + "\n" +
                    "2 - Comfort" + "\n" +
                    "3 - Business");
            String selected = reader.readLine();
            if(selected.equals("1")){
                buyer.setArea(new EconomBazisA());
                buyer.askingArea();

            } else if (selected.equals("2")) {
                buyer.setArea(new ComfortBazisA());
                buyer.askingArea();

            }
            else if(selected.equals("3")){
                buyer.setArea(new BusinessBazisA());
                buyer.askingArea();

            }
        } else if (group.equals("3")) {
            System.out.println("Please, select a class:" + "\n" +
                    "1 - Econom" + "\n" +
                    "2 - Comfort" + "\n" +
                    "3 - Business");
            String selected = reader.readLine();
            if(selected.equals("1")){
                buyer.setArea(new EconomGEDG());
                buyer.askingArea();

            } else if (selected.equals("2")) {
                buyer.setArea(new ComfortGEDG());
                buyer.askingArea();

            }
            else if(selected.equals("3")){
                buyer.setArea(new BusinessGEDG());
                buyer.askingArea();
            }
        }

    }
    }
