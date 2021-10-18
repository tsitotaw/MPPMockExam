package question2;

import java.time.LocalDate;
import java.util.Objects;

public class CheckoutRecordEntry {
	private LocalDate checkoutDate;
	private LocalDate dueDate;
	
	private LendingItem lendingItem;
	private ItemType itemType;
	
	
	public CheckoutRecordEntry(LendingItem lendingItem, LocalDate checkoutDate, LocalDate dueDate, ItemType itemType) {
		this.checkoutDate = checkoutDate;
		this.dueDate = dueDate;
		this.lendingItem = lendingItem;
		this.itemType = itemType;
	}
	
	public LocalDate getCheckoutDate() {
		return checkoutDate;
	}
	public LocalDate getDueDate() {
		return dueDate;
	}
	public LendingItem getLendingItem() {
		return lendingItem;
	}
	public ItemType getItemType() {
		return itemType;
	}

	@Override
	public int hashCode() {
		return Objects.hash(checkoutDate, dueDate, itemType, lendingItem);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CheckoutRecordEntry other = (CheckoutRecordEntry) obj;
		return Objects.equals(checkoutDate, other.checkoutDate) && Objects.equals(dueDate, other.dueDate)
				&& itemType == other.itemType && Objects.equals(lendingItem, other.lendingItem);
	}
	
	
}
