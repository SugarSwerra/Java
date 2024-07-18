package Esercizio_6;

import java.util.ArrayList;

public class StandardRoom implements HotelBooking {

	private final int MAX_ROOMS = 10;
	private ArrayList<String> guests = new ArrayList<String>();
	
	public StandardRoom() {}

	public void bookRoom(String passengerName) {
		
		if(guests.size() < MAX_ROOMS) {
			guests.add(passengerName);
			System.out.println("Ospite " + passengerName + " ha PRENOTATO una Camera");
		}else{
			System.out.println("Posti nelle Camere terminati");
		}
	}

	public void cancelRoom(String passengerName) {
		
		if(guests.remove(passengerName)) {
			System.out.println("Ospite " + passengerName + " ha LIBERATO una Camera");
		}else{
			System.out.println("Non esiste alcuna prenotazione di una Camera a nome di " + passengerName);
		}
		
	}
	
	public void avaibleRoom() {
		System.out.println("Camere disponibili: " + (MAX_ROOMS - guests.size()));
	}

}
