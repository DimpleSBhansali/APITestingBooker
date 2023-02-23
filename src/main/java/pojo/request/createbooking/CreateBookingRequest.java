package pojo.request.createbooking;

import java.util.Objects;

public class CreateBookingRequest {
	
	public String firstname;
	public String lastname;
	public int totalprice;
	public boolean depositpaid;
	public String additionalneeds;
	public Bookingdates bookingdates;
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(int totalprice) {
		this.totalprice = totalprice;
	}
	public boolean isDepositpaid() {
		return depositpaid;
	}
	public void setDepositpaid(boolean depositpaid) {
		this.depositpaid = depositpaid;
	}
	public String getAdditionalneeds() {
		return additionalneeds;
	}
	public void setAdditionalneeds(String additionalneeds) {
		this.additionalneeds = additionalneeds;
	}
	public Bookingdates getBookingdates() {
		return bookingdates;
	}
	public void setBookingdates(Bookingdates bookingdates) {
		this.bookingdates = bookingdates;
	}
	
	@Override
	public int hashCode() {
		return firstname.length();
	}
	@Override
	public boolean equals(Object obj) {
		CreateBookingRequest other = (CreateBookingRequest) obj;
		return Objects.equals(additionalneeds, other.additionalneeds)
				&& Objects.equals(bookingdates, other.bookingdates) && depositpaid == other.depositpaid
				&& Objects.equals(firstname, other.firstname) && Objects.equals(lastname, other.lastname)
				&& totalprice == other.totalprice;
	}
	
}
