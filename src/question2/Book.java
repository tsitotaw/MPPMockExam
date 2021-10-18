package question2;

import java.util.Objects;

public class Book extends LendingItem{
	private String isbn;
	private String title;
	private String authorFirstName;
	private String authorLastName;
	
	public Book() {
		super();
	}

	public Book(String isbn, String title, String authorFirstName, String authorLastName) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.authorFirstName = authorFirstName;
		this.authorLastName = authorLastName;
	}

	@Override
	public int hashCode() {
		return Objects.hash(authorFirstName, authorLastName, isbn, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(authorFirstName, other.authorFirstName)
				&& Objects.equals(authorLastName, other.authorLastName) && Objects.equals(isbn, other.isbn)
				&& Objects.equals(title, other.title);
	}
	
}
