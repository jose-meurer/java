package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CarRental {

    private Date start;
    private Date finish;

    private Vehicle vehicle;
    private Invoice invoice;

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy HH:mm");

    public CarRental(Date start, Date finish, Vehicle vehicle) {
        Date now = new Date();
        if (start.before(now) || finish.before(now)) {
            throw new RuntimeException(
                    "Error : Dates must be future dates");
        }
        if (finish.before(start)) {
            throw new RuntimeException(
                    "Error: The return date must be after pickup date!");
        }
        this.start = start;
        this.finish = finish;
        this.vehicle = vehicle;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getFinish() {
        return finish;
    }

    public void setFinish(Date finish) {
        this.finish = finish;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
}