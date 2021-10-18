package question2;

import java.util.Objects;

public class CD extends LendingItem{
	
	private String productId;
	private String title;
	private String company;
	
	
	public CD() {
		super();
	}
	public CD(String productId, String title, String company) {
		this.productId = productId;
		this.title = title;
		this.company = company;
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(company, productId, title);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CD other = (CD) obj;
		return Objects.equals(company, other.company) && Objects.equals(productId, other.productId)
				&& Objects.equals(title, other.title);
	}
	
	
	
}
