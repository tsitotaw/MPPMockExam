package question2;

import java.util.*;
import java.util.stream.Collectors;

public class Admin {
	
	 /**
	  * a helper method to return the phone numbers of those members who have checkedout atlest ones of an item specified
	  * imperative programming style
	  * @param members
	  * @param item
	  * @return
	  */
	public static List<String> getPhoneNums(LibraryMember[] members, LendingItem item) {
		List<String> phoneNums = new ArrayList<>();
		for (LibraryMember member : members) {
			List<CheckoutRecordEntry> entries = member.getCheckoutRecord().getCheckoutRecordEntryList();
			if (entries != null && entries.size() > 0) {
				if (isItemFound(entries, item)) {
					phoneNums.add(member.getPhone());
				}
			}
		}
		Collections.sort(phoneNums);
		return phoneNums;
	}
	
	/**
	  * a helper method to return the phone numbers of those members who have checkedout atlest ones of an item specified
	  * declarative programming style
	  * @param members
	  * @param item
	  * @return
	  */
	public static List<String> getPhoneNumsStream(LibraryMember[] members, LendingItem item) {
		List<String> phoneNums = new ArrayList<>();
		for (LibraryMember member : members) {
			
			Optional<CheckoutRecordEntry> checkoutEntry = 
					member.getCheckoutRecord().getCheckoutRecordEntryList()
					.stream()
					.filter(entry -> entry.getLendingItem().equals(item))
					.findAny();
			
			if(checkoutEntry.isPresent()) {
				phoneNums.add(member.getPhone());
			}
		}
		return phoneNums.stream().sorted().collect(Collectors.toList());
		
	}

	private static boolean isItemFound(List<CheckoutRecordEntry> entries, LendingItem item) {
		for (CheckoutRecordEntry entry : entries) {
			if (entry.getLendingItem().equals(item)) {
				return true;
			}
		}
		return false;
	}
}
