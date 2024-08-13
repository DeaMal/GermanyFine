import java.util.Objects;
import java.util.Scanner;

public class FineCalculator {
    private final boolean isTown;
    private final int townSpeed;
    private final  int countrySpeed;

    public FineCalculator(boolean isTown, int townSpeed, int countrySpeed) {
        this.isTown = isTown;
        this.townSpeed = townSpeed;
        this.countrySpeed = countrySpeed;
    }

    public void fineCheck() {
        System.out.println("The system for calculating speeding fines in Germany");

        Integer carSpeed = null;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter speed: ");
        if (in.hasNextInt()) {
            carSpeed = in.nextInt();
        }
        if (Objects.isNull(carSpeed)) {
            System.out.println("The speed was entered incorrectly.");
        } else {
            int overSpeed = carSpeed - (isTown ? townSpeed : countrySpeed);
            System.out.println("Driving " + (isTown ? "in the city is " : "outside the city is ") + carSpeed + " km/h");
            if (overSpeed < 1) {
                System.out.println("Speed not exceeded!");
            } else {
                System.out.println("Speed exceeded by " + overSpeed + " km/h");
                var range = FineRange.getRange(overSpeed);
                System.out.println("Fine " + (isTown ? range.getFineTown() : range.getFineCountry()) + " euros");
            }
        }
    }
}
