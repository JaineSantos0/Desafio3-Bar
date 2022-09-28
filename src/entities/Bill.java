package entities;

public class Bill {

    public char gender;
    public int beer;
    public int barbecue;
    public int sofDrink;

    public double cover() {
        double coverTax;
        if (feeding() < 30.00) {
            coverTax = 4.00;
        }
        else {
            coverTax = 0.00;
        }
        return coverTax;
    }

    public double feeding() {
        return beer * 5 + barbecue * 7 + sofDrink * 3;
    }

    public double ticket() {
        double ticketValue;
        if (gender == 'f') {
            ticketValue = 8.00;
        }
        else {
            ticketValue = 10.00;
        }
        return ticketValue;
    }

    public double total() {
        return feeding() + cover() + ticket();
    }
}