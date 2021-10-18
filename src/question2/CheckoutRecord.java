package question2;

import java.util.ArrayList;
import java.util.List;

public class CheckoutRecord {
	
	private List<CheckoutRecordEntry> checkoutRecordEntryList;
	
	
	public CheckoutRecord() {
		this.checkoutRecordEntryList = new ArrayList<>();
	}


	public void addCheckoutEntry(CheckoutRecordEntry entry) {
		this.checkoutRecordEntryList.add(entry);
	}
	
	public List<CheckoutRecordEntry> getCheckoutRecordEntryList(){
		return this.checkoutRecordEntryList;
	}
}
