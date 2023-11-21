package Facade2;

public class ReservationSystem {
    private Booking booking;
    private Pay pay;
    private Delivery delivery;
    public ReservationSystem() {
        this.booking = new Booking();
        this.pay = new Pay();
        this.delivery = new Delivery();
    }
    public void ReserveARoom(){
        booking.searchRoom();
        booking.reserveRoom();
        pay.charge();
        delivery.deliver();
    }
}
