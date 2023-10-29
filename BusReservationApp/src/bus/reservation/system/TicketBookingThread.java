package bus.reservation.system;

public class TicketBookingThread extends Thread {
	
	private TicketCounter ticketCounter;
	private String PassengerName;
	private int noOfSeatsToBook;
	
	public TicketBookingThread(TicketCounter ticketCounter,String PassengerName,int noOfSeatsToBook)
	{
		this.ticketCounter=ticketCounter;
		this.PassengerName=PassengerName;
		this.noOfSeatsToBook=noOfSeatsToBook;
	}
	
	public void run() {
		ticketCounter.bookTicket(PassengerName, noOfSeatsToBook);
	}
	
}
