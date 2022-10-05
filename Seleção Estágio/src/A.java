// The library below will be imported to be used later
import java.util.ArrayList;
// Creation of the class A
public class A {
    //Creating the requested method
    public static ArrayList makeChange(int cents) {
        //Creating the variables that will be assigned to the coins
        int pennies = 0, nickels = 0, dimes = 0, quarters = 0;
        pennies = cents;
        //Creating an ArrayList to insert the counted coins
        ArrayList money = new ArrayList<>();
        //In case of less than 5 cents, this condition will be activated
        if (cents < 5) {
            money.add(pennies);
            money.add(nickels);
            money.add(dimes);
            money.add(quarters);
        } 
        //In case of less than 10 cents, this condition will be activated
        else if (cents < 10) {
            while (pennies >= 5) {
                pennies = pennies - 5;
                nickels = nickels + 1;
            }
            money.removeAll(money);
            money.add(pennies);
            money.add(nickels);
            money.add(dimes);
            money.add(quarters);

        } 
        //In case of less 25 cents, this condition will be activated
        else if (cents < 25) {
            while (pennies >= 10) {
                pennies = pennies - 10;
                dimes = dimes + 1;
            }
            while (pennies >= 5) {
                pennies = pennies - 5;
                nickels = nickels + 1;
            }
            money.removeAll(money);
            money.add(pennies);
            money.add(nickels);
            money.add(dimes);
            money.add(quarters);

        } 
        //In case of 25 cents or more, this condition will be activated
        else {
            while (pennies >= 25) {
                pennies = pennies - 25;
                quarters = quarters + 1;
            }
            while (pennies >= 10) {
                pennies = pennies - 10;
                dimes = dimes + 1;
            }
            while (pennies >= 5) {
                pennies = pennies - 5;
                nickels = nickels + 1;
            }
            money.removeAll(money);
            money.add(pennies);
            money.add(nickels);
            money.add(dimes);
            money.add(quarters);
        }
        return money;

    }
    //Creation of the Main method
    public static void main(String[] args) {
        //Creation of another ArrayList so the count may start
        ArrayList test = new ArrayList<>();
        //Using the requested method
        test = makeChange(24);
        //Showing the output
        System.out.println(test);
    }
}
