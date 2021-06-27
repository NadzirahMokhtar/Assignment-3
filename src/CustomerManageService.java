/**
 * The type Customer manage service.
 */
public class CustomerManageService implements ManageService {

    private String name;
    private String dest;
    private int destP;
    private String date;
    private String carType;
    private int carP;

    /**
     * Instantiates a new Customer manage service.
     *
     * @param name    the name
     * @param dest    the dest
     * @param destP   the dest p
     * @param date    the date
     * @param carType the car type
     * @param carP    the car p
     */
    public CustomerManageService(String name, String dest, int destP, String date, String carType, int carP) {
        this.name = name;
        this.dest = dest;
        this.destP = destP;
        this.date = date;
        this.carType = carType;
        this.carP = carP;
    }

    @Override
    public double calculateFee() {
        return destP + carP;
    }

    @Override
    public String printMessage() {
        int rand = (int) (Math.random() * 100);
        String result = ("\nReceipt #" + rand) +
                ("\n=======================") +
                ("\nName: " + name) +
                ("\nDestination: " + dest) +
                ("\nPrice:" + "RM" + destP) +
                ("\nDate: " + date) +
                ("\nCar Type: " + carType) +
                ("\nPrice:" + " RM" + carP) +
                ("\nYour Total is: RM" + calculateFee()) +
                ("\nThank you!");
        System.out.println(result);
        return result;
    }
}

